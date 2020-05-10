package typingsSlinky.hoganJs

import typingsSlinky.hoganJs.hoganJsBooleans.`false`
import typingsSlinky.hoganJs.mod.SectionTags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined hogan.js.hogan.js.HoganOptions & {  asString  :false} */
@js.native
trait HoganOptionsasStringfalse extends js.Object {
  var asString: js.UndefOr[Boolean with `false`] = js.native
  var delimiters: js.UndefOr[String] = js.native
  var disableLambda: js.UndefOr[Boolean] = js.native
  var sectionTags: js.UndefOr[js.Array[SectionTags]] = js.native
}

object HoganOptionsasStringfalse {
  @scala.inline
  def apply(): HoganOptionsasStringfalse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoganOptionsasStringfalse]
  }
  @scala.inline
  implicit class HoganOptionsasStringfalseOps[Self <: HoganOptionsasStringfalse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsString(value: Boolean with `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asString")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiters")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableLambda(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableLambda")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableLambda: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableLambda")(js.undefined)
        ret
    }
    @scala.inline
    def withSectionTags(value: js.Array[SectionTags]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSectionTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionTags")(js.undefined)
        ret
    }
  }
  
}

