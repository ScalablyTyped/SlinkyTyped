package typingsSlinky.reactSpring.webMod

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-spring/web", "useSpring")
@js.native
object useSpring extends js.Object {
  
  def apply[DS /* <: js.Object */](getProps: js.Function0[UseSpringProps[Merge[DS, CSSProperties]]]): js.Tuple2[
    AnimatedValue[ForwardedProps[OverwriteKeys[DS, CSSProperties]]], 
    SetUpdateFn[OverwriteKeys[DS, CSSProperties]]
  ] = js.native
  def apply[DS /* <: js.Object */](values: UseSpringProps[Merge[DS, CSSProperties]]): AnimatedValue[ForwardedProps[OverwriteKeys[DS, CSSProperties]]] = js.native
}
