package typingsSlinky.rcMenu.legacyUtilMod

import typingsSlinky.rcMenu.interfaceMod.MenuMode
import typingsSlinky.rcTrigger.interfaceMod.MotionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-menu/es/utils/legacyUtil", "getMotion")
@js.native
object getMotion extends js.Object {
  def apply(
    hasPrefixClsMotionDefaultMotionsOpenAnimationOpenTransitionName: GetMotionProps,
    hasSwitchingModeFromInline: GetMotionState,
    menuMode: MenuMode
  ): MotionType = js.native
}

