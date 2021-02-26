package typingsSlinky.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentLocation extends StObject {
  
  /**
    * The Amazon S3 bucket that contains the input document.
    */
  var S3Object: js.UndefOr[typingsSlinky.awsSdk.textractMod.S3Object] = js.native
}
object DocumentLocation {
  
  @scala.inline
  def apply(): DocumentLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentLocation]
  }
  
  @scala.inline
  implicit class DocumentLocationMutableBuilder[Self <: DocumentLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Object(value: S3Object): Self = StObject.set(x, "S3Object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ObjectUndefined: Self = StObject.set(x, "S3Object", js.undefined)
  }
}
