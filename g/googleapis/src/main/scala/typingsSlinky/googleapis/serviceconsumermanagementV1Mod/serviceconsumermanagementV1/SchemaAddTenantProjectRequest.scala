package typingsSlinky.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to add a newly created and configured tenant project to a tenancy
  * unit.
  */
@js.native
trait SchemaAddTenantProjectRequest extends js.Object {
  /**
    * Configuration of the new tenant project to be added to tenancy unit
    * resources.
    */
  var projectConfig: js.UndefOr[SchemaTenantProjectConfig] = js.native
  /**
    * Tag of the added project. Must be less than 128 characters. Required.
    */
  var tag: js.UndefOr[String] = js.native
}

object SchemaAddTenantProjectRequest {
  @scala.inline
  def apply(): SchemaAddTenantProjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddTenantProjectRequest]
  }
  @scala.inline
  implicit class SchemaAddTenantProjectRequestOps[Self <: SchemaAddTenantProjectRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectConfig(value: SchemaTenantProjectConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
  }
  
}

