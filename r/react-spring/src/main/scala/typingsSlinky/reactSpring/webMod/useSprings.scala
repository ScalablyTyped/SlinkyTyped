package typingsSlinky.reactSpring.webMod

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-spring/web", "useSprings")
@js.native
object useSprings extends js.Object {
  
  def apply[DS /* <: js.Object */](count: Double, getProps: js.Function1[/* i */ Double, UseSpringProps[DS]]): js.Tuple2[js.Array[AnimatedValue[ForwardedProps[DS]]], SetUpdateCallbackFn[DS]] = js.native
  def apply[TItem, DS /* <: CSSProperties */](count: Double, items: js.Array[TItem]): js.Array[ForwardedProps[DS]] = js.native
}
