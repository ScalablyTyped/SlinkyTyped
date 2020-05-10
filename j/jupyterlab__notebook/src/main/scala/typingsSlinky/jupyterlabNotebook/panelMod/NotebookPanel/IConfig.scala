package typingsSlinky.jupyterlabNotebook.panelMod.NotebookPanel

import typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook.IEditorConfig
import typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook.INotebookConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Notebook config interface for NotebookPanel
  */
@js.native
trait IConfig extends js.Object {
  /**
    * A config object for cell editors
    */
  var editorConfig: IEditorConfig = js.native
  /**
    * Whether to shut down the kernel when closing the panel or not
    */
  var kernelShutdown: Boolean = js.native
  /**
    * A config object for notebook widget
    */
  var notebookConfig: INotebookConfig = js.native
}

object IConfig {
  @scala.inline
  def apply(editorConfig: IEditorConfig, kernelShutdown: Boolean, notebookConfig: INotebookConfig): IConfig = {
    val __obj = js.Dynamic.literal(editorConfig = editorConfig.asInstanceOf[js.Any], kernelShutdown = kernelShutdown.asInstanceOf[js.Any], notebookConfig = notebookConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
  @scala.inline
  implicit class IConfigOps[Self <: IConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditorConfig(value: IEditorConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernelShutdown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelShutdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotebookConfig(value: INotebookConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebookConfig")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

