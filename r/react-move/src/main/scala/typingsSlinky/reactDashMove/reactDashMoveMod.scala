package typingsSlinky.reactDashMove

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashMove.animateMod.IAnimateProps
import typingsSlinky.reactDashMove.nodeGroupMod.INodeGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-move", JSImport.Namespace)
@js.native
object reactDashMoveMod extends js.Object {
  @js.native
  class Animate ()
    extends Component[IAnimateProps, js.Object, js.Any]
  
  @js.native
  class NodeGroup ()
    extends Component[INodeGroupProps, js.Object, js.Any]
  
  type GetInterpolator = js.Function4[
    /* begValue */ js.UndefOr[js.Any], 
    /* endValue */ js.UndefOr[js.Any], 
    /* attr */ js.UndefOr[String], 
    /* namespace */ js.UndefOr[String], 
    js.Function1[/* t */ Double, js.Any]
  ]
  type HashMap = StringDictionary[js.Any]
}

