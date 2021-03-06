package typingsSlinky.cypress.Mocha

import typingsSlinky.cypress.cypressStrings.failed
import typingsSlinky.cypress.cypressStrings.passed
import typingsSlinky.cypress.cypressStrings.test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Partial interface for Mocha's `Test` class. */
/** @deprecated use `Mocha.Test` instead. */
@js.native
trait ITest extends IRunnable {
  var body: js.UndefOr[String] = js.native
  var file: js.UndefOr[String] = js.native
  /** @deprecated `.parent` has type `Mocha.Suite | undefined` in `Mocha.Test`. */
  var parent: js.UndefOr[ISuite] = js.native
  var pending: Boolean = js.native
  var state: js.UndefOr[failed | passed] = js.native
  var `type`: test = js.native
  def fullTitle(): String = js.native
}

