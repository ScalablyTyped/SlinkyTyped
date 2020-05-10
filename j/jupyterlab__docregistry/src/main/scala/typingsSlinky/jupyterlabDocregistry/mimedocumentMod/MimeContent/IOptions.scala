package typingsSlinky.jupyterlabDocregistry.mimedocumentMod.MimeContent

import typingsSlinky.jupyterlabDocregistry.jupyterlabDocregistryStrings.json
import typingsSlinky.jupyterlabDocregistry.jupyterlabDocregistryStrings.string
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a MimeDocument.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * Context
    */
  var context: IContext[IModel] = js.native
  /**
    * Preferred data type from the model.
    */
  var dataType: js.UndefOr[string | json] = js.native
  /**
    * The mime type.
    */
  var mimeType: String = js.native
  /**
    * The render timeout.
    */
  var renderTimeout: Double = js.native
  /**
    * The renderer instance.
    */
  var renderer: IRenderer = js.native
}

object IOptions {
  @scala.inline
  def apply(context: IContext[IModel], mimeType: String, renderTimeout: Double, renderer: IRenderer): IOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], renderTimeout = renderTimeout.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: IContext[IModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderer(value: IRenderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
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
  }
  
}

