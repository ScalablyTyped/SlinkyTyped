package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentProperties extends js.Object {
  /**
  		 * Matches the CSS style key and its available values.
  		 */
  var CSSStyles: js.UndefOr[StringDictionary[String]] = js.native
  /**
  		 * Corresponds to the aria-label accessibility attribute for this component
  		 */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
  		 * Corresponds to the role accessibility attribute for this component
  		 */
  var ariaRole: js.UndefOr[String] = js.native
  /**
  		 * Corresponds to the aria-selected accessibility attribute for this component
  		 */
  var ariaSelected: js.UndefOr[Boolean] = js.native
  /**
  		 * Corresponds to the display CSS property for the element
  		 */
  var display: js.UndefOr[DisplayType] = js.native
  /**
  		 * Whether the component is enabled in the DOM
  		 */
  var enabled: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double | String] = js.native
  /**
  		 * The position CSS property. Empty by default.
  		 * This is particularly useful if laying out components inside a FlexContainer and
  		 * the size of the component is meant to be a fixed size. In this case the position must be
  		 * set to 'absolute', with the parent FlexContainer having 'relative' position.
  		 * Without this the component will fail to correctly size itself
  		 */
  var position: js.UndefOr[PositionType] = js.native
  var width: js.UndefOr[Double | String] = js.native
}

object ComponentProperties {
  @scala.inline
  def apply(): ComponentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentProperties]
  }
  @scala.inline
  implicit class ComponentPropertiesOps[Self <: ComponentProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCSSStyles(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CSSStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCSSStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CSSStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaRole")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay(value: DisplayType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
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
    def withHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: PositionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
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

