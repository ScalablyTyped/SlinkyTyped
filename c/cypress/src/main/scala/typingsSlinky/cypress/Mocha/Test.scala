package typingsSlinky.cypress.Mocha

import typingsSlinky.cypress.cypressStrings.fast
import typingsSlinky.cypress.cypressStrings.medium
import typingsSlinky.cypress.cypressStrings.slow
import typingsSlinky.cypress.cypressStrings.test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `Test` with the given `title` and callback `fn`.
  *
  * @see https://mochajs.org/api/Test.html
  */
@js.native
trait Test extends Runnable {
   // added by reporters
  var err: js.UndefOr[js.Error] = js.native
  var speed: js.UndefOr[slow | medium | fast] = js.native
  var `type`: test = js.native
}

