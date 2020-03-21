package typingsSlinky.mdast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mdast.mdastStrings.left
    - typingsSlinky.mdast.mdastStrings.right
    - typingsSlinky.mdast.mdastStrings.center
    - scala.Null
  */
  type AlignType = typingsSlinky.mdast.mod._AlignType | scala.Null
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mdast.mod.TopLevelContent
    - typingsSlinky.mdast.mod.ListContent
    - typingsSlinky.mdast.mod.TableContent
    - typingsSlinky.mdast.mod.RowContent
    - typingsSlinky.mdast.mod.PhrasingContent
  */
  type Content = typingsSlinky.mdast.mod._Content | typingsSlinky.mdast.mod.ListContent | typingsSlinky.mdast.mod.TableContent | typingsSlinky.mdast.mod.RowContent | typingsSlinky.mdast.mod.FrontmatterContent
  type FrontmatterContent = typingsSlinky.mdast.mod.YAML
  type ListContent = typingsSlinky.mdast.mod.ListItem
  type RowContent = typingsSlinky.mdast.mod.TableCell
  type TableContent = typingsSlinky.mdast.mod.TableRow
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mdast.mod.BlockContent
    - typingsSlinky.mdast.mod.FrontmatterContent
    - typingsSlinky.mdast.mod.DefinitionContent
  */
  type TopLevelContent = typingsSlinky.mdast.mod._TopLevelContent | typingsSlinky.mdast.mod.FrontmatterContent
}
