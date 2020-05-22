package typingsSlinky.phosphorMessaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MessageHook = typingsSlinky.phosphorMessaging.mod.IMessageHook | (js.Function2[
    /* handler */ typingsSlinky.phosphorMessaging.mod.IMessageHandler, 
    /* msg */ typingsSlinky.phosphorMessaging.mod.Message, 
    scala.Boolean
  ])
}
