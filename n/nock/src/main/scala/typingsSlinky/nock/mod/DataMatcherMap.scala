package typingsSlinky.nock.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataMatcherMap
  extends /* key */ StringDictionary[DataMatcher]
     with DataMatcher
     with RequestBodyMatcher

object DataMatcherMap {
  @scala.inline
  def apply(): DataMatcherMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataMatcherMap]
  }
}

