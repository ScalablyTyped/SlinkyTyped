package typingsSlinky.reactNativeModal

import typingsSlinky.reactNativeModal.anon.AnimationIn
import typingsSlinky.reactNativeModal.anon.AnimationInTiming
import typingsSlinky.reactNativeModal.anon.IsVisible
import typingsSlinky.reactNativeModal.modalMod.ModalProps
import typingsSlinky.reactNativeModal.modalMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-modal", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class ReactNativeModal protected ()
    extends typingsSlinky.reactNativeModal.modalMod.ReactNativeModal {
    def this(props: ModalProps) = this()
  }
  /* static members */
  @js.native
  object ReactNativeModal extends js.Object {
    
    var defaultProps: AnimationInTiming = js.native
    
    def getDerivedStateFromProps(nextProps: ModalProps, state: State): IsVisible | Null = js.native
    
    var propTypes: AnimationIn = js.native
  }
  
  @js.native
  class default protected ()
    extends typingsSlinky.reactNativeModal.modalMod.ReactNativeModal {
    def this(props: ModalProps) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: AnimationInTiming = js.native
    
    def getDerivedStateFromProps(nextProps: ModalProps, state: State): IsVisible | Null = js.native
    
    var propTypes: AnimationIn = js.native
  }
}
