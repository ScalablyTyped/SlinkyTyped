package typingsSlinky.atom.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpawnProcessOptions extends StObject {
  
  /** Current working directory of the child process. */
  var cwd: js.UndefOr[String] = js.native
  
  /** Prepare child to run independently of its parent process. */
  var detached: js.UndefOr[Boolean] = js.native
  
  /** Environment key-value pairs. */
  var env: js.UndefOr[StringDictionary[String]] = js.native
  
  /** Sets the group identity of the process. */
  var gid: js.UndefOr[Double] = js.native
  
  /**
    *  If true, runs command inside of a shell. Uses "/bin/sh" on UNIX, and process.env.ComSpec
    *  on Windows. A different shell can be specified as a string.
    */
  var shell: js.UndefOr[Boolean | String] = js.native
  
  /** The child's stdio configuration. */
  var stdio: js.UndefOr[String | (js.Array[String | Double])] = js.native
  
  /** Sets the user identity of the process. */
  var uid: js.UndefOr[Double] = js.native
}
object SpawnProcessOptions {
  
  @scala.inline
  def apply(): SpawnProcessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpawnProcessOptions]
  }
  
  @scala.inline
  implicit class SpawnProcessOptionsMutableBuilder[Self <: SpawnProcessOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    @scala.inline
    def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    @scala.inline
    def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
    
    @scala.inline
    def setShell(value: Boolean | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
    
    @scala.inline
    def setStdio(value: String | (js.Array[String | Double])): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
    
    @scala.inline
    def setStdioVarargs(value: (String | Double)*): Self = StObject.set(x, "stdio", js.Array(value :_*))
    
    @scala.inline
    def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
