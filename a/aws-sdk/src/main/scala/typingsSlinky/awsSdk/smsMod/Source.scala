package typingsSlinky.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source extends StObject {
  
  var s3Location: js.UndefOr[S3Location] = js.native
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
    def setS3Location(value: S3Location): Self = StObject.set(x, "s3Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3LocationUndefined: Self = StObject.set(x, "s3Location", js.undefined)
  }
}
