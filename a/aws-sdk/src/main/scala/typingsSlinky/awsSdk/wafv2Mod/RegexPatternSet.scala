package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegexPatternSet extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the entity.
    */
  var ARN: js.UndefOr[ResourceArn] = js.native
  /**
    * A friendly description of the set. You cannot change the description of a set after you create it.
    */
  var Description: js.UndefOr[EntityDescription] = js.native
  /**
    * A unique identifier for the set. This ID is returned in the responses to create and list commands. You provide it to operations like update and delete.
    */
  var Id: js.UndefOr[EntityId] = js.native
  /**
    * A friendly name of the set. You cannot change the name after you create the set.
    */
  var Name: js.UndefOr[EntityName] = js.native
  /**
    * The regular expression patterns in the set.
    */
  var RegularExpressionList: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.RegularExpressionList] = js.native
}

object RegexPatternSet {
  @scala.inline
  def apply(): RegexPatternSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegexPatternSet]
  }
  @scala.inline
  implicit class RegexPatternSetOps[Self <: RegexPatternSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARN(value: ResourceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARN")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: EntityDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: EntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withRegularExpressionList(value: RegularExpressionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegularExpressionList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegularExpressionList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegularExpressionList")(js.undefined)
        ret
    }
  }
  
}

