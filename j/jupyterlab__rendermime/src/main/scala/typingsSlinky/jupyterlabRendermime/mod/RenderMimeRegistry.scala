package typingsSlinky.jupyterlabRendermime.mod

import typingsSlinky.jupyterlabRendermime.registryMod.RenderMimeRegistry.IOptions
import typingsSlinky.jupyterlabRendermime.registryMod.RenderMimeRegistry.IUrlResolverOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime", "RenderMimeRegistry")
@js.native
/**
  * Construct a new rendermime.
  *
  * @param options - The options for initializing the instance.
  */
class RenderMimeRegistry ()
  extends typingsSlinky.jupyterlabRendermime.registryMod.RenderMimeRegistry {
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/rendermime", "RenderMimeRegistry")
@js.native
object RenderMimeRegistry extends js.Object {
  /**
    * A default resolver that uses a session and a contents manager.
    */
  @js.native
  class UrlResolver protected ()
    extends typingsSlinky.jupyterlabRendermime.registryMod.RenderMimeRegistry.UrlResolver {
    /**
      * Create a new url resolver for a console.
      */
    def this(options: IUrlResolverOptions) = this()
  }
  
}

