package typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jupyterlabApplication.anon.Browser
import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.ITreeResolver.Paths
import typingsSlinky.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface for a front-end tree route resolver.
  */
@js.native
trait ITreeResolver extends js.Object {
  
  /**
    * A promise that resolves to the routed tree paths or null.
    */
  val paths: js.Promise[Paths] = js.native
}
/**
  * A namespace for tree resolver types.
  */
@JSImport("@jupyterlab/application/lib/frontend", "JupyterFrontEnd.ITreeResolver")
@js.native
object ITreeResolver extends TopLevel[Token[ITreeResolver]] {
  
  /**
    * The browser and file paths if the tree resolver encountered and handled
    * a tree URL or `null` if not. Empty string paths should be ignored.
    */
  type Paths = Browser | Null
}
