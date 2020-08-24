package typingsSlinky.draftConvert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ContentStateConverter = js.Function1[/* contentState */ typingsSlinky.draftJs.mod.ContentState, java.lang.String]
  type EntityKey = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.react.mod.ReactNode
    - typingsSlinky.draftConvert.anon.Empty
    - typingsSlinky.draftConvert.anon.Element
  */
  type Tag = typingsSlinky.draftConvert.mod._Tag | slinky.core.facade.ReactElement
  type htmlConverter = js.Function1[/* html */ java.lang.String, typingsSlinky.draftJs.mod.ContentState]
}
