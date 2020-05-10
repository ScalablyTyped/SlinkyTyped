package typingsSlinky.dojo.dojox.layout.GridContainerLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/layout/GridContainerLite.ChildWidgetProperties.html
  *
  * Properties set on children of a GridContainerLite
  *
  */
@js.native
trait ChildWidgetProperties extends js.Object {
  /**
    * Column of the grid to place the widget.
    * Defined only if dojo.require("dojox.layout.GridContainerLite") is done.
    *
    */
  var column: String = js.native
  /**
    * If true, the widget can not be draggable.
    * Defined only if dojo.require("dojox.layout.GridContainerLite") is done.
    *
    */
  var dragRestriction: Boolean = js.native
}

object ChildWidgetProperties {
  @scala.inline
  def apply(column: String, dragRestriction: Boolean): ChildWidgetProperties = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], dragRestriction = dragRestriction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildWidgetProperties]
  }
  @scala.inline
  implicit class ChildWidgetPropertiesOps[Self <: ChildWidgetProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragRestriction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragRestriction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

