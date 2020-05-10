package typingsSlinky.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProjectsDatabasesIndexesApiClientAltEnum extends js.Object {
  var JSON: ProjectsDatabasesIndexesApiClientAlt = js.native
  var MEDIA: ProjectsDatabasesIndexesApiClientAlt = js.native
  var PROTO: ProjectsDatabasesIndexesApiClientAlt = js.native
  def values(): js.Array[ProjectsDatabasesIndexesApiClientAlt] = js.native
}

object IProjectsDatabasesIndexesApiClientAltEnum {
  @scala.inline
  def apply(
    JSON: ProjectsDatabasesIndexesApiClientAlt,
    MEDIA: ProjectsDatabasesIndexesApiClientAlt,
    PROTO: ProjectsDatabasesIndexesApiClientAlt,
    values: () => js.Array[ProjectsDatabasesIndexesApiClientAlt]
  ): IProjectsDatabasesIndexesApiClientAltEnum = {
    val __obj = js.Dynamic.literal(JSON = JSON.asInstanceOf[js.Any], MEDIA = MEDIA.asInstanceOf[js.Any], PROTO = PROTO.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[IProjectsDatabasesIndexesApiClientAltEnum]
  }
  @scala.inline
  implicit class IProjectsDatabasesIndexesApiClientAltEnumOps[Self <: IProjectsDatabasesIndexesApiClientAltEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJSON(value: ProjectsDatabasesIndexesApiClientAlt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMEDIA(value: ProjectsDatabasesIndexesApiClientAlt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MEDIA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPROTO(value: ProjectsDatabasesIndexesApiClientAlt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PROTO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: () => js.Array[ProjectsDatabasesIndexesApiClientAlt]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

