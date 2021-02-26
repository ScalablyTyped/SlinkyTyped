package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.XResultSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This struct is to be contained in the first notification of an {@link XDynamicResultSet} .
  * @see XDynamicResultSet
  * @see ListEvent
  * @see ListAction
  * @see ListActionType
  */
@js.native
trait WelcomeDynamicResultSetStruct extends StObject {
  
  /** The static result set containing the new version of result set data. */
  var New: XResultSet = js.native
  
  /** The static result set containing the previous version of result set data. */
  var Old: XResultSet = js.native
}
object WelcomeDynamicResultSetStruct {
  
  @scala.inline
  def apply(New: XResultSet, Old: XResultSet): WelcomeDynamicResultSetStruct = {
    val __obj = js.Dynamic.literal(New = New.asInstanceOf[js.Any], Old = Old.asInstanceOf[js.Any])
    __obj.asInstanceOf[WelcomeDynamicResultSetStruct]
  }
  
  @scala.inline
  implicit class WelcomeDynamicResultSetStructMutableBuilder[Self <: WelcomeDynamicResultSetStruct] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNew(value: XResultSet): Self = StObject.set(x, "New", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOld(value: XResultSet): Self = StObject.set(x, "Old", value.asInstanceOf[js.Any])
  }
}
