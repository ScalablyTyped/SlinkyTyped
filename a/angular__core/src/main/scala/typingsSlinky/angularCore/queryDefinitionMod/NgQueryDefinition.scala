package typingsSlinky.angularCore.queryDefinitionMod

import typingsSlinky.angularCore.ngDecoratorsMod.NgDecorator
import typingsSlinky.typescript.mod.ClassDeclaration
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.PropertyDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NgQueryDefinition extends js.Object {
  /** Class declaration that holds this query. */
  var container: ClassDeclaration = js.native
  /** Decorator that declares this as a query. */
  var decorator: NgDecorator = js.native
  /** Name of the query. Set to "null" in case the query name is not statically analyzable. */
  var name: String | Null = js.native
  /** Node that declares this query. */
  var node: Node = js.native
  /**
    * Property declaration that refers to the query value. For accessors there
    * is no property that is guaranteed to access the query value.
    */
  var property: PropertyDeclaration | Null = js.native
  /** Type of the query definition. */
  var `type`: QueryType = js.native
}

object NgQueryDefinition {
  @scala.inline
  def apply(container: ClassDeclaration, decorator: NgDecorator, node: Node, `type`: QueryType): NgQueryDefinition = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], decorator = decorator.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgQueryDefinition]
  }
  @scala.inline
  implicit class NgQueryDefinitionOps[Self <: NgQueryDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: ClassDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecorator(value: NgDecorator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: QueryType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
    @scala.inline
    def withProperty(value: PropertyDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(null)
        ret
    }
  }
  
}

