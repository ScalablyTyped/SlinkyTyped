package typingsSlinky.pouchdbCore.PouchDB.Core

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import typingsSlinky.pouchdbCore.Fetch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  var fetch: js.UndefOr[Fetch] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFetch(
      value: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => js.Promise[org.scalajs.dom.experimental.Response]
    ): Self = StObject.set(x, "fetch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
  }
}
