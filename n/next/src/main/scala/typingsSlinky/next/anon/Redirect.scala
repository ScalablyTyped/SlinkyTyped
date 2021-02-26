package typingsSlinky.next.anon

import typingsSlinky.next.mod.GetStaticPropsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Redirect
  extends GetStaticPropsResult[js.Any] {
  
  var redirect: typingsSlinky.next.mod.Redirect = js.native
  
  var revalidate: js.UndefOr[Double | Boolean] = js.native
}
object Redirect {
  
  @scala.inline
  def apply(redirect: typingsSlinky.next.mod.Redirect): Redirect = {
    val __obj = js.Dynamic.literal(redirect = redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redirect]
  }
  
  @scala.inline
  implicit class RedirectMutableBuilder[Self <: Redirect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRedirect(value: typingsSlinky.next.mod.Redirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevalidate(value: Double | Boolean): Self = StObject.set(x, "revalidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevalidateUndefined: Self = StObject.set(x, "revalidate", js.undefined)
  }
}
