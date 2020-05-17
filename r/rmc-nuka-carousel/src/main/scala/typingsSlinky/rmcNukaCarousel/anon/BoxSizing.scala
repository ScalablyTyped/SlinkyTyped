package typingsSlinky.rmcNukaCarousel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxSizing extends js.Object {
  var MozBoxSizing: String = js.native
  var boxSizing: String = js.native
  var display: String = js.native
  var height: String = js.native
  var position: String = js.native
  var visibility: String = js.native
  var width: js.UndefOr[String] = js.native
}

object BoxSizing {
  @scala.inline
  def apply(
    MozBoxSizing: String,
    boxSizing: String,
    display: String,
    height: String,
    position: String,
    visibility: String
  ): BoxSizing = {
    val __obj = js.Dynamic.literal(MozBoxSizing = MozBoxSizing.asInstanceOf[js.Any], boxSizing = boxSizing.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxSizing]
  }
  @scala.inline
  implicit class BoxSizingOps[Self <: BoxSizing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMozBoxSizing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBoxSizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoxSizing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxSizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

