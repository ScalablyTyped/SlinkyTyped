package typingsSlinky.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Viewprogresss extends StObject {
  
  var view_progress_s: Double = js.native
}
object Viewprogresss {
  
  @scala.inline
  def apply(view_progress_s: Double): Viewprogresss = {
    val __obj = js.Dynamic.literal(view_progress_s = view_progress_s.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewprogresss]
  }
  
  @scala.inline
  implicit class ViewprogresssMutableBuilder[Self <: Viewprogresss] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setView_progress_s(value: Double): Self = StObject.set(x, "view_progress_s", value.asInstanceOf[js.Any])
  }
}
