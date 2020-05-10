package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgColorPicker
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * The event is fired when a color is selected.
  	 *
  	 * Function takes arguments evt and ui.
  	 * Use ui.color to get a reference to the color object.
  	 */
  var colorSelected: js.UndefOr[ColorSelectedEvent] = js.native
  /**
  	 * Gets/Sets the default colors. Default colors are the ones displayed in the upper table of the color picker.
  	 *             The array should contain arrays that contain the color values for every next row.
  	 *
  	 */
  var colors: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the standard colors. Standard colors are the ones displayed in the color picker bottom,
  	 *             visually separated from the default colors. The array should contain the color values.
  	 *
  	 */
  var standardColors: js.UndefOr[js.Array[_]] = js.native
}

object IgColorPicker {
  @scala.inline
  def apply(): IgColorPicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgColorPicker]
  }
  @scala.inline
  implicit class IgColorPickerOps[Self <: IgColorPicker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorSelected(value: (/* event */ Event_, /* ui */ ColorSelectedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSelected")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColorSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: String): Self = {
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
    def withStandardColors(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardColors")(js.undefined)
        ret
    }
  }
  
}

