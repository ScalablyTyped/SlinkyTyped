package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Spell check result.
  */
@js.native
trait SchemaSpellingCorrection extends js.Object {
  /**
    * Indicates if the query was corrected by the spell checker.
    */
  var corrected: js.UndefOr[Boolean] = js.native
  /**
    * Correction output consisting of the corrected keyword string.
    */
  var correctedText: js.UndefOr[String] = js.native
}

object SchemaSpellingCorrection {
  @scala.inline
  def apply(): SchemaSpellingCorrection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpellingCorrection]
  }
  @scala.inline
  implicit class SchemaSpellingCorrectionOps[Self <: SchemaSpellingCorrection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCorrected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corrected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corrected")(js.undefined)
        ret
    }
    @scala.inline
    def withCorrectedText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correctedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrectedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correctedText")(js.undefined)
        ret
    }
  }
  
}

