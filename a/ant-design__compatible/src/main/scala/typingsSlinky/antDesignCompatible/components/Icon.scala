package typingsSlinky.antDesignCompatible.components

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGSVGElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.svg.svg.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignCompatible.iconMod.CustomIconComponentProps
import typingsSlinky.antDesignCompatible.iconMod.IconProps
import typingsSlinky.antDesignCompatible.iconMod.ThemeType
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.SVGProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Icon {
  @JSImport("@ant-design/compatible/lib/icon", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def componentFunctionComponent(value: ReactComponentClass[CustomIconComponentProps | SVGProps[SVGSVGElement]]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def componentComponentClass(value: ReactComponentClass[CustomIconComponentProps | SVGProps[SVGSVGElement]]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def component(value: ReactComponentClass[CustomIconComponentProps | SVGProps[SVGSVGElement]]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyUp(value: SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def rotate(value: Double): this.type = set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def spin(value: Boolean): this.type = set("spin", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ThemeType): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def twoToneColor(value: String): this.type = set("twoToneColor", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def viewBox(value: String): this.type = set("viewBox", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Icon.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

