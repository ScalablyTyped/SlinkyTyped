package typingsSlinky.chromeDashApps.WebView.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * String indicating the reason for the exit.
  */
/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.normal
  - typings.chromeDashApps.chromeDashAppsStrings.abnormal
  - typings.chromeDashApps.chromeDashAppsStrings.crash
  - typings.chromeDashApps.chromeDashAppsStrings.kill
*/
trait ExitEventReason extends js.Object

object ExitEventReason {
  @scala.inline
  def abnormal: typingsSlinky.chromeDashApps.chromeDashAppsStrings.abnormal = this.cast("abnormal")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def crash: typingsSlinky.chromeDashApps.chromeDashAppsStrings.crash = this.cast("crash")
  @scala.inline
  def kill: typingsSlinky.chromeDashApps.chromeDashAppsStrings.kill = this.cast("kill")
  @scala.inline
  def normal: typingsSlinky.chromeDashApps.chromeDashAppsStrings.normal = this.cast("normal")
}

