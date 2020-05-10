package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMetadataCardUnvalidatedValue extends js.Object {
  val ID: String = js.native
  val IsMultiValue: Boolean = js.native
  val IsUnvalidated: Boolean = js.native
  val Name: String = js.native
}

object IMetadataCardUnvalidatedValue {
  @scala.inline
  def apply(ID: String, IsMultiValue: Boolean, IsUnvalidated: Boolean, Name: String): IMetadataCardUnvalidatedValue = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], IsMultiValue = IsMultiValue.asInstanceOf[js.Any], IsUnvalidated = IsUnvalidated.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardUnvalidatedValue]
  }
  @scala.inline
  implicit class IMetadataCardUnvalidatedValueOps[Self <: IMetadataCardUnvalidatedValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMultiValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsMultiValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsUnvalidated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsUnvalidated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

