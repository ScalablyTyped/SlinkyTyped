package typingsSlinky.idyllDocument.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.idyllCompiler.mod.AST
import typingsSlinky.idyllCompiler.mod.Node
import typingsSlinky.idyllCompiler.mod.Options
import typingsSlinky.idyllDocument.anon.Children
import typingsSlinky.idyllDocument.mod.IdyllDocumentProps
import typingsSlinky.idyllDocument.mod.default
import typingsSlinky.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IdyllDocument {
  @JSImport("idyll-document", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def astVarargs(value: Node*): this.type = set("ast", js.Array(value :_*))
    @scala.inline
    def ast(value: AST): this.type = set("ast", value.asInstanceOf[js.Any])
    @scala.inline
    def compilerOptions(value: Options): this.type = set("compilerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def context(value: /* context */ js.Any => Unit): this.type = set("context", js.Any.fromFunction1(value))
    @scala.inline
    def datasets(value: js.Object): this.type = set("datasets", value.asInstanceOf[js.Any])
    @scala.inline
    def errorComponentFunctionComponent(value: ReactComponentClass[Children]): this.type = set("errorComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def errorComponentComponentClass(value: ReactComponentClass[Children]): this.type = set("errorComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def errorComponent(value: ReactType[Children]): this.type = set("errorComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def initialState(value: js.Any): this.type = set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def layout(value: String): this.type = set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def markup(value: String): this.type = set("markup", value.asInstanceOf[js.Any])
    @scala.inline
    def onError(value: /* err */ js.Error => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def theme(value: String): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IdyllDocumentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(components: js.Any): Builder = {
    val __props = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IdyllDocumentProps]))
  }
}

