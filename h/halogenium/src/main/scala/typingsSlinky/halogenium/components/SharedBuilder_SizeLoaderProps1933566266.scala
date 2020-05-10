package typingsSlinky.halogenium.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.halogenium.mod.VerticalAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_SizeLoaderProps1933566266[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
  @scala.inline
  def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  @scala.inline
  def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
  @scala.inline
  def size(value: Double | String): this.type = set("size", value.asInstanceOf[js.Any])
  @scala.inline
  def verticalAlign(value: VerticalAlign): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
}

