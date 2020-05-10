package typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime

import typingsSlinky.jupyterlabRendermimeInterfaces.jupyterlabRendermimeInterfacesStrings.json
import typingsSlinky.jupyterlabRendermimeInterfaces.jupyterlabRendermimeInterfacesStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for using a RenderMime.IRenderer for output and read-only documents.
  */
@js.native
trait IExtension extends js.Object {
  /**
    * Preferred data type from the model.  Defaults to `string`.
    */
  val dataType: js.UndefOr[string | json] = js.native
  /**
    * The options used to open a document with the renderer factory.
    */
  val documentWidgetFactoryOptions: js.UndefOr[IDocumentWidgetFactoryOptions | js.Array[IDocumentWidgetFactoryOptions]] = js.native
  /**
    * The optional file type associated with the extension.
    */
  val fileTypes: js.UndefOr[js.Array[IFileType]] = js.native
  /**
    * The ID of the extension.
    *
    * #### Notes
    * The convention for extension IDs in JupyterLab is the full NPM package
    * name followed by a colon and a unique string token, e.g.
    * `'@jupyterlab/apputils-extension:settings'` or `'foo-extension:bar'`.
    */
  val id: String = js.native
  /**
    * The rank passed to `RenderMime.addFactory`.  If not given,
    * defaults to the `defaultRank` of the factory.
    */
  val rank: js.UndefOr[Double] = js.native
  /**
    * The timeout after user activity to re-render the data.
    */
  val renderTimeout: js.UndefOr[Double] = js.native
  /**
    * A renderer factory to be registered to render the MIME type.
    */
  val rendererFactory: IRendererFactory = js.native
}

object IExtension {
  @scala.inline
  def apply(id: String, rendererFactory: IRendererFactory): IExtension = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rendererFactory = rendererFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtension]
  }
  @scala.inline
  implicit class IExtensionOps[Self <: IExtension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRendererFactory(value: IRendererFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendererFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataType(value: string | json): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentWidgetFactoryOptions(value: IDocumentWidgetFactoryOptions | js.Array[IDocumentWidgetFactoryOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentWidgetFactoryOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentWidgetFactoryOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentWidgetFactoryOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withFileTypes(value: js.Array[IFileType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTimeout")(js.undefined)
        ret
    }
  }
  
}

