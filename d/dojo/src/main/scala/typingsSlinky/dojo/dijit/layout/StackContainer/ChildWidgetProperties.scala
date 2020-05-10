package typingsSlinky.dojo.dijit.layout.StackContainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/StackContainer.ChildWidgetProperties.html
  *
  * These properties can be specified for the children of a StackContainer.
  * 
  */
@js.native
trait ChildWidgetProperties extends js.Object {
  /**
    * True if user can close (destroy) this child, such as (for example) clicking the X on the tab.
    * 
    */
  var closable: Boolean = js.native
  /**
    * Specifies that the button to select this pane should be disabled.
    * Doesn't affect programmatic selection of the pane, nor does it deselect the pane if it is currently selected.
    * 
    */
  var disabled: Boolean = js.native
  /**
    * CSS Class specifying icon to use in label associated with this pane.
    * 
    */
  var iconClass: String = js.native
  /**
    * Specifies that this widget should be the initially displayed pane.
    * Note: to change the selected child use dijit/layout/StackContainer.selectChild
    * 
    */
  var selected: Boolean = js.native
  /**
    * When true, display title of this widget as tab label etc., rather than just using
    * icon specified in iconClass
    * 
    */
  var showTitle: Boolean = js.native
}

object ChildWidgetProperties {
  @scala.inline
  def apply(closable: Boolean, disabled: Boolean, iconClass: String, selected: Boolean, showTitle: Boolean): ChildWidgetProperties = {
    val __obj = js.Dynamic.literal(closable = closable.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], iconClass = iconClass.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], showTitle = showTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildWidgetProperties]
  }
  @scala.inline
  implicit class ChildWidgetPropertiesOps[Self <: ChildWidgetProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClosable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

