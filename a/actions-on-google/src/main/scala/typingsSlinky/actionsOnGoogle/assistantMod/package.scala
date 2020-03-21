package typingsSlinky.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object assistantMod {
  type AppHandler = typingsSlinky.actionsOnGoogle.frameworkFrameworkMod.OmniHandler with typingsSlinky.actionsOnGoogle.assistantMod.BaseApp
  type Plugin[TService, TPlugin] = js.Function1[
    /* app */ typingsSlinky.actionsOnGoogle.assistantMod.AppHandler with TService with js.Any, 
    (typingsSlinky.actionsOnGoogle.assistantMod.AppHandler with TService with js.Any with TPlugin) | scala.Unit
  ]
}
