package typingsSlinky.next.anon

import typingsSlinky.next.mod.GetServerSidePropsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedirectRedirect
  extends GetServerSidePropsResult[js.Any] {
  
  var redirect: typingsSlinky.next.mod.Redirect = js.native
}
object RedirectRedirect {
  
  @scala.inline
  def apply(redirect: typingsSlinky.next.mod.Redirect): RedirectRedirect = {
    val __obj = js.Dynamic.literal(redirect = redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectRedirect]
  }
  
  @scala.inline
  implicit class RedirectRedirectMutableBuilder[Self <: RedirectRedirect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRedirect(value: typingsSlinky.next.mod.Redirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
  }
}
