package typingsSlinky.prosemirrorMarkdown.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.prosemirrorModel.mod.Node
import typingsSlinky.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-markdown", "MarkdownSerializer")
@js.native
class MarkdownSerializer[S /* <: Schema[_, _] */] protected () extends js.Object {
  def this(
    nodes: StringDictionary[
        js.Function4[
          /* state */ MarkdownSerializerState[S], 
          /* node */ Node[S], 
          /* parent */ Node[S], 
          /* index */ Double, 
          Unit
        ]
      ],
    marks: StringDictionary[MarkSerializerConfig[_]]
  ) = this()
  
  /**
    * The mark serializer info.
    */
  var marks: StringDictionary[js.Any] = js.native
  
  /**
    * The node serializer
    * functions for this serializer.
    */
  var nodes: StringDictionary[js.Function2[/* p1 */ MarkdownSerializerState[S], /* p2 */ Node[S], Unit]] = js.native
  
  /**
    * Serialize the content of the given node to
    * [CommonMark](http://commonmark.org/).
    */
  def serialize(content: Node[S]): String = js.native
  def serialize(content: Node[S], options: StringDictionary[js.Any]): String = js.native
}
