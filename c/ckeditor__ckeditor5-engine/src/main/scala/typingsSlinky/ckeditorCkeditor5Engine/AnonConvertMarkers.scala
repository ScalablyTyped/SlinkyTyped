package typingsSlinky.ckeditorCkeditor5Engine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConvertMarkers extends js.Object {
  var convertMarkers: js.UndefOr[Boolean] = js.native
  var rootName: js.UndefOr[String] = js.native
  var withoutSelection: js.UndefOr[Boolean] = js.native
}

object AnonConvertMarkers {
  @scala.inline
  def apply(): AnonConvertMarkers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonConvertMarkers]
  }
  @scala.inline
  implicit class AnonConvertMarkersOps[Self <: AnonConvertMarkers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvertMarkers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertMarkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertMarkers")(js.undefined)
        ret
    }
    @scala.inline
    def withRootName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootName")(js.undefined)
        ret
    }
    @scala.inline
    def withWithoutSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutSelection")(js.undefined)
        ret
    }
  }
  
}

