package typingsSlinky.luminoMessaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type MessageHook = typingsSlinky.luminoMessaging.mod.IMessageHook | (js.Function2[
    /* handler */ typingsSlinky.luminoMessaging.mod.IMessageHandler, 
    /* msg */ typingsSlinky.luminoMessaging.mod.Message, 
    scala.Boolean
  ])
}
