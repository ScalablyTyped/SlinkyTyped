package typingsSlinky.ionicReact.createAnimationMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.react.mod.Component
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/react/dist/types/components/CreateAnimation", "CreateAnimation")
@js.native
class CreateAnimation protected ()
  extends Component[CreateAnimationProps, js.Object, js.Any] {
  def this(props: js.Any) = this()
  
  var animation: Animation = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MCreateAnimation(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCreateAnimation(prevProps: js.Any): Unit = js.native
  
  var nodes: Map[Double, HTMLElement] = js.native
  
  def setupAnimation(props: js.Any): Unit = js.native
}
