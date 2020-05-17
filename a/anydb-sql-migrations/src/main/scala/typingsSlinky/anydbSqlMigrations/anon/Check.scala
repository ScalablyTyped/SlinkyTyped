package typingsSlinky.anydbSqlMigrations.anon

import typingsSlinky.anydbSqlMigrations.mod.MigrationOptions
import typingsSlinky.anydbSqlMigrations.mod.MigrationTask
import typingsSlinky.bluebird.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Check extends js.Object {
  def check(f: js.Function1[/* items */ js.Array[MigrationTask], _]): ^[_] = js.native
  def drop(): ^[_] = js.native
  def execMigrations(migrationOptions: MigrationOptions): ^[Unit] = js.native
  def migrate(): ^[_] = js.native
  def run(): ^[_] = js.native
  def undoLast(): ^[_] = js.native
}

object Check {
  @scala.inline
  def apply(
    check: js.Function1[/* items */ js.Array[MigrationTask], _] => ^[_],
    drop: () => ^[_],
    execMigrations: MigrationOptions => ^[Unit],
    migrate: () => ^[_],
    run: () => ^[_],
    undoLast: () => ^[_]
  ): Check = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check), drop = js.Any.fromFunction0(drop), execMigrations = js.Any.fromFunction1(execMigrations), migrate = js.Any.fromFunction0(migrate), run = js.Any.fromFunction0(run), undoLast = js.Any.fromFunction0(undoLast))
    __obj.asInstanceOf[Check]
  }
  @scala.inline
  implicit class CheckOps[Self <: Check] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheck(value: js.Function1[/* items */ js.Array[MigrationTask], _] => ^[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDrop(value: () => ^[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExecMigrations(value: MigrationOptions => ^[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execMigrations")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMigrate(value: () => ^[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRun(value: () => ^[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUndoLast(value: () => ^[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undoLast")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

