package typingsSlinky.mocha.Mocha_

import typingsSlinky.mocha.mochaStrings.fast
import typingsSlinky.mocha.mochaStrings.medium
import typingsSlinky.mocha.mochaStrings.slow
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
class Test_ () extends Runnable {
   // added by reporters
  var err: js.UndefOr[js.Error] = js.native
  var speed: js.UndefOr[slow | medium | fast] = js.native
  var `type`: typingsSlinky.mocha.mochaStrings.test = js.native
}

