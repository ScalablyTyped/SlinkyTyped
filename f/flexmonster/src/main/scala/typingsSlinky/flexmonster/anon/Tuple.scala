package typingsSlinky.flexmonster.anon

import typingsSlinky.flexmonster.mod.MeasureObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tuple extends StObject {
  
  var measure: MeasureObject = js.native
  
  var tuple: js.Array[String] = js.native
  
  var `type`: String = js.native
}
object Tuple {
  
  @scala.inline
  def apply(measure: MeasureObject, tuple: js.Array[String], `type`: String): Tuple = {
    val __obj = js.Dynamic.literal(measure = measure.asInstanceOf[js.Any], tuple = tuple.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tuple]
  }
  
  @scala.inline
  implicit class TupleMutableBuilder[Self <: Tuple] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeasure(value: MeasureObject): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTuple(value: js.Array[String]): Self = StObject.set(x, "tuple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTupleVarargs(value: String*): Self = StObject.set(x, "tuple", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
