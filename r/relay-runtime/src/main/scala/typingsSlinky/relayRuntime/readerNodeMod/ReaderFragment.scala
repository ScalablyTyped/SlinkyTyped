package typingsSlinky.relayRuntime.readerNodeMod

import typingsSlinky.relayRuntime.anon.Connection
import typingsSlinky.relayRuntime.relayConcreteNodeMod.GeneratedNode
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReaderFragment
  extends GeneratedNode
     with GraphQLTaggedNode
     with ReaderSelectableNode {
  val argumentDefinitions: js.Array[ReaderArgumentDefinition] = js.native
  val kind: String = js.native
  val metadata: js.UndefOr[Connection | Null] = js.native
   // 'Fragment';
  val name: String = js.native
  val selections: js.Array[ReaderSelection] = js.native
  val `type`: String = js.native
}

object ReaderFragment {
  @scala.inline
  def apply(
    argumentDefinitions: js.Array[ReaderArgumentDefinition],
    kind: String,
    name: String,
    selections: js.Array[ReaderSelection],
    `type`: String
  ): ReaderFragment = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderFragment]
  }
  @scala.inline
  implicit class ReaderFragmentOps[Self <: ReaderFragment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgumentDefinitions(value: js.Array[ReaderArgumentDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelections(value: js.Array[ReaderSelection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: Connection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(null)
        ret
    }
  }
  
}

