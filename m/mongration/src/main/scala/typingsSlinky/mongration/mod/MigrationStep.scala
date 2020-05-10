package typingsSlinky.mongration.mod

import typingsSlinky.mongodb.mod.Db
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationStep extends js.Object {
  var down: js.UndefOr[
    js.Function2[/* db */ Db, /* cb */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], Unit]
  ] = js.native
  var id: String = js.native
  def up(db: Db, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
}

object MigrationStep {
  @scala.inline
  def apply(id: String, up: (Db, js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit): MigrationStep = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], up = js.Any.fromFunction2(up))
    __obj.asInstanceOf[MigrationStep]
  }
  @scala.inline
  implicit class MigrationStepOps[Self <: MigrationStep] (val x: Self) extends AnyVal {
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
    def withUp(value: (Db, js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDown(value: (/* db */ Db, /* cb */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.undefined)
        ret
    }
  }
  
}

