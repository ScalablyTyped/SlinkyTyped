package typingsSlinky.gapiClientDatastore.gapi.client.datastore

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entity extends js.Object {
  /**
    * The entity's key.
    *
    * An entity must have a key, unless otherwise documented (for example,
    * an entity in `Value.entity_value` may have no key).
    * An entity's kind is its key path's last element's kind,
    * or null if it has no key.
    */
  var key: js.UndefOr[Key] = js.native
  /**
    * The entity's properties.
    * The map's keys are property names.
    * A property name matching regex `__.&#42;__` is reserved.
    * A reserved property name is forbidden in certain documented contexts.
    * The name must not contain more than 500 characters.
    * The name cannot be `""`.
    */
  var properties: js.UndefOr[Record[String, Value]] = js.native
}

object Entity {
  @scala.inline
  def apply(): Entity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Entity]
  }
  @scala.inline
  implicit class EntityOps[Self <: Entity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: Record[String, Value]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

