package typingsSlinky.markdownIt.stateBlockMod

import typingsSlinky.markdownIt.markdownItStrings.blockquote
import typingsSlinky.markdownIt.markdownItStrings.list
import typingsSlinky.markdownIt.markdownItStrings.paragraph
import typingsSlinky.markdownIt.markdownItStrings.reference
import typingsSlinky.markdownIt.markdownItStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateBlock
  extends typingsSlinky.markdownIt.stateCoreMod.^ {
  var bMarks: js.Array[Double] = js.native
  var blkIndent: Double = js.native
  var bsCount: js.Array[Double] = js.native
  var ddIndent: Double = js.native
  var eMarks: js.Array[Double] = js.native
  var line: Double = js.native
  var lineMax: Double = js.native
  /** Used in lists to determine if they interrupt a paragraph */
  var parentType: blockquote | list | root | paragraph | reference = js.native
  var sCount: js.Array[Double] = js.native
  var tShift: js.Array[Double] = js.native
  var tight: Boolean = js.native
}

