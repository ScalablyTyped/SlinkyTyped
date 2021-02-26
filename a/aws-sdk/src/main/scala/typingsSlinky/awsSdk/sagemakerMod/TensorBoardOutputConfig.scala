package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TensorBoardOutputConfig extends StObject {
  
  /**
    * Path to local storage location for tensorBoard output. Defaults to /opt/ml/output/tensorboard.
    */
  var LocalPath: js.UndefOr[DirectoryPath] = js.native
  
  /**
    * Path to Amazon S3 storage location for TensorBoard output.
    */
  var S3OutputPath: S3Uri = js.native
}
object TensorBoardOutputConfig {
  
  @scala.inline
  def apply(S3OutputPath: S3Uri): TensorBoardOutputConfig = {
    val __obj = js.Dynamic.literal(S3OutputPath = S3OutputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TensorBoardOutputConfig]
  }
  
  @scala.inline
  implicit class TensorBoardOutputConfigMutableBuilder[Self <: TensorBoardOutputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalPath(value: DirectoryPath): Self = StObject.set(x, "LocalPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalPathUndefined: Self = StObject.set(x, "LocalPath", js.undefined)
    
    @scala.inline
    def setS3OutputPath(value: S3Uri): Self = StObject.set(x, "S3OutputPath", value.asInstanceOf[js.Any])
  }
}
