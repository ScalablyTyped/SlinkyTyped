package typingsSlinky.reactFns.scrollScrollMod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactFns.anon.PartialScrollConfig
import typingsSlinky.reactFns.typesMod.SharedRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-fns/dist/Scroll/Scroll", "Scroll")
@js.native
class Scroll ()
  extends Component[ScrollConfig with SharedRenderProps[ScrollProps], ScrollProps, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MScroll(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MScroll(): Unit = js.native
  
  def handleWindowScroll(): Unit = js.native
}
/* static members */
@JSImport("react-fns/dist/Scroll/Scroll", "Scroll")
@js.native
object Scroll extends js.Object {
  
  var defaultProps: PartialScrollConfig = js.native
}
