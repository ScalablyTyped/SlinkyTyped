package typingsSlinky.jupyterlabMarkdownviewer.widgetMod.MarkdownViewerFactory

import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IFileType
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typingsSlinky.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a MimeDocumentFactory.
  */
@js.native
trait IOptions extends IWidgetFactoryOptions[Widget] {
  /**
    * The primary file type associated with the document.
    */
  var primaryFileType: IFileType = js.native
  /**
    * The rendermime instance.
    */
  var rendermime: IRenderMimeRegistry = js.native
}

object IOptions {
  @scala.inline
  def apply(
    fileTypes: js.Array[String],
    name: String,
    primaryFileType: IFileType,
    rendermime: IRenderMimeRegistry
  ): IOptions = {
    val __obj = js.Dynamic.literal(fileTypes = fileTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], primaryFileType = primaryFileType.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrimaryFileType(value: IFileType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryFileType")(value.asInstanceOf[js.Any])
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

