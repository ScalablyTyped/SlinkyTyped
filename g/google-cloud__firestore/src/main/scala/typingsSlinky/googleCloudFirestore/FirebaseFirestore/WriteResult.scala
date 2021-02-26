package typingsSlinky.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteResult extends StObject {
  
  /**
    * Returns true if this `WriteResult` is equal to the provided one.
    *
    * @param other The `WriteResult` to compare against.
    * @return true if this `WriteResult` is equal to the provided one.
    */
  def isEqual(other: WriteResult): Boolean = js.native
  
  /**
    * The write time as set by the Firestore servers.
    */
  val writeTime: Timestamp = js.native
}
object WriteResult {
  
  @scala.inline
  def apply(isEqual: WriteResult => Boolean, writeTime: Timestamp): WriteResult = {
    val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction1(isEqual), writeTime = writeTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteResult]
  }
  
  @scala.inline
  implicit class WriteResultMutableBuilder[Self <: WriteResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsEqual(value: WriteResult => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteTime(value: Timestamp): Self = StObject.set(x, "writeTime", value.asInstanceOf[js.Any])
  }
}
