package typingsSlinky.ejWebAll.ej.TagCloud

import typingsSlinky.ejWebAll.ej.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Event triggers when the TagCloud items are clicked
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  /** Event triggers when the TagCloud are created
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Specify the CSS class to button to achieve custom theme.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** The dataSource contains the list of data to display in a cloud format. Each data contains a link URL, frequency to categorize the font size and a display text.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Event triggers when the TagCloud are destroyed
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Sets the TagCloud and tag items direction as right to left alignment.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Defines the mapping fields for the data items of the TagCloud.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.native
  /** Defines the format for the TagCloud to display the tag items.See Format
    * @Default {ej.Format.Cloud}
    */
  var format: js.UndefOr[String | Format] = js.native
  /** Specifies the list of HTML attributes to be added to TagCloud control.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Sets the maximum font size value for the tag items. The font size for the tag items will be generated in between the minimum and maximum font size values.
    * @Default {40px}
    */
  var maxFontSize: js.UndefOr[String | Double] = js.native
  /** Sets the minimum font size value for the tag items. The font size for the tag items will be generated in between the minimum and maximum font size values.
    * @Default {10px}
    */
  var minFontSize: js.UndefOr[String | Double] = js.native
  /** Event triggers when the cursor leaves out from a tag item
    */
  var mouseout: js.UndefOr[js.Function1[/* e */ MouseoutEventArgs, Unit]] = js.native
  /** Event triggers when the cursor hovers on a tag item
    */
  var mouseover: js.UndefOr[js.Function1[/* e */ MouseoverEventArgs, Unit]] = js.native
  /** Define the query to retrieve the data from online server. The query is used only when the online dataSource is used.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.native
  /** Shows or hides the TagCloud title. When this set to false, it hides the TagCloud header.
    * @Default {true}
    */
  var showTitle: js.UndefOr[Boolean] = js.native
  /** Sets the title image for the TagCloud. To show the title image, the showTitle property should be enabled.
    * @Default {null}
    */
  var titleImage: js.UndefOr[String] = js.native
  /** Sets the title text for the TagCloud. To show the title text, the showTitle property should be enabled.
    * @Default {Title}
    */
  var titleText: js.UndefOr[String] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: /* e */ ClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: /* e */ CreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* e */ DestroyEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: Fields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String | Format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFontSize(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinFontSize(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseout(value: /* e */ MouseoutEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseout")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseover(value: /* e */ MouseoverEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleImage")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleText")(js.undefined)
        ret
    }
  }
  
}

