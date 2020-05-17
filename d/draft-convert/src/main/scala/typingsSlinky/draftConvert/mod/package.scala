package typingsSlinky.draftConvert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ContentStateConverter = js.Function1[/* contentState */ typingsSlinky.draftJs.mod.ContentState, java.lang.String]
  type EntityKey = java.lang.String
  type htmlConverter = js.Function1[/* html */ java.lang.String, typingsSlinky.draftJs.mod.ContentState]
}
