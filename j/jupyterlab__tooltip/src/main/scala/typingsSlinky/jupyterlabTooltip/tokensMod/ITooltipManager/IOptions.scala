package typingsSlinky.jupyterlabTooltip.tokensMod.ITooltipManager

import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsSlinky.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.IKernelConnection
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for tooltip-compatible objects.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The referent anchor the tooltip follows.
    */
  val anchor: Widget = js.native
  /**
    * The referent editor for the tooltip.
    */
  val editor: IEditor = js.native
  /**
    * The kernel the tooltip communicates with to populate itself.
    */
  val kernel: IKernelConnection = js.native
  /**
    * The renderer the tooltip uses to render API responses.
    */
  val rendermime: IRenderMimeRegistry = js.native
}

object IOptions {
  @scala.inline
  def apply(anchor: Widget, editor: IEditor, kernel: IKernelConnection, rendermime: IRenderMimeRegistry): IOptions = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: Widget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditor(value: IEditor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernel(value: IKernelConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRendermime(value: IRenderMimeRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendermime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

