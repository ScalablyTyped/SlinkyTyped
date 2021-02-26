package typingsSlinky.fluentuiReactComponentRef

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import typingsSlinky.fluentuiReactComponentRef.utilsMod.RefProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fluentui/react-component-ref", "Ref")
  @js.native
  val Ref: ReactComponentClass[RefProps] = js.native
  
  @JSImport("@fluentui/react-component-ref", "RefFindNode")
  @js.native
  class RefFindNode protected ()
    extends typingsSlinky.fluentuiReactComponentRef.refFindNodeMod.RefFindNode {
    def this(props: RefProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RefProps, context: js.Any) = this()
  }
  
  @JSImport("@fluentui/react-component-ref", "RefForward")
  @js.native
  class RefForward protected ()
    extends typingsSlinky.fluentuiReactComponentRef.refForwardMod.RefForward {
    def this(props: RefProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RefProps, context: js.Any) = this()
  }
  
  @JSImport("@fluentui/react-component-ref", "handleRef")
  @js.native
  def handleRef[N](ref: js.UndefOr[scala.Nothing], node: N): Unit = js.native
  @JSImport("@fluentui/react-component-ref", "handleRef")
  @js.native
  def handleRef[N](ref: js.Function1[/* instance */ N | Null, Unit], node: N): Unit = js.native
  @JSImport("@fluentui/react-component-ref", "handleRef")
  @js.native
  def handleRef[N](ref: Null, node: N): Unit = js.native
  @JSImport("@fluentui/react-component-ref", "handleRef")
  @js.native
  def handleRef[N](ref: ReactRef[N], node: N): Unit = js.native
  
  @JSImport("@fluentui/react-component-ref", "isRefObject")
  @js.native
  def isRefObject(ref: js.Any): /* is react.react.RefObject<any> */ Boolean = js.native
}
