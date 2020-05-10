package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadingComponentProperties extends js.Object {
  var loading: js.UndefOr[Boolean] = js.native
  var loadingCompletedText: js.UndefOr[String] = js.native
  var loadingText: js.UndefOr[String] = js.native
  var showText: js.UndefOr[Boolean] = js.native
}

object LoadingComponentProperties {
  @scala.inline
  def apply(): LoadingComponentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadingComponentProperties]
  }
  @scala.inline
  implicit class LoadingComponentPropertiesOps[Self <: LoadingComponentProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingCompletedText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingCompletedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingCompletedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingCompletedText")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingText")(js.undefined)
        ret
    }
    @scala.inline
    def withShowText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showText")(js.undefined)
        ret
    }
  }
  
}

