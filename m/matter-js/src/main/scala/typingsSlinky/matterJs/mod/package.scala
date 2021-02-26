package typingsSlinky.matterJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.matterJs.anon.Name
    - typingsSlinky.matterJs.anon.Version
    - java.lang.String
  */
  type Dependency = typingsSlinky.matterJs.mod._Dependency | java.lang.String
  
  @scala.inline
  def use(plugins: (typingsSlinky.matterJs.mod.Plugin | java.lang.String)*): scala.Unit = typingsSlinky.matterJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("use")(plugins.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
