package typingsSlinky.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Large extends js.Object {
  var large: js.UndefOr[String] = js.native
  var medium: js.UndefOr[String] = js.native
  var small: js.UndefOr[String] = js.native
  var xlarge: js.UndefOr[String] = js.native
  var xsmall: js.UndefOr[String] = js.native
}

object Large {
  @scala.inline
  def apply(): Large = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Large]
  }
  @scala.inline
  implicit class LargeOps[Self <: Large] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLarge(value: String): Self = {
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
    def withMedium(value: String): Self = {
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
    def withSmall(value: String): Self = {
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
    def withXlarge(value: String): Self = {
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
    def withXsmall(value: String): Self = {
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
  }
  
}

