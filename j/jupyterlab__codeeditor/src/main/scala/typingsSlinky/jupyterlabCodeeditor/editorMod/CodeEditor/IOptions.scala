package typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jupyterlabCodeeditor.PartialIConfig
import typingsSlinky.jupyterlabCodeeditor.PartialISelectionStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize an editor.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The configuration options for the editor.
    */
  var config: js.UndefOr[PartialIConfig] = js.native
  /**
    * The host widget used by the editor.
    */
  var host: HTMLElement = js.native
  /**
    * The model used by the editor.
    */
  var model: IModel = js.native
  /**
    * The default selection style for the editor.
    */
  var selectionStyle: js.UndefOr[PartialISelectionStyle] = js.native
  /**
    * The desired uuid for the editor.
    */
  var uuid: js.UndefOr[String] = js.native
}

object IOptions {
  @scala.inline
  def apply(host: HTMLElement, model: IModel): IOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: PartialIConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionStyle(value: PartialISelectionStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(js.undefined)
        ret
    }
  }
  
}

