package typingsSlinky.reactShare.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_ShareCountComponentProps_1337477943 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  @scala.inline
  def children(value: /* shareCount */ Double => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
}

