package typingsSlinky.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Captions extends StObject {
  
  /**
    * The array of file formats for the output captions. If you leave this value blank, Elastic Transcoder returns an error.
    */
  var CaptionFormats: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.CaptionFormats] = js.native
  
  /**
    * Source files for the input sidecar captions used during the transcoding process. To omit all sidecar captions, leave CaptionSources blank.
    */
  var CaptionSources: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.CaptionSources] = js.native
  
  /**
    * A policy that determines how Elastic Transcoder handles the existence of multiple captions.    MergeOverride: Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If captions for a language are embedded in the input file and also appear in a sidecar file, Elastic Transcoder uses the sidecar captions and ignores the embedded captions for that language.    MergeRetain: Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If captions for a language are embedded in the input file and also appear in a sidecar file, Elastic Transcoder uses the embedded captions and ignores the sidecar captions for that language. If CaptionSources is empty, Elastic Transcoder omits all sidecar captions from the output files.    Override: Elastic Transcoder transcodes only the sidecar captions that you specify in CaptionSources.    MergePolicy cannot be null.
    */
  var MergePolicy: js.UndefOr[CaptionMergePolicy] = js.native
}
object Captions {
  
  @scala.inline
  def apply(): Captions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Captions]
  }
  
  @scala.inline
  implicit class CaptionsMutableBuilder[Self <: Captions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptionFormats(value: CaptionFormats): Self = StObject.set(x, "CaptionFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionFormatsUndefined: Self = StObject.set(x, "CaptionFormats", js.undefined)
    
    @scala.inline
    def setCaptionFormatsVarargs(value: CaptionFormat*): Self = StObject.set(x, "CaptionFormats", js.Array(value :_*))
    
    @scala.inline
    def setCaptionSources(value: CaptionSources): Self = StObject.set(x, "CaptionSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionSourcesUndefined: Self = StObject.set(x, "CaptionSources", js.undefined)
    
    @scala.inline
    def setCaptionSourcesVarargs(value: CaptionSource*): Self = StObject.set(x, "CaptionSources", js.Array(value :_*))
    
    @scala.inline
    def setMergePolicy(value: CaptionMergePolicy): Self = StObject.set(x, "MergePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergePolicyUndefined: Self = StObject.set(x, "MergePolicy", js.undefined)
  }
}
