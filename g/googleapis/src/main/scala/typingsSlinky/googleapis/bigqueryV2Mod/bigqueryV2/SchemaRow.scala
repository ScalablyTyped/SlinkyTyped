package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single row in the confusion matrix.
  */
@js.native
trait SchemaRow extends StObject {
  
  /**
    * The original label of this row.
    */
  var actualLabel: js.UndefOr[String] = js.native
  
  /**
    * Info describing predicted label distribution.
    */
  var entries: js.UndefOr[js.Array[SchemaEntry]] = js.native
}
object SchemaRow {
  
  @scala.inline
  def apply(): SchemaRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRow]
  }
  
  @scala.inline
  implicit class SchemaRowMutableBuilder[Self <: SchemaRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualLabel(value: String): Self = StObject.set(x, "actualLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualLabelUndefined: Self = StObject.set(x, "actualLabel", js.undefined)
    
    @scala.inline
    def setEntries(value: js.Array[SchemaEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: SchemaEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
