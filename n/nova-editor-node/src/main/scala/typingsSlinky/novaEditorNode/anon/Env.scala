package typingsSlinky.novaEditorNode.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.novaEditorNode.novaEditorNodeStrings.ignore
import typingsSlinky.novaEditorNode.novaEditorNodeStrings.jsonrpc
import typingsSlinky.novaEditorNode.novaEditorNodeStrings.pipe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Env extends StObject {
  
  var args: js.UndefOr[js.Array[String]] = js.native
  
  var cwd: js.UndefOr[String] = js.native
  
  var env: js.UndefOr[StringDictionary[String]] = js.native
  
  var matchers: js.UndefOr[js.Array[String]] = js.native
  
  var stdio: js.UndefOr[
    (js.Tuple3[pipe | ignore, pipe | ignore, pipe | ignore]) | pipe | ignore | jsonrpc | Double
  ] = js.native
}
object Env {
  
  @scala.inline
  def apply(): Env = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Env]
  }
  
  @scala.inline
  implicit class EnvMutableBuilder[Self <: Env] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    @scala.inline
    def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setMatchers(value: js.Array[String]): Self = StObject.set(x, "matchers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchersUndefined: Self = StObject.set(x, "matchers", js.undefined)
    
    @scala.inline
    def setMatchersVarargs(value: String*): Self = StObject.set(x, "matchers", js.Array(value :_*))
    
    @scala.inline
    def setStdio(value: (js.Tuple3[pipe | ignore, pipe | ignore, pipe | ignore]) | pipe | ignore | jsonrpc | Double): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
  }
}
