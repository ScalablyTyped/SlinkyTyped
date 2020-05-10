package typingsSlinky.pulumiAws.getScriptMod

import typingsSlinky.pulumiAws.outputMod.glue.GetScriptDagEdge
import typingsSlinky.pulumiAws.outputMod.glue.GetScriptDagNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetScriptResult extends js.Object {
  val dagEdges: js.Array[GetScriptDagEdge] = js.native
  val dagNodes: js.Array[GetScriptDagNode] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val language: js.UndefOr[String] = js.native
  /**
    * The Python script generated from the DAG when the `language` argument is set to `PYTHON`.
    */
  val pythonScript: String = js.native
  /**
    * The Scala code generated from the DAG when the `language` argument is set to `SCALA`.
    */
  val scalaCode: String = js.native
}

object GetScriptResult {
  @scala.inline
  def apply(
    dagEdges: js.Array[GetScriptDagEdge],
    dagNodes: js.Array[GetScriptDagNode],
    id: String,
    pythonScript: String,
    scalaCode: String
  ): GetScriptResult = {
    val __obj = js.Dynamic.literal(dagEdges = dagEdges.asInstanceOf[js.Any], dagNodes = dagNodes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pythonScript = pythonScript.asInstanceOf[js.Any], scalaCode = scalaCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptResult]
  }
  @scala.inline
  implicit class GetScriptResultOps[Self <: GetScriptResult] (val x: Self) extends AnyVal {
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPythonScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pythonScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScalaCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalaCode")(value.asInstanceOf[js.Any])
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

