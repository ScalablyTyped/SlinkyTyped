package typingsSlinky.keystonejsKeystone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGqlName extends js.Object {
   // TODO: types
  var gqlName: String = js.native
  var item: AnonEmail = js.native
  var itemId: js.UndefOr[js.Any] = js.native
   // TODO: types
  var itemIds: js.UndefOr[js.Any] = js.native
  var listKey: String = js.native
  var operation: String = js.native
  var originalInput: js.UndefOr[js.Any] = js.native
}

object AnonGqlName {
  @scala.inline
  def apply(gqlName: String, item: AnonEmail, listKey: String, operation: String): AnonGqlName = {
    val __obj = js.Dynamic.literal(gqlName = gqlName.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], listKey = listKey.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGqlName]
  }
  @scala.inline
  implicit class AnonGqlNameOps[Self <: AnonGqlName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGqlName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gqlName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: AnonEmail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(js.undefined)
        ret
    }
    @scala.inline
    def withItemIds(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIds")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalInput(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalInput")(js.undefined)
        ret
    }
  }
  
}

