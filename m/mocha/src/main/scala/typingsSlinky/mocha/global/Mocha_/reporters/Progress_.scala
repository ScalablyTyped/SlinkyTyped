package typingsSlinky.mocha.global.Mocha_.reporters

import typingsSlinky.mocha.Mocha.IRunner
import typingsSlinky.mocha.Mocha.Runner
import typingsSlinky.mocha.Mocha.reporters.Base
import typingsSlinky.mocha.Mocha.reporters.Progress.MochaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `Progress` bar test reporter.
  *
  * @see https://mochajs.org/api/Mocha.reporters.Progress.html
  */
@JSGlobal("Mocha.reporters.Progress")
@js.native
class Progress_ protected () extends Base {
  /** @deprecated Use the overload that accepts `Mocha.Runner` instead. */
  def this(runner: IRunner) = this()
  def this(runner: Runner) = this()
  def this(runner: IRunner, options: MochaOptions) = this()
  def this(runner: Runner, options: MochaOptions) = this()
}

