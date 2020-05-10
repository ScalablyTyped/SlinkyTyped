package typingsSlinky.dojo.dojox.mobile.ListItem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/ListItem.ChildWidgetProperties.html
  *
  * These properties can be specified for the children of a dojox/mobile/ListItem.
  *
  */
@js.native
trait ChildWidgetProperties extends js.Object {
  /**
    * Specifies the position of the ListItem child ("left", "center" or "right").
    *
    */
  var layout: String = js.native
  /**
    * Disables touch events on the ListItem child.
    *
    */
  var preventTouch: Boolean = js.native
}

object ChildWidgetProperties {
  @scala.inline
  def apply(layout: String, preventTouch: Boolean): ChildWidgetProperties = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], preventTouch = preventTouch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildWidgetProperties]
  }
  @scala.inline
  implicit class ChildWidgetPropertiesOps[Self <: ChildWidgetProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventTouch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

