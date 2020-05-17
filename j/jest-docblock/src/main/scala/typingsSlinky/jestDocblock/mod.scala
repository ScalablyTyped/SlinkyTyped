package typingsSlinky.jestDocblock

import typingsSlinky.jestDocblock.anon.Comments
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-docblock/build", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def extract(contents: String): String = js.native
  def parse(docblock: String): Pragmas = js.native
  def parseWithComments(docblock: String): Comments = js.native
  def print(hasCommentsPragmas: typingsSlinky.jestDocblock.anon.Pragmas): String = js.native
  def strip(contents: String): String = js.native
  type Pragmas = Record[String, String | js.Array[String]]
}

