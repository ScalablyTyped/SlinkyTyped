package typingsSlinky.plupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait pluploadSettings extends js.Object {
  /** Required Options */
  var browse_button: js.Any = js.native
  /** Chunk */
  var chunk_size: js.UndefOr[Double | String] = js.native
  var container: js.UndefOr[js.Any] = js.native
  /** Drag&Drop Files from the Desktop */
  var drop_element: js.UndefOr[String] = js.native
  var file_data_name: js.UndefOr[String] = js.native
  /** Filters */
  var filters: js.UndefOr[pluploadFilters] = js.native
  var flash_swf_url: js.UndefOr[String] = js.native
  /** Control the request */
  var headers: js.UndefOr[js.Any] = js.native
  /** Events */
  var init: js.UndefOr[pluploadEvents] = js.native
  var max_retries: js.UndefOr[Double] = js.native
  /** Useful Options */
  var multi_selection: js.UndefOr[Boolean] = js.native
  var multipart: js.UndefOr[Boolean] = js.native
  var multipart_params: js.UndefOr[js.Any] = js.native
  var required_features: js.UndefOr[String | js.Any] = js.native
  /** Client-Side Image Resize */
  var resize: js.UndefOr[pluploadResize] = js.native
  /** Optional */
  var runtimes: js.UndefOr[String] = js.native
  var silverlight_xap_url: js.UndefOr[String] = js.native
  var unique_names: js.UndefOr[Boolean] = js.native
  var url: String = js.native
}

object pluploadSettings {
  @scala.inline
  def apply(browse_button: js.Any, url: String): pluploadSettings = {
    val __obj = js.Dynamic.literal(browse_button = browse_button.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[pluploadSettings]
  }
  @scala.inline
  implicit class pluploadSettingsOps[Self <: pluploadSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowse_button(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browse_button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChunk_size(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunk_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunk_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunk_size")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withDrop_element(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop_element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrop_element: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop_element")(js.undefined)
        ret
    }
    @scala.inline
    def withFile_data_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_data_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile_data_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_data_name")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: pluploadFilters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withFlash_swf_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flash_swf_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlash_swf_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flash_swf_url")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: pluploadEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_retries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_retries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_retries")(js.undefined)
        ret
    }
    @scala.inline
    def withMulti_selection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi_selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMulti_selection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi_selection")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipart")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipart_params(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipart_params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipart_params: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipart_params")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired_features(value: String | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired_features: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_features")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: pluploadResize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntimes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntimes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimes")(js.undefined)
        ret
    }
    @scala.inline
    def withSilverlight_xap_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silverlight_xap_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilverlight_xap_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silverlight_xap_url")(js.undefined)
        ret
    }
    @scala.inline
    def withUnique_names(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique_names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnique_names: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique_names")(js.undefined)
        ret
    }
  }
  
}

