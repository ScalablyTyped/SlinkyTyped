package typingsSlinky.extjs.Ext.data.association

import typingsSlinky.extjs.Ext.IBase
import typingsSlinky.extjs.Ext.data.reader.IReader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAssociation extends IBase {
  /** [Config Option] (String) */
  var associatedModel: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var associatedName: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var associationKey: js.UndefOr[String] = js.native
  /** [Method] Get a specialized reader for reading associated data
  		* @returns Ext.data.reader.Reader The reader, null if not supplied
  		*/
  var getReader: js.UndefOr[js.Function0[IReader]] = js.native
  /** [Config Option] (String) */
  var model: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var ownerModel: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var ownerName: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var primaryKey: js.UndefOr[String] = js.native
  /** [Config Option] (Ext.data.reader.Reader) */
  var reader: js.UndefOr[IReader] = js.native
}

object IAssociation {
  @scala.inline
  def apply(): IAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAssociation]
  }
  @scala.inline
  implicit class IAssociationOps[Self <: IAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociatedModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatedModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedModel")(js.undefined)
        ret
    }
    @scala.inline
    def withAssociatedName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatedName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedName")(js.undefined)
        ret
    }
    @scala.inline
    def withAssociationKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associationKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associationKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGetReader(value: () => IReader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetReader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReader")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerModel")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerName")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(js.undefined)
        ret
    }
    @scala.inline
    def withReader(value: IReader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reader")(js.undefined)
        ret
    }
  }
  
}

