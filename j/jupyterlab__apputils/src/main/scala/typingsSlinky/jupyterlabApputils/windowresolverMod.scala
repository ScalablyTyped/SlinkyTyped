package typingsSlinky.jupyterlabApputils

import typingsSlinky.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowresolverMod {
  
  @js.native
  trait IWindowResolver extends StObject {
    
    /**
      * A window name to use as a handle among shared resources.
      */
    val name: String = js.native
  }
  object IWindowResolver {
    
    @JSImport("@jupyterlab/apputils/lib/windowresolver", "IWindowResolver")
    @js.native
    val ^ : Token[IWindowResolver] = js.native
    
    @scala.inline
    implicit class IWindowResolverMutableBuilder[Self <: IWindowResolver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@jupyterlab/apputils/lib/windowresolver", "WindowResolver")
  @js.native
  class WindowResolver () extends IWindowResolver {
    
    var _name: js.Any = js.native
    
    /**
      * The resolved window name.
      *
      * #### Notes
      * If the `resolve` promise has not resolved, the behavior is undefined.
      */
    @JSName("name")
    def name_MWindowResolver: String = js.native
    
    /**
      * Resolve a window name to use as a handle among shared resources.
      *
      * @param candidate - The potential window name being resolved.
      *
      * #### Notes
      * Typically, the name candidate should be a JupyterLab workspace name or
      * an empty string if there is no workspace.
      *
      * If the returned promise rejects, a window name cannot be resolved without
      * user intervention, which typically means navigation to a new URL.
      */
    def resolve(candidate: String): js.Promise[Unit] = js.native
  }
}
