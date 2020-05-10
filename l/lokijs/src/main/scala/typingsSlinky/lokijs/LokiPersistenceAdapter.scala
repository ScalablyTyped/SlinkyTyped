package typingsSlinky.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*------------------+
| PERSISTENCE       |
-------------------*/
/** there are two build in persistence adapters for internal use
  * fs             for use in Nodejs type environments
  * localStorage   for use in browser environment
  * defined as helper classes here so its easy and clean to use
  */
@js.native
trait LokiPersistenceAdapter extends js.Object {
  var deleteDatabase: js.UndefOr[
    js.Function2[
      /* dbnameOrOptions */ js.Any, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Error | Null], /* data */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ] = js.native
  var exportDatabase: js.UndefOr[
    js.Function3[
      /* dbname */ String, 
      /* dbref */ Loki, 
      /* callback */ js.Function1[/* err */ js.Error | Null, Unit], 
      Unit
    ]
  ] = js.native
  var mode: js.UndefOr[String] = js.native
  var saveDatabase: js.UndefOr[
    js.Function3[
      /* dbname */ String, 
      /* dbstring */ js.Any, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  def loadDatabase(dbname: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
}

object LokiPersistenceAdapter {
  @scala.inline
  def apply(loadDatabase: (String, js.Function1[/* value */ js.Any, Unit]) => Unit): LokiPersistenceAdapter = {
    val __obj = js.Dynamic.literal(loadDatabase = js.Any.fromFunction2(loadDatabase))
    __obj.asInstanceOf[LokiPersistenceAdapter]
  }
  @scala.inline
  implicit class LokiPersistenceAdapterOps[Self <: LokiPersistenceAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadDatabase(value: (String, js.Function1[/* value */ js.Any, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadDatabase")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeleteDatabase(
      value: (/* dbnameOrOptions */ js.Any, /* callback */ js.Function2[/* err */ js.UndefOr[js.Error | Null], /* data */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDatabase")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDeleteDatabase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDatabase")(js.undefined)
        ret
    }
    @scala.inline
    def withExportDatabase(
      value: (/* dbname */ String, /* dbref */ Loki, /* callback */ js.Function1[/* err */ js.Error | Null, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportDatabase")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutExportDatabase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportDatabase")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveDatabase(
      value: (/* dbname */ String, /* dbstring */ js.Any, /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveDatabase")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSaveDatabase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveDatabase")(js.undefined)
        ret
    }
  }
  
}

