package typingsSlinky.jestDiff.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiffOptions extends js.Object {
  var aAnnotation: js.UndefOr[String] = js.native
  var bAnnotation: js.UndefOr[String] = js.native
  var contextLines: js.UndefOr[Double] = js.native
  var expand: js.UndefOr[Boolean] = js.native
}

object DiffOptions {
  @scala.inline
  def apply(): DiffOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiffOptions]
  }
  @scala.inline
  implicit class DiffOptionsOps[Self <: DiffOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAAnnotation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withBAnnotation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withContextLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextLines")(js.undefined)
        ret
    }
    @scala.inline
    def withExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
  }
  
}

