package typingsSlinky.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetJobUnlockCodeResult extends StObject {
  
  /**
    * The UnlockCode value for the specified job. The UnlockCode value can be accessed for up to 90 days after the job has been created.
    */
  var UnlockCode: js.UndefOr[String] = js.native
}
object GetJobUnlockCodeResult {
  
  @scala.inline
  def apply(): GetJobUnlockCodeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobUnlockCodeResult]
  }
  
  @scala.inline
  implicit class GetJobUnlockCodeResultMutableBuilder[Self <: GetJobUnlockCodeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnlockCode(value: String): Self = StObject.set(x, "UnlockCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlockCodeUndefined: Self = StObject.set(x, "UnlockCode", js.undefined)
  }
}
