package typingsSlinky.aliApp

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuthCode extends js.Object {
  var authCode: String = js.native
  	// 授权码
  var authErrorScope: StringDictionary[Double] = js.native
  	// 失败的授权类型，key是授权失败的 scope，value 是对应的错误码
  var authSucessScope: js.Array[String] = js.native
}

object AnonAuthCode {
  @scala.inline
  def apply(authCode: String, authErrorScope: StringDictionary[Double], authSucessScope: js.Array[String]): AnonAuthCode = {
    val __obj = js.Dynamic.literal(authCode = authCode.asInstanceOf[js.Any], authErrorScope = authErrorScope.asInstanceOf[js.Any], authSucessScope = authSucessScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthCode]
  }
  @scala.inline
  implicit class AnonAuthCodeOps[Self <: AnonAuthCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthErrorScope(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authErrorScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthSucessScope(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authSucessScope")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

