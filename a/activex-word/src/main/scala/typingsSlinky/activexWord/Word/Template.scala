package typingsSlinky.activexWord.Word

import typingsSlinky.activexOffice.Office.DocumentProperties
import typingsSlinky.activexOffice.Office.DocumentProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val AutoTextEntries: typingsSlinky.activexWord.Word.AutoTextEntries = js.native
  val BuildingBlockEntries: typingsSlinky.activexWord.Word.BuildingBlockEntries = js.native
  val BuildingBlockTypes: typingsSlinky.activexWord.Word.BuildingBlockTypes = js.native
  @JSName("BuiltInDocumentProperties")
  val BuiltInDocumentProperties_Original: DocumentProperties[typingsSlinky.activexWord.Word.Application] = js.native
  val Creator: Double = js.native
  @JSName("CustomDocumentProperties")
  val CustomDocumentProperties_Original: DocumentProperties[typingsSlinky.activexWord.Word.Application] = js.native
  var FarEastLineBreakLanguage: WdFarEastLineBreakLanguageID = js.native
  var FarEastLineBreakLevel: WdFarEastLineBreakLevel = js.native
  val FullName: String = js.native
  var JustificationMode: WdJustificationMode = js.native
  var KerningByAlgorithm: Boolean = js.native
  var LanguageID: WdLanguageID = js.native
  var LanguageIDFarEast: WdLanguageID = js.native
  val ListTemplates: typingsSlinky.activexWord.Word.ListTemplates = js.native
  val Name: String = js.native
  var NoLineBreakAfter: String = js.native
  var NoLineBreakBefore: String = js.native
  var NoProofing: Double = js.native
  val Parent: js.Any = js.native
  val Path: String = js.native
  var Saved: Boolean = js.native
  val Type: WdTemplateType = js.native
  val VBProject: typingsSlinky.activexVbide.VBIDE.VBProject = js.native
  @JSName("Word.Template_typekey")
  var WordDotTemplate_typekey: Template = js.native
  def BuiltInDocumentProperties(index: String): DocumentProperty[typingsSlinky.activexWord.Word.Application] = js.native
  def BuiltInDocumentProperties(index: Double): DocumentProperty[typingsSlinky.activexWord.Word.Application] = js.native
  def CustomDocumentProperties(index: String): DocumentProperty[typingsSlinky.activexWord.Word.Application] = js.native
  def CustomDocumentProperties(index: Double): DocumentProperty[typingsSlinky.activexWord.Word.Application] = js.native
  def OpenAsDocument(): Document = js.native
  def Save(): Unit = js.native
}

