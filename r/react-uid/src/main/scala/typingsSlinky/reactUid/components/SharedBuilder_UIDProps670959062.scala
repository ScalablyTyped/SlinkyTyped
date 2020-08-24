package typingsSlinky.reactUid.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactUid.contextMod.IdSourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_UIDProps670959062[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def idSource(value: IdSourceType): this.type = set("idSource", value.asInstanceOf[js.Any])
  @scala.inline
  def name(value: /* n */ String | Double => String): this.type = set("name", js.Any.fromFunction1(value))
}

