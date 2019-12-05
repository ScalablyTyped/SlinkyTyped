package typingsSlinky.draftDashConvert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object draftDashConvertMod {
  import slinky.core.TagMod
  import typingsSlinky.draftDashJs.draftDashJsMod.ContentState

  type ContentStateConverter = js.Function1[/* contentState */ ContentState, String]
  type EntityKey = String
  /* Rewritten from type alias, can be one of: 
    - typings.react.reactMod.ReactNode
    - typings.draftDashConvert.Anon_Empty
    - typings.draftDashConvert.Anon_Element
  */
  type Tag = _Tag | TagMod[Any]
  type htmlConverter = js.Function1[/* html */ String, ContentState]
}
