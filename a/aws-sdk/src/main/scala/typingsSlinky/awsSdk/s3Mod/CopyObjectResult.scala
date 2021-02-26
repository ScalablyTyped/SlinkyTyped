package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyObjectResult extends StObject {
  
  /**
    * Returns the ETag of the new object. The ETag reflects only changes to the contents of an object, not its metadata. The source and destination ETag is identical for a successfully copied object.
    */
  var ETag: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ETag] = js.native
  
  /**
    * Returns the date that the object was last modified.
    */
  var LastModified: js.UndefOr[js.Date] = js.native
}
object CopyObjectResult {
  
  @scala.inline
  def apply(): CopyObjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyObjectResult]
  }
  
  @scala.inline
  implicit class CopyObjectResultMutableBuilder[Self <: CopyObjectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: ETag): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setLastModified(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
  }
}
