package typingsSlinky.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about vulnerable or missing HTTP Headers.
  */
@js.native
trait SchemaVulnerableHeaders extends js.Object {
  /**
    * List of vulnerable headers.
    */
  var headers: js.UndefOr[js.Array[SchemaHeader]] = js.native
  /**
    * List of missing headers.
    */
  var missingHeaders: js.UndefOr[js.Array[SchemaHeader]] = js.native
}

object SchemaVulnerableHeaders {
  @scala.inline
  def apply(): SchemaVulnerableHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVulnerableHeaders]
  }
  @scala.inline
  implicit class SchemaVulnerableHeadersOps[Self <: SchemaVulnerableHeaders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaders(value: js.Array[SchemaHeader]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withMissingHeaders(value: js.Array[SchemaHeader]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissingHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingHeaders")(js.undefined)
        ret
    }
  }
  
}

