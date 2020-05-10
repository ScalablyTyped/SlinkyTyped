package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Per-project settings for the Tool Results service.
  */
@js.native
trait SchemaProjectSettings extends js.Object {
  /**
    * The name of the Google Cloud Storage bucket to which results are written.
    * By default, this is unset.  In update request: optional In response:
    * optional
    */
  var defaultBucket: js.UndefOr[String] = js.native
  /**
    * The name of the project&#39;s settings.  Always of the form:
    * projects/{project-id}/settings  In update request: never set In response:
    * always set
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaProjectSettings {
  @scala.inline
  def apply(): SchemaProjectSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectSettings]
  }
  @scala.inline
  implicit class SchemaProjectSettingsOps[Self <: SchemaProjectSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBucket")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

