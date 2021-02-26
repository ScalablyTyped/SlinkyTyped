package typingsSlinky.k6.htmlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NodeType extends StObject
@JSImport("k6/html", "NodeType")
@js.native
object NodeType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeType with Double] = js.native
  
  @js.native
  sealed trait CommentNode extends NodeType
  /* 8 */ val CommentNode: typingsSlinky.k6.htmlMod.NodeType.CommentNode with Double = js.native
  
  @js.native
  sealed trait DoctypeNode extends NodeType
  /* 10 */ val DoctypeNode: typingsSlinky.k6.htmlMod.NodeType.DoctypeNode with Double = js.native
  
  @js.native
  sealed trait DocumentNode extends NodeType
  /* 9 */ val DocumentNode: typingsSlinky.k6.htmlMod.NodeType.DocumentNode with Double = js.native
  
  @js.native
  sealed trait ElementNode extends NodeType
  /* 1 */ val ElementNode: typingsSlinky.k6.htmlMod.NodeType.ElementNode with Double = js.native
  
  @js.native
  sealed trait TextNode extends NodeType
  /* 3 */ val TextNode: typingsSlinky.k6.htmlMod.NodeType.TextNode with Double = js.native
}
