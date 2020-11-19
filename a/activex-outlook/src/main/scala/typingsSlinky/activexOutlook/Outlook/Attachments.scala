package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attachments extends js.Object {
  
  def Add(Source: js.Any): Attachment = js.native
  def Add(
    Source: js.Any,
    Type: js.UndefOr[scala.Nothing],
    Position: js.UndefOr[scala.Nothing],
    DisplayName: js.Any
  ): Attachment = js.native
  def Add(Source: js.Any, Type: js.UndefOr[scala.Nothing], Position: js.Any): Attachment = js.native
  def Add(Source: js.Any, Type: js.UndefOr[scala.Nothing], Position: js.Any, DisplayName: js.Any): Attachment = js.native
  def Add(Source: js.Any, Type: js.Any): Attachment = js.native
  def Add(Source: js.Any, Type: js.Any, Position: js.UndefOr[scala.Nothing], DisplayName: js.Any): Attachment = js.native
  def Add(Source: js.Any, Type: js.Any, Position: js.Any): Attachment = js.native
  def Add(Source: js.Any, Type: js.Any, Position: js.Any, DisplayName: js.Any): Attachment = js.native
  
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def Item(Index: js.Any): Attachment = js.native
  
  @JSName("Outlook.Attachments_typekey")
  var OutlookDotAttachments_typekey: Attachments = js.native
  
  val Parent: js.Any = js.native
  
  def Remove(Index: Double): Unit = js.native
  
  val Session: NameSpace = js.native
}
