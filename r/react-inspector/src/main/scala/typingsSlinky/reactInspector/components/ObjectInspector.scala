package typingsSlinky.reactInspector.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactInspector.mod.InspectorNodeParams
import typingsSlinky.reactInspector.mod.InspectorTheme
import typingsSlinky.reactInspector.mod.ObjectInspectorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ObjectInspector {
  @JSImport("react-inspector", "ObjectInspector")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def data(value: js.Any): this.type = set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def expandLevel(value: Double): this.type = set("expandLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def expandPathsVarargs(value: String*): this.type = set("expandPaths", js.Array(value :_*))
    @scala.inline
    def expandPaths(value: String | js.Array[String]): this.type = set("expandPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def nodeRenderer(value: /* params */ InspectorNodeParams => ReactElement): this.type = set("nodeRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def showNonenumerable(value: Boolean): this.type = set("showNonenumerable", value.asInstanceOf[js.Any])
    @scala.inline
    def sortObjectKeysFunction2(value: (/* a */ js.Any, /* b */ js.Any) => Double): this.type = set("sortObjectKeys", js.Any.fromFunction2(value))
    @scala.inline
    def sortObjectKeys(value: Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])): this.type = set("sortObjectKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: InspectorTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ObjectInspectorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ObjectInspector.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

