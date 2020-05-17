package typingsSlinky.babelCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  /**
    * The file that the user requested, e.g. `"@babel/env"`
    */
  var request: String = js.native
  /**
    * The full path of the resolved file, e.g. `"/tmp/node_modules/@babel/preset-env/lib/index.js"`
    */
  var resolved: String = js.native
}

object Request {
  @scala.inline
  def apply(request: String, resolved: String): Request = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolved(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolved")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

