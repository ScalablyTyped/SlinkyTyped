package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Research extends js.Object {
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  var FavoriteService: String = js.native
  
  def IsResearchService(ServiceID: String): Boolean = js.native
  
  val Parent: js.Any = js.native
  
  /**
    * @param string [QueryString='']
    * @param Word.WdLanguageID [QueryLanguage=0]
    * @param boolean [UseSelection=false]
    * @param boolean [LaunchQuery=true]
    */
  def Query(ServiceID: String): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: js.UndefOr[scala.Nothing],
    QueryLanguage: js.UndefOr[scala.Nothing],
    UseSelection: js.UndefOr[scala.Nothing],
    LaunchQuery: Boolean
  ): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: js.UndefOr[scala.Nothing],
    QueryLanguage: js.UndefOr[scala.Nothing],
    UseSelection: Boolean
  ): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: js.UndefOr[scala.Nothing],
    QueryLanguage: js.UndefOr[scala.Nothing],
    UseSelection: Boolean,
    LaunchQuery: Boolean
  ): js.Any = js.native
  def Query(ServiceID: String, QueryString: js.UndefOr[scala.Nothing], QueryLanguage: WdLanguageID): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: js.UndefOr[scala.Nothing],
    QueryLanguage: WdLanguageID,
    UseSelection: js.UndefOr[scala.Nothing],
    LaunchQuery: Boolean
  ): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: js.UndefOr[scala.Nothing],
    QueryLanguage: WdLanguageID,
    UseSelection: Boolean
  ): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: js.UndefOr[scala.Nothing],
    QueryLanguage: WdLanguageID,
    UseSelection: Boolean,
    LaunchQuery: Boolean
  ): js.Any = js.native
  def Query(ServiceID: String, QueryString: String): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: String,
    QueryLanguage: js.UndefOr[scala.Nothing],
    UseSelection: js.UndefOr[scala.Nothing],
    LaunchQuery: Boolean
  ): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: String,
    QueryLanguage: js.UndefOr[scala.Nothing],
    UseSelection: Boolean
  ): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: String,
    QueryLanguage: js.UndefOr[scala.Nothing],
    UseSelection: Boolean,
    LaunchQuery: Boolean
  ): js.Any = js.native
  def Query(ServiceID: String, QueryString: String, QueryLanguage: WdLanguageID): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: String,
    QueryLanguage: WdLanguageID,
    UseSelection: js.UndefOr[scala.Nothing],
    LaunchQuery: Boolean
  ): js.Any = js.native
  def Query(ServiceID: String, QueryString: String, QueryLanguage: WdLanguageID, UseSelection: Boolean): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: String,
    QueryLanguage: WdLanguageID,
    UseSelection: Boolean,
    LaunchQuery: Boolean
  ): js.Any = js.native
  
  def SetLanguagePair(LanguageFrom: WdLanguageID, LanguageTo: WdLanguageID): js.Any = js.native
  
  @JSName("Word.Research_typekey")
  var WordDotResearch_typekey: Research = js.native
}
