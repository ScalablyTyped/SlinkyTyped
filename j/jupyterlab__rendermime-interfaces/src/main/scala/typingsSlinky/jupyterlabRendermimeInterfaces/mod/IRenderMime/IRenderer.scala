package typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime

import typingsSlinky.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A widget which displays the contents of a mime model.
  */
@js.native
trait IRenderer extends Widget {
  
  /**
    * Render a mime model.
    *
    * @param model - The mime model to render.
    *
    * @returns A promise which resolves when rendering is complete.
    *
    * #### Notes
    * This method may be called multiple times during the lifetime
    * of the widget to update it if and when new data is available.
    */
  def renderModel(model: IMimeModel): js.Promise[Unit] = js.native
}
