package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Intent.TrainingPhrase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Part. */
@js.native
trait IPart extends js.Object {
  /** Part alias */
  var alias: js.UndefOr[String | Null] = js.native
  /** Part entityType */
  var entityType: js.UndefOr[String | Null] = js.native
  /** Part text */
  var text: js.UndefOr[String | Null] = js.native
  /** Part userDefined */
  var userDefined: js.UndefOr[Boolean | Null] = js.native
}

object IPart {
  @scala.inline
  def apply(): IPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPart]
  }
  @scala.inline
  implicit class IPartOps[Self <: IPart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(js.undefined)
        ret
    }
    @scala.inline
    def withAliasNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(null)
        ret
    }
    @scala.inline
    def withEntityType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityType")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityType")(null)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(null)
        ret
    }
    @scala.inline
    def withUserDefined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDefined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDefined")(js.undefined)
        ret
    }
    @scala.inline
    def withUserDefinedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDefined")(null)
        ret
    }
  }
  
}

