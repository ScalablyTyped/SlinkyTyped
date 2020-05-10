package typingsSlinky.dojo.dijit.layout.LayoutContainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/LayoutContainer.ChildWidgetProperties.html
  *
  * These properties can be specified for the children of a LayoutContainer.
  * 
  */
@js.native
trait ChildWidgetProperties extends js.Object {
  /**
    * Synonym for region, except using "client" instead of "center".  Deprecated; use region instead.
    * 
    */
  var layoutAlign: String = js.native
  /**
    * Children with a higher layoutPriority will be placed closer to the LayoutContainer center,
    * between children with a lower layoutPriority.
    * 
    */
  var layoutPriority: Double = js.native
  /**
    * Values: "top", "bottom", "leading", "trailing", "left", "right", "center".
    * See the dijit/layout/LayoutContainer description for details.
    * 
    */
  var region: String = js.native
}

object ChildWidgetProperties {
  @scala.inline
  def apply(layoutAlign: String, layoutPriority: Double, region: String): ChildWidgetProperties = {
    val __obj = js.Dynamic.literal(layoutAlign = layoutAlign.asInstanceOf[js.Any], layoutPriority = layoutPriority.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildWidgetProperties]
  }
  @scala.inline
  implicit class ChildWidgetPropertiesOps[Self <: ChildWidgetProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayoutAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayoutPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutPriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

