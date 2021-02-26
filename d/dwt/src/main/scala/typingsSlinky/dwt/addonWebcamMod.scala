package typingsSlinky.dwt

import typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCameraControlProperty
import typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTVideoProperty
import typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTVideoRotateMode
import typingsSlinky.dwt.webTwainMod.WebTwain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addonWebcamMod {
  
  @js.native
  trait CameraControlProperty extends StObject {
    
    /**
      * Return whether the property is set autmatically or not.
      */
    def GetIfAuto(): Boolean = js.native
    
    /**
      * Return the value of the property.
      */
    def GetValue(): Double = js.native
  }
  object CameraControlProperty {
    
    @scala.inline
    def apply(GetIfAuto: () => Boolean, GetValue: () => Double): CameraControlProperty = {
      val __obj = js.Dynamic.literal(GetIfAuto = js.Any.fromFunction0(GetIfAuto), GetValue = js.Any.fromFunction0(GetValue))
      __obj.asInstanceOf[CameraControlProperty]
    }
    
    @scala.inline
    implicit class CameraControlPropertyMutableBuilder[Self <: CameraControlProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetIfAuto(value: () => Boolean): Self = StObject.set(x, "GetIfAuto", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValue(value: () => Double): Self = StObject.set(x, "GetValue", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait CameraControlPropertyExtra extends StObject {
    
    /**
      * Return the default value of the property.
      */
    def GetDefaultValue(): Double = js.native
    
    /**
      * Return whether the property is set autmatically or not.
      */
    def GetIfAuto(): Boolean = js.native
    
    /**
      * Return the maximum value of the property.
      */
    def GetMaxValue(): Double = js.native
    
    /**
      * Return the minimum value of the property.
      */
    def GetMinValue(): Double = js.native
    
    /**
      * Return the smallest increment by which the property can change.
      */
    def GetSteppingDelta(): Double = js.native
  }
  object CameraControlPropertyExtra {
    
    @scala.inline
    def apply(
      GetDefaultValue: () => Double,
      GetIfAuto: () => Boolean,
      GetMaxValue: () => Double,
      GetMinValue: () => Double,
      GetSteppingDelta: () => Double
    ): CameraControlPropertyExtra = {
      val __obj = js.Dynamic.literal(GetDefaultValue = js.Any.fromFunction0(GetDefaultValue), GetIfAuto = js.Any.fromFunction0(GetIfAuto), GetMaxValue = js.Any.fromFunction0(GetMaxValue), GetMinValue = js.Any.fromFunction0(GetMinValue), GetSteppingDelta = js.Any.fromFunction0(GetSteppingDelta))
      __obj.asInstanceOf[CameraControlPropertyExtra]
    }
    
    @scala.inline
    implicit class CameraControlPropertyExtraMutableBuilder[Self <: CameraControlPropertyExtra] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDefaultValue(value: () => Double): Self = StObject.set(x, "GetDefaultValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIfAuto(value: () => Boolean): Self = StObject.set(x, "GetIfAuto", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMaxValue(value: () => Double): Self = StObject.set(x, "GetMaxValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMinValue(value: () => Double): Self = StObject.set(x, "GetMinValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSteppingDelta(value: () => Double): Self = StObject.set(x, "GetSteppingDelta", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait FrameRate extends StObject {
    
    /**
      * Return the specified frame rate.
      */
    def Get(index: Double): Double = js.native
    
    /**
      * Return the number of available frame rates.
      */
    def GetCount(): Double = js.native
    
    /**
      * Return the current frame rate.
      */
    def GetCurrent(): Double = js.native
  }
  object FrameRate {
    
    @scala.inline
    def apply(Get: Double => Double, GetCount: () => Double, GetCurrent: () => Double): FrameRate = {
      val __obj = js.Dynamic.literal(Get = js.Any.fromFunction1(Get), GetCount = js.Any.fromFunction0(GetCount), GetCurrent = js.Any.fromFunction0(GetCurrent))
      __obj.asInstanceOf[FrameRate]
    }
    
    @scala.inline
    implicit class FrameRateMutableBuilder[Self <: FrameRate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: Double => Double): Self = StObject.set(x, "Get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCount(value: () => Double): Self = StObject.set(x, "GetCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCurrent(value: () => Double): Self = StObject.set(x, "GetCurrent", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait MediaType extends StObject {
    
    /**
      * Return the specified media type.
      */
    def Get(index: Double): String = js.native
    
    /**
      * Return the number of available media types.
      */
    def GetCount(): Double = js.native
    
    /**
      * Return the current media type.
      */
    def GetCurrent(): String = js.native
    
    /**
      * internal use
      */
    var _resultlist: js.Any = js.native
  }
  object MediaType {
    
    @scala.inline
    def apply(Get: Double => String, GetCount: () => Double, GetCurrent: () => String, _resultlist: js.Any): MediaType = {
      val __obj = js.Dynamic.literal(Get = js.Any.fromFunction1(Get), GetCount = js.Any.fromFunction0(GetCount), GetCurrent = js.Any.fromFunction0(GetCurrent), _resultlist = _resultlist.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaType]
    }
    
    @scala.inline
    implicit class MediaTypeMutableBuilder[Self <: MediaType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: Double => String): Self = StObject.set(x, "Get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCount(value: () => Double): Self = StObject.set(x, "GetCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCurrent(value: () => String): Self = StObject.set(x, "GetCurrent", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_resultlist(value: js.Any): Self = StObject.set(x, "_resultlist", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Resolution extends StObject {
    
    /**
      * Return the specified resolution.
      */
    def Get(index: Double): String = js.native
    
    /**
      * Return the number of available resolutions.
      */
    def GetCount(): Double = js.native
    
    /**
      * Return the current resolution.
      */
    def GetCurrent(): String = js.native
  }
  object Resolution {
    
    @scala.inline
    def apply(Get: Double => String, GetCount: () => Double, GetCurrent: () => String): Resolution = {
      val __obj = js.Dynamic.literal(Get = js.Any.fromFunction1(Get), GetCount = js.Any.fromFunction0(GetCount), GetCurrent = js.Any.fromFunction0(GetCurrent))
      __obj.asInstanceOf[Resolution]
    }
    
    @scala.inline
    implicit class ResolutionMutableBuilder[Self <: Resolution] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: Double => String): Self = StObject.set(x, "Get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCount(value: () => Double): Self = StObject.set(x, "GetCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCurrent(value: () => String): Self = StObject.set(x, "GetCurrent", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait VideoControlProperty extends StObject {
    
    /**
      * Return whether the property is set autmatically or not.
      */
    def GetIfAuto(): Boolean = js.native
    
    /**
      * Return the value of the property.
      */
    def GetValue(): Double = js.native
  }
  object VideoControlProperty {
    
    @scala.inline
    def apply(GetIfAuto: () => Boolean, GetValue: () => Double): VideoControlProperty = {
      val __obj = js.Dynamic.literal(GetIfAuto = js.Any.fromFunction0(GetIfAuto), GetValue = js.Any.fromFunction0(GetValue))
      __obj.asInstanceOf[VideoControlProperty]
    }
    
    @scala.inline
    implicit class VideoControlPropertyMutableBuilder[Self <: VideoControlProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetIfAuto(value: () => Boolean): Self = StObject.set(x, "GetIfAuto", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValue(value: () => Double): Self = StObject.set(x, "GetValue", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait VideoControlPropertyExtra extends StObject {
    
    /**
      * Return the default value of the property.
      */
    def GetDefaultValue(): Double = js.native
    
    /**
      * Return whether the property is set autmatically or not.
      */
    def GetIfAuto(): Boolean = js.native
    
    /**
      * Return the maximum value of the property.
      */
    def GetMaxValue(): Double = js.native
    
    /**
      * Return the minimum value of the property.
      */
    def GetMinValue(): Double = js.native
    
    /**
      * Return the smallest increment by which the property can change.
      */
    def GetSteppingDelta(): Double = js.native
  }
  object VideoControlPropertyExtra {
    
    @scala.inline
    def apply(
      GetDefaultValue: () => Double,
      GetIfAuto: () => Boolean,
      GetMaxValue: () => Double,
      GetMinValue: () => Double,
      GetSteppingDelta: () => Double
    ): VideoControlPropertyExtra = {
      val __obj = js.Dynamic.literal(GetDefaultValue = js.Any.fromFunction0(GetDefaultValue), GetIfAuto = js.Any.fromFunction0(GetIfAuto), GetMaxValue = js.Any.fromFunction0(GetMaxValue), GetMinValue = js.Any.fromFunction0(GetMinValue), GetSteppingDelta = js.Any.fromFunction0(GetSteppingDelta))
      __obj.asInstanceOf[VideoControlPropertyExtra]
    }
    
    @scala.inline
    implicit class VideoControlPropertyExtraMutableBuilder[Self <: VideoControlPropertyExtra] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDefaultValue(value: () => Double): Self = StObject.set(x, "GetDefaultValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIfAuto(value: () => Boolean): Self = StObject.set(x, "GetIfAuto", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMaxValue(value: () => Double): Self = StObject.set(x, "GetMaxValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMinValue(value: () => Double): Self = StObject.set(x, "GetMinValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSteppingDelta(value: () => Double): Self = StObject.set(x, "GetSteppingDelta", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Webcam extends StObject {
    
    /**
      * Capture an image from the current camera.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error String
      */
    def CaptureImage(
      successCallback: js.Function0[Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit = js.native
    
    /**
      * Close the current camera.
      */
    def CloseSource(): Boolean = js.native
    
    def GetCameraControlPropertyMoreSetting(property: Double): CameraControlPropertyExtra = js.native
    /**
      * Return detailed information about the specified camera property.
      * @param property Specify the property.
      */
    def GetCameraControlPropertyMoreSetting(property: EnumDWTCameraControlProperty): CameraControlPropertyExtra = js.native
    
    def GetCameraControlPropertySetting(property: Double): CameraControlProperty = js.native
    /**
      * Return information about the specified camera property.
      * @param property Specify the property.
      */
    def GetCameraControlPropertySetting(property: EnumDWTCameraControlProperty): CameraControlProperty = js.native
    
    /**
      * Return the internal URL (dwt://) for the latest frame.
      */
    def GetFramePartURL(): String = js.native
    
    /**
      * Return the frame rates supported by the current camera.
      */
    def GetFrameRate(): FrameRate = js.native
    
    /**
      * Return the URL (http(s)://) for the latest frame.
      */
    def GetFrameURL(): String = js.native
    
    /**
      * Return the media types supported by the current camera.
      */
    def GetMediaType(): MediaType = js.native
    
    /**
      * Return the resolutions supported by the current camera.
      */
    def GetResolution(): Resolution = js.native
    
    /**
      * Return a list of all available cameras.
      */
    def GetSourceList(): js.Array[String] = js.native
    
    def GetVideoPropertyMoreSetting(property: Double): VideoControlPropertyExtra = js.native
    /**
      * Return detailed information about the specified video property.
      * @param property Specify the property.
      */
    def GetVideoPropertyMoreSetting(property: EnumDWTVideoProperty): VideoControlPropertyExtra = js.native
    
    def GetVideoPropertySetting(property: Double): VideoControlProperty = js.native
    /**
      * Return information about the specified video property.
      * @param property Specify the property.
      */
    def GetVideoPropertySetting(property: EnumDWTVideoProperty): VideoControlProperty = js.native
    
    /**
      * Return whether the Webcam module has been installed.
      */
    def IsModuleInstalled(): Boolean = js.native
    
    /**
      * Pause the video.
      */
    def PauseVideo(): Boolean = js.native
    
    /**
      * Start to play the video stream from the current camera.
      * @param DWObject Specify a WebTwain instance to show the video.
      * @param quality Specify the quality of the video.
      * @param frameDidShow A callback function that is triggered after each video frame is shown.
      */
    def PlayVideo(DWObject: WebTwain, quality: Double): Boolean = js.native
    def PlayVideo(DWObject: WebTwain, quality: Double, frameDidShow: js.Function0[Unit]): Boolean = js.native
    
    /**
      * Select a camera to use.
      * @param name Specify the camera.
      */
    def SelectSource(name: String): Boolean = js.native
    
    def SetCameraControlPropertySetting(property: Double, value: Double, auto: Boolean): Boolean = js.native
    /**
      * Set the specified camera property.
      * @param property Specify the property.
      * @param value Specify the value.
      * @param auto Specify whether the propery should change automatically.
      */
    def SetCameraControlPropertySetting(property: EnumDWTCameraControlProperty, value: Double, auto: Boolean): Boolean = js.native
    
    /**
      * Set the frame rate.
      * @param rate Specify the frame rate.
      */
    def SetFrameRate(rate: Double): Boolean = js.native
    
    /**
      * Set the media type.
      * @param type Sepcify the media type.
      */
    def SetMediaType(`type`: String): Boolean = js.native
    
    /**
      * Set the resolution.
      * @param resolution Specify the resolution.
      */
    def SetResolution(resolution: String): Boolean = js.native
    
    def SetVideoPropertySetting(property: Double, value: Double, auto: Boolean): Boolean = js.native
    /**
      * Set the specified video property.
      * @param property Specify the property.
      * @param value Specify the value.
      * @param auto Specify whether the propery should change automatically.
      */
    def SetVideoPropertySetting(property: EnumDWTVideoProperty, value: Double, auto: Boolean): Boolean = js.native
    
    def SetVideoRotateMode(mode: Double): Boolean = js.native
    /**
      * Rotate the video.
      * @param mode Specify the rotate mode
      */
    def SetVideoRotateMode(mode: EnumDWTVideoRotateMode): Boolean = js.native
    
    /**
      * Stop the video.
      */
    def StopVideo(): Boolean = js.native
  }
}
