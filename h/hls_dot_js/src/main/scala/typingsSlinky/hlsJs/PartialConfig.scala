package typingsSlinky.hlsJs

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.experimental.Request
import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.hlsJs.mod.AbrController
import typingsSlinky.hlsJs.mod.CustomLoggerObject
import typingsSlinky.hlsJs.mod.Loader
import typingsSlinky.hlsJs.mod.LoaderConfig
import typingsSlinky.hlsJs.mod.TimelineController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<hls.js.hls.js.Config> */
@js.native
trait PartialConfig extends js.Object {
  var abrBandWidthFactor: js.UndefOr[Double] = js.native
  var abrBandWidthUpFactor: js.UndefOr[Double] = js.native
  var abrController: js.UndefOr[AbrController] = js.native
  var abrEwmaDefaultEstimate: js.UndefOr[Double] = js.native
  var abrEwmaFastLive: js.UndefOr[Double] = js.native
  var abrEwmaFastVod: js.UndefOr[Double] = js.native
  var abrEwmaSlowLive: js.UndefOr[Double] = js.native
  var abrEwmaSlowVod: js.UndefOr[Double] = js.native
  var abrMaxWithRealBitrate: js.UndefOr[Boolean] = js.native
  var appendErrorMaxRetry: js.UndefOr[Double] = js.native
  var autoStartLoad: js.UndefOr[Boolean] = js.native
  var capLevelToPlayerSize: js.UndefOr[Boolean] = js.native
  var captionsTextTrack1Label: js.UndefOr[String] = js.native
  var captionsTextTrack1LanguagedCode: js.UndefOr[String] = js.native
  var captionsTextTrack2Label: js.UndefOr[String] = js.native
  var captionsTextTrack2LanguageCode: js.UndefOr[String] = js.native
  var debug: js.UndefOr[Boolean | CustomLoggerObject] = js.native
  var defaultAudioCodec: js.UndefOr[String] = js.native
  var enableCEA708Captions: js.UndefOr[Boolean] = js.native
  var enableSoftwareAES: js.UndefOr[Boolean] = js.native
  var enableWebVTT: js.UndefOr[Boolean] = js.native
  var enableWorker: js.UndefOr[Boolean] = js.native
  var fLoader: js.UndefOr[Instantiable1[/* config */ LoaderConfig, Loader]] = js.native
  var fetchSetup: js.UndefOr[js.Function2[/* context */ js.Any, /* initParams */ js.Any, Request]] = js.native
  var forceKeyFrameOnDiscontinuity: js.UndefOr[Boolean] = js.native
  var fragLoadingMaxRetry: js.UndefOr[Double] = js.native
  var fragLoadingMaxRetryDelay: js.UndefOr[Double] = js.native
  var fragLoadingRetryDelay: js.UndefOr[Double] = js.native
  var fragLoadingTimeOut: js.UndefOr[Double] = js.native
  var highBufferWatchdogPeriod: js.UndefOr[Double] = js.native
  var initialLiveManifestSize: js.UndefOr[Double] = js.native
  var levelLoadingMaxRetry: js.UndefOr[Double] = js.native
  var levelLoadingMaxRetryTimeout: js.UndefOr[Double] = js.native
  var levelLoadingRetryDelay: js.UndefOr[Double] = js.native
  var levelLoadingTimeOut: js.UndefOr[Double] = js.native
  var liveBackBufferLength: js.UndefOr[Double] = js.native
  var liveDurationInfinity: js.UndefOr[Boolean] = js.native
  var liveMaxLatencyDuration: js.UndefOr[Double] = js.native
  var liveMaxLatencyDurationCount: js.UndefOr[Double] = js.native
  var liveSyncDuration: js.UndefOr[Double] = js.native
  var liveSyncDurationCount: js.UndefOr[Double] = js.native
  var loader: js.UndefOr[Instantiable1[/* config */ LoaderConfig, Loader]] = js.native
  var lowBufferWatchdogPeriod: js.UndefOr[Double] = js.native
  var manifestLoadingMaxRetry: js.UndefOr[Double] = js.native
  var manifestLoadingMaxRetryTimeout: js.UndefOr[Double] = js.native
  var manifestLoadingRetryDelay: js.UndefOr[Double] = js.native
  var manifestLoadingTimeOut: js.UndefOr[Double] = js.native
  var maxAudioFramesDrift: js.UndefOr[Double] = js.native
  var maxBufferHole: js.UndefOr[Double] = js.native
  var maxBufferLength: js.UndefOr[Double] = js.native
  var maxBufferSize: js.UndefOr[Double] = js.native
  var maxFragLookUpTolerance: js.UndefOr[Double] = js.native
  var maxLoadingDelay: js.UndefOr[Double] = js.native
  var maxMaxBufferLength: js.UndefOr[Double] = js.native
  var maxSeekHole: js.UndefOr[Double] = js.native
  var maxStarvationDelay: js.UndefOr[Double] = js.native
  var minAutoBitrate: js.UndefOr[Double] = js.native
  var nudgeMaxRetry: js.UndefOr[Double] = js.native
  var nudgeOffset: js.UndefOr[Double] = js.native
  var pLoader: js.UndefOr[Instantiable1[/* config */ LoaderConfig, Loader]] = js.native
  var startFragPrefetch: js.UndefOr[Boolean] = js.native
  var startLevel: js.UndefOr[Double] = js.native
  var startPosition: js.UndefOr[Double] = js.native
  var stretchShortVideoTrack: js.UndefOr[Boolean] = js.native
  var timelineController: js.UndefOr[TimelineController] = js.native
  var xhrSetup: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* url */ String, Unit]] = js.native
}

object PartialConfig {
  @scala.inline
  def apply(): PartialConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfig]
  }
  @scala.inline
  implicit class PartialConfigOps[Self <: PartialConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbrBandWidthFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abrBandWidthFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbrBandWidthFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abrBandWidthFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withAbrBandWidthUpFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abrBandWidthUpFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbrBandWidthUpFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abrBandWidthUpFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withAbrController(value: AbrController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abrController")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbrController: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abrController")(js.undefined)
        ret
    }
    @scala.inline
    def withAbrEwmaDefaultEstimate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abrEwmaDefaultEstimate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbrEwmaDefaultEstimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abrEwmaDefaultEstimate")(js.undefined)
        ret
    }
    @scala.inline
    def withAbrEwmaFastLive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abrEwmaFastLive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbrEwmaFastLive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abrEwmaFastLive")(js.undefined)
        ret
    }
    @scala.inline
    def withAbrEwmaFastVod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abrEwmaFastVod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbrEwmaFastVod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abrEwmaFastVod")(js.undefined)
        ret
    }
    @scala.inline
    def withAbrEwmaSlowLive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abrEwmaSlowLive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbrEwmaSlowLive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abrEwmaSlowLive")(js.undefined)
        ret
    }
    @scala.inline
    def withAbrEwmaSlowVod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abrEwmaSlowVod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbrEwmaSlowVod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abrEwmaSlowVod")(js.undefined)
        ret
    }
    @scala.inline
    def withAbrMaxWithRealBitrate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abrMaxWithRealBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbrMaxWithRealBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abrMaxWithRealBitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendErrorMaxRetry(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendErrorMaxRetry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendErrorMaxRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendErrorMaxRetry")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoStartLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStartLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoStartLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStartLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withCapLevelToPlayerSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capLevelToPlayerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapLevelToPlayerSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capLevelToPlayerSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptionsTextTrack1Label(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionsTextTrack1Label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptionsTextTrack1Label: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionsTextTrack1Label")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptionsTextTrack1LanguagedCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionsTextTrack1LanguagedCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptionsTextTrack1LanguagedCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionsTextTrack1LanguagedCode")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptionsTextTrack2Label(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionsTextTrack2Label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptionsTextTrack2Label: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionsTextTrack2Label")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptionsTextTrack2LanguageCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionsTextTrack2LanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptionsTextTrack2LanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionsTextTrack2LanguageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean | CustomLoggerObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultAudioCodec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAudioCodec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultAudioCodec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAudioCodec")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCEA708Captions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCEA708Captions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCEA708Captions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCEA708Captions")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSoftwareAES(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSoftwareAES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSoftwareAES: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSoftwareAES")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableWebVTT(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableWebVTT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableWebVTT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableWebVTT")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableWorker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableWorker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableWorker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableWorker")(js.undefined)
        ret
    }
    @scala.inline
    def withFLoader(value: Instantiable1[/* config */ LoaderConfig, Loader]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fLoader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fLoader")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchSetup(value: (/* context */ js.Any, /* initParams */ js.Any) => Request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchSetup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFetchSetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchSetup")(js.undefined)
        ret
    }
    @scala.inline
    def withForceKeyFrameOnDiscontinuity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceKeyFrameOnDiscontinuity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceKeyFrameOnDiscontinuity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceKeyFrameOnDiscontinuity")(js.undefined)
        ret
    }
    @scala.inline
    def withFragLoadingMaxRetry(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragLoadingMaxRetry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragLoadingMaxRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragLoadingMaxRetry")(js.undefined)
        ret
    }
    @scala.inline
    def withFragLoadingMaxRetryDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragLoadingMaxRetryDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragLoadingMaxRetryDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragLoadingMaxRetryDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withFragLoadingRetryDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragLoadingRetryDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragLoadingRetryDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragLoadingRetryDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withFragLoadingTimeOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragLoadingTimeOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragLoadingTimeOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragLoadingTimeOut")(js.undefined)
        ret
    }
    @scala.inline
    def withHighBufferWatchdogPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highBufferWatchdogPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighBufferWatchdogPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highBufferWatchdogPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialLiveManifestSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialLiveManifestSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialLiveManifestSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialLiveManifestSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLevelLoadingMaxRetry(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelLoadingMaxRetry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevelLoadingMaxRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelLoadingMaxRetry")(js.undefined)
        ret
    }
    @scala.inline
    def withLevelLoadingMaxRetryTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelLoadingMaxRetryTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevelLoadingMaxRetryTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelLoadingMaxRetryTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withLevelLoadingRetryDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelLoadingRetryDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevelLoadingRetryDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelLoadingRetryDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withLevelLoadingTimeOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelLoadingTimeOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevelLoadingTimeOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelLoadingTimeOut")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveBackBufferLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveBackBufferLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveBackBufferLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveBackBufferLength")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveDurationInfinity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveDurationInfinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveDurationInfinity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveDurationInfinity")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveMaxLatencyDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveMaxLatencyDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveMaxLatencyDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveMaxLatencyDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveMaxLatencyDurationCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveMaxLatencyDurationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveMaxLatencyDurationCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveMaxLatencyDurationCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveSyncDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveSyncDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveSyncDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveSyncDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveSyncDurationCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveSyncDurationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveSyncDurationCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveSyncDurationCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLoader(value: Instantiable1[/* config */ LoaderConfig, Loader]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(js.undefined)
        ret
    }
    @scala.inline
    def withLowBufferWatchdogPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowBufferWatchdogPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowBufferWatchdogPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowBufferWatchdogPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withManifestLoadingMaxRetry(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestLoadingMaxRetry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestLoadingMaxRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestLoadingMaxRetry")(js.undefined)
        ret
    }
    @scala.inline
    def withManifestLoadingMaxRetryTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestLoadingMaxRetryTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestLoadingMaxRetryTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestLoadingMaxRetryTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withManifestLoadingRetryDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestLoadingRetryDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestLoadingRetryDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestLoadingRetryDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withManifestLoadingTimeOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestLoadingTimeOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestLoadingTimeOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestLoadingTimeOut")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAudioFramesDrift(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAudioFramesDrift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAudioFramesDrift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAudioFramesDrift")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBufferHole(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBufferHole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBufferHole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBufferHole")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBufferLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBufferLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBufferLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBufferLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBufferSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFragLookUpTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFragLookUpTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFragLookUpTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFragLookUpTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLoadingDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLoadingDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLoadingDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLoadingDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxMaxBufferLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMaxBufferLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMaxBufferLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMaxBufferLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSeekHole(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSeekHole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSeekHole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSeekHole")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxStarvationDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStarvationDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxStarvationDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStarvationDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMinAutoBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minAutoBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinAutoBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minAutoBitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withNudgeMaxRetry(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nudgeMaxRetry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNudgeMaxRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nudgeMaxRetry")(js.undefined)
        ret
    }
    @scala.inline
    def withNudgeOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nudgeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNudgeOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nudgeOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withPLoader(value: Instantiable1[/* config */ LoaderConfig, Loader]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pLoader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pLoader")(js.undefined)
        ret
    }
    @scala.inline
    def withStartFragPrefetch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startFragPrefetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartFragPrefetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startFragPrefetch")(js.undefined)
        ret
    }
    @scala.inline
    def withStartLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withStretchShortVideoTrack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchShortVideoTrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStretchShortVideoTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchShortVideoTrack")(js.undefined)
        ret
    }
    @scala.inline
    def withTimelineController(value: TimelineController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineController")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimelineController: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineController")(js.undefined)
        ret
    }
    @scala.inline
    def withXhrSetup(value: (/* xhr */ XMLHttpRequest, /* url */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhrSetup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutXhrSetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhrSetup")(js.undefined)
        ret
    }
  }
  
}

