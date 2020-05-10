package typingsSlinky.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedQuery extends js.Object {
  var ast: js.Array[QueryAstNode] = js.native
  var bindVars: js.Array[String] = js.native
  var collections: js.Array[String] = js.native
  var parameters: js.Array[String] = js.native
  var parsed: Boolean = js.native
}

object ParsedQuery {
  @scala.inline
  def apply(
    ast: js.Array[QueryAstNode],
    bindVars: js.Array[String],
    collections: js.Array[String],
    parameters: js.Array[String],
    parsed: Boolean
  ): ParsedQuery = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], bindVars = bindVars.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedQuery]
  }
  @scala.inline
  implicit class ParsedQueryOps[Self <: ParsedQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAst(value: js.Array[QueryAstNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBindVars(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindVars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollections(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

