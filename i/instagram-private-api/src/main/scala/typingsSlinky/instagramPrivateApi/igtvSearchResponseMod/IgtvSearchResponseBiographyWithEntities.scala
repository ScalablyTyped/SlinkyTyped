package typingsSlinky.instagramPrivateApi.igtvSearchResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgtvSearchResponseBiographyWithEntities extends js.Object {
  var entities: js.Array[IgtvSearchResponseEntitiesItem] = js.native
  var raw_text: String = js.native
}

object IgtvSearchResponseBiographyWithEntities {
  @scala.inline
  def apply(entities: js.Array[IgtvSearchResponseEntitiesItem], raw_text: String): IgtvSearchResponseBiographyWithEntities = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], raw_text = raw_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvSearchResponseBiographyWithEntities]
  }
  @scala.inline
  implicit class IgtvSearchResponseBiographyWithEntitiesOps[Self <: IgtvSearchResponseBiographyWithEntities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntities(value: js.Array[IgtvSearchResponseEntitiesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw_text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

