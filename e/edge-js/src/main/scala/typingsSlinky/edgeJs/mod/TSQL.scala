package typingsSlinky.edgeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSQL extends js.Object {
  var commandTimeout: js.UndefOr[Double] = js.native
  var connectionString: js.UndefOr[String] = js.native
  var source: String = js.native
}

object TSQL {
  @scala.inline
  def apply(source: String): TSQL = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSQL]
  }
  @scala.inline
  implicit class TSQLOps[Self <: TSQL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommandTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommandTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionString")(js.undefined)
        ret
    }
  }
  
}

