package typingsSlinky.firebaseInstallations.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  requestName  :string, [index: string] : string | number} & @firebase/installations.@firebase/installations/dist/src/util/errors.ServerErrorData */
@js.native
trait requestNamestringindexstr extends /* index */ StringDictionary[String | Double] {
  var requestName: String = js.native
  var serverCode: Double = js.native
  var serverMessage: String = js.native
  var serverStatus: String = js.native
}

object requestNamestringindexstr {
  @scala.inline
  def apply(requestName: String, serverCode: Double, serverMessage: String, serverStatus: String): requestNamestringindexstr = {
    val __obj = js.Dynamic.literal(requestName = requestName.asInstanceOf[js.Any], serverCode = serverCode.asInstanceOf[js.Any], serverMessage = serverMessage.asInstanceOf[js.Any], serverStatus = serverStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[requestNamestringindexstr]
  }
  @scala.inline
  implicit class requestNamestringindexstrOps[Self <: requestNamestringindexstr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverStatus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

