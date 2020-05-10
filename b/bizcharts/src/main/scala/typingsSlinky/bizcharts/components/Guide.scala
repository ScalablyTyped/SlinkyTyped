package typingsSlinky.bizcharts.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.bizcharts.mod.Guide_
import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Guide {
  @JSImport("bizcharts", "Guide")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props[js.Any]): Default[tag.type, Guide_] = new Default[tag.type, Guide_](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Guide.type): Default[tag.type, Guide_] = new Default[tag.type, Guide_](js.Array(this.component, js.Dictionary.empty))()
}

