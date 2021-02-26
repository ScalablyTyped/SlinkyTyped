package typingsSlinky.pdfjsDist.mod

import typingsSlinky.pdfjsDist.anon.CMapData
import typingsSlinky.pdfjsDist.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CMapReader extends StObject {
  
  def fetch(params: Name): js.Promise[CMapData] = js.native
}
object CMapReader {
  
  @scala.inline
  def apply(fetch: Name => js.Promise[CMapData]): CMapReader = {
    val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
    __obj.asInstanceOf[CMapReader]
  }
  
  @scala.inline
  implicit class CMapReaderMutableBuilder[Self <: CMapReader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFetch(value: Name => js.Promise[CMapData]): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
  }
}
