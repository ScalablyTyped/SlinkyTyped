package typingsSlinky.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A create, update, or delete of a particular column family.
  */
@js.native
trait SchemaModification extends js.Object {
  /**
    * Create a new column family with the specified schema, or fail if one
    * already exists with the given ID.
    */
  var create: js.UndefOr[SchemaColumnFamily] = js.native
  /**
    * Drop (delete) the column family with the given ID, or fail if no such
    * family exists.
    */
  var drop: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the column family to be modified.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Update an existing column family to the specified schema, or fail if no
    * column family exists with the given ID.
    */
  var update: js.UndefOr[SchemaColumnFamily] = js.native
}

object SchemaModification {
  @scala.inline
  def apply(): SchemaModification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModification]
  }
  @scala.inline
  implicit class SchemaModificationOps[Self <: SchemaModification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: SchemaColumnFamily): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.undefined)
        ret
    }
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
    def withUpdate(value: SchemaColumnFamily): Self = {
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
  }
  
}

