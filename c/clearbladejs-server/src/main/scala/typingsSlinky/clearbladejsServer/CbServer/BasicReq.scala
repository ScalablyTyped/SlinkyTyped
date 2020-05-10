package typingsSlinky.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicReq extends js.Object {
  val isLogging: Boolean = js.native
  val params: StringDictionary[js.Any] = js.native
  val systemKey: String = js.native
  val systemSecret: String = js.native
  val userEmail: String = js.native
  val userToken: String = js.native
  val userid: String = js.native
}

object BasicReq {
  @scala.inline
  def apply(
    isLogging: Boolean,
    params: StringDictionary[js.Any],
    systemKey: String,
    systemSecret: String,
    userEmail: String,
    userToken: String,
    userid: String
  ): BasicReq = {
    val __obj = js.Dynamic.literal(isLogging = isLogging.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], userEmail = userEmail.asInstanceOf[js.Any], userToken = userToken.asInstanceOf[js.Any], userid = userid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicReq]
  }
  @scala.inline
  implicit class BasicReqOps[Self <: BasicReq] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLogging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
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
    def withUserEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

