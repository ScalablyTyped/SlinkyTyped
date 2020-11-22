package typingsSlinky.fluentuiReactComponentRef

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import typingsSlinky.fluentuiReactComponentRef.utilsMod.RefProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fluentui/react-component-ref", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Ref: ReactComponentClass[RefProps] = js.native
  
  def handleRef[N](ref: js.UndefOr[scala.Nothing], node: N): Unit = js.native
  def handleRef[N](ref: js.Function1[/* instance */ N | Null, Unit], node: N): Unit = js.native
  def handleRef[N](ref: Null, node: N): Unit = js.native
  def handleRef[N](ref: ReactRef[N], node: N): Unit = js.native
  
  def isRefObject(ref: js.Any): /* is react.react.RefObject<any> */ Boolean = js.native
  
  @js.native
  class RefFindNode ()
    extends typingsSlinky.fluentuiReactComponentRef.refFindNodeMod.RefFindNode
  
  @js.native
  class RefForward ()
    extends typingsSlinky.fluentuiReactComponentRef.refForwardMod.RefForward
}
