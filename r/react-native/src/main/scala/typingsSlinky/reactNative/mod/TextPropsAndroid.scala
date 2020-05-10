package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.balanced
import typingsSlinky.reactNative.reactNativeStrings.highQuality
import typingsSlinky.reactNative.reactNativeStrings.simple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextPropsAndroid extends js.Object {
  /**
    * Lets the user select text, to use the native copy and paste functionality.
    */
  var selectable: js.UndefOr[Boolean] = js.native
  /**
    * The highlight color of the text.
    */
  var selectionColor: js.UndefOr[String] = js.native
  /**
    * Set text break strategy on Android API Level 23+
    * default is `highQuality`.
    */
  var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.native
}

object TextPropsAndroid {
  @scala.inline
  def apply(): TextPropsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextPropsAndroid]
  }
  @scala.inline
  implicit class TextPropsAndroidOps[Self <: TextPropsAndroid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextBreakStrategy(value: simple | highQuality | balanced): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBreakStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextBreakStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBreakStrategy")(js.undefined)
        ret
    }
  }
  
}

