package typingsSlinky.dojo.dojox.layout.TableContainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/layout/TableContainer.ChildWidgetProperties.html
  *
  * Properties to be set on children of TableContainer
  *
  */
@js.native
trait ChildWidgetProperties extends js.Object {
  /**
    * The number of columns this widget should span.
    *
    */
  var colspan: Double = js.native
  /**
    * The label to display for a given widget
    *
    */
  var label: String = js.native
  /**
    * Setting spanLabel to true makes the widget take up both the
    * label and value cells. Defaults to false.
    *
    */
  var spanLabel: Boolean = js.native
  /**
    * The label to display for a given widget.  This is interchangeable
    * with the 'label' parameter, as some widgets already have a use
    * for the 'label', and this can be used instead to avoid conflicts.
    *
    */
  var title: String = js.native
}

object ChildWidgetProperties {
  @scala.inline
  def apply(colspan: Double, label: String, spanLabel: Boolean, title: String): ChildWidgetProperties = {
    val __obj = js.Dynamic.literal(colspan = colspan.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], spanLabel = spanLabel.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildWidgetProperties]
  }
  @scala.inline
  implicit class ChildWidgetPropertiesOps[Self <: ChildWidgetProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColspan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colspan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpanLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spanLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

