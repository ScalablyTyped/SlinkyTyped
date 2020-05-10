package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance clone context.
  */
@js.native
trait SchemaCloneContext extends js.Object {
  /**
    * Binary log coordinates, if specified, identify the position up to which
    * the source instance should be cloned. If not specified, the source
    * instance is cloned up to the most recent binary log coordinates.
    */
  var binLogCoordinates: js.UndefOr[SchemaBinLogCoordinates] = js.native
  /**
    * Name of the Cloud SQL instance to be created as a clone.
    */
  var destinationInstanceName: js.UndefOr[String] = js.native
  /**
    * This is always sql#cloneContext.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Reserved for future use.
    */
  var pitrTimestampMs: js.UndefOr[String] = js.native
}

object SchemaCloneContext {
  @scala.inline
  def apply(): SchemaCloneContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloneContext]
  }
  @scala.inline
  implicit class SchemaCloneContextOps[Self <: SchemaCloneContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinLogCoordinates(value: SchemaBinLogCoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binLogCoordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinLogCoordinates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binLogCoordinates")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationInstanceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationInstanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationInstanceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationInstanceName")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withPitrTimestampMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitrTimestampMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPitrTimestampMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitrTimestampMs")(js.undefined)
        ret
    }
  }
  
}

