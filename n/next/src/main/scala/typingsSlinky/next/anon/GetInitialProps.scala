package typingsSlinky.next.anon

import typingsSlinky.next.libUtilsMod.BaseContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInitialProps[C /* <: BaseContext */, IP] extends StObject {
  
  /**
    * Used for initial page load data population. Data returned from `getInitialProps` is serialized when server rendered.
    * Make sure to return plain `Object` without using `Date`, `Map`, `Set`.
    * @param ctx Context of `page`
    */
  var getInitialProps: js.UndefOr[js.Function1[/* context */ C, IP | js.Promise[IP]]] = js.native
}
object GetInitialProps {
  
  @scala.inline
  def apply[C /* <: BaseContext */, IP](): GetInitialProps[C, IP] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInitialProps[C, IP]]
  }
  
  @scala.inline
  implicit class GetInitialPropsMutableBuilder[Self <: GetInitialProps[_, _], C /* <: BaseContext */, IP] (val x: Self with (GetInitialProps[C, IP])) extends AnyVal {
    
    @scala.inline
    def setGetInitialProps(value: /* context */ C => IP | js.Promise[IP]): Self = StObject.set(x, "getInitialProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetInitialPropsUndefined: Self = StObject.set(x, "getInitialProps", js.undefined)
  }
}
