package typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the parameters needed for de-identification of DICOM stores.
  */
@js.native
trait SchemaDicomConfig extends js.Object {
  /**
    * Tag filtering profile that determines which tags to keep/remove.
    */
  var filterProfile: js.UndefOr[String] = js.native
  /**
    * List of tags to keep. Remove all other tags.
    */
  var keepList: js.UndefOr[SchemaTagFilterList] = js.native
  /**
    * List of tags to remove. Keep all other tags.
    */
  var removeList: js.UndefOr[SchemaTagFilterList] = js.native
}

object SchemaDicomConfig {
  @scala.inline
  def apply(): SchemaDicomConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDicomConfig]
  }
  @scala.inline
  implicit class SchemaDicomConfigOps[Self <: SchemaDicomConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterProfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepList(value: SchemaTagFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepList")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveList(value: SchemaTagFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeList")(js.undefined)
        ret
    }
  }
  
}

