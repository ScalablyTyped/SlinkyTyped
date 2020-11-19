package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KhronosTextureContainer2 extends js.Object {
  
  var _determineTranscodeFormat: js.Any = js.native
  
  def uploadAsync(data: js.typedarray.ArrayBufferView, internalTexture: InternalTexture): js.Promise[Unit] = js.native
}
object KhronosTextureContainer2 {
  
  @scala.inline
  def apply(
    _determineTranscodeFormat: js.Any,
    uploadAsync: (js.typedarray.ArrayBufferView, InternalTexture) => js.Promise[Unit]
  ): KhronosTextureContainer2 = {
    val __obj = js.Dynamic.literal(_determineTranscodeFormat = _determineTranscodeFormat.asInstanceOf[js.Any], uploadAsync = js.Any.fromFunction2(uploadAsync))
    __obj.asInstanceOf[KhronosTextureContainer2]
  }
  
  @scala.inline
  implicit class KhronosTextureContainer2Ops[Self <: KhronosTextureContainer2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_determineTranscodeFormat(value: js.Any): Self = this.set("_determineTranscodeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadAsync(value: (js.typedarray.ArrayBufferView, InternalTexture) => js.Promise[Unit]): Self = this.set("uploadAsync", js.Any.fromFunction2(value))
  }
}
