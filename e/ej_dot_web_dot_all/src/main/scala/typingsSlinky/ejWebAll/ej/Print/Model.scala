package typingsSlinky.ejWebAll.ej.Print

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Append the custom HTML after the selected content.
    * @Default {null}
    */
  var append: js.UndefOr[String] = js.native
  /** Event triggers before the document page or an element in it gets printed.
    */
  var beforeStart: js.UndefOr[js.Function1[/* e */ BeforeStartEventArgs, Unit]] = js.native
  /** Prepend a docType to the document frame.
    * @Default {&lt;!doctype html&gt;}
    */
  var docType: js.UndefOr[String] = js.native
  /** A selector that specifies a particular element to be excluded from printing.
    * @Default {null}
    */
  var excludeSelector: js.UndefOr[String] = js.native
  /** Specifies whether the URL of an external stylesheet can be included to customize and print that page.
    * @Default {null}
    */
  var externalStyles: js.UndefOr[String] = js.native
  /** Specifies whether the global styles can be applied to the element to be printed.
    * @Default {true}
    */
  var globalStyles: js.UndefOr[Boolean] = js.native
  /** Sets the height of the print window.
    * @Default {454}
    */
  var height: js.UndefOr[Double] = js.native
  /** Prepends the custom HTML before the selected content.
    * @Default {null}
    */
  var prepend: js.UndefOr[String] = js.native
  /** Allows printing the content in a new window.
    * @Default {false}
    */
  var printInNewWindow: js.UndefOr[Boolean] = js.native
  /** Sets the period of time to wait before printing the content.
    * @Default {1000}
    */
  var timeOutPeriod: js.UndefOr[Double] = js.native
  /** Sets the title of the print document.
    * @Default {null}
    */
  var title: js.UndefOr[String] = js.native
  /** Defines the width of the print window.
    * @Default {1024}
    */
  var width: js.UndefOr[Double] = js.native
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
    def withAppend(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeStart(value: /* e */ BeforeStartEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withDocType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docType")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalStyles(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepend(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrepend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepend")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintInNewWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printInNewWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintInNewWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printInNewWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeOutPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOutPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeOutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOutPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

