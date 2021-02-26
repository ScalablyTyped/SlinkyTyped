package typingsSlinky.reactNativeFirebase.anon

import typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTimestamp extends StObject {
  
  /* static member */
  def fromDate(date: js.Date): Timestamp = js.native
  
  /* static member */
  def fromMillis(milliseconds: Double): Timestamp = js.native
  
  /* static member */
  def now(): Timestamp = js.native
}
object TypeofTimestamp {
  
  @scala.inline
  def apply(fromDate: js.Date => Timestamp, fromMillis: Double => Timestamp, now: () => Timestamp): TypeofTimestamp = {
    val __obj = js.Dynamic.literal(fromDate = js.Any.fromFunction1(fromDate), fromMillis = js.Any.fromFunction1(fromMillis), now = js.Any.fromFunction0(now))
    __obj.asInstanceOf[TypeofTimestamp]
  }
  
  @scala.inline
  implicit class TypeofTimestampMutableBuilder[Self <: TypeofTimestamp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromDate(value: js.Date => Timestamp): Self = StObject.set(x, "fromDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFromMillis(value: Double => Timestamp): Self = StObject.set(x, "fromMillis", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNow(value: () => Timestamp): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
  }
}
