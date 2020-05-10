package typingsSlinky.expressMyconnection.Express

import typingsSlinky.expressMyconnection.mysql.Connection
import typingsSlinky.expressMyconnection.mysql.MysqlError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var getConnection: js.UndefOr[
    js.Function1[
      /* callback */ js.Function2[/* err */ MysqlError, /* connection */ Connection, Unit], 
      Unit
    ]
  ] = js.native
}

object Request {
  @scala.inline
  def apply(): Request = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetConnection(
      value: /* callback */ js.Function2[/* err */ MysqlError, /* connection */ Connection, Unit] => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConnection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConnection")(js.undefined)
        ret
    }
  }
  
}

