package typingsSlinky.graphqlTools.anon

import typingsSlinky.graphql.astMod.DefinitionNode
import typingsSlinky.graphql.astMod.Location
import typingsSlinky.graphqlTools.graphqlToolsStrings.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Definitions extends js.Object {
  var definitions: js.Array[DefinitionNode] = js.native
  var kind: Document = js.native
  var loc: js.UndefOr[Location] = js.native
}

object Definitions {
  @scala.inline
  def apply(definitions: js.Array[DefinitionNode], kind: Document): Definitions = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definitions]
  }
  @scala.inline
  implicit class DefinitionsOps[Self <: Definitions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinitions(value: js.Array[DefinitionNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoc(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(js.undefined)
        ret
    }
  }
  
}

