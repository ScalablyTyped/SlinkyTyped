package typingsSlinky.angularCommon.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCommon.angularCommonStrings.events
import typingsSlinky.angularCommon.angularCommonStrings.json
import typingsSlinky.angularCommon.httpHttpMod.HttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObserveResponseType extends js.Object {
  var headers: js.UndefOr[HttpHeaders | (StringDictionary[String | js.Array[String]])] = js.native
  var observe: events = js.native
  var responseType: js.UndefOr[json] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object ObserveResponseType {
  @scala.inline
  def apply(observe: events): ObserveResponseType = {
    val __obj = js.Dynamic.literal(observe = observe.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserveResponseType]
  }
  @scala.inline
  implicit class ObserveResponseTypeOps[Self <: ObserveResponseType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObserve(value: events): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: HttpHeaders | (StringDictionary[String | js.Array[String]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseType(value: json): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(js.undefined)
        ret
    }
    @scala.inline
    def withWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(js.undefined)
        ret
    }
  }
  
}

