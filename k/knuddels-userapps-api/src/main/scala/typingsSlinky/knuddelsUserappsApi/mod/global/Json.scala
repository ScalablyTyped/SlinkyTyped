package typingsSlinky.knuddelsUserappsApi.mod.global

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.knuddelsUserappsApi.mod.JsonData
import typingsSlinky.knuddelsUserappsApi.mod._JsonData
import typingsSlinky.knuddelsUserappsApi.mod._KnuddelsEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Json
  extends /* x */ StringDictionary[js.UndefOr[JsonData]]
     with _JsonData
     with _KnuddelsEvent

object Json {
  @scala.inline
  def apply(StringDictionary: /* x */ StringDictionary[js.UndefOr[JsonData]] = null): Json = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Json]
  }
}

