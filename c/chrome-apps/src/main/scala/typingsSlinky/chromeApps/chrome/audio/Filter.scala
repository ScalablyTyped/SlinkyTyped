package typingsSlinky.chromeApps.chrome.audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Device properties by which to filter the list of returned audio devices.
  * If the filter is not set or set to {}, returned device list will contain all available audio devices.
  */
@js.native
trait Filter extends js.Object {
  /**
    * If set, only audio devices whose active state matches this value will satisfy the filter.
    */
  var isActive: js.UndefOr[Boolean] = js.native
  /**
    * If set, only audio devices whose stream type is included in this list will satisfy the filter.
    */
  var streamTypes: js.UndefOr[js.Array[StreamType]] = js.native
}

object Filter {
  @scala.inline
  def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamTypes(value: js.Array[StreamType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamTypes")(js.undefined)
        ret
    }
  }
  
}

