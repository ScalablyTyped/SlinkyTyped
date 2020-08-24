package typingsSlinky.reactKawaii.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactKawaii.mod.KawaiiMood
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_KawaiiProps1805116402 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  @scala.inline
  def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
  @scala.inline
  def mood(value: KawaiiMood): this.type = set("mood", value.asInstanceOf[js.Any])
  @scala.inline
  def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
}

