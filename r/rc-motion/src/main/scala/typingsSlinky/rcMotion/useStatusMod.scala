package typingsSlinky.rcMotion

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.rcMotion.cssmotionMod.CSSMotionProps
import typingsSlinky.rcMotion.interfaceMod.MotionStatus
import typingsSlinky.rcMotion.interfaceMod.StepStatus
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-motion/es/hooks/useStatus", JSImport.Namespace)
@js.native
object useStatusMod extends js.Object {
  
  def default(
    supportMotion: Boolean,
    visible: Boolean,
    getElement: js.Function0[HTMLElement],
    hasMotionEnterMotionAppearMotionLeaveMotionDeadlineMotionLeaveImmediatelyOnAppearPrepareOnEnterPrepareOnLeavePrepareOnAppearStartOnEnterStartOnLeaveStartOnAppearActiveOnEnterActiveOnLeaveActiveOnAppearEndOnEnterEndOnLeaveEndOnVisibleChanged: CSSMotionProps
  ): js.Tuple4[MotionStatus, StepStatus, CSSProperties, Boolean] = js.native
}
