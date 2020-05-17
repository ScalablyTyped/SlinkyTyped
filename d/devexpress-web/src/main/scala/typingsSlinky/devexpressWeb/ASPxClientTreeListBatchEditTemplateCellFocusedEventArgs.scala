package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.BatchEditTemplateCellFocused event.
  */
@js.native
trait ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the currently processed column.
    */
  var column: ASPxClientTreeListColumn = js.native
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean = js.native
}

object ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs {
  @scala.inline
  def apply(column: ASPxClientTreeListColumn, handled: Boolean): ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientTreeListBatchEditTemplateCellFocusedEventArgsOps[Self <: ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: ASPxClientTreeListColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

