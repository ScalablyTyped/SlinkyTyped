package typingsSlinky.reactNativeRssParser

import typingsSlinky.reactNativeRssParser.mod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSubCategories extends js.Object {
  var name: String = js.native
  var subCategories: js.Array[Maybe[AnonName]] = js.native
}

object AnonSubCategories {
  @scala.inline
  def apply(name: String, subCategories: js.Array[Maybe[AnonName]]): AnonSubCategories = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subCategories = subCategories.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSubCategories]
  }
  @scala.inline
  implicit class AnonSubCategoriesOps[Self <: AnonSubCategories] (val x: Self) extends AnyVal {
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
    def withSubCategories(value: js.Array[Maybe[AnonName]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subCategories")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

