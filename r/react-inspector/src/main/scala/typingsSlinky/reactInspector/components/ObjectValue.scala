package typingsSlinky.reactInspector.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactInspector.mod.ObjectValueProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ObjectValue {
  @JSImport("react-inspector", "ObjectValue")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def `object`(value: js.Any): this.type = set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def styles(value: js.Object): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ObjectValueProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ObjectValue.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

