package typingsSlinky.awsSdk.qldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchPageResult extends StObject {
  
  /**
    * Contains details of the fetched page.
    */
  var Page: js.UndefOr[typingsSlinky.awsSdk.qldbsessionMod.Page] = js.native
}
object FetchPageResult {
  
  @scala.inline
  def apply(): FetchPageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchPageResult]
  }
  
  @scala.inline
  implicit class FetchPageResultMutableBuilder[Self <: FetchPageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPage(value: Page): Self = StObject.set(x, "Page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "Page", js.undefined)
  }
}
