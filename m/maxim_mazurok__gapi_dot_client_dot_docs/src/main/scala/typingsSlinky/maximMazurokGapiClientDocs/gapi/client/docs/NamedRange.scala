package typingsSlinky.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedRange extends StObject {
  
  /** The name of the named range. */
  var name: js.UndefOr[String] = js.native
  
  /** The ID of the named range. */
  var namedRangeId: js.UndefOr[String] = js.native
  
  /** The ranges that belong to this named range. */
  var ranges: js.UndefOr[js.Array[Range]] = js.native
}
object NamedRange {
  
  @scala.inline
  def apply(): NamedRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedRange]
  }
  
  @scala.inline
  implicit class NamedRangeMutableBuilder[Self <: NamedRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
    
    @scala.inline
    def setRanges(value: js.Array[Range]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: Range*): Self = StObject.set(x, "ranges", js.Array(value :_*))
  }
}
