package typingsSlinky.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryAstNode
  extends /* key */ StringDictionary[js.Any] {
  var subNodes: js.UndefOr[js.Array[QueryAstNode]] = js.native
  var `type`: String = js.native
}

object QueryAstNode {
  @scala.inline
  def apply(`type`: String): QueryAstNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAstNode]
  }
  @scala.inline
  implicit class QueryAstNodeOps[Self <: QueryAstNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubNodes(value: js.Array[QueryAstNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subNodes")(js.undefined)
        ret
    }
  }
  
}

