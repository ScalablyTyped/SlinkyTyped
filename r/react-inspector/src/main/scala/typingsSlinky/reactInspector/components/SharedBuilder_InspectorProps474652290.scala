package typingsSlinky.reactInspector.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactInspector.mod.InspectorTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_InspectorProps474652290 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  @scala.inline
  def columns(value: js.Array[String]): this.type = set("columns", value.asInstanceOf[js.Any])
  @scala.inline
  def data(value: js.Any): this.type = set("data", value.asInstanceOf[js.Any])
  @scala.inline
  def theme(value: InspectorTheme): this.type = set("theme", value.asInstanceOf[js.Any])
}

