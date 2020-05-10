package typingsSlinky.pinoHttp.mod

import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoLoggingOptions extends js.Object {
  var getPath: js.UndefOr[js.Function1[/* req */ IncomingMessage, js.UndefOr[String]]] = js.native
  var ignorePaths: js.UndefOr[js.Array[String]] = js.native
}

object AutoLoggingOptions {
  @scala.inline
  def apply(): AutoLoggingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoLoggingOptions]
  }
  @scala.inline
  implicit class AutoLoggingOptionsOps[Self <: AutoLoggingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPath(value: /* req */ IncomingMessage => js.UndefOr[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPath")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnorePaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorePaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePaths")(js.undefined)
        ret
    }
  }
  
}

