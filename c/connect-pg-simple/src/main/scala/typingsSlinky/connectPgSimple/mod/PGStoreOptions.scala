package typingsSlinky.connectPgSimple.mod

import typingsSlinky.connectPgSimple.connectPgSimpleBooleans.`false`
import typingsSlinky.pg.mod.Pool
import typingsSlinky.pg.mod.PoolConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PGStoreOptions extends js.Object {
  var conObject: js.UndefOr[PoolConfig] = js.native
   // not typed to avoid dependency to "pg-promise" module (which includes its own types)
  var conString: js.UndefOr[String] = js.native
  // tslint:disable-next-line:prefer-method-signature
  var errorLog: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var pgPromise: js.UndefOr[js.Object] = js.native
  var pool: js.UndefOr[Pool] = js.native
  var pruneSessionInterval: js.UndefOr[`false` | Double] = js.native
  var schemaName: js.UndefOr[String] = js.native
  var tableName: js.UndefOr[String] = js.native
  var ttl: js.UndefOr[Double] = js.native
}

object PGStoreOptions {
  @scala.inline
  def apply(): PGStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PGStoreOptions]
  }
  @scala.inline
  implicit class PGStoreOptionsOps[Self <: PGStoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConObject(value: PoolConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conObject")(js.undefined)
        ret
    }
    @scala.inline
    def withConString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conString")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorLog(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorLog")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutErrorLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorLog")(js.undefined)
        ret
    }
    @scala.inline
    def withPgPromise(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pgPromise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPgPromise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pgPromise")(js.undefined)
        ret
    }
    @scala.inline
    def withPool(value: Pool): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(js.undefined)
        ret
    }
    @scala.inline
    def withPruneSessionInterval(value: `false` | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pruneSessionInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPruneSessionInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pruneSessionInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaName")(js.undefined)
        ret
    }
    @scala.inline
    def withTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(js.undefined)
        ret
    }
    @scala.inline
    def withTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
  }
  
}

