package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SummariesToggledEventUIParam extends StObject {
  
  /**
    * Gets whether summaries are shown or not.
    */
  var isToShow: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets the igGridSummaries widget object.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object SummariesToggledEventUIParam {
  
  @scala.inline
  def apply(): SummariesToggledEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummariesToggledEventUIParam]
  }
  
  @scala.inline
  implicit class SummariesToggledEventUIParamMutableBuilder[Self <: SummariesToggledEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsToShow(value: Boolean): Self = StObject.set(x, "isToShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsToShowUndefined: Self = StObject.set(x, "isToShow", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
