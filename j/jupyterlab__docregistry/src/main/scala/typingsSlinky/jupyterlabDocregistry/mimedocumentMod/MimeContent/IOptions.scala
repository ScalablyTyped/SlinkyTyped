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
trait IOptions extends js.Object {
  /**
    * Context
    */
  var context: IContext[IModel]
  /**
    * Preferred data type from the model.
    */
  var dataType: js.UndefOr[string | json] = js.undefined
  /**
    * The mime type.
    */
  var mimeType: String
  /**
    * The render timeout.
    */
  var renderTimeout: Double
  /**
    * The renderer instance.
    */
  var renderer: IRenderer
}

object IOptions {
  @scala.inline
  def apply(
    context: IContext[IModel],
    mimeType: String,
    renderTimeout: Double,
    renderer: IRenderer,
    dataType: string | json = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], renderTimeout = renderTimeout.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

