package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of html values.
  */
@js.native
trait SchemaHtmlValues extends StObject {
  
  /**
    * The maximum allowable length for html values is 2048 characters.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}
object SchemaHtmlValues {
  
  @scala.inline
  def apply(): SchemaHtmlValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHtmlValues]
  }
  
  @scala.inline
  implicit class SchemaHtmlValuesMutableBuilder[Self <: SchemaHtmlValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
