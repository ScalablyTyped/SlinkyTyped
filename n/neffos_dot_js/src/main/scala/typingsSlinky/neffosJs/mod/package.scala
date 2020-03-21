package typingsSlinky.neffosJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Events = typingsSlinky.std.Map[java.lang.String, typingsSlinky.neffosJs.mod.MessageHandlerFunc]
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
  type MessageHandlerFunc = js.Function2[
    /* c */ typingsSlinky.neffosJs.mod.NSConn, 
    /* msg */ typingsSlinky.neffosJs.mod.Message, 
    js.Error
  ]
  type Namespaces = typingsSlinky.std.Map[java.lang.String, typingsSlinky.neffosJs.mod.Events]
  type WSData = java.lang.String
}
