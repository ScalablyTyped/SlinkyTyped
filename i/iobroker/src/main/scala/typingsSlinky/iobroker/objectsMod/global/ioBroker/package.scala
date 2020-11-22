package typingsSlinky.iobroker.objectsMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ioBroker {
  
  // For all objects that are exposed to the user we need to tone the strictness down.
  // Otherwise, every operation on objects becomes a pain to work with
  type Object = typingsSlinky.iobroker.objectsMod.global.ioBroker.AnyObject with typingsSlinky.iobroker.anon.Common
  
  // In set[Foreign]Object[NotExists] methods, the ID and acl of the object is optional
  type SettableObject = typingsSlinky.iobroker.objectsMod.global.ioBroker.SettableObjectWorker[typingsSlinky.iobroker.objectsMod.global.ioBroker.AnyObject]
  
  type SettableObjectWorker[T] = (typingsSlinky.std.Omit[
    T, 
    typingsSlinky.iobroker.iobrokerStrings._id | typingsSlinky.iobroker.iobrokerStrings.acl
  ]) with typingsSlinky.iobroker.anon.Acl[T]
  
  type StringOrTranslated = java.lang.String | typingsSlinky.iobroker.anon.langinLanguagesstring
  
  type WelcomeScreenEntry = java.lang.String | typingsSlinky.iobroker.anon.Color
}
