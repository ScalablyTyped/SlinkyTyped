package typingsSlinky.reactNativeModals.mod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactNativeModals.anon.Width
import typingsSlinky.reactNativeModals.reactNativeModalsStrings.auto
import typingsSlinky.reactNativeModals.reactNativeModalsStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Modal
  extends Component[ModalProps, js.Object, js.Any] {
  
  def dismiss(): Unit = js.native
  
  var modalSize: Width = js.native
  
  var pointerEvents: auto | none = js.native
  
  def show(): Unit = js.native
}
