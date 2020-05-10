package typingsSlinky.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output configuration for export assets destination.
  */
@js.native
trait SchemaOutputConfig extends js.Object {
  /**
    * Destination on Cloud Storage.
    */
  var gcsDestination: js.UndefOr[SchemaGcsDestination] = js.native
}

object SchemaOutputConfig {
  @scala.inline
  def apply(): SchemaOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOutputConfig]
  }
  @scala.inline
  implicit class SchemaOutputConfigOps[Self <: SchemaOutputConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGcsDestination(value: SchemaGcsDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsDestination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcsDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsDestination")(js.undefined)
        ret
    }
  }
  
}

