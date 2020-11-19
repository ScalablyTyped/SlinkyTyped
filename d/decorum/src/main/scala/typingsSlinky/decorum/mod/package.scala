package typingsSlinky.decorum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type IMessageHandlerMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.decorum.mod.MessageHandler[js.Any]]
  
  type MessageHandler[TValidator /* <: typingsSlinky.decorum.mod.BaseValidator */] = js.Function2[
    /* opts */ typingsSlinky.decorum.mod.IMessageOpts, 
    /* validator */ TValidator, 
    java.lang.String
  ]
  
  type ValidationDefinitions = org.scalablytyped.runtime.StringDictionary[js.Array[typingsSlinky.std.PropertyDecorator]]
}
