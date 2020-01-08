package typingsSlinky.jsonDashFormDashData.jsonDashFormDashDataMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.FileList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidJSON
  extends /* key */ StringDictionary[ValidJSON | ValidJSONValue | js.Array[ValidJSONValue] | FileList]

object ValidJSON {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[
      ValidJSON | ValidJSONValue | js.Array[ValidJSONValue] | org.scalajs.dom.raw.FileList
    ] = null
  ): ValidJSON = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ValidJSON]
  }
}

