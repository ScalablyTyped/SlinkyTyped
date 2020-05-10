package typingsSlinky.extjs.Ext.form

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.extjs.Ext.IElement
import typingsSlinky.extjs.Ext.button.IButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileUploadField
  extends typingsSlinky.extjs.Ext.form.field.ITrigger {
  /** [Property] (Ext.button.Button) */
  var button: js.UndefOr[IButton] = js.native
  /** [Config Option] (Object) */
  var buttonConfig: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var buttonMargin: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var buttonOnly: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var buttonText: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var clearOnSubmit: js.UndefOr[Boolean] = js.native
  /** [Method] Only relevant if the instance s isFileUpload method returns true
  		* @returns HTMLElement
  		*/
  @JSName("extractFileInput")
  var extractFileInput_IFileUploadField: js.UndefOr[js.Function0[HTMLElement]] = js.native
  /** [Property] (Ext.Element) */
  var fileInputEl: js.UndefOr[IElement] = js.native
  /** [Method] Gets the markup to be inserted into the subTplMarkup  */
  var getTriggerMarkup: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
  		* @returns Boolean
  		*/
  @JSName("isFileUpload")
  var isFileUpload_IFileUploadField: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Allows addition of behavior to the show operation  */
  @JSName("onShow")
  var onShow_IFileUploadField: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Overridden to do nothing */
  @JSName("setValue")
  var setValue_IFileUploadField: js.UndefOr[js.Function0[Unit]] = js.native
}

object IFileUploadField {
  @scala.inline
  def apply(): IFileUploadField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileUploadField]
  }
  @scala.inline
  implicit class IFileUploadFieldOps[Self <: IFileUploadField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButton(value: IButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(js.undefined)
        ret
    }
    @scala.inline
    def withClearOnSubmit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnSubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearOnSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withExtractFileInput(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractFileInput")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutExtractFileInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractFileInput")(js.undefined)
        ret
    }
    @scala.inline
    def withFileInputEl(value: IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileInputEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileInputEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileInputEl")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTriggerMarkup(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTriggerMarkup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTriggerMarkup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTriggerMarkup")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFileUpload(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFileUpload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsFileUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFileUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withSetValue(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.undefined)
        ret
    }
  }
  
}

