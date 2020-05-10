package typingsSlinky.axeCore

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFail extends js.Object {
  var fail: String = js.native
  var incomplete: String | StringDictionary[String] = js.native
  var pass: String = js.native
}

object AnonFail {
  @scala.inline
  def apply(fail: String, incomplete: String | StringDictionary[String], pass: String): AnonFail = {
    val __obj = js.Dynamic.literal(fail = fail.asInstanceOf[js.Any], incomplete = incomplete.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFail]
  }
  @scala.inline
  implicit class AnonFailOps[Self <: AnonFail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncomplete(value: String | StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pass")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

