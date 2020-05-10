package typingsSlinky.recharts.components

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.recharts.mod.AllowEscapeViewBox
import typingsSlinky.recharts.mod.AnimationEasingType
import typingsSlinky.recharts.mod.ContentRenderer
import typingsSlinky.recharts.mod.Coordinate
import typingsSlinky.recharts.mod.TooltipPayload
import typingsSlinky.recharts.mod.TooltipProps
import typingsSlinky.recharts.mod.ViewBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip {
  @JSImport("recharts", "Tooltip")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.recharts.mod.Tooltip] {
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def allowEscapeViewBox(value: AllowEscapeViewBox): this.type = set("allowEscapeViewBox", value.asInstanceOf[js.Any])
    @scala.inline
    def animationBegin(value: Double): this.type = set("animationBegin", value.asInstanceOf[js.Any])
    @scala.inline
    def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def animationEasing(value: AnimationEasingType): this.type = set("animationEasing", value.asInstanceOf[js.Any])
    @scala.inline
    def animationId(value: Double): this.type = set("animationId", value.asInstanceOf[js.Any])
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def contentFunction1(value: TooltipProps => TagMod[Any]): this.type = set("content", js.Any.fromFunction1(value))
    @scala.inline
    def contentFunctionComponent(value: ReactComponentClass[_]): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def content(value: ReactElement | ReactComponentClass[_] | ContentRenderer[TooltipProps]): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def contentStyle(value: js.Object): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def coordinate(value: Coordinate): this.type = set("coordinate", value.asInstanceOf[js.Any])
    @scala.inline
    def cursorReactElement(value: ReactElement): this.type = set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def cursorFunctionComponent(value: ReactComponentClass[_]): this.type = set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def cursor(value: Boolean | js.Object | ReactElement | ReactComponentClass[_]): this.type = set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def filterNull(value: Boolean): this.type = set("filterNull", value.asInstanceOf[js.Any])
    @scala.inline
    def formatter(
      value: (/* value */ String | Double | (js.Array[String | Double]), /* name */ String, /* entry */ TooltipPayload, /* index */ Double) => TagMod[Any]
    ): this.type = set("formatter", js.Any.fromFunction4(value))
    @scala.inline
    def isAnimationActive(value: Boolean): this.type = set("isAnimationActive", value.asInstanceOf[js.Any])
    @scala.inline
    def isUpdateAnimationActive(value: Boolean): this.type = set("isUpdateAnimationActive", value.asInstanceOf[js.Any])
    @scala.inline
    def itemSorter(value: (TooltipPayload, TooltipPayload) => Double): this.type = set("itemSorter", js.Any.fromFunction2(value))
    @scala.inline
    def itemStyle(value: js.Object): this.type = set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def label(value: String | Double): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def labelFormatter(value: /* label */ String | Double => TagMod[Any]): this.type = set("labelFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def labelStyle(value: js.Object): this.type = set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def onAnimationEnd(value: /* repeated */ js.Any => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onAnimationStart(value: /* repeated */ js.Any => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
    @scala.inline
    def payload(value: js.Array[TooltipPayload]): this.type = set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def position(value: Coordinate): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def separator(value: String): this.type = set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def useTranslate3d(value: Boolean): this.type = set("useTranslate3d", value.asInstanceOf[js.Any])
    @scala.inline
    def viewBox(value: ViewBox): this.type = set("viewBox", value.asInstanceOf[js.Any])
    @scala.inline
    def wrapperStyle(value: js.Object): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Tooltip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

