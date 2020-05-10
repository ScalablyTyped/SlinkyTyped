package typingsSlinky.reactInspector.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactInspector.mod.InspectorTheme
import typingsSlinky.reactInspector.mod.TableInspectorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableInspector {
  @JSImport("react-inspector", "TableInspector")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def columns(value: js.Array[String]): this.type = set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def data(value: js.Any): this.type = set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: InspectorTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableInspectorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TableInspector.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

