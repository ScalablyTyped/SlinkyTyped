package typingsSlinky.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MsSmoothGroupSettings extends StObject {
  
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
  implicit class MsSmoothGroupSettingsMutableBuilder[Self <: MsSmoothGroupSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalManifests(value: listOfMsSmoothAdditionalManifest): Self = StObject.set(x, "AdditionalManifests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalManifestsUndefined: Self = StObject.set(x, "AdditionalManifests", js.undefined)
    
    @scala.inline
    def setAdditionalManifestsVarargs(value: MsSmoothAdditionalManifest*): Self = StObject.set(x, "AdditionalManifests", js.Array(value :_*))
    
    @scala.inline
    def setAudioDeduplication(value: MsSmoothAudioDeduplication): Self = StObject.set(x, "AudioDeduplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioDeduplicationUndefined: Self = StObject.set(x, "AudioDeduplication", js.undefined)
    
    @scala.inline
    def setDestination(value: stringPatternS3): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationSettings(value: DestinationSettings): Self = StObject.set(x, "DestinationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationSettingsUndefined: Self = StObject.set(x, "DestinationSettings", js.undefined)
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    @scala.inline
    def setEncryption(value: MsSmoothEncryptionSettings): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    @scala.inline
    def setFragmentLength(value: integerMin1Max2147483647): Self = StObject.set(x, "FragmentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentLengthUndefined: Self = StObject.set(x, "FragmentLength", js.undefined)
    
    @scala.inline
    def setManifestEncoding(value: MsSmoothManifestEncoding): Self = StObject.set(x, "ManifestEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestEncodingUndefined: Self = StObject.set(x, "ManifestEncoding", js.undefined)
  }
}
