package typingsSlinky.googleapis.dataprocV1Mod.dataprocV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The location of diagnostic output.
  */
@js.native
trait SchemaDiagnoseClusterResults extends js.Object {
  /**
    * Output only. The Cloud Storage URI of the diagnostic output. The output
    * report is a plain text file with a summary of collected diagnostics.
    */
  var outputUri: js.UndefOr[String] = js.native
}

object SchemaDiagnoseClusterResults {
  @scala.inline
  def apply(): SchemaDiagnoseClusterResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiagnoseClusterResults]
  }
  @scala.inline
  implicit class SchemaDiagnoseClusterResultsOps[Self <: SchemaDiagnoseClusterResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputUri")(js.undefined)
        ret
    }
  }
  
}

