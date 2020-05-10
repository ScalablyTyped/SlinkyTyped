package typingsSlinky.reactNative.mod

import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.reactNativeStrings.clip
import typingsSlinky.reactNative.reactNativeStrings.head
import typingsSlinky.reactNative.reactNativeStrings.middle
import typingsSlinky.reactNative.reactNativeStrings.tail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextProps
  extends AccessibilityProps
     with TextPropsIOS
     with TextPropsAndroid {
  /**
    * Specifies whether fonts should scale to respect Text Size accessibility settings.
    * The default is `true`.
    */
  var allowFontScaling: js.UndefOr[Boolean] = js.native
  /**
    * This can be one of the following values:
    *
    * - `head` - The line is displayed so that the end fits in the container and the missing text
    * at the beginning of the line is indicated by an ellipsis glyph. e.g., "...wxyz"
    * - `middle` - The line is displayed so that the beginning and end fit in the container and the
    * missing text in the middle is indicated by an ellipsis glyph. "ab...yz"
    * - `tail` - The line is displayed so that the beginning fits in the container and the
    * missing text at the end of the line is indicated by an ellipsis glyph. e.g., "abcd..."
    * - `clip` - Lines are not drawn past the edge of the text container.
    *
    * The default is `tail`.
    *
    * `numberOfLines` must be set in conjunction with this prop.
    *
    * > `clip` is working only for iOS
    */
  var ellipsizeMode: js.UndefOr[head | middle | tail | clip] = js.native
  /**
    * Line Break mode. Works only with numberOfLines.
    * clip is working only for iOS
    */
  var lineBreakMode: js.UndefOr[head | middle | tail | clip] = js.native
  /**
    * Specifies largest possible scale a font can reach when allowFontScaling is enabled. Possible values:
    * - null/undefined (default): inherit from the parent node or the global default (0)
    * - 0: no max, ignore parent/global default
    * - >= 1: sets the maxFontSizeMultiplier of this node to this value
    */
  var maxFontSizeMultiplier: js.UndefOr[Double | Null] = js.native
  /**
    * Used to reference react managed views from native code.
    */
  var nativeID: js.UndefOr[String] = js.native
  /**
    * Used to truncate the text with an ellipsis after computing the text
    * layout, including line wrapping, such that the total number of lines
    * does not exceed this number.
    *
    * This prop is commonly used with `ellipsizeMode`.
    */
  var numberOfLines: js.UndefOr[Double] = js.native
  /**
    * Invoked on mount and layout changes with
    *
    * {nativeEvent: { layout: {x, y, width, height}}}.
    */
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.native
  /**
    * This function is called on long press.
    * e.g., `onLongPress={this.increaseSize}>``
    */
  var onLongPress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  /**
    * This function is called on press.
    * Text intrinsically supports press handling with a default highlight state (which can be disabled with suppressHighlighting).
    */
  var onPress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  /**
    * @see https://facebook.github.io/react-native/docs/text.html#style
    */
  var style: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * Used to locate this view in end-to-end tests.
    */
  var testID: js.UndefOr[String] = js.native
}

object TextProps {
  @scala.inline
  def apply(): TextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextProps]
  }
  @scala.inline
  implicit class TextPropsOps[Self <: TextProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowFontScaling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFontScaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFontScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFontScaling")(js.undefined)
        ret
    }
    @scala.inline
    def withEllipsizeMode(value: head | middle | tail | clip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsizeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipsizeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsizeMode")(js.undefined)
        ret
    }
    @scala.inline
    def withLineBreakMode(value: head | middle | tail | clip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineBreakMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineBreakMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineBreakMode")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFontSizeMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFontSizeMultiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFontSizeMultiplier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFontSizeMultiplier")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFontSizeMultiplierNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFontSizeMultiplier")(null)
        ret
    }
    @scala.inline
    def withNativeID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeID")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfLines")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLongPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLongPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
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

