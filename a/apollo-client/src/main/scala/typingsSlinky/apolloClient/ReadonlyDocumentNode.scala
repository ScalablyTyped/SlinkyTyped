package typingsSlinky.apolloClient

import typingsSlinky.apolloClient.apolloClientStrings.Document
import typingsSlinky.graphql.astMod.DefinitionNode
import typingsSlinky.graphql.astMod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<graphql.graphql.DocumentNode> */
@js.native
trait ReadonlyDocumentNode extends js.Object {
  val definitions: js.Array[DefinitionNode] = js.native
  val kind: Document = js.native
  val loc: js.UndefOr[Location] = js.native
}

object ReadonlyDocumentNode {
  @scala.inline
  def apply(definitions: js.Array[DefinitionNode], kind: Document): ReadonlyDocumentNode = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyDocumentNode]
  }
  @scala.inline
  implicit class ReadonlyDocumentNodeOps[Self <: ReadonlyDocumentNode] (val x: Self) extends AnyVal {
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

