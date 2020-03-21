package typingsSlinky.jestWatcher.jestHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jestWatcher.jestWatcherStrings.onFileChange
  - typingsSlinky.jestWatcher.jestWatcherStrings.onTestRunComplete
  - typingsSlinky.jestWatcher.jestWatcherStrings.shouldRunTestSuite
*/
trait AvailableHooks extends js.Object

object AvailableHooks {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onFileChange: typingsSlinky.jestWatcher.jestWatcherStrings.onFileChange = this.cast("onFileChange")
  @scala.inline
  def onTestRunComplete: typingsSlinky.jestWatcher.jestWatcherStrings.onTestRunComplete = this.cast("onTestRunComplete")
  @scala.inline
  def shouldRunTestSuite: typingsSlinky.jestWatcher.jestWatcherStrings.shouldRunTestSuite = this.cast("shouldRunTestSuite")
}

