package typingsSlinky.colresizable.colResizable

import typingsSlinky.colresizable.colresizableStrings.fit
import typingsSlinky.colresizable.colresizableStrings.flex
import typingsSlinky.colresizable.colresizableStrings.overflow
import typingsSlinky.jquery.JQueryMouseEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  /**
    * [default: false] When set to true it aims to remove all previously added enhancements such as events and additional DOM elements assigned by this plugin to
    * a single or collection of tables. It is required to disable a previously colResized table prior its removal from the document object tree.
    * [version: 1.0]
    */
  var disable: js.UndefOr[Boolean] = js.native
  /**
    * [default: [ ] ] An array of column indexes to be excluded, so it will not be possible to drag them manually.
    * [version: 1.6]
    */
  var disabledColumns: js.UndefOr[js.Array[Double]] = js.native
  /**
    * [default: "e-resize"]  Defines the cursor that will be used while the user is resizing a column.
    * [version: 1.3]
    */
  var dragCursor: js.UndefOr[String] = js.native
  /**
    * [default: (internal class)]  This attribute is used as the css class assigned to column anchors while being dragged. It can be used for visual feedback purposes.
    * [version: 1.0]
    */
  var draggingClass: js.UndefOr[String] = js.native
  /**
    * @deprecated use resizeMode instead
    * [default: true] It is used to set how the resize method works.
    * In fixed mode resizing a column does not alter total table width, which means that when a column is expanded the next one shrinks.
    * If fixed is set to false then table can change its width and each column can shrink or expand independently.
    * [version: 1.5]
    */
  var fixed: js.UndefOr[Boolean] = js.native
  /**
    * [default: false]  Flush is only effective when postbackSafe is enabled.
    * Its purpose is to remove all previously stored data related to the current table layout to get it back to its original layout preventing width restoration after postback.
    * [version: ]
    */
  var flush: js.UndefOr[Boolean] = js.native
  /**
    * [default: ""]  Its purpose is to allow column anchor customization by defining the HTML to be used in the column grips to provide some visual feedback.
    * It can be used in a wide range of ways to obtain very different outputs, and its flexibility can be increased by combining it with the draggingClass attribute.
    * [version: 1.0]
    */
  var gripInnerHtml: js.UndefOr[String] = js.native
  /**
    * [default: false]  This attribute can be used to prevent vertical expansion of the column anchors to fit the table height.
    * If it is set to true, column handler's size will be bounded to the first row's vertical size.
    * [version: 1.2]
    */
  var headerOnly: js.UndefOr[Boolean] = js.native
  /**
    * [default: "e-resize"]  This attribute can be used to customize the cursor that will be displayed when the user is positioned on the column anchors.
    * [version: 1.3]
    */
  var hoverCursor: js.UndefOr[String] = js.native
  /**
    * [default: false] When set to true the table layout is updated while dragging column anchors.
    * liveDrag enabled is more CPU consuming so it is not recommended for slow computers, specially when dealing with huge or extremely complicated tables.
    * [version: 1.0]
    */
  var liveDrag: js.UndefOr[Boolean] = js.native
  /**
    * [default: null]  If the target table contains an explicit margin-left CSS rule, the same value must be used in this attribute (for example: "auto", "20%", "10px").
    * The reason why it is needed it is because most browsers (all except of IE) don’t allow direct access to the current CSS rule applied to an element in
    * its original units (such as "%", "em" or "auto" values).
    * If you know any workaround which doesn’t involve iteration through all the styles defined in the site and any other external dependencies, please let me know!
    * [version: 1.3]
    */
  var marginLeft: js.UndefOr[String] = js.native
  /**
    * [default: null]  It behaves in exactly the same way than the marginLeft attribute but applied to the right margin.
    * [version: 1.3]
    */
  var marginRight: js.UndefOr[String] = js.native
  /**
    * [default: 15]  This value specifies the minimum width (measured in pixels) that is allowed for the columns.
    * [version: 1.1]
    */
  var minWidth: js.UndefOr[Double] = js.native
  /**
    * This event is fired while dragging a column anchor if liveDrag is enabled. It can be useful if the table is being used as a multiple range slider.
    * The callback function can obtain a reference to the updated table through the currentTarget attribute of the event retrieved by parameters
    * [version: 1.1]
    */
  var onDrag: js.UndefOr[FunctionCallback] = js.native
  /**
    * If a callback function is supplied it will be fired when the user has ended dragging a column anchor altering the previous table layout.
    * The callback function can obtain a reference to the updated table through the currentTarget attribute of the event retrieved by parameters
    * [version: 1.0]
    */
  var onResize: js.UndefOr[FunctionCallback] = js.native
  /**
    * [default: false]  This attribute should be set to true if the table is inside of an updatePanel or any other kind of partial page refresh using ajax.
    * Table's ID should be same before and after the partial partial refresh.
    * [version: 1.5]
    */
  var partialRefresh: js.UndefOr[Boolean] = js.native
  /**
    * [default: false]  This attribute can be used to specify that the manually selected column widths must remain unaltered after a postback or browser refresh.
    * This feature is mainly oriented to those pages created with server-side logic (codebehind), such as PHP or .NET, and it is only compatible with browsers
    * with sessionStorage support (all modern browsers).
    * However, if you are targeting older browsers (such as IE7 and IE8) you can still emulate sessionStorage using sessionStorage.js.
    * It is important to note that some browsers (IE and FF) doesn’t enable the sessionStorage object while running the website directly from the local file system,
    * so if you want to test this feature it is recommended to view the website through a web server or use browsers such as Chrome or Opera which doesn’t have this limitation.
    * Don't worry about compatibility issues, once your site is up on the internet, all browsers will act in exactly the same way.
    * [version: 1.3]
    */
  var postbackSafe: js.UndefOr[Boolean] = js.native
  /**
    * [default: 'fit']  It is used to set how the resize method works. Those are the possible values:
    * - 'fit': this is default resizing model, in which resizing a column does not alter table width, which means that when a column is expanded the next one shrinks.
    * - 'flex': in this mode tables can change its width and each column can shrink or expand independently if there is enough space in the parent container.
    *           If there is not enough space, columns will share its width as they are resized. Table will never get bigger than its parent.
    * - 'overflow': allows to resize columns with overflow of parent container.
    * [version: 1.6]
    */
  var resizeMode: js.UndefOr[fit | flex | overflow] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledColumns(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withDragCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggingClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggingClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggingClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggingClass")(js.undefined)
        ret
    }
    @scala.inline
    def withFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.undefined)
        ret
    }
    @scala.inline
    def withFlush(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.undefined)
        ret
    }
    @scala.inline
    def withGripInnerHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gripInnerHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGripInnerHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gripInnerHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrag(value: /* e */ JQueryMouseEventObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResize(value: /* e */ JQueryMouseEventObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.undefined)
        ret
    }
    @scala.inline
    def withPartialRefresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartialRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withPostbackSafe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postbackSafe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostbackSafe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postbackSafe")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeMode(value: fit | flex | overflow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeMode")(js.undefined)
        ret
    }
  }
  
}

