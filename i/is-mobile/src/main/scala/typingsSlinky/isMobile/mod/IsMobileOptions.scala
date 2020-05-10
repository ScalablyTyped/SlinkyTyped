package typingsSlinky.isMobile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsMobileOptions extends js.Object {
  var featureDetect: js.UndefOr[Boolean] = js.native
  var tablet: js.UndefOr[Boolean] = js.native
  var ua: js.UndefOr[String | HttpRequestInterfaceMock] = js.native
}

object IsMobileOptions {
  @scala.inline
  def apply(): IsMobileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsMobileOptions]
  }
  @scala.inline
  implicit class IsMobileOptionsOps[Self <: IsMobileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatureDetect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureDetect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureDetect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureDetect")(js.undefined)
        ret
    }
    @scala.inline
    def withTablet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTablet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablet")(js.undefined)
        ret
    }
    @scala.inline
    def withUa(value: String | HttpRequestInterfaceMock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ua")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ua")(js.undefined)
        ret
    }
  }
  
}

