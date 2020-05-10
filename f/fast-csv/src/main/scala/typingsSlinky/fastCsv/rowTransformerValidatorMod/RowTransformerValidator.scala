package typingsSlinky.fastCsv.rowTransformerValidatorMod

import typingsSlinky.fastCsv.parserTypesMod.Row
import typingsSlinky.fastCsv.parserTypesMod.RowTransformFunction
import typingsSlinky.fastCsv.parserTypesMod.RowValidate
import typingsSlinky.fastCsv.parserTypesMod.RowValidatorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowTransformerValidator extends js.Object {
  var _rowTransform: js.Any = js.native
  var _rowValidator: js.Any = js.native
  var callTransformer: js.Any = js.native
  var callValidator: js.Any = js.native
  def rowTransform(transformFunction: RowTransformFunction): js.Any = js.native
  def rowValidator(validateFunction: RowValidate): js.Any = js.native
  def transformAndValidate(row: Row, cb: RowValidatorCallback): Unit = js.native
}

object RowTransformerValidator {
  @scala.inline
  def apply(
    _rowTransform: js.Any,
    _rowValidator: js.Any,
    callTransformer: js.Any,
    callValidator: js.Any,
    rowTransform: RowTransformFunction => js.Any,
    rowValidator: RowValidate => js.Any,
    transformAndValidate: (Row, RowValidatorCallback) => Unit
  ): RowTransformerValidator = {
    val __obj = js.Dynamic.literal(_rowTransform = _rowTransform.asInstanceOf[js.Any], _rowValidator = _rowValidator.asInstanceOf[js.Any], callTransformer = callTransformer.asInstanceOf[js.Any], callValidator = callValidator.asInstanceOf[js.Any], rowTransform = js.Any.fromFunction1(rowTransform), rowValidator = js.Any.fromFunction1(rowValidator), transformAndValidate = js.Any.fromFunction2(transformAndValidate))
    __obj.asInstanceOf[RowTransformerValidator]
  }
  @scala.inline
  implicit class RowTransformerValidatorOps[Self <: RowTransformerValidator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_rowTransform(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rowTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_rowValidator(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rowValidator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallTransformer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callTransformer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallValidator(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callValidator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowTransform(value: RowTransformFunction => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTransform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRowValidator(value: RowValidate => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowValidator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransformAndValidate(value: (Row, RowValidatorCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformAndValidate")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

