package typingsSlinky.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerTaskSpec
  extends TaskSpecBase
     with TaskSpec {
  
  var ContainerSpec: js.UndefOr[typingsSlinky.dockerode.mod.ContainerSpec] = js.native
}
object ContainerTaskSpec {
  
  @scala.inline
  def apply(): ContainerTaskSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerTaskSpec]
  }
  
  @scala.inline
  implicit class ContainerTaskSpecMutableBuilder[Self <: ContainerTaskSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerSpec(value: ContainerSpec): Self = StObject.set(x, "ContainerSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerSpecUndefined: Self = StObject.set(x, "ContainerSpec", js.undefined)
  }
}
