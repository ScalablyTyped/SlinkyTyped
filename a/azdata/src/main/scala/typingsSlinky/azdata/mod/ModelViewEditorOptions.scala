package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelViewEditorOptions extends js.Object {
  /**
  		 * Resource name for this editor
  		 * File icons might depend on file extension, language id or resource name
  		 * Resource name field needs to be set explitly if file icon for a particular Model View Editor depends on editor resource name
  		 */
  val resourceName: js.UndefOr[String] = js.native
  /**
  		 * Should the model view editor's context be kept around even when the editor is no longer visible? It is false by default
  		 */
  val retainContextWhenHidden: js.UndefOr[Boolean] = js.native
  /**
  		 * Does this model view editor support save?
  		 */
  val supportsSave: js.UndefOr[Boolean] = js.native
}

object ModelViewEditorOptions {
  @scala.inline
  def apply(): ModelViewEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelViewEditorOptions]
  }
  @scala.inline
  implicit class ModelViewEditorOptionsOps[Self <: ModelViewEditorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(js.undefined)
        ret
    }
    @scala.inline
    def withRetainContextWhenHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainContextWhenHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetainContextWhenHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainContextWhenHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsSave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsSave")(js.undefined)
        ret
    }
  }
  
}

