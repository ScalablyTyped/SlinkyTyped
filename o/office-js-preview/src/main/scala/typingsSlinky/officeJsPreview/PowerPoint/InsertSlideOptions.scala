package typingsSlinky.officeJsPreview.PowerPoint

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.KeepSourceFormatting
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.UseDestinationTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the available options when inserting slides.
  *
  * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait InsertSlideOptions extends StObject {
  
  /**
    *
    * Specifies which formatting to use during slide insertion.
    The default option is to use "KeepSourceFormatting".
    *
    * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var formatting: js.UndefOr[InsertSlideFormatting | KeepSourceFormatting | UseDestinationTheme] = js.native
  
  /**
    *
    * Specifies the slides from the source presentation that will be inserted into the current presentation. These slides are represented by their IDs which can be retrieved from a `Slide` object.
    The order of these slides is preserved during the insertion.
    If any of the source slides are not found, or if the IDs are invalid, the operation throws a `SlideNotFound` exception and no slides will be inserted.
    All of the source slides will be inserted when `sourceSlideIds` is not provided (this is the default behavior).
    *
    * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var sourceSlideIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    *
    * Specifies where in the presentation the new slides will be inserted. The new slides will be inserted after the slide with the given slide ID.
    If `targetSlideId` is not provided, the slides will be inserted at the beginning of the presentation.
    If `targetSlideId` is invalid or if it is pointing to a non-existing slide, the operation throws a `SlideNotFound` exception and no slides will be inserted.
    *
    * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var targetSlideId: js.UndefOr[String] = js.native
}
object InsertSlideOptions {
  
  @scala.inline
  def apply(): InsertSlideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertSlideOptions]
  }
  
  @scala.inline
  implicit class InsertSlideOptionsMutableBuilder[Self <: InsertSlideOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormatting(value: InsertSlideFormatting | KeepSourceFormatting | UseDestinationTheme): Self = StObject.set(x, "formatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattingUndefined: Self = StObject.set(x, "formatting", js.undefined)
    
    @scala.inline
    def setSourceSlideIds(value: js.Array[String]): Self = StObject.set(x, "sourceSlideIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceSlideIdsUndefined: Self = StObject.set(x, "sourceSlideIds", js.undefined)
    
    @scala.inline
    def setSourceSlideIdsVarargs(value: String*): Self = StObject.set(x, "sourceSlideIds", js.Array(value :_*))
    
    @scala.inline
    def setTargetSlideId(value: String): Self = StObject.set(x, "targetSlideId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSlideIdUndefined: Self = StObject.set(x, "targetSlideId", js.undefined)
  }
}
