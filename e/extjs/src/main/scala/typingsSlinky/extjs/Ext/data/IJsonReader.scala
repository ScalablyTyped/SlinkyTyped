package typingsSlinky.extjs.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJsonReader
  extends typingsSlinky.extjs.Ext.data.reader.IReader {
  /** [Property] (Object) */
  var jsonData: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var metaProperty: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var record: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var useSimpleAccessors: js.UndefOr[Boolean] = js.native
}

object IJsonReader {
  @scala.inline
  def apply(): IJsonReader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJsonReader]
  }
  @scala.inline
  implicit class IJsonReaderOps[Self <: IJsonReader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJsonData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonData")(js.undefined)
        ret
    }
    @scala.inline
    def withMetaProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetaProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withRecord(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSimpleAccessors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSimpleAccessors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSimpleAccessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSimpleAccessors")(js.undefined)
        ret
    }
  }
  
}

