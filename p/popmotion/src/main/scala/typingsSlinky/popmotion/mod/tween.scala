package typingsSlinky.popmotion.mod

import typingsSlinky.popmotion.actionMod.Action
import typingsSlinky.popmotion.tweenTypesMod.TweenInterface
import typingsSlinky.popmotion.tweenTypesMod.TweenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion", "tween")
@js.native
object tween extends js.Object {
  
  def apply(): Action[TweenInterface[Double]] = js.native
  def apply(props: TweenProps): Action[TweenInterface[Double]] = js.native
}
