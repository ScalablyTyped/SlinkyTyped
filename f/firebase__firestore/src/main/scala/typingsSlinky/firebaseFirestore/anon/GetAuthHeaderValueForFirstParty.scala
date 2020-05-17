package typingsSlinky.firebaseFirestore.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAuthHeaderValueForFirstParty extends js.Object {
  def getAuthHeaderValueForFirstParty(userIdentifiers: js.Array[StringDictionary[String]]): String | Null = js.native
}

object GetAuthHeaderValueForFirstParty {
  @scala.inline
  def apply(getAuthHeaderValueForFirstParty: js.Array[StringDictionary[String]] => String | Null): GetAuthHeaderValueForFirstParty = {
    val __obj = js.Dynamic.literal(getAuthHeaderValueForFirstParty = js.Any.fromFunction1(getAuthHeaderValueForFirstParty))
    __obj.asInstanceOf[GetAuthHeaderValueForFirstParty]
  }
  @scala.inline
  implicit class GetAuthHeaderValueForFirstPartyOps[Self <: GetAuthHeaderValueForFirstParty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAuthHeaderValueForFirstParty(value: js.Array[StringDictionary[String]] => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAuthHeaderValueForFirstParty")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

