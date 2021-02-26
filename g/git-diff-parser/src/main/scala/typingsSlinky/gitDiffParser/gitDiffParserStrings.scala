package typingsSlinky.gitDiffParser

import typingsSlinky.gitDiffParser.mod.LineType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gitDiffParserStrings {
  
  @js.native
  sealed trait added extends LineType
  @scala.inline
  def added: added = "added".asInstanceOf[added]
  
  @js.native
  sealed trait deleted extends LineType
  @scala.inline
  def deleted: deleted = "deleted".asInstanceOf[deleted]
  
  @js.native
  sealed trait normal extends LineType
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
}
