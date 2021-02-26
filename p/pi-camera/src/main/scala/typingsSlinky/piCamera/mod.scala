package typingsSlinky.piCamera

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pi-camera", JSImport.Namespace)
  @js.native
  class ^ () extends PiCamera {
    def this(config: CameraConfig) = this()
  }
  
  @js.native
  trait CameraConfig extends StObject {
    
    var annotate: js.UndefOr[String | Double] = js.native
    
    var brightness: js.UndefOr[Double] = js.native
    
    var contrast: js.UndefOr[Double] = js.native
    
    var datetime: js.UndefOr[Boolean] = js.native
    
    var demo: js.UndefOr[Double] = js.native
    
    var encoding: js.UndefOr[String] = js.native
    
    var exif: js.UndefOr[String] = js.native
    
    var framerate: js.UndefOr[Double] = js.native
    
    var fullscreen: js.UndefOr[Boolean] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var hflip: js.UndefOr[Boolean] = js.native
    
    var latest: js.UndefOr[String] = js.native
    
    var mode: Mode = js.native
    
    var nopreview: js.UndefOr[Boolean] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var output: js.UndefOr[String] = js.native
    
    var preview: js.UndefOr[String] = js.native
    
    var quality: js.UndefOr[Double] = js.native
    
    var raw: js.UndefOr[Boolean] = js.native
    
    var rotation: js.UndefOr[Double] = js.native
    
    var saturation: js.UndefOr[Double] = js.native
    
    var shutter: js.UndefOr[Double] = js.native
    
    var thumb: js.UndefOr[String] = js.native
    
    var timelapse: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var timestamp: js.UndefOr[Boolean] = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
    
    var vflip: js.UndefOr[Boolean] = js.native
    
    var vstab: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object CameraConfig {
    
    @scala.inline
    def apply(mode: Mode): CameraConfig = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[CameraConfig]
    }
    
    @scala.inline
    implicit class CameraConfigMutableBuilder[Self <: CameraConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotate(value: String | Double): Self = StObject.set(x, "annotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotateUndefined: Self = StObject.set(x, "annotate", js.undefined)
      
      @scala.inline
      def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
      
      @scala.inline
      def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContrastUndefined: Self = StObject.set(x, "contrast", js.undefined)
      
      @scala.inline
      def setDatetime(value: Boolean): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
      
      @scala.inline
      def setDemo(value: Double): Self = StObject.set(x, "demo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDemoUndefined: Self = StObject.set(x, "demo", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setExif(value: String): Self = StObject.set(x, "exif", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExifUndefined: Self = StObject.set(x, "exif", js.undefined)
      
      @scala.inline
      def setFramerate(value: Double): Self = StObject.set(x, "framerate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramerateUndefined: Self = StObject.set(x, "framerate", js.undefined)
      
      @scala.inline
      def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHflip(value: Boolean): Self = StObject.set(x, "hflip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHflipUndefined: Self = StObject.set(x, "hflip", js.undefined)
      
      @scala.inline
      def setLatest(value: String): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestUndefined: Self = StObject.set(x, "latest", js.undefined)
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNopreview(value: Boolean): Self = StObject.set(x, "nopreview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNopreviewUndefined: Self = StObject.set(x, "nopreview", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
      
      @scala.inline
      def setShutter(value: Double): Self = StObject.set(x, "shutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShutterUndefined: Self = StObject.set(x, "shutter", js.undefined)
      
      @scala.inline
      def setThumb(value: String): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
      
      @scala.inline
      def setTimelapse(value: Double): Self = StObject.set(x, "timelapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimelapseUndefined: Self = StObject.set(x, "timelapse", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTimestamp(value: Boolean): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      @scala.inline
      def setVflip(value: Boolean): Self = StObject.set(x, "vflip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVflipUndefined: Self = StObject.set(x, "vflip", js.undefined)
      
      @scala.inline
      def setVstab(value: Boolean): Self = StObject.set(x, "vstab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVstabUndefined: Self = StObject.set(x, "vstab", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.piCamera.piCameraStrings.mode
    - typingsSlinky.piCamera.piCameraStrings.output
    - typingsSlinky.piCamera.piCameraStrings.width
    - typingsSlinky.piCamera.piCameraStrings.height
    - typingsSlinky.piCamera.piCameraStrings.quality
    - typingsSlinky.piCamera.piCameraStrings.latest
    - typingsSlinky.piCamera.piCameraStrings.timeout
    - typingsSlinky.piCamera.piCameraStrings.thumb
    - typingsSlinky.piCamera.piCameraStrings.demo
    - typingsSlinky.piCamera.piCameraStrings.encoding
    - typingsSlinky.piCamera.piCameraStrings.timelapse
    - typingsSlinky.piCamera.piCameraStrings.framerate
    - typingsSlinky.piCamera.piCameraStrings.rotation
    - typingsSlinky.piCamera.piCameraStrings.preview
    - typingsSlinky.piCamera.piCameraStrings.opacity
    - typingsSlinky.piCamera.piCameraStrings.annotate
    - typingsSlinky.piCamera.piCameraStrings.exif
    - typingsSlinky.piCamera.piCameraStrings.brightness
    - typingsSlinky.piCamera.piCameraStrings.contrast
    - typingsSlinky.piCamera.piCameraStrings.shutter
    - typingsSlinky.piCamera.piCameraStrings.saturation
    - typingsSlinky.piCamera.piCameraStrings.raw
    - typingsSlinky.piCamera.piCameraStrings.verbose
    - typingsSlinky.piCamera.piCameraStrings.fullscreen
    - typingsSlinky.piCamera.piCameraStrings.nopreview
    - typingsSlinky.piCamera.piCameraStrings.vstab
    - typingsSlinky.piCamera.piCameraStrings.hflip
    - typingsSlinky.piCamera.piCameraStrings.vflip
    - typingsSlinky.piCamera.piCameraStrings.timestamp
    - typingsSlinky.piCamera.piCameraStrings.datetime
  */
  trait ConfigKey extends StObject
  
  type ConfigValue = js.UndefOr[String | Double | Boolean | Mode]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.piCamera.piCameraStrings.photo
    - typingsSlinky.piCamera.piCameraStrings.video
  */
  trait Mode extends StObject
  object Mode {
    
    @scala.inline
    def photo: typingsSlinky.piCamera.piCameraStrings.photo = "photo".asInstanceOf[typingsSlinky.piCamera.piCameraStrings.photo]
    
    @scala.inline
    def video: typingsSlinky.piCamera.piCameraStrings.video = "video".asInstanceOf[typingsSlinky.piCamera.piCameraStrings.video]
  }
  
  @js.native
  trait PiCamera extends StObject {
    
    def get(prop: ConfigKey): ConfigValue = js.native
    
    def record(): js.Promise[String] = js.native
    
    def set(prop: ConfigKey, value: ConfigValue): ConfigValue = js.native
    
    def snap(): js.Promise[String] = js.native
    
    /** @async */
    def snapDataUrl(): js.Promise[String] = js.native
  }
  object PiCamera {
    
    @scala.inline
    def apply(
      get: ConfigKey => ConfigValue,
      record: () => js.Promise[String],
      set: (ConfigKey, ConfigValue) => ConfigValue,
      snap: () => js.Promise[String],
      snapDataUrl: () => js.Promise[String]
    ): PiCamera = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), record = js.Any.fromFunction0(record), set = js.Any.fromFunction2(set), snap = js.Any.fromFunction0(snap), snapDataUrl = js.Any.fromFunction0(snapDataUrl))
      __obj.asInstanceOf[PiCamera]
    }
    
    @scala.inline
    implicit class PiCameraMutableBuilder[Self <: PiCamera] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: ConfigKey => ConfigValue): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRecord(value: () => js.Promise[String]): Self = StObject.set(x, "record", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet(value: (ConfigKey, ConfigValue) => ConfigValue): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSnap(value: () => js.Promise[String]): Self = StObject.set(x, "snap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSnapDataUrl(value: () => js.Promise[String]): Self = StObject.set(x, "snapDataUrl", js.Any.fromFunction0(value))
    }
  }
}
