package typingsSlinky.reactNativeModal.components

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeAnimatable.mod.Animation
import typingsSlinky.reactNativeAnimatable.mod.CustomAnimation
import typingsSlinky.reactNativeModal.modalMod.ModalProps
import typingsSlinky.reactNativeModal.modalMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Modal {
  
  @scala.inline
  def apply(
    animationIn: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle]),
    animationInTiming: Double,
    animationOut: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle]),
    animationOutTiming: Double,
    avoidKeyboard: Boolean,
    backdropColor: String,
    backdropOpacity: Double,
    backdropTransitionInTiming: Double,
    backdropTransitionOutTiming: Double,
    coverScreen: Boolean,
    deviceHeight: Double,
    deviceWidth: Double,
    hasBackdrop: Boolean,
    hideModalContentWhileAnimating: Boolean,
    isVisible: Boolean,
    onBackButtonPress: () => Unit,
    onBackdropPress: () => Unit,
    onModalHide: () => Unit,
    onModalShow: () => Unit,
    onModalWillHide: () => Unit,
    onModalWillShow: () => Unit,
    propagateSwipe: Boolean,
    scrollHorizontal: Boolean,
    scrollOffset: Double,
    scrollOffsetMax: Double,
    swipeThreshold: Double,
    useNativeDriver: Boolean
  ): SharedBuilder_ModalProps_1116046267[default] = {
    val __props = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationInTiming = animationInTiming.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any], animationOutTiming = animationOutTiming.asInstanceOf[js.Any], avoidKeyboard = avoidKeyboard.asInstanceOf[js.Any], backdropColor = backdropColor.asInstanceOf[js.Any], backdropOpacity = backdropOpacity.asInstanceOf[js.Any], backdropTransitionInTiming = backdropTransitionInTiming.asInstanceOf[js.Any], backdropTransitionOutTiming = backdropTransitionOutTiming.asInstanceOf[js.Any], coverScreen = coverScreen.asInstanceOf[js.Any], deviceHeight = deviceHeight.asInstanceOf[js.Any], deviceWidth = deviceWidth.asInstanceOf[js.Any], hasBackdrop = hasBackdrop.asInstanceOf[js.Any], hideModalContentWhileAnimating = hideModalContentWhileAnimating.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], onBackButtonPress = js.Any.fromFunction0(onBackButtonPress), onBackdropPress = js.Any.fromFunction0(onBackdropPress), onModalHide = js.Any.fromFunction0(onModalHide), onModalShow = js.Any.fromFunction0(onModalShow), onModalWillHide = js.Any.fromFunction0(onModalWillHide), onModalWillShow = js.Any.fromFunction0(onModalWillShow), propagateSwipe = propagateSwipe.asInstanceOf[js.Any], scrollHorizontal = scrollHorizontal.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], scrollOffsetMax = scrollOffsetMax.asInstanceOf[js.Any], swipeThreshold = swipeThreshold.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    new SharedBuilder_ModalProps_1116046267[default](js.Array(this.component, __props.asInstanceOf[ModalProps]))
  }
  
  @JSImport("react-native-modal/dist/modal", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ModalProps): SharedBuilder_ModalProps_1116046267[default] = new SharedBuilder_ModalProps_1116046267[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
