package typingsSlinky.cypress.global.Mocha_.reporters

import typingsSlinky.cypress.Mocha.IRunner
import typingsSlinky.cypress.Mocha.Runner
import typingsSlinky.cypress.Mocha.reporters.XUnit
import typingsSlinky.cypress.Mocha.reporters.XUnit.MochaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `XUnit` test reporter.
  *
  * @see https://mochajs.org/api/Mocha.reporters.XUnit.html
  */
@JSGlobal("Mocha.reporters.XUnit")
@js.native
class XUnit_ protected () extends XUnit {
  /** @deprecated Use the overload that accepts `Mocha.Runner` instead. */
  def this(runner: IRunner) = this()
  def this(runner: Runner) = this()
  def this(runner: IRunner, options: MochaOptions) = this()
  def this(runner: Runner, options: MochaOptions) = this()
}

