package typingsSlinky.cradle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDescending extends js.Object {
  var descending: js.UndefOr[Boolean] = js.native
  var endkey: js.UndefOr[js.Any] = js.native
  var group: js.UndefOr[Boolean] = js.native
  var include_docs: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String] = js.native
  var limit: js.UndefOr[Double] = js.native
  var reduce: js.UndefOr[Boolean] = js.native
  var startkey: js.UndefOr[js.Any] = js.native
}

object AnonDescending {
  @scala.inline
  def apply(): AnonDescending = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDescending]
  }
  @scala.inline
  implicit class AnonDescendingOps[Self <: AnonDescending] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descending")(js.undefined)
        ret
    }
    @scala.inline
    def withEndkey(value: js.Any): Self = {
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
    def withGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
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
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withReduce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReduce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce")(js.undefined)
        ret
    }
    @scala.inline
    def withStartkey(value: js.Any): Self = {
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

