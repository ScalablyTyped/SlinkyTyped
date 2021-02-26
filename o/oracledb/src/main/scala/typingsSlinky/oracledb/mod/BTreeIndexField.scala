package typingsSlinky.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to configure fields when creating a B-Tree Index.
  */
@js.native
trait BTreeIndexField extends StObject {
  
  /** Name of the data type of the targeted-field value, for indexing purposes. */
  var datatype: js.UndefOr[String] = js.native
  
  /** Specifies the maximum length of the value to index. */
  var maxlength: js.UndefOr[Double] = js.native
  
  /** Index sorting order, for datatype varchar2 (or one of its synonyms) or number. */
  var order: js.UndefOr[String | Double] = js.native
  
  /** Path to the targeted field, whose value is expected to be a scalar. */
  var path: String = js.native
}
object BTreeIndexField {
  
  @scala.inline
  def apply(path: String): BTreeIndexField = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[BTreeIndexField]
  }
  
  @scala.inline
  implicit class BTreeIndexFieldMutableBuilder[Self <: BTreeIndexField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    @scala.inline
    def setMaxlength(value: Double): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
    
    @scala.inline
    def setOrder(value: String | Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
