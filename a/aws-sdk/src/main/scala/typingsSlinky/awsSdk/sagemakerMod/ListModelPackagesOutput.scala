package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListModelPackagesOutput extends js.Object {
  /**
    * An array of ModelPackageSummary objects, each of which lists a model package.
    */
  var ModelPackageSummaryList: typingsSlinky.awsSdk.sagemakerMod.ModelPackageSummaryList = js.native
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of model packages, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
}

object ListModelPackagesOutput {
  @scala.inline
  def apply(ModelPackageSummaryList: ModelPackageSummaryList): ListModelPackagesOutput = {
    val __obj = js.Dynamic.literal(ModelPackageSummaryList = ModelPackageSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListModelPackagesOutput]
  }
  @scala.inline
  implicit class ListModelPackagesOutputOps[Self <: ListModelPackagesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModelPackageSummaryList(value: ModelPackageSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelPackageSummaryList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

