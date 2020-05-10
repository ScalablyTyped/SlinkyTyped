package typingsSlinky.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEqualizerOptions extends js.Object {
  var equalizeByRow: js.UndefOr[Boolean] = js.native
  var equalizeOn: js.UndefOr[String] = js.native
  var equalizeOnStack: js.UndefOr[Boolean] = js.native
}

object IEqualizerOptions {
  @scala.inline
  def apply(): IEqualizerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEqualizerOptions]
  }
  @scala.inline
  implicit class IEqualizerOptionsOps[Self <: IEqualizerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEqualizeByRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalizeByRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEqualizeByRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalizeByRow")(js.undefined)
        ret
    }
    @scala.inline
    def withEqualizeOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalizeOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEqualizeOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalizeOn")(js.undefined)
        ret
    }
    @scala.inline
    def withEqualizeOnStack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalizeOnStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEqualizeOnStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalizeOnStack")(js.undefined)
        ret
    }
  }
  
}

