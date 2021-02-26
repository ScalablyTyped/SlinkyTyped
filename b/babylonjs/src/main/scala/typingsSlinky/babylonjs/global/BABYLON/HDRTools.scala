package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.CubeMapInfo
import typingsSlinky.babylonjs.BABYLON.HDRInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.HDRTools")
@js.native
class HDRTools ()
  extends typingsSlinky.babylonjs.BABYLON.HDRTools
/* static members */
object HDRTools {
  
  @JSGlobal("BABYLON.HDRTools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the cubemap information (each faces texture data) extracted from an RGBE texture.
    * This RGBE texture needs to store the information as a panorama.
    *
    * More information on this format are available here:
    * https://en.wikipedia.org/wiki/RGBE_image_format
    *
    * @param buffer The binary file stored in an array buffer.
    * @param size The expected size of the extracted cubemap.
    * @return The Cube Map information.
    */
  @JSGlobal("BABYLON.HDRTools.GetCubeMapTextureData")
  @js.native
  def GetCubeMapTextureData(buffer: js.typedarray.ArrayBuffer, size: Double): CubeMapInfo = js.native
  
  @JSGlobal("BABYLON.HDRTools.Ldexp")
  @js.native
  def Ldexp: js.Any = js.native
  @scala.inline
  def Ldexp_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ldexp")(x.asInstanceOf[js.Any])
  
  /**
    * Reads header information from an RGBE texture stored in a native array.
    * More information on this format are available here:
    * https://en.wikipedia.org/wiki/RGBE_image_format
    *
    * @param uint8array The binary file stored in  native array.
    * @return The header information.
    */
  @JSGlobal("BABYLON.HDRTools.RGBE_ReadHeader")
  @js.native
  def RGBE_ReadHeader(uint8array: js.typedarray.Uint8Array): HDRInfo = js.native
  
  /**
    * Returns the pixels data extracted from an RGBE texture.
    * This pixels will be stored left to right up to down in the R G B order in one array.
    *
    * More information on this format are available here:
    * https://en.wikipedia.org/wiki/RGBE_image_format
    *
    * @param uint8array The binary file stored in an array buffer.
    * @param hdrInfo The header information of the file.
    * @return The pixels data in RGB right to left up to down order.
    */
  @JSGlobal("BABYLON.HDRTools.RGBE_ReadPixels")
  @js.native
  def RGBE_ReadPixels(uint8array: js.typedarray.Uint8Array, hdrInfo: HDRInfo): js.typedarray.Float32Array = js.native
  
  @JSGlobal("BABYLON.HDRTools.RGBE_ReadPixels_NOT_RLE")
  @js.native
  def RGBE_ReadPixels_NOT_RLE: js.Any = js.native
  @scala.inline
  def RGBE_ReadPixels_NOT_RLE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RGBE_ReadPixels_NOT_RLE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.HDRTools.RGBE_ReadPixels_RLE")
  @js.native
  def RGBE_ReadPixels_RLE: js.Any = js.native
  @scala.inline
  def RGBE_ReadPixels_RLE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RGBE_ReadPixels_RLE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.HDRTools.Rgbe2float")
  @js.native
  def Rgbe2float: js.Any = js.native
  @scala.inline
  def Rgbe2float_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rgbe2float")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.HDRTools.readStringLine")
  @js.native
  def readStringLine: js.Any = js.native
  @scala.inline
  def readStringLine_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readStringLine")(x.asInstanceOf[js.Any])
}
