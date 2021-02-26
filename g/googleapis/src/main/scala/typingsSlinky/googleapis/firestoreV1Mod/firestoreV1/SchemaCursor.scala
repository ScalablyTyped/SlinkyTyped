package typingsSlinky.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A position in a query result set.
  */
@js.native
trait SchemaCursor extends StObject {
  
  /**
    * If the position is just before or just after the given values, relative
    * to the sort order defined by the query.
    */
  var before: js.UndefOr[Boolean] = js.native
  
  /**
    * The values that represent a position, in the order they appear in the
    * order by clause of a query.  Can contain fewer values than specified in
    * the order by clause.
    */
  var values: js.UndefOr[js.Array[SchemaValue]] = js.native
}
object SchemaCursor {
  
  @scala.inline
  def apply(): SchemaCursor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCursor]
  }
  
  @scala.inline
  implicit class SchemaCursorMutableBuilder[Self <: SchemaCursor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBefore(value: Boolean): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[SchemaValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: SchemaValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
