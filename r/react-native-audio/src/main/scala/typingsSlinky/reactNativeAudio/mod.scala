package typingsSlinky.reactNativeAudio

import typingsSlinky.reactNativeAudio.anon.AudioFileURL
import typingsSlinky.reactNativeAudio.anon.CurrentTime
import typingsSlinky.reactNativeAudio.reactNativeAudioStrings.High
import typingsSlinky.reactNativeAudio.reactNativeAudioStrings.Low
import typingsSlinky.reactNativeAudio.reactNativeAudioStrings.Medium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object AudioRecorder {
    
    @JSImport("react-native-audio", "AudioRecorder.checkAuthorizationStatus")
    @js.native
    def checkAuthorizationStatus(): js.Promise[Boolean] = js.native
    
    @JSImport("react-native-audio", "AudioRecorder.onFinished")
    @js.native
    def onFinished(res: AudioFileURL): Unit = js.native
    
    @JSImport("react-native-audio", "AudioRecorder.onProgress")
    @js.native
    def onProgress(res: CurrentTime): Unit = js.native
    
    @JSImport("react-native-audio", "AudioRecorder.pauseRecording")
    @js.native
    def pauseRecording(): js.Promise[String] = js.native
    
    @JSImport("react-native-audio", "AudioRecorder.prepareRecordingAtPath")
    @js.native
    def prepareRecordingAtPath(path: String, options: RecordingOptions): Unit | js.Promise[String] = js.native
    
    @JSImport("react-native-audio", "AudioRecorder.requestAuthorization")
    @js.native
    def requestAuthorization(): js.Promise[Boolean] = js.native
    
    @JSImport("react-native-audio", "AudioRecorder.resumeRecording")
    @js.native
    def resumeRecording(): js.Promise[String] = js.native
    
    @JSImport("react-native-audio", "AudioRecorder.startRecording")
    @js.native
    def startRecording(): js.Promise[String] = js.native
    
    @JSImport("react-native-audio", "AudioRecorder.stopRecording")
    @js.native
    def stopRecording(): js.Promise[String] = js.native
  }
  
  object AudioSource {
    
    @JSImport("react-native-audio", "AudioSource")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-audio", "AudioSource.CAMCORDER")
    @js.native
    def CAMCORDER: Double = js.native
    @scala.inline
    def CAMCORDER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CAMCORDER")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.DEFAULT")
    @js.native
    def DEFAULT: Double = js.native
    @scala.inline
    def DEFAULT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.MIC")
    @js.native
    def MIC: Double = js.native
    @scala.inline
    def MIC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIC")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.REMOTE_SUBMIX")
    @js.native
    def REMOTE_SUBMIX: Double = js.native
    @scala.inline
    def REMOTE_SUBMIX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOTE_SUBMIX")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.UNPROCESSED")
    @js.native
    def UNPROCESSED: Double = js.native
    @scala.inline
    def UNPROCESSED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNPROCESSED")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.VOICE_CALL")
    @js.native
    def VOICE_CALL: Double = js.native
    @scala.inline
    def VOICE_CALL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VOICE_CALL")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.VOICE_COMMUNICATION")
    @js.native
    def VOICE_COMMUNICATION: Double = js.native
    @scala.inline
    def VOICE_COMMUNICATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VOICE_COMMUNICATION")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.VOICE_DOWNLINK")
    @js.native
    def VOICE_DOWNLINK: Double = js.native
    @scala.inline
    def VOICE_DOWNLINK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VOICE_DOWNLINK")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.VOICE_RECOGNITION")
    @js.native
    def VOICE_RECOGNITION: Double = js.native
    @scala.inline
    def VOICE_RECOGNITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VOICE_RECOGNITION")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.VOICE_UPLINK")
    @js.native
    def VOICE_UPLINK: Double = js.native
    @scala.inline
    def VOICE_UPLINK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VOICE_UPLINK")(x.asInstanceOf[js.Any])
  }
  
  object AudioUtils {
    
    @JSImport("react-native-audio", "AudioUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-audio", "AudioUtils.CachesDirectoryPath")
    @js.native
    def CachesDirectoryPath: String = js.native
    @scala.inline
    def CachesDirectoryPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CachesDirectoryPath")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioUtils.DocumentDirectoryPath")
    @js.native
    def DocumentDirectoryPath: String = js.native
    @scala.inline
    def DocumentDirectoryPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DocumentDirectoryPath")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioUtils.DownloadsDirectoryPath")
    @js.native
    def DownloadsDirectoryPath: String = js.native
    @scala.inline
    def DownloadsDirectoryPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DownloadsDirectoryPath")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioUtils.LibraryDirectoryPath")
    @js.native
    def LibraryDirectoryPath: String = js.native
    @scala.inline
    def LibraryDirectoryPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LibraryDirectoryPath")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioUtils.MainBundlePath")
    @js.native
    def MainBundlePath: String = js.native
    @scala.inline
    def MainBundlePath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MainBundlePath")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioUtils.MusicDirectoryPath")
    @js.native
    def MusicDirectoryPath: String = js.native
    @scala.inline
    def MusicDirectoryPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MusicDirectoryPath")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioUtils.PicturesDirectoryPath")
    @js.native
    def PicturesDirectoryPath: String = js.native
    @scala.inline
    def PicturesDirectoryPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PicturesDirectoryPath")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeAudio.reactNativeAudioStrings.aac_eld
    - typingsSlinky.reactNativeAudio.reactNativeAudioStrings.amr_nb
    - typingsSlinky.reactNativeAudio.reactNativeAudioStrings.amr_wb
    - typingsSlinky.reactNativeAudio.reactNativeAudioStrings.he_aac
    - typingsSlinky.reactNativeAudio.reactNativeAudioStrings.vorbis
  */
  trait AudioEncodingAndroidType extends StObject
  object AudioEncodingAndroidType {
    
    @scala.inline
    def aac_eld: typingsSlinky.reactNativeAudio.reactNativeAudioStrings.aac_eld = "aac_eld".asInstanceOf[typingsSlinky.reactNativeAudio.reactNativeAudioStrings.aac_eld]
    
    @scala.inline
    def amr_nb: typingsSlinky.reactNativeAudio.reactNativeAudioStrings.amr_nb = "amr_nb".asInstanceOf[typingsSlinky.reactNativeAudio.reactNativeAudioStrings.amr_nb]
    
    @scala.inline
    def amr_wb: typingsSlinky.reactNativeAudio.reactNativeAudioStrings.amr_wb = "amr_wb".asInstanceOf[typingsSlinky.reactNativeAudio.reactNativeAudioStrings.amr_wb]
    
    @scala.inline
    def he_aac: typingsSlinky.reactNativeAudio.reactNativeAudioStrings.he_aac = "he_aac".asInstanceOf[typingsSlinky.reactNativeAudio.reactNativeAudioStrings.he_aac]
    
    @scala.inline
    def vorbis: typingsSlinky.reactNativeAudio.reactNativeAudioStrings.vorbis = "vorbis".asInstanceOf[typingsSlinky.reactNativeAudio.reactNativeAudioStrings.vorbis]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeAudio.reactNativeAudioStrings.lpcm
    - typingsSlinky.reactNativeAudio.reactNativeAudioStrings.ima4
    - typingsSlinky.reactNativeAudio.reactNativeAudioStrings.MAC3
    - typingsSlinky.reactNativeAudio.reactNativeAudioStrings.MAC6
    - typingsSlinky.reactNativeAudio.reactNativeAudioStrings.ulaw
    - typingsSlinky.reactNativeAudio.reactNativeAudioStrings.alaw
    - typingsSlinky.reactNativeAudio.reactNativeAudioStrings.mp1
    - typingsSlinky.reactNativeAudio.reactNativeAudioStrings.mp2
    - typingsSlinky.reactNativeAudio.reactNativeAudioStrings.alac
    - typingsSlinky.reactNativeAudio.reactNativeAudioStrings.amr
  */
  trait AudioEncodingIOSType extends StObject
  object AudioEncodingIOSType {
    
    @scala.inline
    def MAC3: typingsSlinky.reactNativeAudio.reactNativeAudioStrings.MAC3 = "MAC3".asInstanceOf[typingsSlinky.reactNativeAudio.reactNativeAudioStrings.MAC3]
    
    @scala.inline
    def MAC6: typingsSlinky.reactNativeAudio.reactNativeAudioStrings.MAC6 = "MAC6".asInstanceOf[typingsSlinky.reactNativeAudio.reactNativeAudioStrings.MAC6]
    
    @scala.inline
    def alac: typingsSlinky.reactNativeAudio.reactNativeAudioStrings.alac = "alac".asInstanceOf[typingsSlinky.reactNativeAudio.reactNativeAudioStrings.alac]
    
    @scala.inline
    def alaw: typingsSlinky.reactNativeAudio.reactNativeAudioStrings.alaw = "alaw".asInstanceOf[typingsSlinky.reactNativeAudio.reactNativeAudioStrings.alaw]
    
    @scala.inline
    def amr: typingsSlinky.reactNativeAudio.reactNativeAudioStrings.amr = "amr".asInstanceOf[typingsSlinky.reactNativeAudio.reactNativeAudioStrings.amr]
    
    @scala.inline
    def ima4: typingsSlinky.reactNativeAudio.reactNativeAudioStrings.ima4 = "ima4".asInstanceOf[typingsSlinky.reactNativeAudio.reactNativeAudioStrings.ima4]
    
    @scala.inline
    def lpcm: typingsSlinky.reactNativeAudio.reactNativeAudioStrings.lpcm = "lpcm".asInstanceOf[typingsSlinky.reactNativeAudio.reactNativeAudioStrings.lpcm]
    
    @scala.inline
    def mp1: typingsSlinky.reactNativeAudio.reactNativeAudioStrings.mp1 = "mp1".asInstanceOf[typingsSlinky.reactNativeAudio.reactNativeAudioStrings.mp1]
    
    @scala.inline
    def mp2: typingsSlinky.reactNativeAudio.reactNativeAudioStrings.mp2 = "mp2".asInstanceOf[typingsSlinky.reactNativeAudio.reactNativeAudioStrings.mp2]
    
    @scala.inline
    def ulaw: typingsSlinky.reactNativeAudio.reactNativeAudioStrings.ulaw = "ulaw".asInstanceOf[typingsSlinky.reactNativeAudio.reactNativeAudioStrings.ulaw]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeAudio.reactNativeAudioStrings.aac
    - typingsSlinky.reactNativeAudio.reactNativeAudioStrings.aac_eld
    - typingsSlinky.reactNativeAudio.reactNativeAudioStrings.amr_nb
    - typingsSlinky.reactNativeAudio.reactNativeAudioStrings.amr_wb
    - typingsSlinky.reactNativeAudio.reactNativeAudioStrings.he_aac
    - typingsSlinky.reactNativeAudio.reactNativeAudioStrings.vorbis
  */
  trait AudioEncodingType extends StObject
  object AudioEncodingType {
    
    @scala.inline
    def aac: typingsSlinky.reactNativeAudio.reactNativeAudioStrings.aac = "aac".asInstanceOf[typingsSlinky.reactNativeAudio.reactNativeAudioStrings.aac]
    
    @scala.inline
    def aac_eld: typingsSlinky.reactNativeAudio.reactNativeAudioStrings.aac_eld = "aac_eld".asInstanceOf[typingsSlinky.reactNativeAudio.reactNativeAudioStrings.aac_eld]
    
    @scala.inline
    def amr_nb: typingsSlinky.reactNativeAudio.reactNativeAudioStrings.amr_nb = "amr_nb".asInstanceOf[typingsSlinky.reactNativeAudio.reactNativeAudioStrings.amr_nb]
    
    @scala.inline
    def amr_wb: typingsSlinky.reactNativeAudio.reactNativeAudioStrings.amr_wb = "amr_wb".asInstanceOf[typingsSlinky.reactNativeAudio.reactNativeAudioStrings.amr_wb]
    
    @scala.inline
    def he_aac: typingsSlinky.reactNativeAudio.reactNativeAudioStrings.he_aac = "he_aac".asInstanceOf[typingsSlinky.reactNativeAudio.reactNativeAudioStrings.he_aac]
    
    @scala.inline
    def vorbis: typingsSlinky.reactNativeAudio.reactNativeAudioStrings.vorbis = "vorbis".asInstanceOf[typingsSlinky.reactNativeAudio.reactNativeAudioStrings.vorbis]
  }
  
  @js.native
  trait RecordingOptions extends StObject {
    
    var AudioEncoding: js.UndefOr[AudioEncodingType] = js.native
    
    var AudioEncodingBitRate: js.UndefOr[Double] = js.native
    
    var AudioQuality: js.UndefOr[Low | Medium | High] = js.native
    
    var AudioSource: js.UndefOr[Double] = js.native
    
    var Channels: js.UndefOr[Double] = js.native
    
    var IncludeBase64: js.UndefOr[Boolean] = js.native
    
    var MeasurementMode: js.UndefOr[Boolean] = js.native
    
    var MeteringEnabled: js.UndefOr[Boolean] = js.native
    
    var OutputFormat: js.UndefOr[String] = js.native
    
    var SampleRate: js.UndefOr[Double] = js.native
  }
  object RecordingOptions {
    
    @scala.inline
    def apply(): RecordingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordingOptions]
    }
    
    @scala.inline
    implicit class RecordingOptionsMutableBuilder[Self <: RecordingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudioEncoding(value: AudioEncodingType): Self = StObject.set(x, "AudioEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioEncodingBitRate(value: Double): Self = StObject.set(x, "AudioEncodingBitRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioEncodingBitRateUndefined: Self = StObject.set(x, "AudioEncodingBitRate", js.undefined)
      
      @scala.inline
      def setAudioEncodingUndefined: Self = StObject.set(x, "AudioEncoding", js.undefined)
      
      @scala.inline
      def setAudioQuality(value: Low | Medium | High): Self = StObject.set(x, "AudioQuality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioQualityUndefined: Self = StObject.set(x, "AudioQuality", js.undefined)
      
      @scala.inline
      def setAudioSource(value: Double): Self = StObject.set(x, "AudioSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioSourceUndefined: Self = StObject.set(x, "AudioSource", js.undefined)
      
      @scala.inline
      def setChannels(value: Double): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
      
      @scala.inline
      def setIncludeBase64(value: Boolean): Self = StObject.set(x, "IncludeBase64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeBase64Undefined: Self = StObject.set(x, "IncludeBase64", js.undefined)
      
      @scala.inline
      def setMeasurementMode(value: Boolean): Self = StObject.set(x, "MeasurementMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasurementModeUndefined: Self = StObject.set(x, "MeasurementMode", js.undefined)
      
      @scala.inline
      def setMeteringEnabled(value: Boolean): Self = StObject.set(x, "MeteringEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeteringEnabledUndefined: Self = StObject.set(x, "MeteringEnabled", js.undefined)
      
      @scala.inline
      def setOutputFormat(value: String): Self = StObject.set(x, "OutputFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFormatUndefined: Self = StObject.set(x, "OutputFormat", js.undefined)
      
      @scala.inline
      def setSampleRate(value: Double): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
    }
  }
}
