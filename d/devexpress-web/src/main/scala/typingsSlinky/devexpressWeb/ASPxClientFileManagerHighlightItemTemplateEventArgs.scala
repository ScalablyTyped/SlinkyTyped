package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.HighlightItemTemplate event.
  */
@js.native
trait ASPxClientFileManagerHighlightItemTemplateEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a string that is a filter value specified by the filter box.
    */
  var filterValue: String = js.native
  /**
    * Get the name of the cascading style sheet (CSS) class associated with an item in the highlighted state.
    */
  var highlightCssClassName: String = js.native
  /**
    * Gets the name of the item currently being processed.
    */
  var itemName: String = js.native
  /**
    * Gets an element containing the item template.
    */
  var templateElement: String = js.native
}

object ASPxClientFileManagerHighlightItemTemplateEventArgs {
  @scala.inline
  def apply(filterValue: String, highlightCssClassName: String, itemName: String, templateElement: String): ASPxClientFileManagerHighlightItemTemplateEventArgs = {
    val __obj = js.Dynamic.literal(filterValue = filterValue.asInstanceOf[js.Any], highlightCssClassName = highlightCssClassName.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any], templateElement = templateElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerHighlightItemTemplateEventArgs]
  }
  @scala.inline
  implicit class ASPxClientFileManagerHighlightItemTemplateEventArgsOps[Self <: ASPxClientFileManagerHighlightItemTemplateEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightCssClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCssClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateElement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

