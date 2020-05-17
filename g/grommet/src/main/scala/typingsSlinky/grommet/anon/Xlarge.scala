package typingsSlinky.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Xlarge extends js.Object {
  var large: js.UndefOr[HeightSize] = js.native
  var medium: js.UndefOr[HeightSize] = js.native
  var small: js.UndefOr[HeightSize] = js.native
  var xlarge: js.UndefOr[HeightSize] = js.native
  var xsmall: js.UndefOr[HeightSize] = js.native
  var xxlarge: js.UndefOr[HeightSize] = js.native
}

object Xlarge {
  @scala.inline
  def apply(): Xlarge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Xlarge]
  }
  @scala.inline
  implicit class XlargeOps[Self <: Xlarge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLarge(value: HeightSize): Self = {
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
    def withMedium(value: HeightSize): Self = {
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
    def withSmall(value: HeightSize): Self = {
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
    def withXlarge(value: HeightSize): Self = {
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
    def withXsmall(value: HeightSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsmall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXsmall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsmall")(js.undefined)
        ret
    }
    @scala.inline
    def withXxlarge(value: HeightSize): Self = {
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

