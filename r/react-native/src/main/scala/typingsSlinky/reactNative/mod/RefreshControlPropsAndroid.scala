package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshControlPropsAndroid extends ViewProps {
  /**
    * The colors (at least one) that will be used to draw the refresh indicator.
    */
  var colors: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether the pull to refresh functionality is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The background color of the refresh indicator.
    */
  var progressBackgroundColor: js.UndefOr[String] = js.native
  /**
    * Progress view top offset
    * @platform android
    */
  var progressViewOffset: js.UndefOr[Double] = js.native
  /**
    * Size of the refresh indicator, see RefreshControl.SIZE.
    */
  var size: js.UndefOr[Double] = js.native
}

object RefreshControlPropsAndroid {
  @scala.inline
  def apply(): RefreshControlPropsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshControlPropsAndroid]
  }
  @scala.inline
  implicit class RefreshControlPropsAndroidOps[Self <: RefreshControlPropsAndroid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressViewOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressViewOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressViewOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressViewOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

