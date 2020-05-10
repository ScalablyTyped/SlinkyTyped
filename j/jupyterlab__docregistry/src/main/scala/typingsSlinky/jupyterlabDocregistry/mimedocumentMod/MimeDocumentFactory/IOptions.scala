package typingsSlinky.jupyterlabDocregistry.mimedocumentMod.MimeDocumentFactory

import typingsSlinky.jupyterlabDocregistry.jupyterlabDocregistryStrings.json
import typingsSlinky.jupyterlabDocregistry.jupyterlabDocregistryStrings.string
import typingsSlinky.jupyterlabDocregistry.mimedocumentMod.MimeDocument
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IFileType
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typingsSlinky.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a MimeDocumentFactory.
  */
@js.native
trait IOptions[T /* <: MimeDocument */] extends IWidgetFactoryOptions[T] {
  /**
    * Preferred data type from the model.
    */
  var dataType: js.UndefOr[string | json] = js.native
  /**
    * The primary file type associated with the document.
    */
  var primaryFileType: IFileType = js.native
  /**
    * The render timeout.
    */
  var renderTimeout: js.UndefOr[Double] = js.native
  /**
    * The rendermime instance.
    */
  var rendermime: IRenderMimeRegistry = js.native
}

object IOptions {
  @scala.inline
  def apply[T](
    fileTypes: js.Array[String],
    name: String,
    primaryFileType: IFileType,
    rendermime: IRenderMimeRegistry
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(fileTypes = fileTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], primaryFileType = primaryFileType.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
  @scala.inline
  implicit class IOptionsOps[Self[t] <: IOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withPrimaryFileType(value: IFileType): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryFileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRendermime(value: IRenderMimeRegistry): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendermime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataType(value: string | json): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataType: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTimeout(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderTimeout: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTimeout")(js.undefined)
        ret
    }
  }
  
}

