package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.ddsMod.DDSInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "DDSTools")
@js.native
class DDSTools ()
  extends typingsSlinky.babylonjs.miscIndexMod.DDSTools

/* static members */
@JSImport("babylonjs/index", "DDSTools")
@js.native
object DDSTools extends js.Object {
  /**
    * Gets or sets a boolean indicating that LOD info is stored in alpha channel (false by default)
    */
  var StoreLODInAlphaChannel: Boolean = js.native
  var _ExtractLongWordOrder: js.Any = js.native
  var _FloatView: js.Any = js.native
  var _FromHalfFloat: js.Any = js.native
  var _GetFloatAsUIntRGBAArrayBuffer: js.Any = js.native
  var _GetFloatRGBAArrayBuffer: js.Any = js.native
  var _GetHalfFloatAsFloatRGBAArrayBuffer: js.Any = js.native
  var _GetHalfFloatAsUIntRGBAArrayBuffer: js.Any = js.native
  var _GetHalfFloatRGBAArrayBuffer: js.Any = js.native
  var _GetLuminanceArrayBuffer: js.Any = js.native
  var _GetRGBAArrayBuffer: js.Any = js.native
  var _GetRGBArrayBuffer: js.Any = js.native
  var _Int32View: js.Any = js.native
  var _ToHalfFloat: js.Any = js.native
  /**
    * Gets DDS information from an array buffer
    * @param data defines the array buffer view to read data from
    * @returns the DDS information
    */
  def GetDDSInfo(data: js.typedarray.ArrayBufferView): DDSInfo = js.native
  /**
    * Uploads DDS Levels to a Babylon Texture
    * @hidden
    */
  def UploadDDSLevels(
    engine: typingsSlinky.babylonjs.thinEngineMod.ThinEngine,
    texture: typingsSlinky.babylonjs.internalTextureMod.InternalTexture,
    data: js.typedarray.ArrayBufferView,
    info: DDSInfo,
    loadMipmaps: Boolean,
    faces: Double
  ): Unit = js.native
  def UploadDDSLevels(
    engine: typingsSlinky.babylonjs.thinEngineMod.ThinEngine,
    texture: typingsSlinky.babylonjs.internalTextureMod.InternalTexture,
    data: js.typedarray.ArrayBufferView,
    info: DDSInfo,
    loadMipmaps: Boolean,
    faces: Double,
    lodIndex: Double
  ): Unit = js.native
  def UploadDDSLevels(
    engine: typingsSlinky.babylonjs.thinEngineMod.ThinEngine,
    texture: typingsSlinky.babylonjs.internalTextureMod.InternalTexture,
    data: js.typedarray.ArrayBufferView,
    info: DDSInfo,
    loadMipmaps: Boolean,
    faces: Double,
    lodIndex: Double,
    currentFace: Double
  ): Unit = js.native
}

