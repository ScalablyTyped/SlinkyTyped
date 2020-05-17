package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KhronosTextureContainer extends js.Object {
  var _upload2DCompressedLevels: js.Any = js.native
  /**
    * Gets the bytes of key value data
    */
  var bytesOfKeyValueData: Double = js.native
  /** contents of the KTX container file */
  var data: js.typedarray.ArrayBufferView = js.native
  /**
    * Gets the base internal format
    */
  var glBaseInternalFormat: Double = js.native
  /**
    * Gets the openGL format
    */
  var glFormat: Double = js.native
  /**
    * Gets the openGL internal format
    */
  var glInternalFormat: Double = js.native
  /**
    * Gets the openGL type
    */
  var glType: Double = js.native
  /**
    * Gets the openGL type size
    */
  var glTypeSize: Double = js.native
  /**
    * If the container has been made invalid (eg. constructor failed to correctly load array buffer)
    */
  var isInvalid: Boolean = js.native
  /**
    * Gets the load type
    */
  var loadType: Double = js.native
  /**
    * Gets the number of array elements
    */
  var numberOfArrayElements: Double = js.native
  /**
    * Gets the number of faces
    */
  var numberOfFaces: Double = js.native
  /**
    * Gets the number of mipmap levels
    */
  var numberOfMipmapLevels: Double = js.native
  /**
    * Gets image depth in pixels
    */
  var pixelDepth: Double = js.native
  /**
    * Gets image height in pixel
    */
  var pixelHeight: Double = js.native
  /**
    * Gets image width in pixel
    */
  var pixelWidth: Double = js.native
  /**
    * Uploads KTX content to a Babylon Texture.
    * It is assumed that the texture has already been created & is currently bound
    * @hidden
    */
  def uploadLevels(texture: InternalTexture, loadMipmaps: Boolean): Unit = js.native
}

object KhronosTextureContainer {
  @scala.inline
  def apply(
    _upload2DCompressedLevels: js.Any,
    bytesOfKeyValueData: Double,
    data: js.typedarray.ArrayBufferView,
    glBaseInternalFormat: Double,
    glFormat: Double,
    glInternalFormat: Double,
    glType: Double,
    glTypeSize: Double,
    isInvalid: Boolean,
    loadType: Double,
    numberOfArrayElements: Double,
    numberOfFaces: Double,
    numberOfMipmapLevels: Double,
    pixelDepth: Double,
    pixelHeight: Double,
    pixelWidth: Double,
    uploadLevels: (InternalTexture, Boolean) => Unit
  ): KhronosTextureContainer = {
    val __obj = js.Dynamic.literal(_upload2DCompressedLevels = _upload2DCompressedLevels.asInstanceOf[js.Any], bytesOfKeyValueData = bytesOfKeyValueData.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], glBaseInternalFormat = glBaseInternalFormat.asInstanceOf[js.Any], glFormat = glFormat.asInstanceOf[js.Any], glInternalFormat = glInternalFormat.asInstanceOf[js.Any], glType = glType.asInstanceOf[js.Any], glTypeSize = glTypeSize.asInstanceOf[js.Any], isInvalid = isInvalid.asInstanceOf[js.Any], loadType = loadType.asInstanceOf[js.Any], numberOfArrayElements = numberOfArrayElements.asInstanceOf[js.Any], numberOfFaces = numberOfFaces.asInstanceOf[js.Any], numberOfMipmapLevels = numberOfMipmapLevels.asInstanceOf[js.Any], pixelDepth = pixelDepth.asInstanceOf[js.Any], pixelHeight = pixelHeight.asInstanceOf[js.Any], pixelWidth = pixelWidth.asInstanceOf[js.Any], uploadLevels = js.Any.fromFunction2(uploadLevels))
    __obj.asInstanceOf[KhronosTextureContainer]
  }
  @scala.inline
  implicit class KhronosTextureContainerOps[Self <: KhronosTextureContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_upload2DCompressedLevels(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_upload2DCompressedLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBytesOfKeyValueData(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesOfKeyValueData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.typedarray.ArrayBufferView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlBaseInternalFormat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glBaseInternalFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlFormat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlInternalFormat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glInternalFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlTypeSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glTypeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInvalid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInvalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfArrayElements(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfArrayElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfFaces(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfFaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfMipmapLevels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfMipmapLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadLevels(value: (InternalTexture, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadLevels")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

