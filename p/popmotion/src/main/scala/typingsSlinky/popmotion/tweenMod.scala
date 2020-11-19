package typingsSlinky.popmotion

import typingsSlinky.popmotion.actionMod.Action
import typingsSlinky.popmotion.tweenTypesMod.TweenInterface
import typingsSlinky.popmotion.tweenTypesMod.TweenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion/lib/animations/tween", JSImport.Namespace)
@js.native
object tweenMod extends js.Object {
  
  def default(): Action[TweenInterface[Double]] = js.native
  def default(props: TweenProps): Action[TweenInterface[Double]] = js.native
}
