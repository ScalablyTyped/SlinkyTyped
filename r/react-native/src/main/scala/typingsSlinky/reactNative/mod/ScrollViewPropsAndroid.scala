package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.always
import typingsSlinky.reactNative.reactNativeStrings.auto
import typingsSlinky.reactNative.reactNativeStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollViewPropsAndroid extends js.Object {
  /**
    * Sometimes a scrollview takes up more space than its content fills.
    * When this is the case, this prop will fill the rest of the
    * scrollview with a color to avoid setting a background and creating
    * unnecessary overdraw. This is an advanced optimization that is not
    * needed in the general case.
    */
  var endFillColor: js.UndefOr[String] = js.native
  /**
    * Fades out the edges of the the scroll content.
    *
    * If the value is greater than 0, the fading edges will be set accordingly
    * to the current scroll direction and position,
    * indicating if there is more content to show.
    *
    * The default value is 0.
    * @platform android
    */
  var fadingEdgeLength: js.UndefOr[Double] = js.native
  /**
    * Enables nested scrolling for Android API level 21+. Nested scrolling is supported by default on iOS.
    */
  var nestedScrollEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Used to override default value of overScroll mode.
    * Possible values:
    *   - 'auto' - Default value, allow a user to over-scroll this view only if the content is large enough to meaningfully scroll.
    *   - 'always' - Always allow a user to over-scroll this view.
    *   - 'never' - Never allow a user to over-scroll this view.
    */
  var overScrollMode: js.UndefOr[auto | always | never] = js.native
  /**
    * Causes the scrollbars not to turn transparent when they are not in use. The default value is false.
    */
  var persistentScrollbar: js.UndefOr[Boolean] = js.native
  /**
    * Tag used to log scroll performance on this scroll view. Will force
    * momentum events to be turned on (see sendMomentumEvents). This doesn't do
    * anything out of the box and you need to implement a custom native
    * FpsListener for it to be useful.
    * @platform android
    */
  var scrollPerfTag: js.UndefOr[String] = js.native
}

object ScrollViewPropsAndroid {
  @scala.inline
  def apply(): ScrollViewPropsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollViewPropsAndroid]
  }
  @scala.inline
  implicit class ScrollViewPropsAndroidOps[Self <: ScrollViewPropsAndroid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndFillColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endFillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endFillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFadingEdgeLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadingEdgeLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadingEdgeLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadingEdgeLength")(js.undefined)
        ret
    }
    @scala.inline
    def withNestedScrollEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedScrollEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestedScrollEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedScrollEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOverScrollMode(value: auto | always | never): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overScrollMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverScrollMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overScrollMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentScrollbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistentScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentScrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollPerfTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPerfTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollPerfTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPerfTag")(js.undefined)
        ret
    }
  }
  
}

