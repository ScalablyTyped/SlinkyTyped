package typingsSlinky.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Command extends StObject {
  
  /**
    * Arguments for Amazon EMR to pass to the command for execution.
    */
  var Args: js.UndefOr[StringList] = js.native
  
  /**
    * The name of the command.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The Amazon S3 location of the command script.
    */
  var ScriptPath: js.UndefOr[String] = js.native
}
object Command {
  
  @scala.inline
  def apply(): Command = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit class CommandMutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: StringList): Self = StObject.set(x, "Args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "Args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "Args", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setScriptPath(value: String): Self = StObject.set(x, "ScriptPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptPathUndefined: Self = StObject.set(x, "ScriptPath", js.undefined)
  }
}
