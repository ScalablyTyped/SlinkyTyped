package typingsSlinky.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source extends StObject {
  
  /**
    * The S3Source object.
    */
  var s3: js.UndefOr[S3Source] = js.native
}
object Source {
  
  @scala.inline
  def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3(value: S3Source): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
  }
}
