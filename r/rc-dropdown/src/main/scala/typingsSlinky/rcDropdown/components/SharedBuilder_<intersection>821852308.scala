package typingsSlinky.rcDropdown.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class `SharedBuilder_<intersection>821852308`[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def align(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlignType */ js.Any
  ): this.type = set("align", value.asInstanceOf[js.Any])
  @scala.inline
  def alignPoint(value: Boolean): this.type = set("alignPoint", value.asInstanceOf[js.Any])
  @scala.inline
  def animation(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationType */ js.Any
  ): this.type = set("animation", value.asInstanceOf[js.Any])
  @scala.inline
  def hideAction(
    value: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ _
    ]
  ): this.type = set("hideAction", value.asInstanceOf[js.Any])
  @scala.inline
  def minOverlayWidthMatchTrigger(value: Boolean): this.type = set("minOverlayWidthMatchTrigger", value.asInstanceOf[js.Any])
  @scala.inline
  def onOverlayClick(value: /* e */ Event_ => Unit): this.type = set("onOverlayClick", js.Any.fromFunction1(value))
  @scala.inline
  def onVisibleChange(value: /* visible */ Boolean => Unit): this.type = set("onVisibleChange", js.Any.fromFunction1(value))
  @scala.inline
  def openClassName(value: String): this.type = set("openClassName", value.asInstanceOf[js.Any])
  @scala.inline
  def overlayReactElement(value: ReactElement): this.type = set("overlay", value.asInstanceOf[js.Any])
  @scala.inline
  def overlayFunction0(value: () => ReactElement): this.type = set("overlay", js.Any.fromFunction0(value))
  @scala.inline
  def overlay(value: js.Function0[ReactElement] | ReactElement): this.type = set("overlay", value.asInstanceOf[js.Any])
  @scala.inline
  def overlayClassName(value: String): this.type = set("overlayClassName", value.asInstanceOf[js.Any])
  @scala.inline
  def overlayStyle(value: CSSProperties): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
  @scala.inline
  def placement(value: String): this.type = set("placement", value.asInstanceOf[js.Any])
  @scala.inline
  def placements(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildInPlacements */ js.Any
  ): this.type = set("placements", value.asInstanceOf[js.Any])
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  @scala.inline
  def showAction(
    value: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ _
    ]
  ): this.type = set("showAction", value.asInstanceOf[js.Any])
  @scala.inline
  def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  @scala.inline
  def trigger(
    value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ js.Any) | (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ _
    ])
  ): this.type = set("trigger", value.asInstanceOf[js.Any])
  @scala.inline
  def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
}

