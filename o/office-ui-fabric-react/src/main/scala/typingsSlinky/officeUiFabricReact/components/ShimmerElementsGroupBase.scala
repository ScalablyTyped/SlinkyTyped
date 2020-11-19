package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.shimmerElementsGroupTypesMod.IShimmerElementsGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShimmerElementsGroupBase {
  
  @JSImport("office-ui-fabric-react", "ShimmerElementsGroupBase")
  @js.native
  object component extends js.Object
  
  def withProps(p: IShimmerElementsGroupProps): SharedBuilder_IShimmerElementsGroupProps_1705317047 = new SharedBuilder_IShimmerElementsGroupProps_1705317047(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ShimmerElementsGroupBase.type): SharedBuilder_IShimmerElementsGroupProps_1705317047 = new SharedBuilder_IShimmerElementsGroupProps_1705317047(js.Array(this.component, js.Dictionary.empty))()
}
