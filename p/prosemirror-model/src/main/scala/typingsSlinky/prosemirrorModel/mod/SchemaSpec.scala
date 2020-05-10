package typingsSlinky.prosemirrorModel.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.orderedmap.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSpec[N /* <: String */, M /* <: String */] extends js.Object {
  /**
    * The mark types that exist in this schema. The order in which they
    * are provided determines the order in which [mark
    * sets](#model.Mark.addToSet) are sorted and in which [parse
    * rules](#model.MarkSpec.parseDOM) are tried.
    */
  var marks: js.UndefOr[
    (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in M ]: prosemirror-model.prosemirror-model.MarkSpec}
    */ typingsSlinky.prosemirrorModel.prosemirrorModelStrings.SchemaSpec with TopLevel[js.Any]) | ^[MarkSpec] | Null
  ] = js.native
  /**
    * The node types in this schema. Maps names to
    * [`NodeSpec`](#model.NodeSpec) objects that describe the node type
    * associated with that name. Their order is significant—it
    * determines which [parse rules](#model.NodeSpec.parseDOM) take
    * precedence by default, and which nodes come first in a given
    * [group](#model.NodeSpec.group).
    */
  var nodes: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in N ]: prosemirror-model.prosemirror-model.NodeSpec}
    */ typingsSlinky.prosemirrorModel.prosemirrorModelStrings.SchemaSpec with TopLevel[js.Any]) | ^[NodeSpec] = js.native
  /**
    * The name of the default top-level node for the schema. Defaults
    * to `"doc"`.
    */
  var topNode: js.UndefOr[String | Null] = js.native
}

object SchemaSpec {
  @scala.inline
  def apply[N, M](
    nodes: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in N ]: prosemirror-model.prosemirror-model.NodeSpec}
    */ typingsSlinky.prosemirrorModel.prosemirrorModelStrings.SchemaSpec with TopLevel[js.Any]) | ^[NodeSpec]
  ): SchemaSpec[N, M] = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSpec[N, M]]
  }
  @scala.inline
  implicit class SchemaSpecOps[Self[n, m] <: SchemaSpec[n, m], N, M] (val x: Self[N, M]) extends AnyVal {
    @scala.inline
    def duplicate: Self[N, M] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[N, M]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[N, M]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[N, M]) with Other]
    @scala.inline
    def withNodes(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ name in N ]: prosemirror-model.prosemirror-model.NodeSpec}
      */ typingsSlinky.prosemirrorModel.prosemirrorModelStrings.SchemaSpec with TopLevel[js.Any]) | ^[NodeSpec]
    ): Self[N, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarks(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ name in M ]: prosemirror-model.prosemirror-model.MarkSpec}
      */ typingsSlinky.prosemirrorModel.prosemirrorModelStrings.SchemaSpec with TopLevel[js.Any]) | ^[MarkSpec]
    ): Self[N, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarks: Self[N, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marks")(js.undefined)
        ret
    }
    @scala.inline
    def withMarksNull: Self[N, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marks")(null)
        ret
    }
    @scala.inline
    def withTopNode(value: String): Self[N, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopNode: Self[N, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topNode")(js.undefined)
        ret
    }
    @scala.inline
    def withTopNodeNull: Self[N, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topNode")(null)
        ret
    }
  }
  
}

