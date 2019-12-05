package typingsSlinky.officeDashJsDashPreview.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListNumbering extends js.Object

/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.ListNumbering")
@js.native
object ListNumbering extends js.Object {
  @js.native
  sealed trait arabic extends ListNumbering
  
  @js.native
  sealed trait lowerLetter extends ListNumbering
  
  @js.native
  sealed trait lowerRoman extends ListNumbering
  
  @js.native
  sealed trait none extends ListNumbering
  
  @js.native
  sealed trait upperLetter extends ListNumbering
  
  @js.native
  sealed trait upperRoman extends ListNumbering
  
  /* "Arabic" */ val arabic: typingsSlinky.officeDashJsDashPreview.Word.ListNumbering.arabic with String = js.native
  /* "LowerLetter" */ val lowerLetter: typingsSlinky.officeDashJsDashPreview.Word.ListNumbering.lowerLetter with String = js.native
  /* "LowerRoman" */ val lowerRoman: typingsSlinky.officeDashJsDashPreview.Word.ListNumbering.lowerRoman with String = js.native
  /* "None" */ val none: typingsSlinky.officeDashJsDashPreview.Word.ListNumbering.none with String = js.native
  /* "UpperLetter" */ val upperLetter: typingsSlinky.officeDashJsDashPreview.Word.ListNumbering.upperLetter with String = js.native
  /* "UpperRoman" */ val upperRoman: typingsSlinky.officeDashJsDashPreview.Word.ListNumbering.upperRoman with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListNumbering with String] = js.native
}

