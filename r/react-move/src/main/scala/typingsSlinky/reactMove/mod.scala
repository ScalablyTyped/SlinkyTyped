package typingsSlinky.reactMove

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactMove.animateMod.default
import typingsSlinky.reactMove.nodeGroupMod.INodeGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-move", "Animate")
  @js.native
  class Animate () extends default
  
  @JSImport("react-move", "NodeGroup")
  @js.native
  class NodeGroup protected ()
    extends typingsSlinky.reactMove.nodeGroupMod.default {
    def this(props: INodeGroupProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: INodeGroupProps, context: js.Any) = this()
  }
  
  type GetInterpolator = js.Function4[
    /* begValue */ js.UndefOr[js.Any], 
    /* endValue */ js.UndefOr[js.Any], 
    /* attr */ js.UndefOr[String], 
    /* namespace */ js.UndefOr[String], 
    js.Function1[/* t */ Double, js.Any]
  ]
  
  type HashMap = StringDictionary[js.Any]
}
