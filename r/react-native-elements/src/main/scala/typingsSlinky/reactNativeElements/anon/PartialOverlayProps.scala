package typingsSlinky.reactNativeElements.anon

import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.`landscape-left`
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.`landscape-right`
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.`portrait-upside-down`
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.fade
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.formSheet
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.fullScreen
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.landscape
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.none
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.overFullScreen
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.pageSheet
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.portrait
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.OverlayProps> */
@js.native
trait PartialOverlayProps extends js.Object {
  var ModalComponent: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  var animated: js.UndefOr[Boolean] = js.native
  var animationType: js.UndefOr[none | slide | fade] = js.native
  var backdropStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var children: js.UndefOr[ReactElement] = js.native
  var fullScreen: js.UndefOr[Boolean] = js.native
  var hardwareAccelerated: js.UndefOr[Boolean] = js.native
  var isVisible: js.UndefOr[Boolean] = js.native
  var onBackdropPress: js.UndefOr[js.Function0[Unit]] = js.native
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  var onOrientationChange: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, _], Unit]] = js.native
  var onRequestClose: js.UndefOr[js.Function0[Unit]] = js.native
  var onShow: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, _], Unit]] = js.native
  var overlayStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var presentationStyle: js.UndefOr[fullScreen | pageSheet | formSheet | overFullScreen] = js.native
  var statusBarTranslucent: js.UndefOr[Boolean] = js.native
  var supportedOrientations: js.UndefOr[
    js.Array[
      portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
    ]
  ] = js.native
  var transparent: js.UndefOr[Boolean] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object PartialOverlayProps {
  @scala.inline
  def apply(): PartialOverlayProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverlayProps]
  }
  @scala.inline
  implicit class PartialOverlayPropsOps[Self <: PartialOverlayProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setModalComponent(value: ReactComponentClass[js.Object]): Self = this.set("ModalComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalComponent: Self = this.set("ModalComponent", js.undefined)
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    @scala.inline
    def setAnimationType(value: none | slide | fade): Self = this.set("animationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationType: Self = this.set("animationType", js.undefined)
    @scala.inline
    def setBackdropStyle(value: StyleProp[ViewStyle]): Self = this.set("backdropStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdropStyle: Self = this.set("backdropStyle", js.undefined)
    @scala.inline
    def setBackdropStyleNull: Self = this.set("backdropStyle", null)
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setFullScreen(value: Boolean): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullScreen: Self = this.set("fullScreen", js.undefined)
    @scala.inline
    def setHardwareAccelerated(value: Boolean): Self = this.set("hardwareAccelerated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHardwareAccelerated: Self = this.set("hardwareAccelerated", js.undefined)
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsVisible: Self = this.set("isVisible", js.undefined)
    @scala.inline
    def setOnBackdropPress(value: () => Unit): Self = this.set("onBackdropPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnBackdropPress: Self = this.set("onBackdropPress", js.undefined)
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    @scala.inline
    def setOnOrientationChange(value: SyntheticEvent[NodeHandle, _] => Unit): Self = this.set("onOrientationChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOrientationChange: Self = this.set("onOrientationChange", js.undefined)
    @scala.inline
    def setOnRequestClose(value: () => Unit): Self = this.set("onRequestClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnRequestClose: Self = this.set("onRequestClose", js.undefined)
    @scala.inline
    def setOnShow(value: SyntheticEvent[NodeHandle, _] => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setOverlayStyle(value: StyleProp[ViewStyle]): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    @scala.inline
    def setOverlayStyleNull: Self = this.set("overlayStyle", null)
    @scala.inline
    def setPresentationStyle(value: fullScreen | pageSheet | formSheet | overFullScreen): Self = this.set("presentationStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresentationStyle: Self = this.set("presentationStyle", js.undefined)
    @scala.inline
    def setStatusBarTranslucent(value: Boolean): Self = this.set("statusBarTranslucent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusBarTranslucent: Self = this.set("statusBarTranslucent", js.undefined)
    @scala.inline
    def setSupportedOrientationsVarargs(value: (portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`)*): Self = this.set("supportedOrientations", js.Array(value :_*))
    @scala.inline
    def setSupportedOrientations(
      value: js.Array[
          portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
        ]
    ): Self = this.set("supportedOrientations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedOrientations: Self = this.set("supportedOrientations", js.undefined)
    @scala.inline
    def setTransparent(value: Boolean): Self = this.set("transparent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransparent: Self = this.set("transparent", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

