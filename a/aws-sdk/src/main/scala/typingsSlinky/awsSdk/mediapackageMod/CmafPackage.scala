package typingsSlinky.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CmafPackage extends js.Object {
  
  var Encryption: js.UndefOr[CmafEncryption] = js.native
  
  /**
    * A list of HLS manifest configurations
    */
  var HlsManifests: js.UndefOr[listOfHlsManifest] = js.native
  
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
object CmafPackage {
  
  @scala.inline
  def apply(): CmafPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CmafPackage]
  }
  
  @scala.inline
  implicit class CmafPackageOps[Self <: CmafPackage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEncryption(value: CmafEncryption): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
    
    @scala.inline
    def setHlsManifestsVarargs(value: HlsManifest*): Self = this.set("HlsManifests", js.Array(value :_*))
    
    @scala.inline
    def setHlsManifests(value: listOfHlsManifest): Self = this.set("HlsManifests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHlsManifests: Self = this.set("HlsManifests", js.undefined)
    
    @scala.inline
    def setSegmentDurationSeconds(value: integer): Self = this.set("SegmentDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentDurationSeconds: Self = this.set("SegmentDurationSeconds", js.undefined)
    
    @scala.inline
    def setSegmentPrefix(value: string): Self = this.set("SegmentPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentPrefix: Self = this.set("SegmentPrefix", js.undefined)
    
    @scala.inline
    def setStreamSelection(value: StreamSelection): Self = this.set("StreamSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamSelection: Self = this.set("StreamSelection", js.undefined)
  }
}
