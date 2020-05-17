package typingsSlinky.elasticsearch.mod

import typingsSlinky.elasticsearch.anon.Actions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesUpdateAliasesParams extends GenericParams {
  @JSName("body")
  var body_IndicesUpdateAliasesParams: Actions = js.native
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  var timeout: js.UndefOr[TimeSpan] = js.native
}

object IndicesUpdateAliasesParams {
  @scala.inline
  def apply(body: Actions): IndicesUpdateAliasesParams = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesUpdateAliasesParams]
  }
  @scala.inline
  implicit class IndicesUpdateAliasesParamsOps[Self <: IndicesUpdateAliasesParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: Actions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMasterTimeout(value: TimeSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: TimeSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

