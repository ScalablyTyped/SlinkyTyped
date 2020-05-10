package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initial State for shielded instance, these are public keys which are safe
  * to store in public
  */
@js.native
trait SchemaInitialStateConfig extends js.Object {
  /**
    * The Key Database (db).
    */
  var dbs: js.UndefOr[js.Array[SchemaFileContentBuffer]] = js.native
  /**
    * The forbidden key database (dbx).
    */
  var dbxs: js.UndefOr[js.Array[SchemaFileContentBuffer]] = js.native
  /**
    * The Key Exchange Key (KEK).
    */
  var keks: js.UndefOr[js.Array[SchemaFileContentBuffer]] = js.native
  /**
    * The Platform Key (PK).
    */
  var pk: js.UndefOr[SchemaFileContentBuffer] = js.native
}

object SchemaInitialStateConfig {
  @scala.inline
  def apply(): SchemaInitialStateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInitialStateConfig]
  }
  @scala.inline
  implicit class SchemaInitialStateConfigOps[Self <: SchemaInitialStateConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDbs(value: js.Array[SchemaFileContentBuffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbs")(js.undefined)
        ret
    }
    @scala.inline
    def withDbxs(value: js.Array[SchemaFileContentBuffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbxs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbxs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbxs")(js.undefined)
        ret
    }
    @scala.inline
    def withKeks(value: js.Array[SchemaFileContentBuffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keks")(js.undefined)
        ret
    }
    @scala.inline
    def withPk(value: SchemaFileContentBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pk")(js.undefined)
        ret
    }
  }
  
}

