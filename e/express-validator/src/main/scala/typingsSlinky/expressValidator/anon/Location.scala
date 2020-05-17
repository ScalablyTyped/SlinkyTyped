package typingsSlinky.expressValidator.anon

import typingsSlinky.expressValidator.baseMod.ValidationError
import typingsSlinky.expressValidator.expressValidatorStrings._error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends ValidationError {
  var location: js.UndefOr[scala.Nothing] = js.native
  var msg: js.Any = js.native
  var nestedErrors: js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias express-validator.express-validator/src/base.ValidationError */ js.Object
  ] = js.native
  var param: _error = js.native
  var value: js.UndefOr[scala.Nothing] = js.native
}

object Location {
  @scala.inline
  def apply(
    msg: js.Any,
    nestedErrors: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias express-validator.express-validator/src/base.ValidationError */ js.Object
    ],
    param: _error
  ): Location = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], nestedErrors = nestedErrors.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMsg(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNestedErrors(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias express-validator.express-validator/src/base.ValidationError */ js.Object
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParam(value: _error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("param")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

