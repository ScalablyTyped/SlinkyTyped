package typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait invocationOptions extends js.Object

@JSImport("instabug-reactnative", "BugReporting.invocationOptions")
@js.native
object invocationOptions extends js.Object {
  @js.native
  sealed trait commentFieldRequired
    extends typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationOptions
  
  @js.native
  sealed trait disablePostSendingDialog
    extends typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationOptions
  
  @js.native
  sealed trait emailFieldHidden
    extends typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationOptions
  
  @js.native
  sealed trait emailFieldOptional
    extends typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationOptions
  
  /* 2 */ val commentFieldRequired: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationOptions.commentFieldRequired with Double = js.native
  /* 3 */ val disablePostSendingDialog: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationOptions.disablePostSendingDialog with Double = js.native
  /* 0 */ val emailFieldHidden: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationOptions.emailFieldHidden with Double = js.native
  /* 1 */ val emailFieldOptional: typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationOptions.emailFieldOptional with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsSlinky.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.invocationOptions with Double
  ] = js.native
}

