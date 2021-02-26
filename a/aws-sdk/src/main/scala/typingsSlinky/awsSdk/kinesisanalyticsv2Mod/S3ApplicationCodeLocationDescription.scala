package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3ApplicationCodeLocationDescription extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the S3 bucket containing the application code.
    */
  var BucketARN: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.BucketARN = js.native
  
  /**
    * The file key for the object containing the application code.
    */
  var FileKey: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.FileKey = js.native
  
  /**
    * The version of the object containing the application code.
    */
  var ObjectVersion: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ObjectVersion] = js.native
}
object S3ApplicationCodeLocationDescription {
  
  @scala.inline
  def apply(BucketARN: BucketARN, FileKey: FileKey): S3ApplicationCodeLocationDescription = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN.asInstanceOf[js.Any], FileKey = FileKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ApplicationCodeLocationDescription]
  }
  
  @scala.inline
  implicit class S3ApplicationCodeLocationDescriptionMutableBuilder[Self <: S3ApplicationCodeLocationDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketARN(value: BucketARN): Self = StObject.set(x, "BucketARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileKey(value: FileKey): Self = StObject.set(x, "FileKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectVersion(value: ObjectVersion): Self = StObject.set(x, "ObjectVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectVersionUndefined: Self = StObject.set(x, "ObjectVersion", js.undefined)
  }
}
