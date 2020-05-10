package typingsSlinky.clearbladejsNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Code extends js.Object {
  var URI: String = js.native
  var URIPrefix: String = js.native
  var callTimeout: Double = js.native
  var systemKey: String = js.native
  var systemSecret: String = js.native
  var user: APIUser = js.native
  def execute(name: String, params: js.Object, callback: CbCallback): Unit = js.native
}

object Code {
  @scala.inline
  def apply(
    URI: String,
    URIPrefix: String,
    callTimeout: Double,
    execute: (String, js.Object, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    user: APIUser
  ): Code = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], URIPrefix = URIPrefix.asInstanceOf[js.Any], callTimeout = callTimeout.asInstanceOf[js.Any], execute = js.Any.fromFunction3(execute), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  @scala.inline
  implicit class CodeOps[Self <: Code] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withURIPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URIPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecute(value: (String, js.Object, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSystemKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: APIUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

