package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.shimmerCircleTypesMod.IShimmerCircleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShimmerCircleBase {
  
  @JSImport("office-ui-fabric-react", "ShimmerCircleBase")
  @js.native
  object component extends js.Object
  
  def withProps(p: IShimmerCircleProps): SharedBuilder_IShimmerCircleProps176458435 = new SharedBuilder_IShimmerCircleProps176458435(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ShimmerCircleBase.type): SharedBuilder_IShimmerCircleProps176458435 = new SharedBuilder_IShimmerCircleProps176458435(js.Array(this.component, js.Dictionary.empty))()
}
