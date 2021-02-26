package typingsSlinky.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enum value definition.
  */
@js.native
trait SchemaEnumValue extends StObject {
  
  /**
    * Enum value name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Enum value number.
    */
  var number: js.UndefOr[Double] = js.native
  
  /**
    * Protocol buffer options.
    */
  var options: js.UndefOr[js.Array[SchemaOption]] = js.native
}
object SchemaEnumValue {
  
  @scala.inline
  def apply(): SchemaEnumValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnumValue]
  }
  
  @scala.inline
  implicit class SchemaEnumValueMutableBuilder[Self <: SchemaEnumValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[SchemaOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: SchemaOption*): Self = StObject.set(x, "options", js.Array(value :_*))
  }
}
