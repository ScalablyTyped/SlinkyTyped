package typingsSlinky.rcMotion

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.rcMotion.cssmotionMod.CSSMotionProps
import typingsSlinky.rcMotion.interfaceMod.MotionStatus
import typingsSlinky.rcMotion.interfaceMod.StepStatus
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useStatusMod {
  
  @JSImport("rc-motion/es/hooks/useStatus", JSImport.Default)
  @js.native
  def default(
    supportMotion: Boolean,
    visible: Boolean,
    getElement: js.Function0[HTMLElement],
    hasMotionEnterMotionAppearMotionLeaveMotionDeadlineMotionLeaveImmediatelyOnAppearPrepareOnEnterPrepareOnLeavePrepareOnAppearStartOnEnterStartOnLeaveStartOnAppearActiveOnEnterActiveOnLeaveActiveOnAppearEndOnEnterEndOnLeaveEndOnVisibleChanged: CSSMotionProps
  ): js.Tuple4[MotionStatus, StepStatus, CSSProperties, Boolean] = js.native
}
