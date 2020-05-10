package typingsSlinky.jsforce.describeResultMod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordTypeInfo extends js.Object {
  var available: Boolean = js.native
  var defaultRecordTypeMapping: Boolean = js.native
  var developerName: js.UndefOr[maybe[String]] = js.native
  var master: Boolean = js.native
  var name: String = js.native
  var recordTypeId: String = js.native
  var urls: Record[String, String] = js.native
}

object RecordTypeInfo {
  @scala.inline
  def apply(
    available: Boolean,
    defaultRecordTypeMapping: Boolean,
    master: Boolean,
    name: String,
    recordTypeId: String,
    urls: Record[String, String]
  ): RecordTypeInfo = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], defaultRecordTypeMapping = defaultRecordTypeMapping.asInstanceOf[js.Any], master = master.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recordTypeId = recordTypeId.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordTypeInfo]
  }
  @scala.inline
  implicit class RecordTypeInfoOps[Self <: RecordTypeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultRecordTypeMapping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRecordTypeMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaster(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordTypeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrls(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeveloperName(value: maybe[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerName")(js.undefined)
        ret
    }
    @scala.inline
    def withDeveloperNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerName")(null)
        ret
    }
  }
  
}

