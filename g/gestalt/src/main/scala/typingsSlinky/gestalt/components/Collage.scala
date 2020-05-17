package typingsSlinky.gestalt.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.anon.Height
import typingsSlinky.gestalt.mod.CollageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Collage {
  @JSImport("gestalt", "Collage")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Collage] {
    @scala.inline
    def cover(value: Boolean): this.type = set("cover", value.asInstanceOf[js.Any])
    @scala.inline
    def gutter(value: Double): this.type = set("gutter", value.asInstanceOf[js.Any])
    @scala.inline
    def layoutKey(value: Double): this.type = set("layoutKey", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CollageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(columns: Double, height: Double, renderImage: Height => TagMod[Any], width: Double): Builder = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], renderImage = js.Any.fromFunction1(renderImage), width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CollageProps]))
  }
}

