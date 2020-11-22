package typingsSlinky.reactOverlays.modalMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactOverlays.anon.HandleContainerOverflow
import typingsSlinky.reactOverlays.anon.PartialModalPropsRefAttri
import typingsSlinky.reactOverlays.anon.WeakValidationMapModalPro
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-overlays/esm/Modal", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def apply(props: ModalProps with RefAttributes[ModalHandle]): ReactElement | Null = js.native
  
  @JSName("$$typeof")
  val DollarDollartypeof: js.Symbol = js.native
  
  var defaultProps: js.UndefOr[PartialModalPropsRefAttri] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapModalPro] = js.native
  
  @js.native
  class Manager ()
    extends typingsSlinky.reactOverlays.modalManagerMod.default {
    def this(hasHideSiblingNodesHandleContainerOverflow: HandleContainerOverflow) = this()
  }
  @js.native
  object Manager
    extends TopLevel[
          Instantiable1[
            /* hasHideSiblingNodesHandleContainerOverflow */ js.UndefOr[HandleContainerOverflow], 
            typingsSlinky.reactOverlays.modalManagerMod.default
          ]
        ]
}
