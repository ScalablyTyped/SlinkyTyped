package typingsSlinky.canvasjs.mod

import typingsSlinky.canvasjs.anon.Entries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartToolTipOptions extends js.Object {
  /**
    * While mouse hovers from one dataPoint to another there is a smooth transition in toolTip.
    * This effect can be controlled by animationEnabled Property. Setting it to false, will disable the animation and toolTip will directly switch from one dataPoint to the other.
    * Default: True
    * Example: True, False
    */
  var animationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Sets the background color of toolTip. Values can be “HTML Color Name” or “hex” code.
    * Default: white
    * Example: “red”, “#FF0000” ..
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * Sets the border color around Tool Tip. When not set it takes the color of corresponding dataSeries or dataPoint.
    * Default: dataSeries color/ dataPoint color
    * Example: "red", "#808080"..
    */
  var borderColor: js.UndefOr[String] = js.native
  /**
    * Sets the thickness of border around the toolTip in pixels. To display border around toolTip, set the borderThickness to a number greater than zero. Setting it to zero removes the border.
    * Default: 2
    * Example: 2,4 ..
    */
  var borderThickness: js.UndefOr[Double] = js.native
  /**
    * toolTip for entire chart can be set by adding content at toolTip object.
    * content can either be a string or a custom function that returns HTML/String to be displayed inside the toolTip.
    * Default: auto
    */
  var content: js.UndefOr[String] = js.native
  /**
    * A custom formatter function that returns the content (text/html) to be displayed inside the toolTip.
    */
  var contentFormatter: js.UndefOr[js.Function1[/* e */ Entries, String]] = js.native
  /**
    * Setting a value higher than 0 makes the corners of toolTip rounded. Higher the value, more rounded the corners are.
    * Default: 5
    * Options: 2,3,8 ..
    */
  var cornerRadius: js.UndefOr[Double] = js.native
  /**
    * Enables or Disables the toolTip for the chart.
    * Default: True
    * Example: True, False
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Sets the Font Color of toolTipContent. The value of fontColor can be a “HTML Color Name” or “hex” code.
    * Default: “black”
    * Example: “red”, “#FAC003″ ..
    */
  var fontColor: js.UndefOr[String] = js.native
  /**
    * Sets the Font Family of ToolTip Content.
    * Default: “Calibri, Arial, Georgia, serif”
    * Example: “arial” , “tahoma”, “verdana” ..
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    * Sets the font Size of ToolTip Content in pixels.
    * Default: 14
    * Example: 16,18,22 ..
    */
  var fontSize: js.UndefOr[Double] = js.native
  /**
    * Sets the Font Style of ToolTip Content. It can be set to one of the below options.
    * Default: “italic”
    * Example: “normal”, “italic” , “oblique”
    */
  var fontStyle: js.UndefOr[String] = js.native
  /**
    * Set the font Weight of ToolTip Content.
    * Default: “normal”
    * Example: “lighter”, “normal”, “bold” , “bolder”
    */
  var fontWeight: js.UndefOr[String] = js.native
  /**
    * Reverses the order in which items inside toolTip are shown.
    * Default: false
    * Example: true, false
    */
  var reversed: js.UndefOr[Boolean] = js.native
  /**
    * In a Multi-Series or a Combination Chart, it is often required to display all values common to x value in a single bubble.
    * Setting shared to true will show in a common bubble all the values of y from each series next to their name.
    * Default: True
    * Example: True, False
    */
  var shared: js.UndefOr[Boolean] = js.native
}

object ChartToolTipOptions {
  @scala.inline
  def apply(): ChartToolTipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartToolTipOptions]
  }
  @scala.inline
  implicit class ChartToolTipOptionsOps[Self <: ChartToolTipOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEnabled")(js.undefined)
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
    def withBorderThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withContentFormatter(value: /* e */ Entries => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContentFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withCornerRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(js.undefined)
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
    def withFontColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withReversed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReversed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(js.undefined)
        ret
    }
    @scala.inline
    def withShared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(js.undefined)
        ret
    }
  }
  
}

