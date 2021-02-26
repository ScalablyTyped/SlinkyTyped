package typingsSlinky.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateJobPlaylist extends StObject {
  
  /**
    * The format of the output playlist. Valid formats include HLSv3, HLSv4, and Smooth.
    */
  var Format: js.UndefOr[PlaylistFormat] = js.native
  
  /**
    * The HLS content protection settings, if any, that you want Elastic Transcoder to apply to the output files associated with this playlist.
    */
  var HlsContentProtection: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.HlsContentProtection] = js.native
  
  /**
    * The name that you want Elastic Transcoder to assign to the master playlist, for example, nyc-vacation.m3u8. If the name includes a / character, the section of the name before the last / must be identical for all Name objects. If you create more than one master playlist, the values of all Name objects must be unique.   Elastic Transcoder automatically appends the relevant file extension to the file name (.m3u8 for HLSv3 and HLSv4 playlists, and .ism and .ismc for Smooth playlists). If you include a file extension in Name, the file name will have two extensions. 
    */
  var Name: js.UndefOr[Filename] = js.native
  
  /**
    * For each output in this job that you want to include in a master playlist, the value of the Outputs:Key object.    If your output is not HLS or does not have a segment duration set, the name of the output file is a concatenation of OutputKeyPrefix and Outputs:Key: OutputKeyPrefixOutputs:Key    If your output is HLSv3 and has a segment duration set, or is not included in a playlist, Elastic Transcoder creates an output playlist file with a file extension of .m3u8, and a series of .ts files that include a five-digit sequential counter beginning with 00000: OutputKeyPrefixOutputs:Key.m3u8 OutputKeyPrefixOutputs:Key00000.ts   If your output is HLSv4, has a segment duration set, and is included in an HLSv4 playlist, Elastic Transcoder creates an output playlist file with a file extension of _v4.m3u8. If the output is video, Elastic Transcoder also creates an output file with an extension of _iframe.m3u8: OutputKeyPrefixOutputs:Key_v4.m3u8 OutputKeyPrefixOutputs:Key_iframe.m3u8 OutputKeyPrefixOutputs:Key.ts   Elastic Transcoder automatically appends the relevant file extension to the file name. If you include a file extension in Output Key, the file name will have two extensions. If you include more than one output in a playlist, any segment duration settings, clip settings, or caption settings must be the same for all outputs in the playlist. For Smooth playlists, the Audio:Profile, Video:Profile, and Video:FrameRate to Video:KeyframesMaxDist ratio must be the same for all outputs.
    */
  var OutputKeys: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.OutputKeys] = js.native
  
  /**
    * The DRM settings, if any, that you want Elastic Transcoder to apply to the output files associated with this playlist.
    */
  var PlayReadyDrm: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.PlayReadyDrm] = js.native
}
object CreateJobPlaylist {
  
  @scala.inline
  def apply(): CreateJobPlaylist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateJobPlaylist]
  }
  
  @scala.inline
  implicit class CreateJobPlaylistMutableBuilder[Self <: CreateJobPlaylist] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: PlaylistFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    @scala.inline
    def setHlsContentProtection(value: HlsContentProtection): Self = StObject.set(x, "HlsContentProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlsContentProtectionUndefined: Self = StObject.set(x, "HlsContentProtection", js.undefined)
    
    @scala.inline
    def setName(value: Filename): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOutputKeys(value: OutputKeys): Self = StObject.set(x, "OutputKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputKeysUndefined: Self = StObject.set(x, "OutputKeys", js.undefined)
    
    @scala.inline
    def setOutputKeysVarargs(value: Key*): Self = StObject.set(x, "OutputKeys", js.Array(value :_*))
    
    @scala.inline
    def setPlayReadyDrm(value: PlayReadyDrm): Self = StObject.set(x, "PlayReadyDrm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayReadyDrmUndefined: Self = StObject.set(x, "PlayReadyDrm", js.undefined)
  }
}
