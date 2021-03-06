package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxActivityLogging Class */
@js.native
trait FaxActivityLogging extends StObject {
  
  /** Activity log database files path */
  var DatabasePath: String = js.native
  
  @JSName("FAXCOMEXLib.FaxActivityLogging_typekey")
  var FAXCOMEXLibDotFaxActivityLogging_typekey: FaxActivityLogging = js.native
  
  /** Does the server log incoming fax activity */
  var LogIncoming: Boolean = js.native
  
  /** Does the server log outgoing fax activity */
  var LogOutgoing: Boolean = js.native
  
  /** Refresh the object */
  def Refresh(): Unit = js.native
  
  /** Save the object */
  def Save(): Unit = js.native
}
object FaxActivityLogging {
  
  @scala.inline
  def apply(
    DatabasePath: String,
    FAXCOMEXLibDotFaxActivityLogging_typekey: FaxActivityLogging,
    LogIncoming: Boolean,
    LogOutgoing: Boolean,
    Refresh: () => Unit,
    Save: () => Unit
  ): FaxActivityLogging = {
    val __obj = js.Dynamic.literal(DatabasePath = DatabasePath.asInstanceOf[js.Any], LogIncoming = LogIncoming.asInstanceOf[js.Any], LogOutgoing = LogOutgoing.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), Save = js.Any.fromFunction0(Save))
    __obj.updateDynamic("FAXCOMEXLib.FaxActivityLogging_typekey")(FAXCOMEXLibDotFaxActivityLogging_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxActivityLogging]
  }
  
  @scala.inline
  implicit class FaxActivityLoggingMutableBuilder[Self <: FaxActivityLogging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabasePath(value: String): Self = StObject.set(x, "DatabasePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFAXCOMEXLibDotFaxActivityLogging_typekey(value: FaxActivityLogging): Self = StObject.set(x, "FAXCOMEXLib.FaxActivityLogging_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogIncoming(value: Boolean): Self = StObject.set(x, "LogIncoming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogOutgoing(value: Boolean): Self = StObject.set(x, "LogOutgoing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = StObject.set(x, "Refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
  }
}
