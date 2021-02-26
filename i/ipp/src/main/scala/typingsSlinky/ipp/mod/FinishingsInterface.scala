package typingsSlinky.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinishingsInterface extends StObject {
  
  var baling: js.UndefOr[FinishingBailing] = js.native
  
  var binding: js.UndefOr[FinishingBinding] = js.native
  
  var coating: js.UndefOr[FinishingCoating] = js.native
  
  var covering: js.UndefOr[FinishingCovering] = js.native
  
  var `finishing-template`: js.UndefOr[Finishings] = js.native
  
  var folding: js.UndefOr[js.Array[FinishingFolding]] = js.native
  
  var `imposition-template`: js.UndefOr[ImpositionTemplate] = js.native
  
  var laminating: js.UndefOr[FinishingLaminating] = js.native
  
  var `media-sheets-supported`: js.UndefOr[String] = js.native
  
  var `media-size`: js.UndefOr[MediaSize] = js.native
  
  var `media-size-name`: js.UndefOr[String] = js.native
  
  var punching: js.UndefOr[FinishingPunching] = js.native
  
  var stitching: js.UndefOr[FinishingStitching] = js.native
  
  var trimming: js.UndefOr[js.Array[FinishingTrimming]] = js.native
}
object FinishingsInterface {
  
  @scala.inline
  def apply(): FinishingsInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingsInterface]
  }
  
  @scala.inline
  implicit class FinishingsInterfaceMutableBuilder[Self <: FinishingsInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaling(value: FinishingBailing): Self = StObject.set(x, "baling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBalingUndefined: Self = StObject.set(x, "baling", js.undefined)
    
    @scala.inline
    def setBinding(value: FinishingBinding): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingUndefined: Self = StObject.set(x, "binding", js.undefined)
    
    @scala.inline
    def setCoating(value: FinishingCoating): Self = StObject.set(x, "coating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoatingUndefined: Self = StObject.set(x, "coating", js.undefined)
    
    @scala.inline
    def setCovering(value: FinishingCovering): Self = StObject.set(x, "covering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoveringUndefined: Self = StObject.set(x, "covering", js.undefined)
    
    @scala.inline
    def `setFinishing-template`(value: Finishings): Self = StObject.set(x, "finishing-template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFinishing-templateUndefined`: Self = StObject.set(x, "finishing-template", js.undefined)
    
    @scala.inline
    def setFolding(value: js.Array[FinishingFolding]): Self = StObject.set(x, "folding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldingUndefined: Self = StObject.set(x, "folding", js.undefined)
    
    @scala.inline
    def setFoldingVarargs(value: FinishingFolding*): Self = StObject.set(x, "folding", js.Array(value :_*))
    
    @scala.inline
    def `setImposition-template`(value: ImpositionTemplate): Self = StObject.set(x, "imposition-template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setImposition-templateUndefined`: Self = StObject.set(x, "imposition-template", js.undefined)
    
    @scala.inline
    def setLaminating(value: FinishingLaminating): Self = StObject.set(x, "laminating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaminatingUndefined: Self = StObject.set(x, "laminating", js.undefined)
    
    @scala.inline
    def `setMedia-sheets-supported`(value: String): Self = StObject.set(x, "media-sheets-supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMedia-sheets-supportedUndefined`: Self = StObject.set(x, "media-sheets-supported", js.undefined)
    
    @scala.inline
    def `setMedia-size`(value: MediaSize): Self = StObject.set(x, "media-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMedia-size-name`(value: String): Self = StObject.set(x, "media-size-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMedia-size-nameUndefined`: Self = StObject.set(x, "media-size-name", js.undefined)
    
    @scala.inline
    def `setMedia-sizeUndefined`: Self = StObject.set(x, "media-size", js.undefined)
    
    @scala.inline
    def setPunching(value: FinishingPunching): Self = StObject.set(x, "punching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPunchingUndefined: Self = StObject.set(x, "punching", js.undefined)
    
    @scala.inline
    def setStitching(value: FinishingStitching): Self = StObject.set(x, "stitching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStitchingUndefined: Self = StObject.set(x, "stitching", js.undefined)
    
    @scala.inline
    def setTrimming(value: js.Array[FinishingTrimming]): Self = StObject.set(x, "trimming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimmingUndefined: Self = StObject.set(x, "trimming", js.undefined)
    
    @scala.inline
    def setTrimmingVarargs(value: FinishingTrimming*): Self = StObject.set(x, "trimming", js.Array(value :_*))
  }
}
