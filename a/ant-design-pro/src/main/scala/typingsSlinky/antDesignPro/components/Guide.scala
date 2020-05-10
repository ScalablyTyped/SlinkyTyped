package typingsSlinky.antDesignPro.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Guide {
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Guide")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props[js.Any]): Default[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Guide] = new Default[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Guide](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Guide.type): Default[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Guide] = new Default[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Guide](js.Array(this.component, js.Dictionary.empty))()
}

