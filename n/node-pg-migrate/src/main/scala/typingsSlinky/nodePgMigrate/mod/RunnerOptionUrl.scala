package typingsSlinky.nodePgMigrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunnerOptionUrl extends js.Object {
  var databaseUrl: String | ClientConfig = js.native
}

object RunnerOptionUrl {
  @scala.inline
  def apply(databaseUrl: String | ClientConfig): RunnerOptionUrl = {
    val __obj = js.Dynamic.literal(databaseUrl = databaseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunnerOptionUrl]
  }
  @scala.inline
  implicit class RunnerOptionUrlOps[Self <: RunnerOptionUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabaseUrl(value: String | ClientConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

