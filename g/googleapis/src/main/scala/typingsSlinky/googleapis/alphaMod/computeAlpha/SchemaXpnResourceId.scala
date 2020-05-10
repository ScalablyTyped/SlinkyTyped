package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Service resource (a.k.a service project) ID.
  */
@js.native
trait SchemaXpnResourceId extends js.Object {
  /**
    * The ID of the service resource. In the case of projects, this field
    * supports project id (e.g., my-project-123) and project number (e.g.
    * 12345678).
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The type of the service resource.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaXpnResourceId {
  @scala.inline
  def apply(): SchemaXpnResourceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaXpnResourceId]
  }
  @scala.inline
  implicit class SchemaXpnResourceIdOps[Self <: SchemaXpnResourceId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

