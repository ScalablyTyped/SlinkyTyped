package typingsSlinky.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transition extends StObject {
  
  /**
    * Indicates when objects are transitioned to the specified storage class. The date value must be in ISO 8601 format. The time is always midnight UTC.
    */
  var Date: js.UndefOr[js.Date] = js.native
  
  /**
    * Indicates the number of days after creation when objects are transitioned to the specified storage class. The value must be a positive integer.
    */
  var Days: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.Days] = js.native
  
  /**
    * The storage class to which you want the object to transition.
    */
  var StorageClass: js.UndefOr[TransitionStorageClass] = js.native
}
object Transition {
  
  @scala.inline
  def apply(): Transition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transition]
  }
  
  @scala.inline
  implicit class TransitionMutableBuilder[Self <: Transition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: js.Date): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "Date", js.undefined)
    
    @scala.inline
    def setDays(value: Days): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysUndefined: Self = StObject.set(x, "Days", js.undefined)
    
    @scala.inline
    def setStorageClass(value: TransitionStorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
  }
}
