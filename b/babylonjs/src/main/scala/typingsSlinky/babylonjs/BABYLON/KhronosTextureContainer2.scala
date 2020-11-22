package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KhronosTextureContainer2 extends js.Object {
  
  /* protected */ def _createTexture(data: js.Any, internalTexture: InternalTexture): Unit = js.native
  /* protected */ def _createTexture(data: js.Any, internalTexture: InternalTexture, options: js.Any): Unit = js.native
  
  var _engine: js.Any = js.native
  
  /**
    * Stop all async operations and release resources.
    */
  def dispose(): Unit = js.native
  
  /** @hidden */
  def uploadAsync(data: js.typedarray.ArrayBufferView, internalTexture: InternalTexture): js.Promise[Unit] = js.native
  def uploadAsync(data: js.typedarray.ArrayBufferView, internalTexture: InternalTexture, options: js.Any): js.Promise[Unit] = js.native
}
