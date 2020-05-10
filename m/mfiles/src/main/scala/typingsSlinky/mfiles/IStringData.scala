package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFStringDataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStringData extends js.Object {
  var AsString: String = js.native
  val StringDataType: MFStringDataType = js.native
  def Clone(): IStringData = js.native
}

object IStringData {
  @scala.inline
  def apply(AsString: String, Clone: () => IStringData, StringDataType: MFStringDataType): IStringData = {
    val __obj = js.Dynamic.literal(AsString = AsString.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), StringDataType = StringDataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStringData]
  }
  @scala.inline
  implicit class IStringDataOps[Self <: IStringData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AsString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IStringData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStringDataType(value: MFStringDataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringDataType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

