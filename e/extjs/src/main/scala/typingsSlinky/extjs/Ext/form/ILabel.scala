package typingsSlinky.extjs.Ext.form

import typingsSlinky.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILabel extends IComponent {
  /** [Config Option] (String) */
  var forId: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  @JSName("html")
  var html_ILabel: js.UndefOr[String] = js.native
  /** [Method] Updates the label s innerHTML with the specified string
  		* @param text String The new label text
  		* @param encode Boolean False to skip HTML-encoding the text when rendering it to the label. This might be useful if you want to include tags in the label's innerHTML rather than rendering them as string literals per the default logic.
  		* @returns Ext.form.Label this
  		*/
  var setText: js.UndefOr[
    js.Function2[/* text */ js.UndefOr[String], /* encode */ js.UndefOr[Boolean], this.type]
  ] = js.native
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.native
}

object ILabel {
  @scala.inline
  def apply(): ILabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILabel]
  }
  @scala.inline
  implicit class ILabelOps[Self <: ILabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forId")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withSetText(value: (/* text */ js.UndefOr[String], /* encode */ js.UndefOr[Boolean]) => ILabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

