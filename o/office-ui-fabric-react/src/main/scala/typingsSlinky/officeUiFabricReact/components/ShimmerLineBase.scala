package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.shimmerLineTypesMod.IShimmerLineProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShimmerLineBase {
  
  @JSImport("office-ui-fabric-react", "ShimmerLineBase")
  @js.native
  object component extends js.Object
  
  def withProps(p: IShimmerLineProps): SharedBuilder_IShimmerLineProps1550650054 = new SharedBuilder_IShimmerLineProps1550650054(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ShimmerLineBase.type): SharedBuilder_IShimmerLineProps1550650054 = new SharedBuilder_IShimmerLineProps1550650054(js.Array(this.component, js.Dictionary.empty))()
}
