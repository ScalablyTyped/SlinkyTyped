package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.email
import typingsSlinky.devextreme.devextremeStrings.password
import typingsSlinky.devextreme.devextremeStrings.search
import typingsSlinky.devextreme.devextremeStrings.tel
import typingsSlinky.devextreme.devextremeStrings.text
import typingsSlinky.devextreme.devextremeStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTextBoxOptions[T] extends dxTextEditorOptions[T] {
  /** Specifies the maximum number of characters you can enter into the textbox. */
  var maxLength: js.UndefOr[String | Double] = js.native
  /** The "mode" attribute value of the actual HTML input element representing the text box. */
  var mode: js.UndefOr[email | password | search | tel | text | url] = js.native
  /** Specifies a value the widget displays. */
  @JSName("value")
  var value_dxTextBoxOptions: js.UndefOr[String] = js.native
}

object dxTextBoxOptions {
  @scala.inline
  def apply[T](): dxTextBoxOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTextBoxOptions[T]]
  }
  @scala.inline
  implicit class dxTextBoxOptionsOps[Self[t] <: dxTextBoxOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withMaxLength(value: String | Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: email | password | search | tel | text | url): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

