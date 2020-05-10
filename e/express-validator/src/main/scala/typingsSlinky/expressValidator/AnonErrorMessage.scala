package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.baseMod.DynamicMessageCreator
import typingsSlinky.expressValidator.baseMod.Meta
import typingsSlinky.expressValidator.schemaMod.ValidatorSchemaOptions
import typingsSlinky.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonErrorMessage[K /* <: /* keyof express-validator.express-validator/src/chain/validators.Validators<any> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 70 */ js.Any */] extends ValidatorSchemaOptions[K] {
  var errorMessage: js.UndefOr[DynamicMessageCreator | js.Any] = js.native
  var negated: js.UndefOr[Boolean] = js.native
  var options: js.UndefOr[
    (Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: express-validator.express-validator/src/chain/validators.Validators<any>[K] */ js.Any
    ]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/validators.Validators<any>[K]>[0] */ js.Any)
  ] = js.native
}

object AnonErrorMessage {
  @scala.inline
  def apply[K](): AnonErrorMessage[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonErrorMessage[K]]
  }
  @scala.inline
  implicit class AnonErrorMessageOps[Self[k] <: AnonErrorMessage[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withErrorMessageFunction2(value: (/* value */ js.Any, /* meta */ Meta) => js.Any): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withErrorMessage(value: DynamicMessageCreator | js.Any): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withNegated(value: Boolean): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegated: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negated")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(
      value: (Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: express-validator.express-validator/src/chain/validators.Validators<any>[K] */ js.Any
        ]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/validators.Validators<any>[K]>[0] */ js.Any)
    ): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

