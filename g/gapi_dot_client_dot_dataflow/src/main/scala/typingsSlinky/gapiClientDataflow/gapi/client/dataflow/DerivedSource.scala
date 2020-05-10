package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DerivedSource extends js.Object {
  /** What source to base the produced source on (if any). */
  var derivationMode: js.UndefOr[String] = js.native
  /** Specification of the source. */
  var source: js.UndefOr[Source] = js.native
}

object DerivedSource {
  @scala.inline
  def apply(): DerivedSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DerivedSource]
  }
  @scala.inline
  implicit class DerivedSourceOps[Self <: DerivedSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDerivationMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derivationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDerivationMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derivationMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: Source): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

