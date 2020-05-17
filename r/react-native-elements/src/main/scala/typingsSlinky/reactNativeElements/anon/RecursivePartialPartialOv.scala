package typingsSlinky.reactNativeElements.anon

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.RecursivePartial
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

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.OverlayProps>> */
@js.native
trait RecursivePartialPartialOv extends js.Object {
  var animated: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var animationType: js.UndefOr[RecursivePartial[js.UndefOr[none | slide | fade]]] = js.native
  var borderRadius: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var children: js.UndefOr[RecursivePartial[js.UndefOr[ReactElement]]] = js.native
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var fullScreen: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var hardwareAccelerated: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var height: js.UndefOr[RecursivePartial[js.UndefOr[Double | String]]] = js.native
  var isVisible: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var onBackdropPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onDismiss: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onOrientationChange: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, _], Unit]]]] = js.native
  var onRequestClose: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onShow: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, _], Unit]]]] = js.native
  var overlayBackgroundColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var overlayStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var presentationStyle: js.UndefOr[
    RecursivePartial[js.UndefOr[fullScreen | pageSheet | formSheet | overFullScreen]]
  ] = js.native
  var supportedOrientations: js.UndefOr[
    RecursivePartial[
      js.UndefOr[
        js.Array[
          portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
        ]
      ]
    ]
  ] = js.native
  var transparent: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var visible: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var width: js.UndefOr[RecursivePartial[js.UndefOr[Double | String]]] = js.native
  var windowBackgroundColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
}

object RecursivePartialPartialOv {
  @scala.inline
  def apply(): RecursivePartialPartialOv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialOv]
  }
  @scala.inline
  implicit class RecursivePartialPartialOvOps[Self <: RecursivePartialPartialOv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimated(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationType(value: RecursivePartial[js.UndefOr[none | slide | fade]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationType")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRadius(value: RecursivePartial[js.UndefOr[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: RecursivePartial[js.UndefOr[ReactElement]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFullScreen(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withHardwareAccelerated(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareAccelerated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHardwareAccelerated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareAccelerated")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: RecursivePartial[js.UndefOr[Double | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVisible(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBackdropPress(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackdropPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBackdropPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackdropPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDismiss(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOrientationChange(value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, _], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOrientationChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnOrientationChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOrientationChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRequestClose(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequestClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnRequestClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequestClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, _], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayBackgroundColor(value: RecursivePartial[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPresentationStyle(value: RecursivePartial[js.UndefOr[fullScreen | pageSheet | formSheet | overFullScreen]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentationStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresentationStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentationStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedOrientations(
      value: RecursivePartial[
          js.UndefOr[
            js.Array[
              portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedOrientations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedOrientations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedOrientations")(js.undefined)
        ret
    }
    @scala.inline
    def withTransparent(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: RecursivePartial[js.UndefOr[Double | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowBackgroundColor(value: RecursivePartial[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowBackgroundColor")(js.undefined)
        ret
    }
  }
  
}

