package typingsSlinky.antd.formListMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormListProps extends js.Object {
  var name: String | Double | (js.Array[String | Double]) = js.native
  def children(fields: js.Array[FieldData], operation: Operation): TagMod[Any] = js.native
}

object FormListProps {
  @scala.inline
  def apply(
    children: (js.Array[FieldData], Operation) => TagMod[Any],
    name: String | Double | (js.Array[String | Double])
  ): FormListProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormListProps]
  }
  @scala.inline
  implicit class FormListPropsOps[Self <: FormListProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: (js.Array[FieldData], Operation) => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withName(value: String | Double | (js.Array[String | Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

