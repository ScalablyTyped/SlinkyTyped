package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Storage extends StObject {
  
  /**
    * An Amazon S3 storage location.
    */
  var S3: js.UndefOr[S3Storage] = js.native
}
object Storage {
  
  @scala.inline
  def apply(): Storage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Storage]
  }
  
  @scala.inline
  implicit class StorageMutableBuilder[Self <: Storage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3(value: S3Storage): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
  }
}
