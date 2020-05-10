package typingsSlinky.node.inspectorMod.NodeTracing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCategoriesReturnType extends js.Object {
  /**
    * A list of supported tracing categories.
    */
  var categories: js.Array[String] = js.native
}

object GetCategoriesReturnType {
  @scala.inline
  def apply(categories: js.Array[String]): GetCategoriesReturnType = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCategoriesReturnType]
  }
  @scala.inline
  implicit class GetCategoriesReturnTypeOps[Self <: GetCategoriesReturnType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

