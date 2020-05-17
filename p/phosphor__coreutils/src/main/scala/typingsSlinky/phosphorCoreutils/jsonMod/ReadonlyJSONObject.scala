package typingsSlinky.phosphorCoreutils.jsonMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadonlyJSONObject
  extends /* key */ StringDictionary[ReadonlyJSONValue]
     with ReadonlyJSONValue

object ReadonlyJSONObject {
  @scala.inline
  def apply(): ReadonlyJSONObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyJSONObject]
  }
}

