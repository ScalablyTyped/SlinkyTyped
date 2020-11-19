package typingsSlinky.antdMobileRn.modalNativeMod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.LayoutChangeEvent
import typingsSlinky.reactNative.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AntmModal
  extends Component[IModalNativeProps, js.Any, js.Any] {
  
  def onFooterLayout(e: LayoutChangeEvent): Unit = js.native
  
  var root: View | Null = js.native
  
  def saveRoot(root: js.Any): Unit = js.native
}
