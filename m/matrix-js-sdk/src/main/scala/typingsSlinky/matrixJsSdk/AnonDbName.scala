package typingsSlinky.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDbName extends js.Object {
  var dbName: js.UndefOr[String] = js.native
  var indexedDB: js.Any = js.native
  var workerApi: js.UndefOr[js.Any] = js.native
  var workerScript: js.UndefOr[String] = js.native
}

object AnonDbName {
  @scala.inline
  def apply(indexedDB: js.Any): AnonDbName = {
    val __obj = js.Dynamic.literal(indexedDB = indexedDB.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDbName]
  }
  @scala.inline
  implicit class AnonDbNameOps[Self <: AnonDbName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexedDB(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexedDB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDbName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbName")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerApi(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerApi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerApi")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerScript")(js.undefined)
        ret
    }
  }
  
}

