package typingsSlinky.grommet.anon

import typingsSlinky.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Xxlarge extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.native
  var large: js.UndefOr[MaxWidth] = js.native
  var medium: js.UndefOr[MaxWidth] = js.native
  var small: js.UndefOr[MaxWidth] = js.native
  var xlarge: js.UndefOr[MaxWidth] = js.native
  var xxlarge: js.UndefOr[MaxWidth] = js.native
}

object Xxlarge {
  @scala.inline
  def apply(): Xxlarge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Xxlarge]
  }
  @scala.inline
  implicit class XxlargeOps[Self <: Xxlarge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtendFunction1(value: /* args */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExtend(value: ExtendType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.undefined)
        ret
    }
    @scala.inline
    def withLarge(value: MaxWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(js.undefined)
        ret
    }
    @scala.inline
    def withMedium(value: MaxWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedium: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medium")(js.undefined)
        ret
    }
    @scala.inline
    def withSmall(value: MaxWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(js.undefined)
        ret
    }
    @scala.inline
    def withXlarge(value: MaxWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXlarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlarge")(js.undefined)
        ret
    }
    @scala.inline
    def withXxlarge(value: MaxWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xxlarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXxlarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xxlarge")(js.undefined)
        ret
    }
  }
  
}

