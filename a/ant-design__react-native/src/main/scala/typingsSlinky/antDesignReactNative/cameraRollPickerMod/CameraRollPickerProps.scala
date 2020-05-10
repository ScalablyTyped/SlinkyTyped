package typingsSlinky.antDesignReactNative.cameraRollPickerMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.GetPhotosParamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraRollPickerProps extends GetPhotosParamType {
  var backgroundColor: js.UndefOr[String] = js.native
  var callback: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var containerWidth: js.UndefOr[Double] = js.native
  var imageMargin: Double = js.native
  var imagesPerRow: Double = js.native
  var maximum: Double = js.native
  var selectSingleItem: js.UndefOr[Boolean] = js.native
  var selected: js.UndefOr[js.Array[_]] = js.native
  var selectedMarker: js.UndefOr[ReactElement] = js.native
}

object CameraRollPickerProps {
  @scala.inline
  def apply(first: Double, imageMargin: Double, imagesPerRow: Double, maximum: Double): CameraRollPickerProps = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], imageMargin = imageMargin.asInstanceOf[js.Any], imagesPerRow = imagesPerRow.asInstanceOf[js.Any], maximum = maximum.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraRollPickerProps]
  }
  @scala.inline
  implicit class CameraRollPickerPropsOps[Self <: CameraRollPickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImagesPerRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagesPerRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectSingleItem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectSingleItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectSingleItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectSingleItem")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedMarker(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedMarker")(js.undefined)
        ret
    }
  }
  
}

