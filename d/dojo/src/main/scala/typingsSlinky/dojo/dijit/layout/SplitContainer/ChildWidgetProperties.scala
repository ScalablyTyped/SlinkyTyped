package typingsSlinky.dojo.dijit.layout.SplitContainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/SplitContainer.ChildWidgetProperties.html
  *
  * These properties can be specified for the children of a SplitContainer.
  * 
  */
@js.native
trait ChildWidgetProperties extends js.Object {
  /**
    * Minimum size (width or height) of a child of a SplitContainer.
    * The value is relative to other children's sizeShare properties.
    * 
    */
  var sizeMin: Double = js.native
  /**
    * Size (width or height) of a child of a SplitContainer.
    * The value is relative to other children's sizeShare properties.
    * For example, if there are two children and each has sizeShare=10, then
    * each takes up 50% of the available space.
    * 
    */
  var sizeShare: Double = js.native
}

object ChildWidgetProperties {
  @scala.inline
  def apply(sizeMin: Double, sizeShare: Double): ChildWidgetProperties = {
    val __obj = js.Dynamic.literal(sizeMin = sizeMin.asInstanceOf[js.Any], sizeShare = sizeShare.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildWidgetProperties]
  }
  @scala.inline
  implicit class ChildWidgetPropertiesOps[Self <: ChildWidgetProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSizeMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizeShare(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeShare")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

