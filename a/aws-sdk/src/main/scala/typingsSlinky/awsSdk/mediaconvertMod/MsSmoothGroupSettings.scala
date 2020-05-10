package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MsSmoothGroupSettings extends js.Object {
  /**
    * By default, the service creates one .ism Microsoft Smooth Streaming manifest for each Microsoft Smooth Streaming output group in your job. This default manifest references every output in the output group. To create additional manifests that reference a subset of the outputs in the output group, specify a list of them here.
    */
  var AdditionalManifests: js.UndefOr[listOfMsSmoothAdditionalManifest] = js.native
  /**
    * COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings across a Microsoft Smooth output group into a single audio stream.
    */
  var AudioDeduplication: js.UndefOr[MsSmoothAudioDeduplication] = js.native
  /**
    * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the input file. If your job has multiple inputs, the service uses the filename of the first input file.
    */
  var Destination: js.UndefOr[stringPatternS3] = js.native
  /**
    * Settings associated with the destination. Will vary based on the type of destination
    */
  var DestinationSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.DestinationSettings] = js.native
  /**
    * If you are using DRM, set DRM System (MsSmoothEncryptionSettings) to specify the value SpekeKeyProvider.
    */
  var Encryption: js.UndefOr[MsSmoothEncryptionSettings] = js.native
  /**
    * Use Fragment length (FragmentLength) to specify the mp4 fragment sizes in seconds. Fragment length must be compatible with GOP size and frame rate.
    */
  var FragmentLength: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding format for the server and client manifest. Valid options are utf8 and utf16.
    */
  var ManifestEncoding: js.UndefOr[MsSmoothManifestEncoding] = js.native
}

object MsSmoothGroupSettings {
  @scala.inline
  def apply(): MsSmoothGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MsSmoothGroupSettings]
  }
  @scala.inline
  implicit class MsSmoothGroupSettingsOps[Self <: MsSmoothGroupSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalManifests(value: listOfMsSmoothAdditionalManifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalManifests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalManifests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalManifests")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioDeduplication(value: MsSmoothAudioDeduplication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioDeduplication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioDeduplication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioDeduplication")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: stringPatternS3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destination")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationSettings(value: DestinationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryption(value: MsSmoothEncryptionSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encryption")(js.undefined)
        ret
    }
    @scala.inline
    def withFragmentLength(value: integerMin1Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FragmentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmentLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FragmentLength")(js.undefined)
        ret
    }
    @scala.inline
    def withManifestEncoding(value: MsSmoothManifestEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestEncoding")(js.undefined)
        ret
    }
  }
  
}

