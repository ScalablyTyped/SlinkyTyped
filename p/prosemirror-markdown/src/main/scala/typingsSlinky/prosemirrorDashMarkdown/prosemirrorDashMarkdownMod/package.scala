package typingsSlinky.prosemirrorDashMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object prosemirrorDashMarkdownMod {
  import typingsSlinky.prosemirrorDashModel.prosemirrorDashModelMod.Fragment
  import typingsSlinky.prosemirrorDashModel.prosemirrorDashModelMod.Mark
  import typingsSlinky.prosemirrorDashModel.prosemirrorDashModelMod.Schema

  type MarkSerializerMethod[S /* <: Schema[_, _] */] = js.Function4[
    /* state */ MarkdownSerializerState[S], 
    /* mark */ Mark[S], 
    /* parent */ Fragment[S], 
    /* index */ Double, 
    Unit
  ]
}
