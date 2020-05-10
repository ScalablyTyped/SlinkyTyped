package typingsSlinky.globule.mod

import typingsSlinky.globule.globuleStrings.first
import typingsSlinky.globule.globuleStrings.last
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MappingOptions extends FindOptions {
  var destBase: js.UndefOr[String] = js.native
  var ext: js.UndefOr[String] = js.native
  var extDot: js.UndefOr[first | last] = js.native
  var flatten: js.UndefOr[Boolean] = js.native
  var rename: js.UndefOr[js.Function1[/* p */ String, String]] = js.native
}

object MappingOptions {
  @scala.inline
  def apply(): MappingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingOptions]
  }
  @scala.inline
  implicit class MappingOptionsOps[Self <: MappingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destBase")(js.undefined)
        ret
    }
    @scala.inline
    def withExt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(js.undefined)
        ret
    }
    @scala.inline
    def withExtDot(value: first | last): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extDot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtDot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extDot")(js.undefined)
        ret
    }
    @scala.inline
    def withFlatten(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatten")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlatten: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatten")(js.undefined)
        ret
    }
    @scala.inline
    def withRename(value: /* p */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(js.undefined)
        ret
    }
  }
  
}

