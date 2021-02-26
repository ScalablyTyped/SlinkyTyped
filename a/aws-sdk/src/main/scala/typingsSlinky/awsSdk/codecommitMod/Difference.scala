package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Difference extends StObject {
  
  /**
    * Information about an afterBlob data type object, including the ID, the file mode permission code, and the path.
    */
  var afterBlob: js.UndefOr[BlobMetadata] = js.native
  
  /**
    * Information about a beforeBlob data type object, including the ID, the file mode permission code, and the path.
    */
  var beforeBlob: js.UndefOr[BlobMetadata] = js.native
  
  /**
    * Whether the change type of the difference is an addition (A), deletion (D), or modification (M).
    */
  var changeType: js.UndefOr[ChangeTypeEnum] = js.native
}
object Difference {
  
  @scala.inline
  def apply(): Difference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Difference]
  }
  
  @scala.inline
  implicit class DifferenceMutableBuilder[Self <: Difference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterBlob(value: BlobMetadata): Self = StObject.set(x, "afterBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterBlobUndefined: Self = StObject.set(x, "afterBlob", js.undefined)
    
    @scala.inline
    def setBeforeBlob(value: BlobMetadata): Self = StObject.set(x, "beforeBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeBlobUndefined: Self = StObject.set(x, "beforeBlob", js.undefined)
    
    @scala.inline
    def setChangeType(value: ChangeTypeEnum): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
  }
}
