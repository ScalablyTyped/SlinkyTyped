package typingsSlinky.muiDatatables.anon

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lookup extends StObject {
  
  var data: js.Array[DataIndex] = js.native
  
  var lookup: NumberDictionary[Boolean] = js.native
}
object Lookup {
  
  @scala.inline
  def apply(data: js.Array[DataIndex], lookup: NumberDictionary[Boolean]): Lookup = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lookup]
  }
  
  @scala.inline
  implicit class LookupMutableBuilder[Self <: Lookup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[DataIndex]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: DataIndex*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setLookup(value: NumberDictionary[Boolean]): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
  }
}
