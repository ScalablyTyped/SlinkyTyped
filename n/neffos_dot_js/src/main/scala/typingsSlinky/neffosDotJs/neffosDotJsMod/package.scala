package typingsSlinky.neffosDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object neffosDotJsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.std.Map

  type Events = Map[String, MessageHandlerFunc]
  type Headers = StringDictionary[js.Any]
  type MessageHandlerFunc = js.Function2[/* c */ NSConn, /* msg */ Message, js.Error]
  type Namespaces = Map[String, Events]
  type WSData = String
}
