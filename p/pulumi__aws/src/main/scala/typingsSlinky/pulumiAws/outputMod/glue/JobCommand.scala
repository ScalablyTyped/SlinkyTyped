package typingsSlinky.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobCommand extends StObject {
  
  /**
    * The name of the job command. Defaults to `glueetl`. Use `pythonshell` for Python Shell Job Type, `maxCapacity` needs to be set if `pythonshell` is chosen.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The Python version being used to execute a Python shell job. Allowed values are 2 or 3.
    */
  var pythonVersion: String = js.native
  
  /**
    * Specifies the S3 path to a script that executes a job.
    */
  var scriptLocation: String = js.native
}
object JobCommand {
  
  @scala.inline
  def apply(pythonVersion: String, scriptLocation: String): JobCommand = {
    val __obj = js.Dynamic.literal(pythonVersion = pythonVersion.asInstanceOf[js.Any], scriptLocation = scriptLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobCommand]
  }
  
  @scala.inline
  implicit class JobCommandMutableBuilder[Self <: JobCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPythonVersion(value: String): Self = StObject.set(x, "pythonVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptLocation(value: String): Self = StObject.set(x, "scriptLocation", value.asInstanceOf[js.Any])
  }
}
