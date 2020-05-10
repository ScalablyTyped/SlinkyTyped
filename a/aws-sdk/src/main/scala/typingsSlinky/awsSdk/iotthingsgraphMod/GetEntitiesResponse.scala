package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEntitiesResponse extends js.Object {
  /**
    * An array of descriptions for the specified entities.
    */
  var descriptions: js.UndefOr[EntityDescriptions] = js.native
}

object GetEntitiesResponse {
  @scala.inline
  def apply(): GetEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEntitiesResponse]
  }
  @scala.inline
  implicit class GetEntitiesResponseOps[Self <: GetEntitiesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescriptions(value: EntityDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptions")(js.undefined)
        ret
    }
  }
  
}

