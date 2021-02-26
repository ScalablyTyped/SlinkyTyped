package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TablesOfFigures extends StObject {
  
  def Add(
    Range: Range,
    Caption: js.UndefOr[js.Any],
    IncludeLabel: js.UndefOr[js.Any],
    UseHeadingStyles: js.UndefOr[js.Any],
    UpperHeadingLevel: js.UndefOr[js.Any],
    LowerHeadingLevel: js.UndefOr[js.Any],
    UseFields: js.UndefOr[js.Any],
    TableID: js.UndefOr[js.Any],
    RightAlignPageNumbers: js.UndefOr[js.Any],
    IncludePageNumbers: js.UndefOr[js.Any],
    AddedStyles: js.UndefOr[js.Any],
    UseHyperlinks: js.UndefOr[js.Any],
    HidePageNumbersInWeb: js.UndefOr[js.Any]
  ): TableOfFigures = js.native
  
  def AddOld(
    Range: Range,
    Caption: js.UndefOr[js.Any],
    IncludeLabel: js.UndefOr[js.Any],
    UseHeadingStyles: js.UndefOr[js.Any],
    UpperHeadingLevel: js.UndefOr[js.Any],
    LowerHeadingLevel: js.UndefOr[js.Any],
    UseFields: js.UndefOr[js.Any],
    TableID: js.UndefOr[js.Any],
    RightAlignPageNumbers: js.UndefOr[js.Any],
    IncludePageNumbers: js.UndefOr[js.Any],
    AddedStyles: js.UndefOr[js.Any]
  ): TableOfFigures = js.native
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  var Format: WdTofFormat = js.native
  
  def Item(Index: Double): TableOfFigures = js.native
  
  def MarkEntry(Range: Range): Field = js.native
  def MarkEntry(
    Range: Range,
    Entry: js.UndefOr[scala.Nothing],
    EntryAutoText: js.UndefOr[scala.Nothing],
    TableID: js.UndefOr[scala.Nothing],
    Level: js.Any
  ): Field = js.native
  def MarkEntry(
    Range: Range,
    Entry: js.UndefOr[scala.Nothing],
    EntryAutoText: js.UndefOr[scala.Nothing],
    TableID: js.Any
  ): Field = js.native
  def MarkEntry(
    Range: Range,
    Entry: js.UndefOr[scala.Nothing],
    EntryAutoText: js.UndefOr[scala.Nothing],
    TableID: js.Any,
    Level: js.Any
  ): Field = js.native
  def MarkEntry(Range: Range, Entry: js.UndefOr[scala.Nothing], EntryAutoText: js.Any): Field = js.native
  def MarkEntry(
    Range: Range,
    Entry: js.UndefOr[scala.Nothing],
    EntryAutoText: js.Any,
    TableID: js.UndefOr[scala.Nothing],
    Level: js.Any
  ): Field = js.native
  def MarkEntry(Range: Range, Entry: js.UndefOr[scala.Nothing], EntryAutoText: js.Any, TableID: js.Any): Field = js.native
  def MarkEntry(
    Range: Range,
    Entry: js.UndefOr[scala.Nothing],
    EntryAutoText: js.Any,
    TableID: js.Any,
    Level: js.Any
  ): Field = js.native
  def MarkEntry(Range: Range, Entry: js.Any): Field = js.native
  def MarkEntry(
    Range: Range,
    Entry: js.Any,
    EntryAutoText: js.UndefOr[scala.Nothing],
    TableID: js.UndefOr[scala.Nothing],
    Level: js.Any
  ): Field = js.native
  def MarkEntry(Range: Range, Entry: js.Any, EntryAutoText: js.UndefOr[scala.Nothing], TableID: js.Any): Field = js.native
  def MarkEntry(
    Range: Range,
    Entry: js.Any,
    EntryAutoText: js.UndefOr[scala.Nothing],
    TableID: js.Any,
    Level: js.Any
  ): Field = js.native
  def MarkEntry(Range: Range, Entry: js.Any, EntryAutoText: js.Any): Field = js.native
  def MarkEntry(
    Range: Range,
    Entry: js.Any,
    EntryAutoText: js.Any,
    TableID: js.UndefOr[scala.Nothing],
    Level: js.Any
  ): Field = js.native
  def MarkEntry(Range: Range, Entry: js.Any, EntryAutoText: js.Any, TableID: js.Any): Field = js.native
  def MarkEntry(Range: Range, Entry: js.Any, EntryAutoText: js.Any, TableID: js.Any, Level: js.Any): Field = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.TablesOfFigures_typekey")
  var WordDotTablesOfFigures_typekey: TablesOfFigures = js.native
}
