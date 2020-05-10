package typingsSlinky.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonNode extends js.Object {
  /**
    * Returns the node's parent node.
    */
  var parent: js.UndefOr[JsonContainer] = js.native
  /**
    * Contains information to generate byte-to-byte equal node string as it
    * was in origin input.
    */
  var raws: js.UndefOr[NodeRaws] = js.native
  /**
    * Returns the input source of the node. The property is used in source
    * map generation. If you create a node manually (e.g., with
    * postcss.decl() ), that node will not have a  source  property and
    * will be absent from the source map. For this reason, the plugin
    * developer should consider cloning nodes to create new ones (in which
    * case the new node's source will reference the original, cloned node)
    * or setting the source property manually.
    */
  var source: js.UndefOr[NodeSource] = js.native
  /**
    * Returns a string representing the node's type. Possible values are
    * root, atrule, rule, decl or comment.
    */
  var `type`: js.UndefOr[String] = js.native
}

object JsonNode {
  @scala.inline
  def apply(): JsonNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonNode]
  }
  @scala.inline
  implicit class JsonNodeOps[Self <: JsonNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParent(value: JsonContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withRaws(value: NodeRaws): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raws")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaws: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raws")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: NodeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

