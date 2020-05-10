package typingsSlinky.angularOdataResources.OData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICountResult extends js.Object {
  @JSName("$promise")
  var $promise: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<any> */ js.Any = js.native
  var result: Double = js.native
}

object ICountResult {
  @scala.inline
  def apply(
    $promise: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<any> */ js.Any,
    result: Double
  ): ICountResult = {
    val __obj = js.Dynamic.literal($promise = $promise.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICountResult]
  }
  @scala.inline
  implicit class ICountResultOps[Self <: ICountResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$promise(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<any> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

