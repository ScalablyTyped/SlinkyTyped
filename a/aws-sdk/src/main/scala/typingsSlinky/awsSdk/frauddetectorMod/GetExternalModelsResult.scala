package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExternalModelsResult extends js.Object {
  /**
    * Gets the Amazon SageMaker models.
    */
  var externalModels: js.UndefOr[ExternalModelList] = js.native
  /**
    * The next page token to be used in subsequent requests.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object GetExternalModelsResult {
  @scala.inline
  def apply(): GetExternalModelsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExternalModelsResult]
  }
  @scala.inline
  implicit class GetExternalModelsResultOps[Self <: GetExternalModelsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExternalModels(value: ExternalModelList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalModels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalModels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalModels")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

