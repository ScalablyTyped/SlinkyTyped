package typingsSlinky.rcTrigger.popupMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.rcTrigger.interfaceMod.AlignType
import typingsSlinky.rcTrigger.interfaceMod.AnimationType
import typingsSlinky.rcTrigger.interfaceMod.MotionType
import typingsSlinky.rcTrigger.interfaceMod.Point
import typingsSlinky.rcTrigger.interfaceMod.StretchType
import typingsSlinky.rcTrigger.interfaceMod.TransitionNameType
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupProps extends js.Object {
  var align: js.UndefOr[AlignType] = js.undefined
  var animation: AnimationType
  var children: js.UndefOr[ReactElement] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var destroyPopupOnHide: js.UndefOr[Boolean] = js.undefined
  var getClassNameFromAlign: js.UndefOr[js.Function1[/* align */ AlignType, String]] = js.undefined
  var getRootDomNode: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  var mask: js.UndefOr[Boolean] = js.undefined
  var maskAnimation: AnimationType
  var maskMotion: MotionType
  var maskTransitionName: TransitionNameType
  var motion: MotionType
  var onAlign: js.UndefOr[js.Function2[/* element */ HTMLElement, /* align */ AlignType, Unit]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
  var point: js.UndefOr[Point] = js.undefined
  var prefixCls: String
  var stretch: js.UndefOr[StretchType] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var transitionName: TransitionNameType
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object PopupProps {
  @scala.inline
  def apply(
    animation: AnimationType,
    maskAnimation: AnimationType,
    maskMotion: MotionType,
    maskTransitionName: TransitionNameType,
    motion: MotionType,
    prefixCls: String,
    transitionName: TransitionNameType
  ): PopupProps = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], maskAnimation = maskAnimation.asInstanceOf[js.Any], maskMotion = maskMotion.asInstanceOf[js.Any], maskTransitionName = maskTransitionName.asInstanceOf[js.Any], motion = motion.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupProps]
  }
  @scala.inline
  implicit class PopupPropsOps[Self <: PopupProps] (val x: Self) extends AnyVal {
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
    def setAnimation(value: AnimationType): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaskAnimation(value: AnimationType): Self = this.set("maskAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaskMotion(value: MotionType): Self = this.set("maskMotion", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaskTransitionName(value: TransitionNameType): Self = this.set("maskTransitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMotion(value: MotionType): Self = this.set("motion", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionName(value: TransitionNameType): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlign(value: AlignType): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDestroyPopupOnHide(value: Boolean): Self = this.set("destroyPopupOnHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroyPopupOnHide: Self = this.set("destroyPopupOnHide", js.undefined)
    @scala.inline
    def setGetClassNameFromAlign(value: /* align */ AlignType => String): Self = this.set("getClassNameFromAlign", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetClassNameFromAlign: Self = this.set("getClassNameFromAlign", js.undefined)
    @scala.inline
    def setGetRootDomNode(value: () => HTMLElement): Self = this.set("getRootDomNode", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRootDomNode: Self = this.set("getRootDomNode", js.undefined)
    @scala.inline
    def setMask(value: Boolean): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setOnAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Unit): Self = this.set("onAlign", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnAlign: Self = this.set("onAlign", js.undefined)
    @scala.inline
    def setOnMouseDown(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnTouchStart(value: SyntheticTouchEvent[HTMLElement] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    @scala.inline
    def setPoint(value: Point): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    @scala.inline
    def setStretch(value: StretchType): Self = this.set("stretch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStretch: Self = this.set("stretch", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

