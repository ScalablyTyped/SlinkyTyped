package typingsSlinky.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "TGATools")
@js.native
class TGATools ()
  extends typingsSlinky.babylonjs.miscIndexMod.TGATools
/* static members */
object TGATools {
  
  @JSImport("babylonjs/index", "TGATools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the header of a TGA file
    * @param data defines the TGA data
    * @returns the header
    */
  @JSImport("babylonjs/index", "TGATools.GetTGAHeader")
  @js.native
  def GetTGAHeader(data: js.typedarray.Uint8Array): js.Any = js.native
  
  /**
    * Uploads TGA content to a Babylon Texture
    * @hidden
    */
  @JSImport("babylonjs/index", "TGATools.UploadContent")
  @js.native
  def UploadContent(
    texture: typingsSlinky.babylonjs.internalTextureMod.InternalTexture,
    data: js.typedarray.Uint8Array
  ): Unit = js.native
  
  @JSImport("babylonjs/index", "TGATools._ORIGIN_BL")
  @js.native
  def _ORIGIN_BL: js.Any = js.native
  @scala.inline
  def _ORIGIN_BL_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ORIGIN_BL")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "TGATools._ORIGIN_BR")
  @js.native
  def _ORIGIN_BR: js.Any = js.native
  @scala.inline
  def _ORIGIN_BR_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ORIGIN_BR")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "TGATools._ORIGIN_MASK")
  @js.native
  def _ORIGIN_MASK: js.Any = js.native
  @scala.inline
  def _ORIGIN_MASK_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ORIGIN_MASK")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "TGATools._ORIGIN_SHIFT")
  @js.native
  def _ORIGIN_SHIFT: js.Any = js.native
  @scala.inline
  def _ORIGIN_SHIFT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ORIGIN_SHIFT")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "TGATools._ORIGIN_UL")
  @js.native
  def _ORIGIN_UL: js.Any = js.native
  @scala.inline
  def _ORIGIN_UL_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ORIGIN_UL")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "TGATools._ORIGIN_UR")
  @js.native
  def _ORIGIN_UR: js.Any = js.native
  @scala.inline
  def _ORIGIN_UR_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ORIGIN_UR")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "TGATools._TYPE_GREY")
  @js.native
  def _TYPE_GREY: js.Any = js.native
  @scala.inline
  def _TYPE_GREY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TYPE_GREY")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "TGATools._TYPE_INDEXED")
  @js.native
  def _TYPE_INDEXED: js.Any = js.native
  @scala.inline
  def _TYPE_INDEXED_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TYPE_INDEXED")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "TGATools._TYPE_RGB")
  @js.native
  def _TYPE_RGB: js.Any = js.native
  @scala.inline
  def _TYPE_RGB_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TYPE_RGB")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "TGATools._TYPE_RLE_GREY")
  @js.native
  def _TYPE_RLE_GREY: js.Any = js.native
  @scala.inline
  def _TYPE_RLE_GREY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TYPE_RLE_GREY")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "TGATools._TYPE_RLE_INDEXED")
  @js.native
  def _TYPE_RLE_INDEXED: js.Any = js.native
  @scala.inline
  def _TYPE_RLE_INDEXED_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TYPE_RLE_INDEXED")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "TGATools._TYPE_RLE_RGB")
  @js.native
  def _TYPE_RLE_RGB: js.Any = js.native
  @scala.inline
  def _TYPE_RLE_RGB_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TYPE_RLE_RGB")(x.asInstanceOf[js.Any])
  
  /** @hidden */
  @JSImport("babylonjs/index", "TGATools._getImageData16bits")
  @js.native
  def _getImageData16bits(
    header: js.Any,
    palettes: js.typedarray.Uint8Array,
    pixel_data: js.typedarray.Uint8Array,
    y_start: Double,
    y_step: Double,
    y_end: Double,
    x_start: Double,
    x_step: Double,
    x_end: Double
  ): js.typedarray.Uint8Array = js.native
  
  /** @hidden */
  @JSImport("babylonjs/index", "TGATools._getImageData24bits")
  @js.native
  def _getImageData24bits(
    header: js.Any,
    palettes: js.typedarray.Uint8Array,
    pixel_data: js.typedarray.Uint8Array,
    y_start: Double,
    y_step: Double,
    y_end: Double,
    x_start: Double,
    x_step: Double,
    x_end: Double
  ): js.typedarray.Uint8Array = js.native
  
  /** @hidden */
  @JSImport("babylonjs/index", "TGATools._getImageData32bits")
  @js.native
  def _getImageData32bits(
    header: js.Any,
    palettes: js.typedarray.Uint8Array,
    pixel_data: js.typedarray.Uint8Array,
    y_start: Double,
    y_step: Double,
    y_end: Double,
    x_start: Double,
    x_step: Double,
    x_end: Double
  ): js.typedarray.Uint8Array = js.native
  
  /** @hidden */
  @JSImport("babylonjs/index", "TGATools._getImageData8bits")
  @js.native
  def _getImageData8bits(
    header: js.Any,
    palettes: js.typedarray.Uint8Array,
    pixel_data: js.typedarray.Uint8Array,
    y_start: Double,
    y_step: Double,
    y_end: Double,
    x_start: Double,
    x_step: Double,
    x_end: Double
  ): js.typedarray.Uint8Array = js.native
  
  /** @hidden */
  @JSImport("babylonjs/index", "TGATools._getImageDataGrey16bits")
  @js.native
  def _getImageDataGrey16bits(
    header: js.Any,
    palettes: js.typedarray.Uint8Array,
    pixel_data: js.typedarray.Uint8Array,
    y_start: Double,
    y_step: Double,
    y_end: Double,
    x_start: Double,
    x_step: Double,
    x_end: Double
  ): js.typedarray.Uint8Array = js.native
  
  /** @hidden */
  @JSImport("babylonjs/index", "TGATools._getImageDataGrey8bits")
  @js.native
  def _getImageDataGrey8bits(
    header: js.Any,
    palettes: js.typedarray.Uint8Array,
    pixel_data: js.typedarray.Uint8Array,
    y_start: Double,
    y_step: Double,
    y_end: Double,
    x_start: Double,
    x_step: Double,
    x_end: Double
  ): js.typedarray.Uint8Array = js.native
}
