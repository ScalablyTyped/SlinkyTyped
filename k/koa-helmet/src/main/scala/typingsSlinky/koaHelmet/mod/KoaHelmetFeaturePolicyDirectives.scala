package typingsSlinky.koaHelmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KoaHelmetFeaturePolicyDirectives extends js.Object {
  var accelerometer: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var ambientLightSensor: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var autoplay: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var camera: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var documentDomain: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var documentWrite: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var encryptedMedia: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var fontDisplayLateSwap: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var fullscreen: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var geolocation: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var gyroscope: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var layoutAnimations: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var legacyImageFormats: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var loadingFrameDefaultEager: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var magnetometer: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var microphone: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var midi: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var oversizedImages: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var payment: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var pictureInPicture: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var serial: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var speaker: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var syncScript: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var syncXhr: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var unoptimizedImages: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var unoptimizedLosslessImages: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var unoptimizedLossyImages: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var unsizedMedia: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var usb: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var verticalScroll: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var vibrate: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var vr: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var wakeLock: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var xr: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
}

object KoaHelmetFeaturePolicyDirectives {
  @scala.inline
  def apply(): KoaHelmetFeaturePolicyDirectives = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KoaHelmetFeaturePolicyDirectives]
  }
  @scala.inline
  implicit class KoaHelmetFeaturePolicyDirectivesOps[Self <: KoaHelmetFeaturePolicyDirectives] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccelerometer(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerometer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccelerometer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerometer")(js.undefined)
        ret
    }
    @scala.inline
    def withAmbientLightSensor(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ambientLightSensor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmbientLightSensor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ambientLightSensor")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplay(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.undefined)
        ret
    }
    @scala.inline
    def withCamera(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCamera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentDomain(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentWrite(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentWrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentWrite")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptedMedia(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptedMedia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptedMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptedMedia")(js.undefined)
        ret
    }
    @scala.inline
    def withFontDisplayLateSwap(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontDisplayLateSwap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontDisplayLateSwap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontDisplayLateSwap")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreen(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withGeolocation(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geolocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeolocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geolocation")(js.undefined)
        ret
    }
    @scala.inline
    def withGyroscope(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gyroscope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGyroscope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gyroscope")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutAnimations(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutAnimations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutAnimations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutAnimations")(js.undefined)
        ret
    }
    @scala.inline
    def withLegacyImageFormats(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyImageFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegacyImageFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyImageFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingFrameDefaultEager(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingFrameDefaultEager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingFrameDefaultEager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingFrameDefaultEager")(js.undefined)
        ret
    }
    @scala.inline
    def withMagnetometer(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magnetometer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagnetometer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magnetometer")(js.undefined)
        ret
    }
    @scala.inline
    def withMicrophone(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microphone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMicrophone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microphone")(js.undefined)
        ret
    }
    @scala.inline
    def withMidi(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMidi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midi")(js.undefined)
        ret
    }
    @scala.inline
    def withOversizedImages(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oversizedImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOversizedImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oversizedImages")(js.undefined)
        ret
    }
    @scala.inline
    def withPayment(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment")(js.undefined)
        ret
    }
    @scala.inline
    def withPictureInPicture(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pictureInPicture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPictureInPicture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pictureInPicture")(js.undefined)
        ret
    }
    @scala.inline
    def withSerial(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serial")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeaker(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speaker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeaker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speaker")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncScript(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncScript")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncXhr(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncXhr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncXhr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncXhr")(js.undefined)
        ret
    }
    @scala.inline
    def withUnoptimizedImages(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unoptimizedImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnoptimizedImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unoptimizedImages")(js.undefined)
        ret
    }
    @scala.inline
    def withUnoptimizedLosslessImages(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unoptimizedLosslessImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnoptimizedLosslessImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unoptimizedLosslessImages")(js.undefined)
        ret
    }
    @scala.inline
    def withUnoptimizedLossyImages(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unoptimizedLossyImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnoptimizedLossyImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unoptimizedLossyImages")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsizedMedia(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsizedMedia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsizedMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsizedMedia")(js.undefined)
        ret
    }
    @scala.inline
    def withUsb(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usb")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalScroll(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withVibrate(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vibrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVibrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vibrate")(js.undefined)
        ret
    }
    @scala.inline
    def withVr(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vr")(js.undefined)
        ret
    }
    @scala.inline
    def withWakeLock(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wakeLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWakeLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wakeLock")(js.undefined)
        ret
    }
    @scala.inline
    def withXr(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xr")(js.undefined)
        ret
    }
  }
  
}

