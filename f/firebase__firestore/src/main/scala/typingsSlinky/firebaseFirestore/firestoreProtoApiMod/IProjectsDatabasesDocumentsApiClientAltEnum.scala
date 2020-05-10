package typingsSlinky.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProjectsDatabasesDocumentsApiClientAltEnum extends js.Object {
  var JSON: ProjectsDatabasesDocumentsApiClientAlt = js.native
  var MEDIA: ProjectsDatabasesDocumentsApiClientAlt = js.native
  var PROTO: ProjectsDatabasesDocumentsApiClientAlt = js.native
  def values(): js.Array[ProjectsDatabasesDocumentsApiClientAlt] = js.native
}

object IProjectsDatabasesDocumentsApiClientAltEnum {
  @scala.inline
  def apply(
    JSON: ProjectsDatabasesDocumentsApiClientAlt,
    MEDIA: ProjectsDatabasesDocumentsApiClientAlt,
    PROTO: ProjectsDatabasesDocumentsApiClientAlt,
    values: () => js.Array[ProjectsDatabasesDocumentsApiClientAlt]
  ): IProjectsDatabasesDocumentsApiClientAltEnum = {
    val __obj = js.Dynamic.literal(JSON = JSON.asInstanceOf[js.Any], MEDIA = MEDIA.asInstanceOf[js.Any], PROTO = PROTO.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[IProjectsDatabasesDocumentsApiClientAltEnum]
  }
  @scala.inline
  implicit class IProjectsDatabasesDocumentsApiClientAltEnumOps[Self <: IProjectsDatabasesDocumentsApiClientAltEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJSON(value: ProjectsDatabasesDocumentsApiClientAlt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMEDIA(value: ProjectsDatabasesDocumentsApiClientAlt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MEDIA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPROTO(value: ProjectsDatabasesDocumentsApiClientAlt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PROTO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: () => js.Array[ProjectsDatabasesDocumentsApiClientAlt]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

