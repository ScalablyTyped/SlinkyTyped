package typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait extendedBugReportMode extends js.Object

@JSImport("instabug-reactnative", "BugReporting.extendedBugReportMode")
@js.native
object extendedBugReportMode extends js.Object {
  @js.native
  sealed trait disabled
    extends typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.extendedBugReportMode
  
  @js.native
  sealed trait enabledWithOptionalFields
    extends typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.extendedBugReportMode
  
  @js.native
  sealed trait enabledWithRequiredFields
    extends typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.extendedBugReportMode
  
  /* 2 */ val disabled: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.extendedBugReportMode.disabled with Double = js.native
  /* 1 */ val enabledWithOptionalFields: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.extendedBugReportMode.enabledWithOptionalFields with Double = js.native
  /* 0 */ val enabledWithRequiredFields: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.extendedBugReportMode.enabledWithRequiredFields with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.extendedBugReportMode with Double
  ] = js.native
}

