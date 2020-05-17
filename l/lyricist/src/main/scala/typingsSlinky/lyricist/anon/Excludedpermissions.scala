package typingsSlinky.lyricist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Excludedpermissions extends js.Object {
  var excluded_permissions: js.Array[String] = js.native
  var interactions: Following = js.native
  var iq_by_action: js.Any = js.native
  var permissions: js.Array[String] = js.native
  var relationships: js.Any = js.native
}

object Excludedpermissions {
  @scala.inline
  def apply(
    excluded_permissions: js.Array[String],
    interactions: Following,
    iq_by_action: js.Any,
    permissions: js.Array[String],
    relationships: js.Any
  ): Excludedpermissions = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], iq_by_action = iq_by_action.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any])
    __obj.asInstanceOf[Excludedpermissions]
  }
  @scala.inline
  implicit class ExcludedpermissionsOps[Self <: Excludedpermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcluded_permissions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excluded_permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteractions(value: Following): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIq_by_action(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iq_by_action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelationships(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationships")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

