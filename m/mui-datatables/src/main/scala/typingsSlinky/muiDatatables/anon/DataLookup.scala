package typingsSlinky.muiDatatables.anon

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataLookup extends StObject {
  
  var data: js.Array[DataIndex] = js.native
  
  var lookup: NumberDictionary[Boolean] = js.native
}
object DataLookup {
  
  @scala.inline
  def apply(data: js.Array[DataIndex], lookup: NumberDictionary[Boolean]): DataLookup = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataLookup]
  }
  
  @scala.inline
  implicit class DataLookupMutableBuilder[Self <: DataLookup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[DataIndex]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: DataIndex*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setLookup(value: NumberDictionary[Boolean]): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
  }
}
