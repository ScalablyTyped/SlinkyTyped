package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A selector associated with the SecuritySettings. If the labels and port in
  * this selector match the Envoy&#39;s label and port, the server side
  * authentication and authorization settings are applied to the Envoy.
  */
@js.native
trait SchemaServerSecuritySettingsSelector extends js.Object {
  /**
    * The labels associated with the XDS client.
    */
  var labelMatches: js.UndefOr[js.Array[SchemaMetadataFilterLabelMatch]] = js.native
  /**
    * The listener port of the XDS client.
    */
  var port: js.UndefOr[Double] = js.native
}

object SchemaServerSecuritySettingsSelector {
  @scala.inline
  def apply(): SchemaServerSecuritySettingsSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServerSecuritySettingsSelector]
  }
  @scala.inline
  implicit class SchemaServerSecuritySettingsSelectorOps[Self <: SchemaServerSecuritySettingsSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelMatches(value: js.Array[SchemaMetadataFilterLabelMatch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMatches")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
  }
  
}

