package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloneContext extends js.Object {
  /**
    * Binary log coordinates, if specified, indentify the the position up to which the source instance should be cloned. If not specified, the source
    * instance is cloned up to the most recent binary log coordintes.
    */
  var binLogCoordinates: js.UndefOr[BinLogCoordinates] = js.native
  /** Name of the Cloud SQL instance to be created as a clone. */
  var destinationInstanceName: js.UndefOr[String] = js.native
  /** This is always sql#cloneContext. */
  var kind: js.UndefOr[String] = js.native
}

object CloneContext {
  @scala.inline
  def apply(): CloneContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloneContext]
  }
  @scala.inline
  implicit class CloneContextOps[Self <: CloneContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinLogCoordinates(value: BinLogCoordinates): Self = {
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
  }
  
}

