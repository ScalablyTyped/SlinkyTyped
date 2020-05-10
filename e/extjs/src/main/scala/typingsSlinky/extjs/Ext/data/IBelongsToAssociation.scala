package typingsSlinky.extjs.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBelongsToAssociation
  extends typingsSlinky.extjs.Ext.data.association.IAssociation {
  /** [Config Option] (String) */
  var foreignKey: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var getterName: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var setterName: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.native
}

object IBelongsToAssociation {
  @scala.inline
  def apply(): IBelongsToAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBelongsToAssociation]
  }
  @scala.inline
  implicit class IBelongsToAssociationOps[Self <: IBelongsToAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForeignKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForeignKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGetterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getterName")(js.undefined)
        ret
    }
    @scala.inline
    def withSetterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setterName")(js.undefined)
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

