package typingsSlinky.dojo.dojox.mobile.Accordion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/Accordion.ChildWidgetProperties.html
  *
  * These properties can be specified for the children of a dojox/mobile/Accordion.
  *
  */
@js.native
trait ChildWidgetProperties extends js.Object {
  /**
    * The alternate text of the Accordion title.
    *
    */
  var alt: String = js.native
  /**
    * The unselected icon of the Accordion title.
    *
    */
  var icon1: String = js.native
  /**
    * The selected icon of the Accordion title.
    *
    */
  var icon2: String = js.native
  /**
    * The position ("top,left,width,height") of the unselected aggregated icon of the Accordion title.
    *
    */
  var iconPos1: String = js.native
  /**
    * The position ("top,left,width,height") of the selected aggregated icon of the Accordion title.
    *
    */
  var iconPos2: String = js.native
  /**
    * The label of the Accordion title.
    *
    */
  var label: String = js.native
  /**
    * Specifies that the Accordion child must be lazily loaded.
    *
    */
  var `lazy`: Boolean = js.native
  /**
    * The selected state of the Accordion title.
    *
    */
  var selected: Boolean = js.native
}

object ChildWidgetProperties {
  @scala.inline
  def apply(
    alt: String,
    icon1: String,
    icon2: String,
    iconPos1: String,
    iconPos2: String,
    label: String,
    `lazy`: Boolean,
    selected: Boolean
  ): ChildWidgetProperties = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], icon1 = icon1.asInstanceOf[js.Any], icon2 = icon2.asInstanceOf[js.Any], iconPos1 = iconPos1.asInstanceOf[js.Any], iconPos2 = iconPos2.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildWidgetProperties]
  }
  @scala.inline
  implicit class ChildWidgetPropertiesOps[Self <: ChildWidgetProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconPos1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconPos1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconPos2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconPos2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLazy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

