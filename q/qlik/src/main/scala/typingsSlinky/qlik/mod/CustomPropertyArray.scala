package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPropertyArray
  extends CustomPropertyCommon
     with CustomProperty {
  var addTranslation: js.UndefOr[String] = js.native
  var allowAdd: js.UndefOr[Boolean] = js.native
  var allowMove: js.UndefOr[Boolean] = js.native
  var allowRemove: js.UndefOr[Boolean] = js.native
  var component: js.UndefOr[scala.Nothing] = js.native
  var itemTitleRef: js.UndefOr[String] = js.native
  @JSName("type")
  var type_CustomPropertyArray: array = js.native
}

object CustomPropertyArray {
  @scala.inline
  def apply(`type`: array): CustomPropertyArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyArray]
  }
  @scala.inline
  implicit class CustomPropertyArrayOps[Self <: CustomPropertyArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddTranslation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTranslation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddTranslation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTranslation")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowAdd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMove")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowRemove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withComponent(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withItemTitleRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTitleRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemTitleRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTitleRef")(js.undefined)
        ret
    }
  }
  
}

