package typingsSlinky.hexoDashUtil

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var segments: js.UndefOr[StringDictionary[String | js.RegExp]] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(segments: StringDictionary[String | js.RegExp] = null): Anon_Name = {
    val __obj = js.Dynamic.literal()
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Name]
  }
}

