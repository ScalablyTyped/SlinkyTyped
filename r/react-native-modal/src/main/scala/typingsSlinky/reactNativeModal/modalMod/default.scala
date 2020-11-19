package typingsSlinky.reactNativeModal.modalMod

import typingsSlinky.reactNativeModal.anon.AnimationIn
import typingsSlinky.reactNativeModal.anon.AnimationInTiming
import typingsSlinky.reactNativeModal.anon.IsVisible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-modal/dist/modal", JSImport.Default)
@js.native
class default protected () extends ReactNativeModal {
  def this(props: ModalProps) = this()
}
/* static members */
@JSImport("react-native-modal/dist/modal", JSImport.Default)
@js.native
object default extends js.Object {
  
  var defaultProps: AnimationInTiming = js.native
  
  def getDerivedStateFromProps(nextProps: ModalProps, state: State): IsVisible | Null = js.native
  
  var propTypes: AnimationIn = js.native
}
