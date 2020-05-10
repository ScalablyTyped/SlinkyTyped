package typingsSlinky.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/interchange.html#custom-named-queries
@js.native
trait InterchangeOptions extends js.Object {
  var directives: js.UndefOr[js.Object] = js.native
  var load_attr: js.UndefOr[String] = js.native
  var named_queries: js.UndefOr[js.Object] = js.native
}

object InterchangeOptions {
  @scala.inline
  def apply(): InterchangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterchangeOptions]
  }
  @scala.inline
  implicit class InterchangeOptionsOps[Self <: InterchangeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectives(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad_attr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load_attr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoad_attr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load_attr")(js.undefined)
        ret
    }
    @scala.inline
    def withNamed_queries(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("named_queries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamed_queries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("named_queries")(js.undefined)
        ret
    }
  }
  
}

