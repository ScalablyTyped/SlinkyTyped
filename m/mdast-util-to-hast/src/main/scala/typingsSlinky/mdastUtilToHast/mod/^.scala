package typingsSlinky.mdastUtilToHast.mod

import typingsSlinky.unist.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mdast-util-to-hast", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Transform the given [mdast](https://github.com/syntax-tree/mdast)
    * [tree](https://github.com/syntax-tree/unist#tree) to a
    * [hast](https://github.com/syntax-tree/hast) [tree](https://github.com/syntax-tree/unist#tree).
    */
  def apply(node: Node): Node = js.native
  def apply(node: Node, options: Options): Node = js.native
}
