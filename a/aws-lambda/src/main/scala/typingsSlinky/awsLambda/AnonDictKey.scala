package typingsSlinky.awsLambda

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictKey
  extends /* Key */ StringDictionary[js.Any] {
  var ServiceToken: String = js.native
}

object AnonDictKey {
  @scala.inline
  def apply(ServiceToken: String): AnonDictKey = {
    val __obj = js.Dynamic.literal(ServiceToken = ServiceToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictKey]
  }
  @scala.inline
  implicit class AnonDictKeyOps[Self <: AnonDictKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceToken")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

