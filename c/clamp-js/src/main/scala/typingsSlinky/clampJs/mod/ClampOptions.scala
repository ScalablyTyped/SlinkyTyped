package typingsSlinky.clampJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClampOptions extends js.Object {
  var animate: js.UndefOr[Boolean] = js.native
  var clamp: js.UndefOr[Double | String] = js.native
  var splitOnChars: js.UndefOr[js.Array[String]] = js.native
  var truncationChar: js.UndefOr[String] = js.native
  var truncationHTML: js.UndefOr[String | Null] = js.native
  var useNativeClamp: js.UndefOr[Boolean] = js.native
}

object ClampOptions {
  @scala.inline
  def apply(): ClampOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClampOptions]
  }
  @scala.inline
  implicit class ClampOptionsOps[Self <: ClampOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withClamp(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clamp")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitOnChars(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitOnChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitOnChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitOnChars")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncationChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncationChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncationChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncationChar")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncationHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncationHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncationHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncationHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncationHTMLNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncationHTML")(null)
        ret
    }
    @scala.inline
    def withUseNativeClamp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeClamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNativeClamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeClamp")(js.undefined)
        ret
    }
  }
  
}

