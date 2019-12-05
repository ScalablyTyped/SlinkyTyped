package typingsSlinky.cypress.Mocha

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.cypress.cypressStrings.fast
import typingsSlinky.cypress.cypressStrings.medium
import typingsSlinky.cypress.cypressStrings.slow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `Test` with the given `title` and callback `fn`.
  *
  * @see https://mochajs.org/api/Test.html
  */
@JSGlobal("Mocha.Test")
@js.native
class Test () extends Runnable {
   // added by reporters
  var err: js.UndefOr[js.Error] = js.native
  var speed: js.UndefOr[slow | medium | fast] = js.native
  var `type`: typingsSlinky.cypress.cypressStrings.test = js.native
}

/**
  * Describes a test case.
  *
  * - _Only available when invoked via the mocha CLI._
  */
@JSGlobal("Mocha.test")
@js.native
object test extends TopLevel[TestFunction]

