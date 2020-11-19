package typingsSlinky.gitDiffParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents prefix in `git diff` output: '+', '-', or space */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gitDiffParser.gitDiffParserStrings.deleted
  - typingsSlinky.gitDiffParser.gitDiffParserStrings.added
  - typingsSlinky.gitDiffParser.gitDiffParserStrings.normal
*/
trait LineType extends js.Object
object LineType {
  
  @scala.inline
  def added: typingsSlinky.gitDiffParser.gitDiffParserStrings.added = "added".asInstanceOf[typingsSlinky.gitDiffParser.gitDiffParserStrings.added]
  
  @scala.inline
  def deleted: typingsSlinky.gitDiffParser.gitDiffParserStrings.deleted = "deleted".asInstanceOf[typingsSlinky.gitDiffParser.gitDiffParserStrings.deleted]
  
  @scala.inline
  def normal: typingsSlinky.gitDiffParser.gitDiffParserStrings.normal = "normal".asInstanceOf[typingsSlinky.gitDiffParser.gitDiffParserStrings.normal]
}
