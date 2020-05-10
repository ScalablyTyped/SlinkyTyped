package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlgorithmSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the algorithm.
    */
  var AlgorithmArn: typingsSlinky.awsSdk.sagemakerMod.AlgorithmArn = js.native
  /**
    * A brief description of the algorithm.
    */
  var AlgorithmDescription: js.UndefOr[EntityDescription] = js.native
  /**
    * The name of the algorithm that is described by the summary.
    */
  var AlgorithmName: EntityName = js.native
  /**
    * The overall status of the algorithm.
    */
  var AlgorithmStatus: typingsSlinky.awsSdk.sagemakerMod.AlgorithmStatus = js.native
  /**
    * A timestamp that shows when the algorithm was created.
    */
  var CreationTime: js.Date = js.native
}

object AlgorithmSummary {
  @scala.inline
  def apply(
    AlgorithmArn: AlgorithmArn,
    AlgorithmName: EntityName,
    AlgorithmStatus: AlgorithmStatus,
    CreationTime: js.Date
  ): AlgorithmSummary = {
    val __obj = js.Dynamic.literal(AlgorithmArn = AlgorithmArn.asInstanceOf[js.Any], AlgorithmName = AlgorithmName.asInstanceOf[js.Any], AlgorithmStatus = AlgorithmStatus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmSummary]
  }
  @scala.inline
  implicit class AlgorithmSummaryOps[Self <: AlgorithmSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithmArn(value: AlgorithmArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlgorithmName(value: EntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlgorithmStatus(value: AlgorithmStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlgorithmDescription(value: EntityDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithmDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmDescription")(js.undefined)
        ret
    }
  }
  
}

