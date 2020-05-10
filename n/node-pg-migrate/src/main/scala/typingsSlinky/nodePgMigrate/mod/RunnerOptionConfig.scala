package typingsSlinky.nodePgMigrate.mod

import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.down
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunnerOptionConfig extends js.Object {
  var checkOrder: js.UndefOr[Boolean] = js.native
  var count: Double = js.native
  var createMigrationsSchema: js.UndefOr[Boolean] = js.native
  var createSchema: js.UndefOr[Boolean] = js.native
  var decamelize: js.UndefOr[Boolean] = js.native
  var dir: String = js.native
  var direction: up | down = js.native
  var dryRun: js.UndefOr[Boolean] = js.native
  var fake: js.UndefOr[Boolean] = js.native
  var file: js.UndefOr[String] = js.native
  var ignorePattern: String = js.native
  var log: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
  var migrationsSchema: js.UndefOr[String] = js.native
  var migrationsTable: String = js.native
  var noLock: js.UndefOr[Boolean] = js.native
  var schema: js.UndefOr[String | js.Array[String]] = js.native
  var singleTransaction: js.UndefOr[Boolean] = js.native
  var timestamp: js.UndefOr[Boolean] = js.native
}

object RunnerOptionConfig {
  @scala.inline
  def apply(count: Double, dir: String, direction: up | down, ignorePattern: String, migrationsTable: String): RunnerOptionConfig = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], ignorePattern = ignorePattern.asInstanceOf[js.Any], migrationsTable = migrationsTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunnerOptionConfig]
  }
  @scala.inline
  implicit class RunnerOptionConfigOps[Self <: RunnerOptionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: up | down): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnorePattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMigrationsTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrationsTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateMigrationsSchema(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createMigrationsSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateMigrationsSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createMigrationsSchema")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateSchema(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSchema")(js.undefined)
        ret
    }
    @scala.inline
    def withDecamelize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decamelize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecamelize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decamelize")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withFake(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fake")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFake: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fake")(js.undefined)
        ret
    }
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: /* msg */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withMigrationsSchema(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrationsSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMigrationsSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrationsSchema")(js.undefined)
        ret
    }
    @scala.inline
    def withNoLock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noLock")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleTransaction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleTransaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleTransaction")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
  }
  
}

