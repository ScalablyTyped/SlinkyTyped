package typingsSlinky.reactNativeFirebase.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TIMESTAMP extends js.Object {
  var TIMESTAMP: StringDictionary[String] = js.native
}

object TIMESTAMP {
  @scala.inline
  def apply(TIMESTAMP: StringDictionary[String]): TIMESTAMP = {
    val __obj = js.Dynamic.literal(TIMESTAMP = TIMESTAMP.asInstanceOf[js.Any])
    __obj.asInstanceOf[TIMESTAMP]
  }
  @scala.inline
  implicit class TIMESTAMPOps[Self <: TIMESTAMP] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTIMESTAMP(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TIMESTAMP")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

