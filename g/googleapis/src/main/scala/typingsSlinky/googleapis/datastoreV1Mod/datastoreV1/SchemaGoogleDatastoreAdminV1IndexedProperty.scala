package typingsSlinky.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A property of an index.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1IndexedProperty extends js.Object {
  /**
    * The indexed property&#39;s direction.  Must not be DIRECTION_UNSPECIFIED.
    * Required.
    */
  var direction: js.UndefOr[String] = js.native
  /**
    * The property name to index. Required.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaGoogleDatastoreAdminV1IndexedProperty {
  @scala.inline
  def apply(): SchemaGoogleDatastoreAdminV1IndexedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1IndexedProperty]
  }
  @scala.inline
  implicit class SchemaGoogleDatastoreAdminV1IndexedPropertyOps[Self <: SchemaGoogleDatastoreAdminV1IndexedProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

