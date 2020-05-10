package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExplainQueryStep extends js.Object {
  /** Machine-readable operation type. */
  var kind: js.UndefOr[String] = js.native
  /** Human-readable stage descriptions. */
  var substeps: js.UndefOr[js.Array[String]] = js.native
}

object ExplainQueryStep {
  @scala.inline
  def apply(): ExplainQueryStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplainQueryStep]
  }
  @scala.inline
  implicit class ExplainQueryStepOps[Self <: ExplainQueryStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSubsteps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substeps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubsteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substeps")(js.undefined)
        ret
    }
  }
  
}

