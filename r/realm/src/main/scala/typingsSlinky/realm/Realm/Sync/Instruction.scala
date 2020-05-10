package typingsSlinky.realm.Realm.Sync

import typingsSlinky.realm.realmStrings.ADD_PROPERTIES
import typingsSlinky.realm.realmStrings.ADD_TYPE
import typingsSlinky.realm.realmStrings.CHANGE_IDENTITY
import typingsSlinky.realm.realmStrings.CLEAR
import typingsSlinky.realm.realmStrings.DELETE
import typingsSlinky.realm.realmStrings.INSERT
import typingsSlinky.realm.realmStrings.LIST_CLEAR
import typingsSlinky.realm.realmStrings.LIST_ERASE
import typingsSlinky.realm.realmStrings.LIST_INSERT
import typingsSlinky.realm.realmStrings.LIST_SET
import typingsSlinky.realm.realmStrings.SET
import typingsSlinky.realm.realmStrings.SWAP_IDENTITY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instruction extends js.Object {
  var identity: String = js.native
  var list_index: js.UndefOr[js.Any] = js.native
  var new_identity: js.UndefOr[js.Any] = js.native
  var object_identity: js.UndefOr[js.Any] = js.native
  var object_type: String = js.native
  var primary_key: js.UndefOr[String] = js.native
  var properties: js.UndefOr[js.Any] = js.native
  var property: js.UndefOr[js.Any] = js.native
  var `type`: INSERT | SET | DELETE | CLEAR | LIST_SET | LIST_INSERT | LIST_ERASE | LIST_CLEAR | ADD_TYPE | ADD_PROPERTIES | CHANGE_IDENTITY | SWAP_IDENTITY = js.native
  var values: js.UndefOr[js.Any] = js.native
}

object Instruction {
  @scala.inline
  def apply(
    identity: String,
    object_type: String,
    `type`: INSERT | SET | DELETE | CLEAR | LIST_SET | LIST_INSERT | LIST_ERASE | LIST_CLEAR | ADD_TYPE | ADD_PROPERTIES | CHANGE_IDENTITY | SWAP_IDENTITY
  ): Instruction = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], object_type = object_type.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instruction]
  }
  @scala.inline
  implicit class InstructionOps[Self <: Instruction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(
      value: INSERT | SET | DELETE | CLEAR | LIST_SET | LIST_INSERT | LIST_ERASE | LIST_CLEAR | ADD_TYPE | ADD_PROPERTIES | CHANGE_IDENTITY | SWAP_IDENTITY
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList_index(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list_index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutList_index: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list_index")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_identity(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_identity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_identity")(js.undefined)
        ret
    }
    @scala.inline
    def withObject_identity(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object_identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObject_identity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object_identity")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimary_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary_key")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withProperty(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

