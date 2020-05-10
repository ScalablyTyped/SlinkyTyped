package typingsSlinky.koaJoiRouter

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.coBody.mod.Options
import typingsSlinky.joi.mod.SchemaLike
import typingsSlinky.koaJoiRouter.koaJoiRouterStrings.form
import typingsSlinky.koaJoiRouter.koaJoiRouterStrings.json
import typingsSlinky.koaJoiRouter.koaJoiRouterStrings.multipart
import typingsSlinky.koaJoiRouter.mod.OutputValidation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContinueOnError extends js.Object {
  var body: js.UndefOr[SchemaLike] = js.native
  var continueOnError: js.UndefOr[Boolean] = js.native
  var failure: js.UndefOr[Double] = js.native
  var formOptions: js.UndefOr[Options] = js.native
  var header: js.UndefOr[SchemaLike] = js.native
  var jsonOptions: js.UndefOr[Options] = js.native
  var maxBody: js.UndefOr[Double] = js.native
  var multipartOptions: js.UndefOr[Options] = js.native
  var output: js.UndefOr[StringDictionary[OutputValidation]] = js.native
  var params: js.UndefOr[SchemaLike] = js.native
  var query: js.UndefOr[SchemaLike] = js.native
  var `type`: js.UndefOr[form | json | multipart] = js.native
}

object AnonContinueOnError {
  @scala.inline
  def apply(): AnonContinueOnError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonContinueOnError]
  }
  @scala.inline
  implicit class AnonContinueOnErrorOps[Self <: AnonContinueOnError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: SchemaLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(null)
        ret
    }
    @scala.inline
    def withContinueOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinueOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withFailure(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(js.undefined)
        ret
    }
    @scala.inline
    def withFormOptions(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: SchemaLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(null)
        ret
    }
    @scala.inline
    def withJsonOptions(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBody(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBody")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipartOptions(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipartOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipartOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipartOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: StringDictionary[OutputValidation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: SchemaLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withParamsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(null)
        ret
    }
    @scala.inline
    def withQuery(value: SchemaLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(null)
        ret
    }
    @scala.inline
    def withType(value: form | json | multipart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

