package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database Instance truncate log context.
  */
@js.native
trait SchemaTruncateLogContext extends js.Object {
  /**
    * This is always sql#truncateLogContext.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The type of log to truncate. Valid values are MYSQL_GENERAL_TABLE and
    * MYSQL_SLOW_TABLE.
    */
  var logType: js.UndefOr[String] = js.native
}

object SchemaTruncateLogContext {
  @scala.inline
  def apply(): SchemaTruncateLogContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTruncateLogContext]
  }
  @scala.inline
  implicit class SchemaTruncateLogContextOps[Self <: SchemaTruncateLogContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLogType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logType")(js.undefined)
        ret
    }
  }
  
}

