package typingsSlinky.powerappsComponentFramework.ComponentFramework

import typingsSlinky.powerappsComponentFramework.AnonGuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * An object that encapsulates an Entity Reference as a plain object suitable for storing in the state tree
	 */
@js.native
trait EntityReference extends js.Object {
  /**
  		 * The entity logical name. Read-only.
  		 */
  var etn: js.UndefOr[String] = js.native
  /**
  		 * The record id. Read-only.
  		 */
  var id: AnonGuid = js.native
  /**
  		 * The name of the entity reference. Read-only.
  		 */
  var name: String = js.native
}

object EntityReference {
  @scala.inline
  def apply(id: AnonGuid, name: String): EntityReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityReference]
  }
  @scala.inline
  implicit class EntityReferenceOps[Self <: EntityReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: AnonGuid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEtn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etn")(js.undefined)
        ret
    }
  }
  
}

