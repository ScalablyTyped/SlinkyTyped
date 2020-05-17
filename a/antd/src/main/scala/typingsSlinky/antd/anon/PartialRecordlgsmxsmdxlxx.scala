package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<'lg' | 'sm' | 'xs' | 'md' | 'xl' | 'xxl', boolean>> */
@js.native
trait PartialRecordlgsmxsmdxlxx extends js.Object {
  var lg: js.UndefOr[Boolean] = js.native
  var md: js.UndefOr[Boolean] = js.native
  var sm: js.UndefOr[Boolean] = js.native
  var xl: js.UndefOr[Boolean] = js.native
  var xs: js.UndefOr[Boolean] = js.native
  var xxl: js.UndefOr[Boolean] = js.native
}

object PartialRecordlgsmxsmdxlxx {
  @scala.inline
  def apply(): PartialRecordlgsmxsmdxlxx = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordlgsmxsmdxlxx]
  }
  @scala.inline
  implicit class PartialRecordlgsmxsmdxlxxOps[Self <: PartialRecordlgsmxsmdxlxx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLg(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lg")(js.undefined)
        ret
    }
    @scala.inline
    def withMd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md")(js.undefined)
        ret
    }
    @scala.inline
    def withSm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sm")(js.undefined)
        ret
    }
    @scala.inline
    def withXl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xl")(js.undefined)
        ret
    }
    @scala.inline
    def withXs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xs")(js.undefined)
        ret
    }
    @scala.inline
    def withXxl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xxl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXxl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xxl")(js.undefined)
        ret
    }
  }
  
}

