package typingsSlinky.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefinedNamesRanges extends StObject {
  
  var name: String = js.native
  
  var ranges: js.Array[String] = js.native
}
object DefinedNamesRanges {
  
  @scala.inline
  def apply(name: String, ranges: js.Array[String]): DefinedNamesRanges = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinedNamesRanges]
  }
  
  @scala.inline
  implicit class DefinedNamesRangesMutableBuilder[Self <: DefinedNamesRanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRanges(value: js.Array[String]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesVarargs(value: String*): Self = StObject.set(x, "ranges", js.Array(value :_*))
  }
}
