package typingsSlinky.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputParallelismUpdate extends StObject {
  
  /**
    * Number of in-application streams to create for the specified streaming source.
    */
  var CountUpdate: js.UndefOr[InputParallelismCount] = js.native
}
object InputParallelismUpdate {
  
  @scala.inline
  def apply(): InputParallelismUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputParallelismUpdate]
  }
  
  @scala.inline
  implicit class InputParallelismUpdateMutableBuilder[Self <: InputParallelismUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountUpdate(value: InputParallelismCount): Self = StObject.set(x, "CountUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUpdateUndefined: Self = StObject.set(x, "CountUpdate", js.undefined)
  }
}
