package typingsSlinky.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CmafPackageCreateOrUpdateParameters extends StObject {
  
  var Encryption: js.UndefOr[CmafEncryption] = js.native
  
  /**
    * A list of HLS manifest configurations
    */
  var HlsManifests: js.UndefOr[listOfHlsManifestCreateOrUpdateParameters] = js.native
  
  /**
    * Duration (in seconds) of each segment. Actual segments will be
  rounded to the nearest multiple of the source segment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.native
  
  /**
    * An optional custom string that is prepended to the name of each segment. If not specified, it defaults to the ChannelId.
    */
  var SegmentPrefix: js.UndefOr[string] = js.native
  
  var StreamSelection: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.StreamSelection] = js.native
}
object CmafPackageCreateOrUpdateParameters {
  
  @scala.inline
  def apply(): CmafPackageCreateOrUpdateParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CmafPackageCreateOrUpdateParameters]
  }
  
  @scala.inline
  implicit class CmafPackageCreateOrUpdateParametersMutableBuilder[Self <: CmafPackageCreateOrUpdateParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryption(value: CmafEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    @scala.inline
    def setHlsManifests(value: listOfHlsManifestCreateOrUpdateParameters): Self = StObject.set(x, "HlsManifests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlsManifestsUndefined: Self = StObject.set(x, "HlsManifests", js.undefined)
    
    @scala.inline
    def setHlsManifestsVarargs(value: HlsManifestCreateOrUpdateParameters*): Self = StObject.set(x, "HlsManifests", js.Array(value :_*))
    
    @scala.inline
    def setSegmentDurationSeconds(value: integer): Self = StObject.set(x, "SegmentDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentDurationSecondsUndefined: Self = StObject.set(x, "SegmentDurationSeconds", js.undefined)
    
    @scala.inline
    def setSegmentPrefix(value: string): Self = StObject.set(x, "SegmentPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentPrefixUndefined: Self = StObject.set(x, "SegmentPrefix", js.undefined)
    
    @scala.inline
    def setStreamSelection(value: StreamSelection): Self = StObject.set(x, "StreamSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamSelectionUndefined: Self = StObject.set(x, "StreamSelection", js.undefined)
  }
}
