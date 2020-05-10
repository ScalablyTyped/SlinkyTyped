package typingsSlinky.antDesignIconsReact.components

import org.scalajs.dom.raw.SVGSVGElement
import slinky.web.SyntheticMouseEvent
import slinky.web.svg.svg.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_IconProps_1416468498[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def focusable(value: String): this.type = set("focusable", value.asInstanceOf[js.Any])
  @scala.inline
  def onClick(value: SyntheticMouseEvent[SVGSVGElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
  @scala.inline
  def primaryColor(value: String): this.type = set("primaryColor", value.asInstanceOf[js.Any])
  @scala.inline
  def secondaryColor(value: String): this.type = set("secondaryColor", value.asInstanceOf[js.Any])
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
}

