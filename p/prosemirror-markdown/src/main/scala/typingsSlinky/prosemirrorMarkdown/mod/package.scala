package typingsSlinky.prosemirrorMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type MarkSerializerMethod[S /* <: typingsSlinky.prosemirrorModel.mod.Schema[_, _] */] = js.Function4[
    /* state */ typingsSlinky.prosemirrorMarkdown.mod.MarkdownSerializerState[S], 
    /* mark */ typingsSlinky.prosemirrorModel.mod.Mark[S], 
    /* parent */ typingsSlinky.prosemirrorModel.mod.Fragment[S], 
    /* index */ scala.Double, 
    scala.Unit
  ]
}
