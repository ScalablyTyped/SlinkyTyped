package typingsSlinky.koaJsonError.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONErrorOptions extends js.Object {
  /**
    * Runs inmediatly after `options.preFormat`. It receives two arguments: the original `err` and the output of     `options.preFormat`. It should `return` a newly formatted error.
    */
  var format: js.UndefOr[js.Function2[/* err */ js.Error, /* obj */ js.Any, _]] = js.native
  /**
    * Runs inmediatly after `options.format`. It receives two arguments: the original `err` and the output of   `options.format`.   It should `return` a newly formatted error.
    */
  var postFormat: js.UndefOr[js.Function2[/* err */ js.Error, /* obj */ js.Any, _]] = js.native
  /**
    * Perform some task before calling `options.format`. Must be a function with the original err as its only argument.
    */
  var preFormat: js.UndefOr[js.Function1[/* err */ js.Error, _]] = js.native
}

object JSONErrorOptions {
  @scala.inline
  def apply(): JSONErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONErrorOptions]
  }
  @scala.inline
  implicit class JSONErrorOptionsOps[Self <: JSONErrorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: (/* err */ js.Error, /* obj */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withPostFormat(value: (/* err */ js.Error, /* obj */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postFormat")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPostFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withPreFormat(value: /* err */ js.Error => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preFormat")(js.undefined)
        ret
    }
  }
  
}

