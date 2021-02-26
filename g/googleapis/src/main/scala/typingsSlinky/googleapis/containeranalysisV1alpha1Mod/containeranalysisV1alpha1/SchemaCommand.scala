package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Command describes a step performed as part of the build pipeline.
  */
@js.native
trait SchemaCommand extends StObject {
  
  /**
    * Command-line arguments used when executing this Command.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Working directory (relative to project source root) used when running
    * this Command.
    */
  var dir: js.UndefOr[String] = js.native
  
  /**
    * Environment variables set before running this Command.
    */
  var env: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional unique identifier for this Command, used in wait_for to
    * reference this Command as a dependency.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Name of the command, as presented on the command line, or if the command
    * is packaged as a Docker container, as presented to `docker pull`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The ID(s) of the Command(s) that this Command depends on.
    */
  var waitFor: js.UndefOr[js.Array[String]] = js.native
}
object SchemaCommand {
  
  @scala.inline
  def apply(): SchemaCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommand]
  }
  
  @scala.inline
  implicit class SchemaCommandMutableBuilder[Self <: SchemaCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setEnv(value: js.Array[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setEnvVarargs(value: String*): Self = StObject.set(x, "env", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setWaitFor(value: js.Array[String]): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
    
    @scala.inline
    def setWaitForVarargs(value: String*): Self = StObject.set(x, "waitFor", js.Array(value :_*))
  }
}
