package typingsSlinky.rcTrigger.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTrigger.interfaceMod.AlignType
import typingsSlinky.rcTrigger.interfaceMod.AnimationType
import typingsSlinky.rcTrigger.interfaceMod.MotionType
import typingsSlinky.rcTrigger.interfaceMod.Point
import typingsSlinky.rcTrigger.interfaceMod.StretchType
import typingsSlinky.rcTrigger.interfaceMod.TransitionNameType
import typingsSlinky.rcTrigger.popupMod.PopupProps
import typingsSlinky.rcTrigger.popupMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popup {
  @JSImport("rc-trigger/es/Popup", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def align(value: AlignType): this.type = set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def destroyPopupOnHide(value: Boolean): this.type = set("destroyPopupOnHide", value.asInstanceOf[js.Any])
    @scala.inline
    def getClassNameFromAlign(value: /* align */ AlignType => String): this.type = set("getClassNameFromAlign", js.Any.fromFunction1(value))
    @scala.inline
    def getRootDomNode(value: () => HTMLElement): this.type = set("getRootDomNode", js.Any.fromFunction0(value))
    @scala.inline
    def mask(value: Boolean): this.type = set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def onAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Unit): this.type = set("onAlign", js.Any.fromFunction2(value))
    @scala.inline
    def onMouseDown(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchStart(value: SyntheticTouchEvent[HTMLElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def point(value: Point): this.type = set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def stretch(value: StretchType): this.type = set("stretch", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PopupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    animation: AnimationType,
    maskAnimation: AnimationType,
    maskMotion: MotionType,
    maskTransitionName: TransitionNameType,
    motion: MotionType,
    prefixCls: String,
    transitionName: TransitionNameType
  ): Builder = {
    val __props = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], maskAnimation = maskAnimation.asInstanceOf[js.Any], maskMotion = maskMotion.asInstanceOf[js.Any], maskTransitionName = maskTransitionName.asInstanceOf[js.Any], motion = motion.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PopupProps]))
  }
}

