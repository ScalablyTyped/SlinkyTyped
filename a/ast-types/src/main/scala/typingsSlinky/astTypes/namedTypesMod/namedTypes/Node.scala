package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node extends Printable {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var `type`: String = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.Node")
@js.native
object Node extends TopLevel[Type[Node]]
