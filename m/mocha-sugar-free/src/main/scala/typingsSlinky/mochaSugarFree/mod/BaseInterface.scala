package typingsSlinky.mochaSugarFree.mod

import typingsSlinky.mochaSugarFree.mochaSugarFreeStrings.bdd
import typingsSlinky.mochaSugarFree.mochaSugarFreeStrings.qunit
import typingsSlinky.mochaSugarFree.mochaSugarFreeStrings.tdd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #region Test functions
@js.native
trait BaseInterface extends js.Object {
  /**
  		 * The detected Mocha interface.
  		 *
  		 * @default "bdd"
  		 */
  var detectedInterface: bdd | tdd | qunit = js.native
  /**
  		 * Triggers root suite execution.
  		 *
  		 * - _Only available if flag `--delay` is passed to Mocha._
  		 *
  		 * @see https://mochajs.org/api/global.html#runWithSuite
  		 */
  def run(): Unit = js.native
}

object BaseInterface {
  @scala.inline
  def apply(detectedInterface: bdd | tdd | qunit, run: () => Unit): BaseInterface = {
    val __obj = js.Dynamic.literal(detectedInterface = detectedInterface.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[BaseInterface]
  }
  @scala.inline
  implicit class BaseInterfaceOps[Self <: BaseInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectedInterface(value: bdd | tdd | qunit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedInterface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRun(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

