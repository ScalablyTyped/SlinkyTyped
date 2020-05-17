package typingsSlinky.iobroker.mod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for adapter.getObjectView */
@js.native
trait GetObjectViewParams extends js.Object {
  /** Last id to include in the return list */
  var endkey: js.UndefOr[String] = js.native
  /** Whether docs should be included in the return list */ // TODO: What are docs?
  var include_docs: js.UndefOr[Boolean] = js.native
  /** First id to include in the return list */
  var startkey: js.UndefOr[String] = js.native
}

object GetObjectViewParams {
  @scala.inline
  def apply(): GetObjectViewParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectViewParams]
  }
  @scala.inline
  implicit class GetObjectViewParamsOps[Self <: GetObjectViewParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndkey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndkey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endkey")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_docs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_docs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_docs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_docs")(js.undefined)
        ret
    }
    @scala.inline
    def withStartkey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartkey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startkey")(js.undefined)
        ret
    }
  }
  
}

