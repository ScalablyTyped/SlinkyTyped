package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endnote extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application
  val Creator: Double
  val Index: Double
  val Parent: js.Any
  val Range: typingsSlinky.activexWord.Word.Range
  val Reference: typingsSlinky.activexWord.Word.Range
  @JSName("Word.Endnote_typekey")
  var WordDotEndnote_typekey: Endnote
  def Delete(): Unit
}

object Endnote {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Index: Double,
    Parent: js.Any,
    Range: Range,
    Reference: Range,
    WordDotEndnote_typekey: Endnote
  ): Endnote = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Reference = Reference.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Endnote_typekey")(WordDotEndnote_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endnote]
  }
}

