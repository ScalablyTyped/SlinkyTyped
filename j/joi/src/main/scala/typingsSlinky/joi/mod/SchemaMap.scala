package typingsSlinky.joi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaMap
  extends /* key */ StringDictionary[SchemaLike | js.Array[SchemaLike]]
     with SchemaLike

object SchemaMap {
  @scala.inline
  def apply(): SchemaMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMap]
  }
}

