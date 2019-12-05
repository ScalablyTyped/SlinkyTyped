package typingsSlinky.jsdocDashToDashMarkdown

import typingsSlinky.jsdocDashToDashMarkdown.jsdocDashToDashMarkdownMod.MemberIndexFormat
import typingsSlinky.jsdocDashToDashMarkdown.jsdocDashToDashMarkdownMod.RenderListFormat
import typingsSlinky.jsdocDashToDashMarkdown.jsdocDashToDashMarkdownMod.StyleListFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jsdocDashToDashMarkdownStrings {
  @js.native
  sealed trait dl extends StyleListFormat
  
  @js.native
  sealed trait grouped
    extends MemberIndexFormat
       with StyleListFormat
  
  @js.native
  sealed trait list
    extends MemberIndexFormat
       with RenderListFormat
  
  @js.native
  sealed trait none extends StyleListFormat
  
  @js.native
  sealed trait table
    extends RenderListFormat
       with StyleListFormat
  
  @scala.inline
  def dl: dl = "dl".asInstanceOf[dl]
  @scala.inline
  def grouped: grouped = "grouped".asInstanceOf[grouped]
  @scala.inline
  def list: list = "list".asInstanceOf[list]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def table: table = "table".asInstanceOf[table]
}

