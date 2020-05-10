package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfusionMatrix extends js.Object {
  /**
    * The number of matches in the data that the transform didn't find, in the confusion matrix for your transform.
    */
  var NumFalseNegatives: js.UndefOr[RecordsCount] = js.native
  /**
    * The number of nonmatches in the data that the transform incorrectly classified as a match, in the confusion matrix for your transform.
    */
  var NumFalsePositives: js.UndefOr[RecordsCount] = js.native
  /**
    * The number of nonmatches in the data that the transform correctly rejected, in the confusion matrix for your transform.
    */
  var NumTrueNegatives: js.UndefOr[RecordsCount] = js.native
  /**
    * The number of matches in the data that the transform correctly found, in the confusion matrix for your transform.
    */
  var NumTruePositives: js.UndefOr[RecordsCount] = js.native
}

object ConfusionMatrix {
  @scala.inline
  def apply(): ConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfusionMatrix]
  }
  @scala.inline
  implicit class ConfusionMatrixOps[Self <: ConfusionMatrix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumFalseNegatives(value: RecordsCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumFalseNegatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumFalseNegatives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumFalseNegatives")(js.undefined)
        ret
    }
    @scala.inline
    def withNumFalsePositives(value: RecordsCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumFalsePositives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumFalsePositives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumFalsePositives")(js.undefined)
        ret
    }
    @scala.inline
    def withNumTrueNegatives(value: RecordsCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumTrueNegatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumTrueNegatives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumTrueNegatives")(js.undefined)
        ret
    }
    @scala.inline
    def withNumTruePositives(value: RecordsCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumTruePositives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumTruePositives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumTruePositives")(js.undefined)
        ret
    }
  }
  
}

