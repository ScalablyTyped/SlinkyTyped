package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sections extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val First: Section = js.native
  val Last: Section = js.native
  var PageSetup: typingsSlinky.activexWord.Word.PageSetup = js.native
  val Parent: js.Any = js.native
  @JSName("Word.Sections_typekey")
  var WordDotSections_typekey: Sections = js.native
  def Add(): Section = js.native
  def Add(Range: js.UndefOr[scala.Nothing], Start: js.Any): Section = js.native
  def Add(Range: js.Any): Section = js.native
  def Add(Range: js.Any, Start: js.Any): Section = js.native
  def Item(Index: Double): Section = js.native
}

