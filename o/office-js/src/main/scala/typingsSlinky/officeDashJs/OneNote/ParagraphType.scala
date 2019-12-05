package typingsSlinky.officeDashJs.OneNote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphType extends js.Object

/**
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.ParagraphType")
@js.native
object ParagraphType extends js.Object {
  @js.native
  sealed trait image extends ParagraphType
  
  @js.native
  sealed trait ink extends ParagraphType
  
  @js.native
  sealed trait other extends ParagraphType
  
  @js.native
  sealed trait richText extends ParagraphType
  
  @js.native
  sealed trait table extends ParagraphType
  
  /* "Image" */ val image: typingsSlinky.officeDashJs.OneNote.ParagraphType.image with String = js.native
  /* "Ink" */ val ink: typingsSlinky.officeDashJs.OneNote.ParagraphType.ink with String = js.native
  /* "Other" */ val other: typingsSlinky.officeDashJs.OneNote.ParagraphType.other with String = js.native
  /* "RichText" */ val richText: typingsSlinky.officeDashJs.OneNote.ParagraphType.richText with String = js.native
  /* "Table" */ val table: typingsSlinky.officeDashJs.OneNote.ParagraphType.table with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ParagraphType with String] = js.native
}

