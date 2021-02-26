package typingsSlinky.officeJs.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the page that raised the PageRenderComplete event.
  *
  * [Api set:  1.1]
  */
@js.native
trait PageRenderCompleteEventArgs extends StObject {
  
  /**
    *
    * Gets the name of the page that raised the PageLoad event.
    *
    * [Api set:  1.1]
    */
  var pageName: String = js.native
  
  /**
    *
    * Gets the success/failure of the PageRender event.
    *
    * [Api set:  1.1]
    */
  var success: Boolean = js.native
}
object PageRenderCompleteEventArgs {
  
  @scala.inline
  def apply(pageName: String, success: Boolean): PageRenderCompleteEventArgs = {
    val __obj = js.Dynamic.literal(pageName = pageName.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageRenderCompleteEventArgs]
  }
  
  @scala.inline
  implicit class PageRenderCompleteEventArgsMutableBuilder[Self <: PageRenderCompleteEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageName(value: String): Self = StObject.set(x, "pageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
