package typingsSlinky.pulumiAws.lifecyclePolicyDocumentMod

import typingsSlinky.pulumiAws.pulumiAwsStrings.any
import typingsSlinky.pulumiAws.pulumiAwsStrings.imageCountMoreThan
import typingsSlinky.pulumiAws.pulumiAwsStrings.sinceImagePushed
import typingsSlinky.pulumiAws.pulumiAwsStrings.tagged
import typingsSlinky.pulumiAws.pulumiAwsStrings.untagged
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Selection extends js.Object {
  /**
    * The maximum number of images or the max age for which to apply the image selection.
    */
  var countNumber: Input[Double] = js.native
  /**
    * Indicate whether to evaluate the rule based on `imageCountMoreThan` or `sinceImagePushed`.
    */
  var countType: Input[imageCountMoreThan | sinceImagePushed] = js.native
  /**
    * The unit of time e.g. days for which to apply the selection.
    */
  var countUnit: js.UndefOr[Input[String]] = js.native
  /**
    * Specify one or more image tag prefixes for selection.
    */
  var tagPrefixList: js.UndefOr[Input[String] | js.Array[Input[String]]] = js.native
  /**
    * Indicate whether to select `tagged`, `untagged` or `any` images in the repository.
    */
  var tagStatus: Input[tagged | untagged | any] = js.native
}

object Selection {
  @scala.inline
  def apply(
    countNumber: Input[Double],
    countType: Input[imageCountMoreThan | sinceImagePushed],
    tagStatus: Input[tagged | untagged | any]
  ): Selection = {
    val __obj = js.Dynamic.literal(countNumber = countNumber.asInstanceOf[js.Any], countType = countType.asInstanceOf[js.Any], tagStatus = tagStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
  @scala.inline
  implicit class SelectionOps[Self <: Selection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountNumber(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountType(value: Input[imageCountMoreThan | sinceImagePushed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagStatus(value: Input[tagged | untagged | any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountUnit(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withTagPrefixList(value: Input[String] | js.Array[Input[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagPrefixList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagPrefixList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagPrefixList")(js.undefined)
        ret
    }
  }
  
}

