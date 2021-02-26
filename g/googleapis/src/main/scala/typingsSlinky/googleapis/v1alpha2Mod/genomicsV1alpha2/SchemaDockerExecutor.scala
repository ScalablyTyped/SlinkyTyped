package typingsSlinky.googleapis.v1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Docker execuctor specification.
  */
@js.native
trait SchemaDockerExecutor extends StObject {
  
  /**
    * Required. The command or newline delimited script to run. The command
    * string will be executed within a bash shell.  If the command exits with a
    * non-zero exit code, output parameter de-localization will be skipped and
    * the pipeline operation&#39;s `error` field will be populated.  Maximum
    * command string length is 16384.
    */
  var cmd: js.UndefOr[String] = js.native
  
  /**
    * Required. Image name from either Docker Hub or Google Container Registry.
    * Users that run pipelines must have READ access to the image.
    */
  var imageName: js.UndefOr[String] = js.native
}
object SchemaDockerExecutor {
  
  @scala.inline
  def apply(): SchemaDockerExecutor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDockerExecutor]
  }
  
  @scala.inline
  implicit class SchemaDockerExecutorMutableBuilder[Self <: SchemaDockerExecutor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmdUndefined: Self = StObject.set(x, "cmd", js.undefined)
    
    @scala.inline
    def setImageName(value: String): Self = StObject.set(x, "imageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageNameUndefined: Self = StObject.set(x, "imageName", js.undefined)
  }
}
