package typingsSlinky.jestDashWatcher.buildJestHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jestDashWatcher.jestDashWatcherStrings.onFileChange
  - typings.jestDashWatcher.jestDashWatcherStrings.onTestRunComplete
  - typings.jestDashWatcher.jestDashWatcherStrings.shouldRunTestSuite
*/
trait AvailableHooks extends js.Object

object AvailableHooks {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onFileChange: typingsSlinky.jestDashWatcher.jestDashWatcherStrings.onFileChange = this.cast("onFileChange")
  @scala.inline
  def onTestRunComplete: typingsSlinky.jestDashWatcher.jestDashWatcherStrings.onTestRunComplete = this.cast("onTestRunComplete")
  @scala.inline
  def shouldRunTestSuite: typingsSlinky.jestDashWatcher.jestDashWatcherStrings.shouldRunTestSuite = this.cast("shouldRunTestSuite")
}

