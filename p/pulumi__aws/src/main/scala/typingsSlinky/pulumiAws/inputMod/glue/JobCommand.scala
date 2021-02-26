package typingsSlinky.pulumiAws.inputMod.glue

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobCommand extends StObject {
  
  /**
    * The name of the job command. Defaults to `glueetl`. Use `pythonshell` for Python Shell Job Type, `maxCapacity` needs to be set if `pythonshell` is chosen.
    */
  var name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Python version being used to execute a Python shell job. Allowed values are 2 or 3.
    */
  var pythonVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies the S3 path to a script that executes a job.
    */
  var scriptLocation: Input[String] = js.native
}
object JobCommand {
  
  @scala.inline
  def apply(scriptLocation: Input[String]): JobCommand = {
    val __obj = js.Dynamic.literal(scriptLocation = scriptLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobCommand]
  }
  
  @scala.inline
  implicit class JobCommandMutableBuilder[Self <: JobCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPythonVersion(value: Input[String]): Self = StObject.set(x, "pythonVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPythonVersionUndefined: Self = StObject.set(x, "pythonVersion", js.undefined)
    
    @scala.inline
    def setScriptLocation(value: Input[String]): Self = StObject.set(x, "scriptLocation", value.asInstanceOf[js.Any])
  }
}
