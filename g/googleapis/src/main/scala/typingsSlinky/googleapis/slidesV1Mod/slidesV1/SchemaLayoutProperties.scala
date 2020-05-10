package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of Page are only relevant for pages with page_type LAYOUT.
  */
@js.native
trait SchemaLayoutProperties extends js.Object {
  /**
    * The human-readable name of the layout.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The object ID of the master that this layout is based on.
    */
  var masterObjectId: js.UndefOr[String] = js.native
  /**
    * The name of the layout.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaLayoutProperties {
  @scala.inline
  def apply(): SchemaLayoutProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLayoutProperties]
  }
  @scala.inline
  implicit class SchemaLayoutPropertiesOps[Self <: SchemaLayoutProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterObjectId")(js.undefined)
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

