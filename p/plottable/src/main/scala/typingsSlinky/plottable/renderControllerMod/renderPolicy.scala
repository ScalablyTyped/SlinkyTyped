package typingsSlinky.plottable.renderControllerMod

import typingsSlinky.plottable.renderPolicyMod.IRenderPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/core/renderController", "renderPolicy")
@js.native
object renderPolicy extends js.Object {
  def apply(): IRenderPolicy = js.native
  def apply(renderPolicy: Policy): Unit = js.native
}

