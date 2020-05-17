package typingsSlinky.breeze.anon

import typingsSlinky.breeze.breeze.KeyMapping
import typingsSlinky.breeze.breeze.NodeContext
import typingsSlinky.breeze.breeze.QueryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtractKeyMappings extends js.Object {
  var extractKeyMappings: js.UndefOr[js.Function1[/* data */ js.Object, js.Array[KeyMapping]]] = js.native
  var extractResults: js.UndefOr[js.Function1[/* data */ js.Object, js.Object]] = js.native
  var extractSaveResults: js.UndefOr[js.Function1[/* data */ js.Object, js.Array[_]]] = js.native
  var name: String = js.native
  def visitNode(node: js.Object, queryContext: QueryContext, nodeContext: NodeContext): EntityType = js.native
}

object ExtractKeyMappings {
  @scala.inline
  def apply(name: String, visitNode: (js.Object, QueryContext, NodeContext) => EntityType): ExtractKeyMappings = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], visitNode = js.Any.fromFunction3(visitNode))
    __obj.asInstanceOf[ExtractKeyMappings]
  }
  @scala.inline
  implicit class ExtractKeyMappingsOps[Self <: ExtractKeyMappings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisitNode(value: (js.Object, QueryContext, NodeContext) => EntityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNode")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withExtractKeyMappings(value: /* data */ js.Object => js.Array[KeyMapping]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractKeyMappings")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExtractKeyMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractKeyMappings")(js.undefined)
        ret
    }
    @scala.inline
    def withExtractResults(value: /* data */ js.Object => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractResults")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExtractResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractResults")(js.undefined)
        ret
    }
    @scala.inline
    def withExtractSaveResults(value: /* data */ js.Object => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractSaveResults")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExtractSaveResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractSaveResults")(js.undefined)
        ret
    }
  }
  
}

