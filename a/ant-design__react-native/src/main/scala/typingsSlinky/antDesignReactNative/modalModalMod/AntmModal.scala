package typingsSlinky.antDesignReactNative.modalModalMod

import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AntmModal
  extends Component[ModalProps, js.Any, js.Any] {
  
  def onFooterLayout(e: SyntheticEvent[NodeHandle, Layout]): Unit = js.native
  
  var root: View | Null = js.native
  
  def saveRoot(root: js.Any): Unit = js.native
}
