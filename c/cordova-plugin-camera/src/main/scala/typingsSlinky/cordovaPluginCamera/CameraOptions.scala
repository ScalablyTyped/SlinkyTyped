package typingsSlinky.cordovaPluginCamera

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraOptions extends StObject {
  
  /** Allow simple editing of image before selection. */
  var allowEdit: js.UndefOr[Boolean] = js.native
  
  /**
    * Choose the camera to use (front- or back-facing).
    * Defined in navigator.camera.Direction. Default is BACK.
    *      FRONT: 0
    *      BACK: 1
    */
  var cameraDirection: js.UndefOr[Double] = js.native
  
  /** Rotate the image to correct for the orientation of the device during capture. */
  var correctOrientation: js.UndefOr[Boolean] = js.native
  
  /**
    * Choose the format of the return value.
    * Defined in navigator.camera.DestinationType. Default is FILE_URI.
    *      DATA_URL : 0,   Return image as base64-encoded string
    *      FILE_URI : 1,   Return image file URI
    */
  var destinationType: js.UndefOr[Double] = js.native
  
  /**
    * Choose the returned image file's encoding.
    * Defined in navigator.camera.EncodingType. Default is JPEG
    *      JPEG : 0    Return JPEG encoded image
    *      PNG : 1     Return PNG encoded image
    */
  var encodingType: js.UndefOr[Double] = js.native
  
  /**
    * Set the type of media to select from. Only works when PictureSourceType
    * is PHOTOLIBRARY or SAVEDPHOTOALBUM. Defined in nagivator.camera.MediaType
    *      PICTURE: 0      allow selection of still pictures only. DEFAULT.
    *          Will return format specified via DestinationType
    *      VIDEO: 1        allow selection of video only, WILL ALWAYS RETURN FILE_URI
    *      ALLMEDIA : 2    allow selection from all media types
    */
  var mediaType: js.UndefOr[Double] = js.native
  
  /** iOS-only options that specify popover location in iPad. Defined in CameraPopoverOptions. */
  var popoverOptions: js.UndefOr[CameraPopoverOptions] = js.native
  
  /** Picture quality in range 0-100. Default is 50 */
  var quality: js.UndefOr[Double] = js.native
  
  /** Save the image to the photo album on the device after capture. */
  var saveToPhotoAlbum: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the source of the picture.
    * Defined in navigator.camera.PictureSourceType. Default is CAMERA.
    *      PHOTOLIBRARY : 0,
    *      CAMERA : 1,
    *      SAVEDPHOTOALBUM : 2
    */
  var sourceType: js.UndefOr[Double] = js.native
  
  /**
    * Height in pixels to scale image. Must be used with targetWidth.
    * Aspect ratio remains constant.
    */
  var targetHeight: js.UndefOr[Double] = js.native
  
  /**
    * Width in pixels to scale image. Must be used with targetHeight.
    * Aspect ratio remains constant.
    */
  var targetWidth: js.UndefOr[Double] = js.native
}
object CameraOptions {
  
  @scala.inline
  def apply(): CameraOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraOptions]
  }
  
  @scala.inline
  implicit class CameraOptionsMutableBuilder[Self <: CameraOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowEdit(value: Boolean): Self = StObject.set(x, "allowEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEditUndefined: Self = StObject.set(x, "allowEdit", js.undefined)
    
    @scala.inline
    def setCameraDirection(value: Double): Self = StObject.set(x, "cameraDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraDirectionUndefined: Self = StObject.set(x, "cameraDirection", js.undefined)
    
    @scala.inline
    def setCorrectOrientation(value: Boolean): Self = StObject.set(x, "correctOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectOrientationUndefined: Self = StObject.set(x, "correctOrientation", js.undefined)
    
    @scala.inline
    def setDestinationType(value: Double): Self = StObject.set(x, "destinationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationTypeUndefined: Self = StObject.set(x, "destinationType", js.undefined)
    
    @scala.inline
    def setEncodingType(value: Double): Self = StObject.set(x, "encodingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingTypeUndefined: Self = StObject.set(x, "encodingType", js.undefined)
    
    @scala.inline
    def setMediaType(value: Double): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
    
    @scala.inline
    def setPopoverOptions(value: CameraPopoverOptions): Self = StObject.set(x, "popoverOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopoverOptionsUndefined: Self = StObject.set(x, "popoverOptions", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    @scala.inline
    def setSaveToPhotoAlbum(value: Boolean): Self = StObject.set(x, "saveToPhotoAlbum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveToPhotoAlbumUndefined: Self = StObject.set(x, "saveToPhotoAlbum", js.undefined)
    
    @scala.inline
    def setSourceType(value: Double): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    @scala.inline
    def setTargetHeight(value: Double): Self = StObject.set(x, "targetHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetHeightUndefined: Self = StObject.set(x, "targetHeight", js.undefined)
    
    @scala.inline
    def setTargetWidth(value: Double): Self = StObject.set(x, "targetWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetWidthUndefined: Self = StObject.set(x, "targetWidth", js.undefined)
  }
}
