package typingsSlinky.mocha.commonMod

import typingsSlinky.mocha.Mocha_.Suite_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuiteFunctions extends js.Object {
  /**
    * Creates a suite.
    */
  def create(opts: CreateOptions): Suite_ = js.native
  /**
    * Create an exclusive Suite; convenience function
    */
  def only(opts: CreateOptions): Suite_ = js.native
  /**
    * Create a Suite, but skip it; convenience function
    */
  def skip(opts: CreateOptions): Suite_ = js.native
}

object SuiteFunctions {
  @scala.inline
  def apply(create: CreateOptions => Suite_, only: CreateOptions => Suite_, skip: CreateOptions => Suite_): SuiteFunctions = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), only = js.Any.fromFunction1(only), skip = js.Any.fromFunction1(skip))
    __obj.asInstanceOf[SuiteFunctions]
  }
  @scala.inline
  implicit class SuiteFunctionsOps[Self <: SuiteFunctions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: CreateOptions => Suite_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnly(value: CreateOptions => Suite_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSkip(value: CreateOptions => Suite_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

