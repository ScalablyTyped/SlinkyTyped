package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaReservationsScopedList extends StObject {
  
  /**
    * A list of reservations contained in this scope.
    */
  var reservations: js.UndefOr[js.Array[SchemaReservation]] = js.native
  
  /**
    * Informational warning which replaces the list of reservations when the
    * list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}
object SchemaReservationsScopedList {
  
  @scala.inline
  def apply(): SchemaReservationsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReservationsScopedList]
  }
  
  @scala.inline
  implicit class SchemaReservationsScopedListMutableBuilder[Self <: SchemaReservationsScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReservations(value: js.Array[SchemaReservation]): Self = StObject.set(x, "reservations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationsUndefined: Self = StObject.set(x, "reservations", js.undefined)
    
    @scala.inline
    def setReservationsVarargs(value: SchemaReservation*): Self = StObject.set(x, "reservations", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
