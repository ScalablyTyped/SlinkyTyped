package typingsSlinky.ebml.mod.Encoder

import typingsSlinky.node.Buffer
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagStackItem extends js.Object {
  var children: js.Array[TagStackItem] = js.native
  var data: Buffer | Null = js.native
  var end: Double = js.native
  var id: ReturnType[js.Function1[/* tagName */ String, Double | Null]] = js.native
  var name: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any = js.native
}

object TagStackItem {
  @scala.inline
  def apply(
    children: js.Array[TagStackItem],
    end: Double,
    id: ReturnType[js.Function1[/* tagName */ String, Double | Null]],
    name: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any
  ): TagStackItem = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagStackItem]
  }
  @scala.inline
  implicit class TagStackItemOps[Self <: TagStackItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Array[TagStackItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: ReturnType[js.Function1[/* tagName */ String, Double | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(
      value: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(null)
        ret
    }
  }
  
}

