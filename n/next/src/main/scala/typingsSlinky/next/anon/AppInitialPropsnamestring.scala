package typingsSlinky.next.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined next.next/dist/next-server/lib/utils.AppInitialProps & {[name: string] : any} */
@js.native
trait AppInitialPropsnamestring
  extends /* k */ StringDictionary[js.Any] {
  
  var pageProps: js.Any = js.native
}
object AppInitialPropsnamestring {
  
  @scala.inline
  def apply(pageProps: js.Any): AppInitialPropsnamestring = {
    val __obj = js.Dynamic.literal(pageProps = pageProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppInitialPropsnamestring]
  }
  
  @scala.inline
  implicit class AppInitialPropsnamestringMutableBuilder[Self <: AppInitialPropsnamestring] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageProps(value: js.Any): Self = StObject.set(x, "pageProps", value.asInstanceOf[js.Any])
  }
}
