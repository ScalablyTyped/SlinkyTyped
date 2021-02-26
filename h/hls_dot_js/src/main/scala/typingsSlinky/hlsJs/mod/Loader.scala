package typingsSlinky.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "Loader")
@js.native
class Loader protected () extends StObject {
  def this(config: LoaderConfig) = this()
  
  /**
    * Abort any loading in progress.
    */
  def abort(): Unit = js.native
  
  /**
    * Destroy loading context.
    */
  def destroy(): Unit = js.native
  
  /**
    * Start retrieving content located at given URL (HTTP GET).
    */
  def load(context: LoaderContext, config: LoaderConfig, callbacks: LoaderCallbacks): Unit = js.native
}
