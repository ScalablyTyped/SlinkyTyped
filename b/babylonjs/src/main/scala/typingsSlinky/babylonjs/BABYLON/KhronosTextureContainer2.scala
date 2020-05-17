package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def with_determineTranscodeFormat(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_determineTranscodeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadAsync(value: (js.typedarray.ArrayBufferView, InternalTexture) => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadAsync")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

