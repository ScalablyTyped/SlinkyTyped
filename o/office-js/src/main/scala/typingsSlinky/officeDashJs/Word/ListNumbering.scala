package typingsSlinky.officeDashJs.Word

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
  
  /* "Arabic" */ val arabic: typingsSlinky.officeDashJs.Word.ListNumbering.arabic with String = js.native
  /* "LowerLetter" */ val lowerLetter: typingsSlinky.officeDashJs.Word.ListNumbering.lowerLetter with String = js.native
  /* "LowerRoman" */ val lowerRoman: typingsSlinky.officeDashJs.Word.ListNumbering.lowerRoman with String = js.native
  /* "None" */ val none: typingsSlinky.officeDashJs.Word.ListNumbering.none with String = js.native
  /* "UpperLetter" */ val upperLetter: typingsSlinky.officeDashJs.Word.ListNumbering.upperLetter with String = js.native
  /* "UpperRoman" */ val upperRoman: typingsSlinky.officeDashJs.Word.ListNumbering.upperRoman with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListNumbering with String] = js.native
}

