package typingsSlinky.reactTagcloud.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.reactTagcloud.ReactTagCloud_.TagCloudProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactTagCloudTagCloud {
  @JSGlobal("reactTagCloud.TagCloud")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, LegacyRef[js.Any] with js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def colorOptions(value: js.Object): this.type = set("colorOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def disableRandomColor(value: Boolean): this.type = set("disableRandomColor", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: js.Function): this.type = set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def renderer(value: js.Function): this.type = set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def shuffle(value: Boolean): this.type = set("shuffle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TagCloudProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(maxSize: Double, minSize: Double, tags: js.Array[_]): Builder = {
    val __props = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TagCloudProps]))
  }
}

