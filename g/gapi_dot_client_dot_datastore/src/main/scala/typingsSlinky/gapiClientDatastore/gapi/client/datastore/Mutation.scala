package typingsSlinky.gapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mutation extends js.Object {
  /**
    * The version of the entity that this mutation is being applied to. If this
    * does not match the current version on the server, the mutation conflicts.
    */
  var baseVersion: js.UndefOr[String] = js.native
  /**
    * The key of the entity to delete. The entity may or may not already exist.
    * Must have a complete key path and must not be reserved/read-only.
    */
  var delete: js.UndefOr[Key] = js.native
  /**
    * The entity to insert. The entity must not already exist.
    * The entity key's final path element may be incomplete.
    */
  var insert: js.UndefOr[Entity] = js.native
  /**
    * The entity to update. The entity must already exist.
    * Must have a complete key path.
    */
  var update: js.UndefOr[Entity] = js.native
  /**
    * The entity to upsert. The entity may or may not already exist.
    * The entity key's final path element may be incomplete.
    */
  var upsert: js.UndefOr[Entity] = js.native
}

object Mutation {
  @scala.inline
  def apply(): Mutation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mutation]
  }
  @scala.inline
  implicit class MutationOps[Self <: Mutation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDelete(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.undefined)
        ret
    }
    @scala.inline
    def withInsert(value: Entity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: Entity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withUpsert(value: Entity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsert")(js.undefined)
        ret
    }
  }
  
}

