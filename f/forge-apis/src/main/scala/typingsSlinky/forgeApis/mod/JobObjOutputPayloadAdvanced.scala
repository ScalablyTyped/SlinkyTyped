package typingsSlinky.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobObjOutputPayloadAdvanced extends js.Object {
  var exportFileStructure: js.UndefOr[String] = js.native
  var modelGuid: js.UndefOr[String] = js.native
  var objectIds: js.UndefOr[js.Array[String]] = js.native
}

object JobObjOutputPayloadAdvanced {
  @scala.inline
  def apply(): JobObjOutputPayloadAdvanced = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobObjOutputPayloadAdvanced]
  }
  @scala.inline
  implicit class JobObjOutputPayloadAdvancedOps[Self <: JobObjOutputPayloadAdvanced] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportFileStructure(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportFileStructure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportFileStructure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportFileStructure")(js.undefined)
        ret
    }
    @scala.inline
    def withModelGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelGuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelGuid")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectIds")(js.undefined)
        ret
    }
  }
  
}

