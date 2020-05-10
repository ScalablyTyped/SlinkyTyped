package typingsSlinky.pulumiAws.getScriptMod

import typingsSlinky.pulumiAws.inputMod.glue.GetScriptDagEdge
import typingsSlinky.pulumiAws.inputMod.glue.GetScriptDagNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetScriptArgs extends js.Object {
  /**
    * A list of the edges in the DAG. Defined below.
    */
  val dagEdges: js.Array[GetScriptDagEdge] = js.native
  /**
    * A list of the nodes in the DAG. Defined below.
    */
  val dagNodes: js.Array[GetScriptDagNode] = js.native
  /**
    * The programming language of the resulting code from the DAG. Defaults to `PYTHON`. Valid values are `PYTHON` and `SCALA`.
    */
  val language: js.UndefOr[String] = js.native
}

object GetScriptArgs {
  @scala.inline
  def apply(dagEdges: js.Array[GetScriptDagEdge], dagNodes: js.Array[GetScriptDagNode]): GetScriptArgs = {
    val __obj = js.Dynamic.literal(dagEdges = dagEdges.asInstanceOf[js.Any], dagNodes = dagNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptArgs]
  }
  @scala.inline
  implicit class GetScriptArgsOps[Self <: GetScriptArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDagEdges(value: js.Array[GetScriptDagEdge]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dagEdges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDagNodes(value: js.Array[GetScriptDagNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dagNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
  }
  
}

