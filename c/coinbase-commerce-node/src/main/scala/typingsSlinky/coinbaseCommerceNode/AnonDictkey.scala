package typingsSlinky.coinbaseCommerceNode

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.applicationSlashjson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var Accept: applicationSlashjson = js.native
  var `Content-Type`: applicationSlashjson = js.native
  var `User-Agent`: String = js.native
  var `X-CC-Api-Key`: String = js.native
  var `X-CC-Version`: String = js.native
}

object AnonDictkey {
  @scala.inline
  def apply(
    Accept: applicationSlashjson,
    `Content-Type`: applicationSlashjson,
    `User-Agent`: String,
    `X-CC-Api-Key`: String,
    `X-CC-Version`: String
  ): AnonDictkey = {
    val __obj = js.Dynamic.literal(Accept = Accept.asInstanceOf[js.Any])
    __obj.updateDynamic("Content-Type")(`Content-Type`.asInstanceOf[js.Any])
    __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
    __obj.updateDynamic("X-CC-Api-Key")(`X-CC-Api-Key`.asInstanceOf[js.Any])
    __obj.updateDynamic("X-CC-Version")(`X-CC-Version`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictkey]
  }
  @scala.inline
  implicit class AnonDictkeyOps[Self <: AnonDictkey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: applicationSlashjson): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withContent-Type`(value: applicationSlashjson): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content-Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withUser-Agent`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User-Agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withX-CC-Api-Key`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X-CC-Api-Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withX-CC-Version`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X-CC-Version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

