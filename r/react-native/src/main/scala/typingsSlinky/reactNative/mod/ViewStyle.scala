package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.dashed
import typingsSlinky.reactNative.reactNativeStrings.dotted
import typingsSlinky.reactNative.reactNativeStrings.hidden
import typingsSlinky.reactNative.reactNativeStrings.solid
import typingsSlinky.reactNative.reactNativeStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewStyle
  extends FlexStyle
     with ShadowStyleIOS
     with TransformsStyle {
  var backfaceVisibility: js.UndefOr[visible | hidden] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var borderBottomColor: js.UndefOr[String] = js.native
  var borderBottomEndRadius: js.UndefOr[Double] = js.native
  var borderBottomLeftRadius: js.UndefOr[Double] = js.native
  var borderBottomRightRadius: js.UndefOr[Double] = js.native
  var borderBottomStartRadius: js.UndefOr[Double] = js.native
  var borderColor: js.UndefOr[String] = js.native
  var borderEndColor: js.UndefOr[String] = js.native
  var borderLeftColor: js.UndefOr[String] = js.native
  var borderRadius: js.UndefOr[Double] = js.native
  var borderRightColor: js.UndefOr[String] = js.native
  var borderStartColor: js.UndefOr[String] = js.native
  var borderStyle: js.UndefOr[solid | dotted | dashed] = js.native
  var borderTopColor: js.UndefOr[String] = js.native
  var borderTopEndRadius: js.UndefOr[Double] = js.native
  var borderTopLeftRadius: js.UndefOr[Double] = js.native
  var borderTopRightRadius: js.UndefOr[Double] = js.native
  var borderTopStartRadius: js.UndefOr[Double] = js.native
  /**
    * Sets the elevation of a view, using Android's underlying
    * [elevation API](https://developer.android.com/training/material/shadows-clipping.html#Elevation).
    * This adds a drop shadow to the item and affects z-order for overlapping views.
    * Only supported on Android 5.0+, has no effect on earlier versions.
    *
    * @platform android
    */
  var elevation: js.UndefOr[Double] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var testID: js.UndefOr[String] = js.native
}

object ViewStyle {
  @scala.inline
  def apply(): ViewStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewStyle]
  }
  @scala.inline
  implicit class ViewStyleOps[Self <: ViewStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackfaceVisibility(value: visible | hidden): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backfaceVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackfaceVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backfaceVisibility")(js.undefined)
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
    def withBorderBottomColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBottomColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBottomEndRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomEndRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBottomEndRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomEndRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBottomLeftRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomLeftRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBottomLeftRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomLeftRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBottomRightRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomRightRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBottomRightRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomRightRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBottomStartRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomStartRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBottomStartRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomStartRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderEndColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderEndColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderEndColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderEndColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderLeftColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderLeftColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRightColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRightColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderStartColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStartColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderStartColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStartColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderStyle(value: solid | dotted | dashed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderTopColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderTopColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderTopEndRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopEndRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderTopEndRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopEndRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderTopLeftRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopLeftRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderTopLeftRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopLeftRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderTopRightRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopRightRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderTopRightRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopRightRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderTopStartRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopStartRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderTopStartRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopStartRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withElevation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElevation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withTestID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testID")(js.undefined)
        ret
    }
  }
  
}

