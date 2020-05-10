package typingsSlinky.nodePgMigrate.mod

import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.btree
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.gin
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.gist
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.hash
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.spgist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIndexOptions extends js.Object {
  var concurrently: js.UndefOr[Boolean] = js.native
  var method: js.UndefOr[btree | hash | gist | spgist | gin] = js.native
  var name: js.UndefOr[String] = js.native
  var opclass: js.UndefOr[String] = js.native
  var unique: js.UndefOr[Boolean] = js.native
  var where: js.UndefOr[String] = js.native
}

object CreateIndexOptions {
  @scala.inline
  def apply(): CreateIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIndexOptions]
  }
  @scala.inline
  implicit class CreateIndexOptionsOps[Self <: CreateIndexOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcurrently(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrently")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrently: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrently")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: btree | hash | gist | spgist | gin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
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
    @scala.inline
    def withOpclass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opclass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpclass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opclass")(js.undefined)
        ret
    }
    @scala.inline
    def withUnique(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnique: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(js.undefined)
        ret
    }
    @scala.inline
    def withWhere(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(js.undefined)
        ret
    }
  }
  
}

