package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversionStatus extends js.Object {
  /** The original conversion that was inserted or updated. */
  var conversion: js.UndefOr[Conversion] = js.native
  /** A list of errors related to this conversion. */
  var errors: js.UndefOr[js.Array[ConversionError]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversionStatus". */
  var kind: js.UndefOr[String] = js.native
}

object ConversionStatus {
  @scala.inline
  def apply(): ConversionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionStatus]
  }
  @scala.inline
  implicit class ConversionStatusOps[Self <: ConversionStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConversion(value: Conversion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversion")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[ConversionError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
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

