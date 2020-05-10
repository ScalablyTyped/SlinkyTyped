package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IlmExplainLifecycle extends Generic {
  var index: String = js.native
  var only_errors: js.UndefOr[Boolean] = js.native
  var only_managed: js.UndefOr[Boolean] = js.native
}

object IlmExplainLifecycle {
  @scala.inline
  def apply(index: String): IlmExplainLifecycle = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmExplainLifecycle]
  }
  @scala.inline
  implicit class IlmExplainLifecycleOps[Self <: IlmExplainLifecycle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnly_errors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only_errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnly_errors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only_errors")(js.undefined)
        ret
    }
    @scala.inline
    def withOnly_managed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only_managed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnly_managed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only_managed")(js.undefined)
        ret
    }
  }
  
}

