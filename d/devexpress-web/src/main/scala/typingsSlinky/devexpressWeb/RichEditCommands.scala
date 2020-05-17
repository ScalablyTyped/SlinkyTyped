package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a set of the available client commands.
  */
@js.native
trait RichEditCommands extends js.Object {
  /**
    * Gets a command to add spacing after a paragraph.
    */
  val addSpacingAfterParagraph: AddSpacingAfterParagraphCommand = js.native
  /**
    * Gets a command to add spacing before a paragraph.
    */
  val addSpacingBeforeParagraph: AddSpacingBeforeParagraphCommand = js.native
  /**
    * Gets a command to assign a shortcut to the specified client command.
    */
  val assignShortcut: AssignShortcutCommand = js.native
  /**
    * Gets a command to move the cursor backwards and erase characters in a selected range.
    */
  val backspace: BackspaceCommand = js.native
  /**
    * Gets a command to capitalize each word in the selected sentence.
    */
  val capitalizeEachWordTextCase: CapitalizeEachWordTextCaseCommand = js.native
  /**
    * Gets a command to customize the numbered list parameters.
    */
  val changeCustomNumberingList: ChangeCustomNumberingListCommand = js.native
  /**
    * Gets a command to change a floating object's absolute position.
    */
  val changeFloatingObjectAbsolutePosition: ChangeFloatingObjectAbsolutePositionCommand = js.native
  /**
    * Gets a command to change a floating object's absolute size.
    */
  val changeFloatingObjectAbsoluteSize: ChangeFloatingObjectAbsoluteSizeCommand = js.native
  /**
    * Gets a command to modify a floating object's alignment position.
    */
  val changeFloatingObjectAlignmentPosition: ChangeFloatingObjectAlignmentPositionCommand = js.native
  /**
    * Gets a command to modify a floating object's background fill color.
    */
  val changeFloatingObjectFillColor: ChangeFloatingObjectFillColorCommand = js.native
  /**
    * Gets a command to lock a floating object's anchor.
    */
  val changeFloatingObjectLockAnchor: ChangeFloatingObjectLockAnchorCommand = js.native
  /**
    * Gets a command to lock a floating object's aspect ratio.
    */
  val changeFloatingObjectLockAspectRatio: ChangeFloatingObjectLockAspectRatioCommand = js.native
  /**
    * Gets a command to modify a floating object's outline color.
    */
  val changeFloatingObjectOutlineColor: ChangeFloatingObjectOutlineColorCommand = js.native
  /**
    * Gets a command to modify a floating object's outline width.
    */
  val changeFloatingObjectOutlineWidth: ChangeFloatingObjectOutlineWidthCommand = js.native
  /**
    * Gets a command to modify a floating object's relative position.
    */
  val changeFloatingObjectRelativePosition: ChangeFloatingObjectRelativePositionCommand = js.native
  /**
    * Gets a command to rotate a floating object.
    */
  val changeFloatingObjectRotation: ChangeFloatingObjectRotationCommand = js.native
  /**
    * Gets a command to modify a floating object's text wrapping settings.
    */
  val changeFloatingObjectTextWrapping: ChangeFloatingObjectTextWrappingCommand = js.native
  /**
    * Gets a command to change the background color of characters in a selected range.
    */
  val changeFontBackColor: ChangeFontBackColorCommand = js.native
  /**
    * Gets a command to change the bold formatting of characters in a selected range.
    */
  val changeFontBold: ChangeFontBoldCommand = js.native
  /**
    * Gets a command to change the font color of characters in a selected range.
    */
  val changeFontForeColor: ChangeFontForeColorCommand = js.native
  /**
    * Gets a command to change the font formatting of characters in a selected range.
    */
  val changeFontFormatting: ChangeFontFormattingCommand = js.native
  /**
    * Gets a command to change the italic formatting of characters in a selected range.
    */
  val changeFontItalic: ChangeFontItalicCommand = js.native
  /**
    * Gets a command to change the font name of characters in a selected range.
    */
  val changeFontName: ChangeFontNameCommand = js.native
  /**
    * Gets a command to change the font size (in points) of characters in a selected range.
    */
  val changeFontSize: ChangeFontSizeCommand = js.native
  /**
    * Gets a command to change the strikeout formatting of characters in a selected range.
    */
  val changeFontStrikeout: ChangeFontStrikeoutCommand = js.native
  /**
    * Gets a command to change the subscript formatting of characters in a selected range.
    */
  val changeFontSubscript: ChangeFontSubscriptCommand = js.native
  /**
    * Gets a command to change the superscript formatting of characters in a selected range.
    */
  val changeFontSuperscript: ChangeFontSuperscriptCommand = js.native
  /**
    * Gets a command to change the underline formatting of characters in a selected range.
    */
  val changeFontUnderline: ChangeFontUnderlineCommand = js.native
  /**
    * Gets a command that changes the specified hyperlink.
    */
  val changeHyperlink: ChangeHyperlinkCommand = js.native
  /**
    * Gets a command to set the background color of all pages contained in the document.
    */
  val changePageColor: ChangePageColorCommand = js.native
  /**
    * Gets a command to apply page margins settings to sections located within a selected range.
    */
  val changePageMargins: ChangePageMarginsCommand = js.native
  /**
    * Gets a command to apply page orientation settings to sections located within a selected range.
    */
  val changePageOrientation: ChangePageOrientationCommand = js.native
  /**
    * Gets a command to apply page size settings to sections located within a selected range.
    */
  val changePageSize: ChangePageSizeCommand = js.native
  /**
    * Gets a command to change the background color of paragraphs in a selected range.
    */
  val changeParagraphBackColor: ChangeParagraphBackColorCommand = js.native
  /**
    * Gets a command to apply formatting settings to paragraphs within a selected range.
    */
  val changeParagraphFormatting: ChangeParagraphFormattingCommand = js.native
  /**
    * Gets a command to scale a selected in-line picture.
    */
  val changePictureScale: ChangePictureScaleCommand = js.native
  /**
    * Gets a command to apply column layout settings to a section.
    */
  val changeSectionColumns: ChangeSectionColumnsCommand = js.native
  /**
    * Gets a command to change the number of columns having the same width in a section.
    */
  val changeSectionEqualColumnCount: ChangeSectionEqualColumnCountCommand = js.native
  /**
    * Gets a command to apply a character or paragraph style settings to text in a selected range.
    */
  val changeStyle: ChangeStyleCommand = js.native
  /**
    * Gets a command to apply borders' drawing settings.
    */
  val changeTableBorderRepositoryItem: ChangeTableBorderRepositoryItemCommand = js.native
  /**
    * Gets a command to change the selected table's borders and shading.
    */
  val changeTableBordersAndShading: ChangeTableBordersAndShadingCommand = js.native
  /**
    * Gets a command to change the cell formatting of the selected table elements.
    */
  val changeTableCellFormatting: ChangeTableCellFormattingCommand = js.native
  /**
    * Gets a command to change the preferred cell width of the selected table rows.
    */
  val changeTableCellPreferredWidth: ChangeTableCellPreferredWidthCommand = js.native
  /**
    * Gets a command to change cell shading in selected table cells.
    */
  val changeTableCellShading: ChangeTableCellShadingCommand = js.native
  /**
    * Gets a command to change the selected table columns' preferred width.
    */
  val changeTableColumnPreferredWidth: ChangeTableColumnPreferredWidthCommand = js.native
  /**
    * Gets a command to change the selected table's formatting.
    */
  val changeTableFormatting: ChangeTableFormattingCommand = js.native
  /**
    * Gets a command to change the selected table's style options.
    */
  val changeTableLook: ChangeTableLookCommand = js.native
  /**
    * Gets a command to change the selected table rows' preferred height.
    */
  val changeTableRowPreferredHeight: ChangeTableRowPreferredHeightCommand = js.native
  /**
    * Gets a command to change the selected table's style.
    */
  val changeTableStyle: ChangeTableStyleCommand = js.native
  /**
    * Gets a command to change the default tab stop value of a document and apply custom tab settings to the selected paragraphs.
    */
  val changeTabs: ChangeTabsCommand = js.native
  /**
    * Gets a command to modify a text box's content margins.
    */
  val changeTextBoxContentMargins: ChangeTextBoxContentMarginsCommand = js.native
  /**
    * Gets a command to modify a text box's relative size settings.
    */
  val changeTextBoxRelativeSize: ChangeTextBoxRelativeSizeCommand = js.native
  /**
    * Gets a command to resize the shape to fit the text in the text box.
    */
  val changeTextBoxResizeShapeToFitText: ChangeTextBoxResizeShapeToFitTextCommand = js.native
  /**
    * Gets a command to change the Rich Edit's document view type.
    */
  val changeViewType: ChangeViewTypeCommand = js.native
  /**
    * Gets a command to reset textual and paragraph formatting in the selected range to default values.
    */
  val clearFormatting: ClearFormattingCommand = js.native
  /**
    * Gets a command to substitute a header/footer sub-document with the main sub-document as an active sub-document.
    */
  val closeHeaderFooter: CloseHeaderFooterCommand = js.native
  /**
    * Gets a command to continue the list's numbering.
    */
  val continueNumberingList: ContinueNumberingListCommand = js.native
  /**
    * Gets a command to copy the selected text and place it to the clipboard.
    */
  val copy: CopyCommand = js.native
  /**
    * Gets a command to copy the selected text and place it to the specified position.
    */
  val copyContent: CopyContentCommand = js.native
  /**
    * Gets a command to insert and update a field with a DATE code.
    */
  val createDateField: CreateDateFieldCommand = js.native
  /**
    * Gets a command to add a field at the current position in a document.
    */
  val createField: CreateFieldCommand = js.native
  /**
    * Gets a command to replace the selection with a MERGEFIELD (a data source column name is passed with a parameter).
    */
  val createMergeField: CreateMergeFieldCommand = js.native
  /**
    * Gets a command to replace the selection with a NUMPAGES field displaying the total number of pages.
    */
  val createPageCountField: CreatePageCountFieldCommand = js.native
  /**
    * Gets a command to replace the selection with a PAGE field displaying the current page number.
    */
  val createPageField: CreatePageFieldCommand = js.native
  /**
    * Gets a command to replace the selection with a TIME field displaying the current time.
    */
  val createTimeField: CreateTimeFieldCommand = js.native
  /**
    * Gets a command to cut the selected text and place it to the clipboard.
    */
  val cut: CutCommand = js.native
  /**
    * Gets a command to decrease the selected range's font size to the closest smaller predefined value (in points).
    */
  val decreaseFontSize: DecreaseFontSizeCommand = js.native
  /**
    * Gets a command to decrease the indent level of paragraphs in a selected range.
    */
  val decreaseIndent: DecreaseIndentCommand = js.native
  /**
    * Gets a command to decrement the indent level of paragraphs in a selected numbered list.
    */
  val decrementNumberingIndent: DecrementNumberingIndentCommand = js.native
  /**
    * Gets a command to decrement the paragraph's left indent position.
    */
  val decrementParagraphLeftIndent: DecrementParagraphLeftIndentCommand = js.native
  /**
    * Gets a command to delete text and in-line objects in a selected range.
    */
  val delete: DeleteCommand = js.native
  /**
    * Gets a command to delete a specific bookmark.
    */
  val deleteBookmark: DeleteBookmarkCommand = js.native
  /**
    * Gets a command to delete the selected hyperlink.
    */
  val deleteHyperlink: DeleteHyperlinkCommand = js.native
  /**
    * Gets a command to delete all hyperlinks in the selected range.
    */
  val deleteHyperlinks: DeleteHyperlinksCommand = js.native
  /**
    * Gets a command to delete the selected table.
    */
  val deleteTable: DeleteTableCommand = js.native
  /**
    * Gets a command to invoke the Delete Cells dialog window.
    */
  val deleteTableCellsDialog: DeleteTableCellsDialogCommand = js.native
  /**
    * Gets a command to delete the selected table cells with a horizontal shift.
    */
  val deleteTableCellsWithShiftHorizontally: DeleteTableCellsWithShiftHorizontallyCommand = js.native
  /**
    * Gets a command to delete the selected table cells with a vertical shift.
    */
  val deleteTableCellsWithShiftVertically: DeleteTableCellsWithShiftVerticallyCommand = js.native
  /**
    * Gets a command to delete the selected columns in the table.
    */
  val deleteTableColumns: DeleteTableColumnsCommand = js.native
  /**
    * Gets a command to delete the selected rows in the table.
    */
  val deleteTableRows: DeleteTableRowsCommand = js.native
  /**
    * Gets a command to download the document specifying the file's extension.
    */
  val fileDownload: FileDownloadCommand = js.native
  /**
    * Gets a command to create a new empty document.
    */
  val fileNew: FileNewCommand = js.native
  /**
    * Gets a command to open a document stored in the specified file.
    */
  val fileOpen: FileOpenCommand = js.native
  /**
    * Gets a command to invoke the File Open dialog allowing one to select and load a document file into RichEdit.
    */
  val fileOpenDialog: FileOpenDialogCommand = js.native
  /**
    * Gets a command to invoke a browser-specific Print dialog allowing one to print the current document.
    */
  val filePrint: FilePrintCommand = js.native
  /**
    * Gets a command to save the document at its original location on the server.
    */
  val fileSave: FileSaveCommand = js.native
  /**
    * Gets a command to save a document in a file with the specified path.
    */
  val fileSaveAs: FileSaveAsCommand = js.native
  /**
    * Gets a command to invoke the Save As dialog that prompts for a file name and saves the current document in a file with the specified path.
    */
  val fileSaveAsDialog: FileSaveAsDialogCommand = js.native
  /**
    * Gets a command to find all matches of the specified text in the document.
    */
  val findAll: FindAllCommand = js.native
  /**
    * Gets a command to force synchronizing the server document model with the client model and execute a callback function if it is necessary.
    */
  val forceSyncWithServer: ForceSyncWithServerCommand = js.native
  /**
    * Gets a command to receive RTF formatted content from the document in the specified range.
    */
  val getRtf: GetRtfCommand = js.native
  /**
    * Gets a command to navigate to the specified bookmark.
    */
  val goToBookmark: GoToBookmarkCommand = js.native
  /**
    * Gets a command to open the specified data record.
    */
  val goToDataRecord: GoToDataRecordCommand = js.native
  /**
    * Gets a command to navigate to the first data record.
    */
  val goToFirstDataRecord: GoToFirstDataRecordCommand = js.native
  /**
    * Gets a command to substitute a header sub-document with a footer sub-document of the same page as an active sub-document.
    */
  val goToFooter: GoToFooterCommand = js.native
  /**
    * Gets a command to substitute a footer sub-document with a header sub-document of the same page as an active sub-document.
    */
  val goToHeader: GoToHeaderCommand = js.native
  /**
    * Gets a command to navigate to the last data record of the bound data source.
    */
  val goToLastDataRecord: GoToLastDataRecordCommand = js.native
  /**
    * Gets a command to navigate to the next data record of the bound data source.
    */
  val goToNextDataRecord: GoToNextDataRecordCommand = js.native
  /**
    * Gets a command to substitute a current header/footer with a header/footer of the next section as an active sub-document.
    */
  val goToNextHeaderFooter: GoToNextHeaderFooterCommand = js.native
  /**
    * Gets a command to navigate to the previous data record of the bound data source.
    */
  val goToPreviousDataRecord: GoToPreviousDataRecordCommand = js.native
  /**
    * Gets a command to substitute a current header/footer with a header/footer of the previous section as an active sub-document.
    */
  val goToPreviousHeaderFooter: GoToPreviousHeaderFooterCommand = js.native
  /**
    * Gets a command to hide the search results.
    */
  val hideFindResults: HideFindResultsCommand = js.native
  /**
    * Gets a command to increase the font size of characters in a selected range to the closest larger predefined value (in points).
    */
  val increaseFontSize: IncreaseFontSizeCommand = js.native
  /**
    * Gets a command to increment the indent level of paragraphs in a selected range.
    */
  val increaseIndent: IncreaseIndentCommand = js.native
  /**
    * Gets a command to increment the indent level of paragraphs in a selected numbered list.
    */
  val incrementNumberingIndent: IncrementNumberingIndentCommand = js.native
  /**
    * Gets a command to increment the left indent of paragraphs in a selected range.
    */
  val incrementParagraphLeftIndent: IncrementParagraphLeftIndentCommand = js.native
  /**
    * Gets a command to insert a new bookmark that references the current selection.
    */
  val insertBookmark: InsertBookmarkCommand = js.native
  /**
    * Gets a command to insert a column break at the current position in the document.
    */
  val insertColumnBreak: InsertColumnBreakCommand = js.native
  /**
    * Gets a command to insert content created on the server to the client model.
    */
  val insertContentFromServer: InsertContentFromServerCommand = js.native
  /**
    * Gets a command to add a caption (numbered label) to an equation.
    */
  val insertEquationsCaption: InsertEquationsCaptionCommand = js.native
  /**
    * Gets a command to add a caption (numbered label) to a figure.
    */
  val insertFiguresCaption: InsertFiguresCaptionCommand = js.native
  /**
    * Gets a command to insert a floating text box.
    */
  val insertFloatingTextBox: InsertFloatingTextBoxCommand = js.native
  /**
    * Gets a command to create a footer sub-document (if it is not yet created) and set it as an active sub-document instead of the main sub-document.
    */
  val insertFooter: InsertFooterCommand = js.native
  /**
    * Gets a command to create a header sub-document (if it is not yet created) and set it as an active sub-document instead of the main sub-document.
    */
  val insertHeader: InsertHeaderCommand = js.native
  /**
    * Gets a command to add an HTML formatted content in place of a selected range.
    */
  val insertHtml: InsertHtmlCommand = js.native
  /**
    * Gets a command to insert and update a hyperlink field in place of a selected range.
    */
  val insertHyperlink: InsertHyperlinkCommand = js.native
  /**
    * Gets a command to insert the line break at the current position in the document.
    */
  val insertLineBreak: InsertLineBreakCommand = js.native
  /**
    * Gets a command to add a non-breaking space in place of a selected range
    */
  val insertNonBreakingSpace: InsertNonBreakingSpaceCommand = js.native
  /**
    * Gets a command to insert numeration to a paragraph making it a numbering list item.
    */
  val insertNumeration: InsertNumerationCommand = js.native
  /**
    * Gets a command to insert a page break at the current position in the document.
    */
  val insertPageBreak: InsertPageBreakCommand = js.native
  /**
    * Gets a command to insert a paragraph break at the current position in the document.
    */
  val insertParagraph: InsertParagraphCommand = js.native
  /**
    * Gets a command to insert an inline picture stored by the specified web address.
    */
  val insertPicture: InsertPictureCommand = js.native
  /**
    * Gets a command to add RTF formatted content at the specified position.
    */
  val insertRtf: InsertRtfCommand = js.native
  /**
    * Gets a command to insert a section break and starts a new section on the next even-numbered page.
    */
  val insertSectionBreakEvenPage: InsertSectionBreakEvenPageCommand = js.native
  /**
    * Gets a command to insert a section break and starts a new section on the next page.
    */
  val insertSectionBreakNextPage: InsertSectionBreakNextPageCommand = js.native
  /**
    * Gets a command to insert a section break and starts a new section on the next odd-numbered page.
    */
  val insertSectionBreakOddPage: InsertSectionBreakOddPageCommand = js.native
  /**
    * Gets a command to insert characters into a document instead of a selected range.
    */
  val insertSymbol: InsertSymbolCommand = js.native
  /**
    * Gets a command to insert a tab character at the current position in the document.
    */
  val insertTab: InsertTabCommand = js.native
  /**
    * Gets a command to insert a rectangular table of the specified size.
    */
  val insertTable: InsertTableCommand = js.native
  /**
    * Gets a command to insert table cells with a horizontal shift into the selected table.
    */
  val insertTableCellWithShiftToTheLeft: InsertTableCellWithShiftToTheLeftCommand = js.native
  /**
    * Gets a command to invoke the Insert Cells dialog window.
    */
  val insertTableCellsDialog: InsertTableCellsDialogCommand = js.native
  /**
    * Gets a command to insert table cells with a vertical shift into the selected table.
    */
  val insertTableCellsWithShiftToTheVertically: InsertTableCellsWithShiftToTheVerticallyCommand = js.native
  /**
    * Gets a command to insert a table column to the left of the current position in the table.
    */
  val insertTableColumnToTheLeft: InsertTableColumnToTheLeftCommand = js.native
  /**
    * Gets a command to insert a table column to the right of the current position in the table.
    */
  val insertTableColumnToTheRight: InsertTableColumnToTheRightCommand = js.native
  /**
    * Gets a command to insert a table of contents.
    */
  val insertTableOfContents: InsertTableOfContentsCommand = js.native
  /**
    * Gets a command to create a table of equations on the base of equation captions.
    */
  val insertTableOfEquations: InsertTableOfEquationsCommand = js.native
  /**
    * Gets a command to create a table of figures on the base of figures captions.
    */
  val insertTableOfFigures: InsertTableOfFiguresCommand = js.native
  /**
    * Gets a command to create a table of tables on the base of tables captions.
    */
  val insertTableOfTables: InsertTableOfTablesCommand = js.native
  /**
    * Gets a command to insert a row in the table above the selected row.
    */
  val insertTableRowAbove: InsertTableRowAboveCommand = js.native
  /**
    * Gets a command to insert a row in the table below the selected row.
    */
  val insertTableRowBelow: InsertTableRowBelowCommand = js.native
  /**
    * Gets a command to add a caption (numbered label) to a table.
    */
  val insertTablesCaption: InsertTablesCaptionCommand = js.native
  /**
    * Gets a command to insert text in place of a selected range.
    */
  val insertText: InsertTextCommand = js.native
  /**
    * Gets a command to link a header/footer to the previous section, so it has the same content.
    */
  val linkHeaderFooterToPrevious: LinkHeaderFooterToPreviousCommand = js.native
  /**
    * Gets a command to perform a mail merge and download the merged document.
    */
  val mailMergeAndDownload: MailMergeAndDownloadCommand = js.native
  /**
    * Gets a command to perform a mail merge and save the merged document to the server.
    */
  val mailMergeAndSaveAs: MailMergeAndSaveAsCommand = js.native
  /**
    * Gets a command to invoke the Export Range dialog window to start a mail merge.
    */
  val mailMergeDialog: MailMergeDialogCommand = js.native
  /**
    * Gets a command to convert selected text to lower case.
    */
  val makeTextLowerCase: MakeTextLowerCaseCommand = js.native
  /**
    * Gets a command changing all selected text to the sentence case capitalization.
    */
  val makeTextSentenceCase: MakeTextSentenceCaseCommand = js.native
  /**
    * Gets a command to convert selected text to upper case.
    */
  val makeTextUpperCase: MakeTextUpperCaseCommand = js.native
  /**
    * Gets a command to invoke the Insert Merge Field dialog window.
    */
  val mergeFieldDialog: MergeFieldDialogCommand = js.native
  /**
    * Gets a command to merge the selected cells.
    */
  val mergeTableCells: MergeTableCellsCommand = js.native
  /**
    * Gets a command to move the selected range.
    */
  val moveContent: MoveContentCommand = js.native
  /**
    * Gets a command to invoke the Customize Numbered List dialog window.
    */
  val openCustomNumberingListDialog: OpenCustomNumberingListDialogCommand = js.native
  /**
    * Gets a command to invoke the Find and Replace dialog window.
    */
  val openFindAndReplaceDialog: OpenFindAndReplaceDialogCommand = js.native
  /**
    * Gets a command to invoke the Search Panel allowing end-users to search text and navigate through search results.
    */
  val openFindPanel: OpenFindPanelCommand = js.native
  /**
    * Gets a command to invoke the Font dialog window.
    */
  val openFontFormattingDialog: OpenFontFormattingDialogCommand = js.native
  /**
    * Gets a command to go to a bookmark or URI contained within the selected hyperlink.
    */
  val openHyperlink: OpenHyperlinkCommand = js.native
  /**
    * Gets a command to invoke the Bookmark dialog window.
    */
  val openInsertBookmarkDialog: OpenInsertBookmarkDialogCommand = js.native
  /**
    * Gets a command to invoke the Hyperlink dialog window.
    */
  val openInsertHyperlinkDialog: OpenInsertHyperlinkDialogCommand = js.native
  /**
    * Gets a command to invoke the Insert Image dialog window.
    */
  val openInsertPictureDialog: OpenInsertPictureDialogCommand = js.native
  /**
    * Gets a command to invoke the Symbols dialog window.
    */
  val openInsertSymbolDialog: OpenInsertSymbolDialogCommand = js.native
  /**
    * Gets a command to invoke the Insert Table dialog window.
    */
  val openInsertTableDialog: OpenInsertTableDialogCommand = js.native
  /**
    * Gets a command to invoke the Layout dialog window to customize the settings of a floating object.
    */
  val openLayoutOptionsDialog: OpenLayoutOptionsDialogCommand = js.native
  /**
    * Gets a command to invoke the Bulleted and Numbering dialog window.
    */
  val openNumberingListDialog: OpenNumberingListDialogCommand = js.native
  /**
    * Gets a command to invoke the Margins tab of the Page Setup dialog window.
    */
  val openPageMarginsDialog: OpenPageMarginsDialogCommand = js.native
  /**
    * Gets a command to invoke the Paper tab of the Page Setup dialog window.
    */
  val openPagePaperSizeDialog: OpenPagePaperSizeDialogCommand = js.native
  /**
    * Gets a command to invoke the Indents And Spacing tab of the Paragraph dialog window.
    */
  val openParagraphFormattingDialog: OpenParagraphFormattingDialogCommand = js.native
  /**
    * Gets a command to invoke the Columns dialog window.
    */
  val openSectionColumnsDialog: OpenSectionColumnsDialogCommand = js.native
  /**
    * Gets a command to invoke the Spelling dialog window.
    */
  val openSpellingDialog: OpenSpellingDialogCommand = js.native
  /**
    * Gets a command to invoke the Borders tab of the Borders and Shading dialog window.
    */
  val openTableBordersAndShadingDialog: OpenTableBordersAndShadingDialogCommand = js.native
  /**
    * Gets a command to invoke the Table tab of the Table Properties dialog window.
    */
  val openTableFormattingDialog: OpenTableFormattingDialogCommand = js.native
  /**
    * Gets a command to invoke the Tabs dialog window.
    */
  val openTabsDialog: OpenTabsDialogCommand = js.native
  /**
    * Gets a command to paste the text from the clipboard over the selection.
    */
  val paste: PasteCommand = js.native
  /**
    * Gets a command to reverse actions of the previous RichEditCommands.undo command.
    */
  val redo: RedoCommand = js.native
  /**
    * Gets a command to remove the next word.
    */
  val removeNextWord: RemoveNextWordCommand = js.native
  /**
    * Gets a command to exclude the selected paragraphs from the numbered list.
    */
  val removeNumeration: RemoveNumerationCommand = js.native
  /**
    * Gets a command to remove the previous word.
    */
  val removePrevWord: RemovePrevWordCommand = js.native
  /**
    * Gets a command to remove spacing after the selected paragraph.
    */
  val removeSpacingAfterParagraph: RemoveSpacingAfterParagraphCommand = js.native
  /**
    * Gets a command to remove spacing before the selected paragraph.
    */
  val removeSpacingBeforeParagraph: RemoveSpacingBeforeParagraphCommand = js.native
  /**
    * Gets a command to remove the borders of the selected table cells.
    */
  val removeTableCellBorders: RemoveTableCellBordersCommand = js.native
  /**
    * Gets a command to replace all matches of the specified text with new characters.
    */
  val replaceAll: ReplaceAllCommand = js.native
  /**
    * Gets a command to find and replace a next match of the specified text after the cursor position with new characters.
    */
  val replaceNext: ReplaceNextCommand = js.native
  /**
    * Gets a command to restart the numbering list.
    */
  val restartNumberingList: RestartNumberingListCommand = js.native
  /**
    * Gets a command to enable (or disable if it is enabled) a different page header and footer for the first page of the current section.
    */
  val setDifferentFirstPageHeaderFooter: SetDifferentFirstPageHeaderFooterCommand = js.native
  /**
    * Gets a command to enable (or disable if it is enabled) a different page header and footer for odd and even pages of the current section.
    */
  val setDifferentOddAndEvenPagesHeaderFooter: SetDifferentOddAndEvenPagesHeaderFooterCommand = js.native
  /**
    * Gets a command to format a selected paragraph with double line spacing.
    */
  val setDoubleParagraphSpacing: SetDoubleParagraphSpacingCommand = js.native
  /**
    * Gets a command to toggle the fullscreen mode.
    */
  val setFullscreen: SetFullscreenCommand = js.native
  /**
    * Gets a command to invoke the Page Setup dialog.
    */
  val setPageSizeDialog: SetPageSizeDialogCommand = js.native
  /**
    * Gets a command to apply a paragraph level to the selected text
    */
  val setParagraphLevel: SetParagraphLevelCommand = js.native
  /**
    * Gets a command to format a current paragraph with one and a half line spacing.
    */
  val setSesquialteralParagraphSpacing: SetSesquialteralParagraphSpacingCommand = js.native
  /**
    * Gets a command to format a current paragraph with single line spacing.
    */
  val setSingleParagraphSpacing: SetSingleParagraphSpacingCommand = js.native
  /**
    * Gets a command to display all field codes in place of the fields in the document.
    */
  val showAllFieldCodes: ShowAllFieldCodesCommand = js.native
  /**
    * Gets a command to display the selected field's codes.
    */
  val showFieldCodes: ShowFieldCodesCommand = js.native
  /**
    * Gets a command to toggle hidden symbol visibility.
    */
  val showHiddenSymbols: ShowHiddenSymbolsCommand = js.native
  /**
    * Gets a command to toggle the horizontal ruler's visibility.
    */
  val showHorizontalRuler: ShowHorizontalRulerCommand = js.native
  /**
    * Gets a command to display or hide actual data in MERGEFIELD fields.
    */
  val showMergedData: ShowMergedDataCommand = js.native
  /**
    * Gets a command to toggle the display of grid lines for a table with no borders applied - on/off.
    */
  val showTableGridLines: ShowTableGridLinesCommand = js.native
  /**
    * Gets a command to split the selected table cells.
    */
  val splitTableCells: SplitTableCellsCommand = js.native
  /**
    * Gets a command to invoke the Split Cells dialog window.
    */
  val splitTableCellsDialog: SplitTableCellsDialogCommand = js.native
  /**
    * Gets a command to switch the text capitalization in the selection.
    */
  val switchTextCase: SwitchTextCaseCommand = js.native
  /**
    * Gets a command to toggle between the bulleted paragraph and normal text.
    */
  val toggleBulletedList: ToggleBulletedListCommand = js.native
  /**
    * Gets a command to toggle between the multilevel list style and normal text.
    */
  val toggleMultilevelList: ToggleMultilevelListCommand = js.native
  /**
    * Gets a command to toggle between the numbered paragraph and normal text.
    */
  val toggleNumberingList: ToggleNumberingListCommand = js.native
  /**
    * Gets a command to toggle centered paragraph alignment on and off.
    */
  val toggleParagraphAlignmentCenter: ToggleParagraphAlignmentCenterCommand = js.native
  /**
    * Gets a command to toggle justified paragraph alignment on and off.
    */
  val toggleParagraphAlignmentJustify: ToggleParagraphAlignmentJustifyCommand = js.native
  /**
    * Gets a command to toggle left paragraph alignment on and off.
    */
  val toggleParagraphAlignmentLeft: ToggleParagraphAlignmentLeftCommand = js.native
  /**
    * Gets a command to toggle right paragraph alignment on and off.
    */
  val toggleParagraphAlignmentRight: ToggleParagraphAlignmentRightCommand = js.native
  /**
    * Gets a command that fits the specified table to its contents.
    */
  val toggleTableAutoFitContents: ToggleTableAutoFitContentsCommand = js.native
  /**
    * Gets a command that fits the specified table to a document's window.
    */
  val toggleTableAutoFitWindow: ToggleTableAutoFitWindowCommand = js.native
  /**
    * Gets a command to apply bottom-center alignment for the selected cells.
    */
  val toggleTableCellAlignBottomCenter: ToggleTableCellAlignBottomCenterCommand = js.native
  /**
    * Gets a command to apply bottom-left alignment for the selected cells.
    */
  val toggleTableCellAlignBottomLeft: ToggleTableCellAlignBottomLeftCommand = js.native
  /**
    * Gets a command to apply bottom-right alignment for the selected cells.
    */
  val toggleTableCellAlignBottomRight: ToggleTableCellAlignBottomRightCommand = js.native
  /**
    * Gets a command to apply middle-center alignment for the selected cells.
    */
  val toggleTableCellAlignMiddleCenter: ToggleTableCellAlignMiddleCenterCommand = js.native
  /**
    * Gets a command to apply middle-left alignment for the selected cells.
    */
  val toggleTableCellAlignMiddleLeft: ToggleTableCellAlignMiddleLeftCommand = js.native
  /**
    * Gets a command to apply middle-right alignment for the selected cells.
    */
  val toggleTableCellAlignMiddleRight: ToggleTableCellAlignMiddleRightCommand = js.native
  /**
    * Gets a command to apply top-center alignment for the selected cells.
    */
  val toggleTableCellAlignTopCenter: ToggleTableCellAlignTopCenterCommand = js.native
  /**
    * Gets a command to apply top-left alignment for the selected cells.
    */
  val toggleTableCellAlignTopLeft: ToggleTableCellAlignTopLeftCommand = js.native
  /**
    * Gets a command to apply top-right alignment for the selected cells.
    */
  val toggleTableCellAlignTopRight: ToggleTableCellAlignTopRightCommand = js.native
  /**
    * Gets a command to apply (or cancel) border settings to all borders of the selected cells.
    */
  val toggleTableCellAllBorders: ToggleTableCellAllBordersCommand = js.native
  /**
    * Gets a command to apply (or cancel) border settings of the bottom border for the selected cells.
    */
  val toggleTableCellBottomBorder: ToggleTableCellBottomBorderCommand = js.native
  /**
    * Gets a command to apply (or cancel) border settings of the inside borders for the selected cells.
    */
  val toggleTableCellInsideBorders: ToggleTableCellInsideBordersCommand = js.native
  /**
    * Gets a command to apply (or cancel) border settings of the inside horizontal borders for the selected cells.
    */
  val toggleTableCellInsideHorizontalBorders: ToggleTableCellInsideHorizontalBordersCommand = js.native
  /**
    * Gets a command to apply (or cancel) border settings of the inside vertical borders for the selected cells.
    */
  val toggleTableCellInsideVerticalBorders: ToggleTableCellInsideVerticalBordersCommand = js.native
  /**
    * Gets a command to apply (or cancel) border settings of the left border for the selected cells.
    */
  val toggleTableCellLeftBorder: ToggleTableCellLeftBorderCommand = js.native
  /**
    * Gets a command to apply (or cancel) border settings of the outside borders for the selected cells.
    */
  val toggleTableCellOutsideBorders: ToggleTableCellOutsideBordersCommand = js.native
  /**
    * Gets a command to apply (or cancel) border settings of the right border for the selected cells.
    */
  val toggleTableCellRightBorder: ToggleTableCellRightBorderCommand = js.native
  /**
    * Gets a command to apply (or cancel) border settings of the top border for the selected cells.
    */
  val toggleTableCellTopBorder: ToggleTableCellTopBorderCommand = js.native
  /**
    * Gets a command that disables automatic adjusting of the selected table.
    */
  val toggleTableFixedColumnWidth: ToggleTableFixedColumnWidthCommand = js.native
  /**
    * Gets a command to toggle case for each character - upper case becomes lower, lower case becomes upper.
    */
  val toggleTextCase: ToggleTextCaseCommand = js.native
  /**
    * Gets a command to cancel changes caused by the previous command.
    */
  val undo: UndoCommand = js.native
  /**
    * Gets a command to update all fields in the document.
    */
  val updateAllFields: UpdateAllFieldsCommand = js.native
  /**
    * Gets a command to update each field's result in the selection.
    */
  val updateField: UpdateFieldCommand = js.native
  /**
    * Gets a command to update a table of contents.
    */
  val updateTableOfContents: UpdateTableOfContentsCommand = js.native
  /**
    * Gets a command to prevent the control UI from being updated until the RichEditCommands.endUpdate method is called.
    */
  def beginUpdate(): Unit = js.native
  /**
    * Re-enables render operations after a call to the RichEditCommands.beginUpdate method and forces immediate re-rendering.
    */
  def endUpdate(): Unit = js.native
}

object RichEditCommands {
  @scala.inline
  def apply(
    addSpacingAfterParagraph: AddSpacingAfterParagraphCommand,
    addSpacingBeforeParagraph: AddSpacingBeforeParagraphCommand,
    assignShortcut: AssignShortcutCommand,
    backspace: BackspaceCommand,
    beginUpdate: () => Unit,
    capitalizeEachWordTextCase: CapitalizeEachWordTextCaseCommand,
    changeCustomNumberingList: ChangeCustomNumberingListCommand,
    changeFloatingObjectAbsolutePosition: ChangeFloatingObjectAbsolutePositionCommand,
    changeFloatingObjectAbsoluteSize: ChangeFloatingObjectAbsoluteSizeCommand,
    changeFloatingObjectAlignmentPosition: ChangeFloatingObjectAlignmentPositionCommand,
    changeFloatingObjectFillColor: ChangeFloatingObjectFillColorCommand,
    changeFloatingObjectLockAnchor: ChangeFloatingObjectLockAnchorCommand,
    changeFloatingObjectLockAspectRatio: ChangeFloatingObjectLockAspectRatioCommand,
    changeFloatingObjectOutlineColor: ChangeFloatingObjectOutlineColorCommand,
    changeFloatingObjectOutlineWidth: ChangeFloatingObjectOutlineWidthCommand,
    changeFloatingObjectRelativePosition: ChangeFloatingObjectRelativePositionCommand,
    changeFloatingObjectRotation: ChangeFloatingObjectRotationCommand,
    changeFloatingObjectTextWrapping: ChangeFloatingObjectTextWrappingCommand,
    changeFontBackColor: ChangeFontBackColorCommand,
    changeFontBold: ChangeFontBoldCommand,
    changeFontForeColor: ChangeFontForeColorCommand,
    changeFontFormatting: ChangeFontFormattingCommand,
    changeFontItalic: ChangeFontItalicCommand,
    changeFontName: ChangeFontNameCommand,
    changeFontSize: ChangeFontSizeCommand,
    changeFontStrikeout: ChangeFontStrikeoutCommand,
    changeFontSubscript: ChangeFontSubscriptCommand,
    changeFontSuperscript: ChangeFontSuperscriptCommand,
    changeFontUnderline: ChangeFontUnderlineCommand,
    changeHyperlink: ChangeHyperlinkCommand,
    changePageColor: ChangePageColorCommand,
    changePageMargins: ChangePageMarginsCommand,
    changePageOrientation: ChangePageOrientationCommand,
    changePageSize: ChangePageSizeCommand,
    changeParagraphBackColor: ChangeParagraphBackColorCommand,
    changeParagraphFormatting: ChangeParagraphFormattingCommand,
    changePictureScale: ChangePictureScaleCommand,
    changeSectionColumns: ChangeSectionColumnsCommand,
    changeSectionEqualColumnCount: ChangeSectionEqualColumnCountCommand,
    changeStyle: ChangeStyleCommand,
    changeTableBorderRepositoryItem: ChangeTableBorderRepositoryItemCommand,
    changeTableBordersAndShading: ChangeTableBordersAndShadingCommand,
    changeTableCellFormatting: ChangeTableCellFormattingCommand,
    changeTableCellPreferredWidth: ChangeTableCellPreferredWidthCommand,
    changeTableCellShading: ChangeTableCellShadingCommand,
    changeTableColumnPreferredWidth: ChangeTableColumnPreferredWidthCommand,
    changeTableFormatting: ChangeTableFormattingCommand,
    changeTableLook: ChangeTableLookCommand,
    changeTableRowPreferredHeight: ChangeTableRowPreferredHeightCommand,
    changeTableStyle: ChangeTableStyleCommand,
    changeTabs: ChangeTabsCommand,
    changeTextBoxContentMargins: ChangeTextBoxContentMarginsCommand,
    changeTextBoxRelativeSize: ChangeTextBoxRelativeSizeCommand,
    changeTextBoxResizeShapeToFitText: ChangeTextBoxResizeShapeToFitTextCommand,
    changeViewType: ChangeViewTypeCommand,
    clearFormatting: ClearFormattingCommand,
    closeHeaderFooter: CloseHeaderFooterCommand,
    continueNumberingList: ContinueNumberingListCommand,
    copy: CopyCommand,
    copyContent: CopyContentCommand,
    createDateField: CreateDateFieldCommand,
    createField: CreateFieldCommand,
    createMergeField: CreateMergeFieldCommand,
    createPageCountField: CreatePageCountFieldCommand,
    createPageField: CreatePageFieldCommand,
    createTimeField: CreateTimeFieldCommand,
    cut: CutCommand,
    decreaseFontSize: DecreaseFontSizeCommand,
    decreaseIndent: DecreaseIndentCommand,
    decrementNumberingIndent: DecrementNumberingIndentCommand,
    decrementParagraphLeftIndent: DecrementParagraphLeftIndentCommand,
    delete: DeleteCommand,
    deleteBookmark: DeleteBookmarkCommand,
    deleteHyperlink: DeleteHyperlinkCommand,
    deleteHyperlinks: DeleteHyperlinksCommand,
    deleteTable: DeleteTableCommand,
    deleteTableCellsDialog: DeleteTableCellsDialogCommand,
    deleteTableCellsWithShiftHorizontally: DeleteTableCellsWithShiftHorizontallyCommand,
    deleteTableCellsWithShiftVertically: DeleteTableCellsWithShiftVerticallyCommand,
    deleteTableColumns: DeleteTableColumnsCommand,
    deleteTableRows: DeleteTableRowsCommand,
    endUpdate: () => Unit,
    fileDownload: FileDownloadCommand,
    fileNew: FileNewCommand,
    fileOpen: FileOpenCommand,
    fileOpenDialog: FileOpenDialogCommand,
    filePrint: FilePrintCommand,
    fileSave: FileSaveCommand,
    fileSaveAs: FileSaveAsCommand,
    fileSaveAsDialog: FileSaveAsDialogCommand,
    findAll: FindAllCommand,
    forceSyncWithServer: ForceSyncWithServerCommand,
    getRtf: GetRtfCommand,
    goToBookmark: GoToBookmarkCommand,
    goToDataRecord: GoToDataRecordCommand,
    goToFirstDataRecord: GoToFirstDataRecordCommand,
    goToFooter: GoToFooterCommand,
    goToHeader: GoToHeaderCommand,
    goToLastDataRecord: GoToLastDataRecordCommand,
    goToNextDataRecord: GoToNextDataRecordCommand,
    goToNextHeaderFooter: GoToNextHeaderFooterCommand,
    goToPreviousDataRecord: GoToPreviousDataRecordCommand,
    goToPreviousHeaderFooter: GoToPreviousHeaderFooterCommand,
    hideFindResults: HideFindResultsCommand,
    increaseFontSize: IncreaseFontSizeCommand,
    increaseIndent: IncreaseIndentCommand,
    incrementNumberingIndent: IncrementNumberingIndentCommand,
    incrementParagraphLeftIndent: IncrementParagraphLeftIndentCommand,
    insertBookmark: InsertBookmarkCommand,
    insertColumnBreak: InsertColumnBreakCommand,
    insertContentFromServer: InsertContentFromServerCommand,
    insertEquationsCaption: InsertEquationsCaptionCommand,
    insertFiguresCaption: InsertFiguresCaptionCommand,
    insertFloatingTextBox: InsertFloatingTextBoxCommand,
    insertFooter: InsertFooterCommand,
    insertHeader: InsertHeaderCommand,
    insertHtml: InsertHtmlCommand,
    insertHyperlink: InsertHyperlinkCommand,
    insertLineBreak: InsertLineBreakCommand,
    insertNonBreakingSpace: InsertNonBreakingSpaceCommand,
    insertNumeration: InsertNumerationCommand,
    insertPageBreak: InsertPageBreakCommand,
    insertParagraph: InsertParagraphCommand,
    insertPicture: InsertPictureCommand,
    insertRtf: InsertRtfCommand,
    insertSectionBreakEvenPage: InsertSectionBreakEvenPageCommand,
    insertSectionBreakNextPage: InsertSectionBreakNextPageCommand,
    insertSectionBreakOddPage: InsertSectionBreakOddPageCommand,
    insertSymbol: InsertSymbolCommand,
    insertTab: InsertTabCommand,
    insertTable: InsertTableCommand,
    insertTableCellWithShiftToTheLeft: InsertTableCellWithShiftToTheLeftCommand,
    insertTableCellsDialog: InsertTableCellsDialogCommand,
    insertTableCellsWithShiftToTheVertically: InsertTableCellsWithShiftToTheVerticallyCommand,
    insertTableColumnToTheLeft: InsertTableColumnToTheLeftCommand,
    insertTableColumnToTheRight: InsertTableColumnToTheRightCommand,
    insertTableOfContents: InsertTableOfContentsCommand,
    insertTableOfEquations: InsertTableOfEquationsCommand,
    insertTableOfFigures: InsertTableOfFiguresCommand,
    insertTableOfTables: InsertTableOfTablesCommand,
    insertTableRowAbove: InsertTableRowAboveCommand,
    insertTableRowBelow: InsertTableRowBelowCommand,
    insertTablesCaption: InsertTablesCaptionCommand,
    insertText: InsertTextCommand,
    linkHeaderFooterToPrevious: LinkHeaderFooterToPreviousCommand,
    mailMergeAndDownload: MailMergeAndDownloadCommand,
    mailMergeAndSaveAs: MailMergeAndSaveAsCommand,
    mailMergeDialog: MailMergeDialogCommand,
    makeTextLowerCase: MakeTextLowerCaseCommand,
    makeTextSentenceCase: MakeTextSentenceCaseCommand,
    makeTextUpperCase: MakeTextUpperCaseCommand,
    mergeFieldDialog: MergeFieldDialogCommand,
    mergeTableCells: MergeTableCellsCommand,
    moveContent: MoveContentCommand,
    openCustomNumberingListDialog: OpenCustomNumberingListDialogCommand,
    openFindAndReplaceDialog: OpenFindAndReplaceDialogCommand,
    openFindPanel: OpenFindPanelCommand,
    openFontFormattingDialog: OpenFontFormattingDialogCommand,
    openHyperlink: OpenHyperlinkCommand,
    openInsertBookmarkDialog: OpenInsertBookmarkDialogCommand,
    openInsertHyperlinkDialog: OpenInsertHyperlinkDialogCommand,
    openInsertPictureDialog: OpenInsertPictureDialogCommand,
    openInsertSymbolDialog: OpenInsertSymbolDialogCommand,
    openInsertTableDialog: OpenInsertTableDialogCommand,
    openLayoutOptionsDialog: OpenLayoutOptionsDialogCommand,
    openNumberingListDialog: OpenNumberingListDialogCommand,
    openPageMarginsDialog: OpenPageMarginsDialogCommand,
    openPagePaperSizeDialog: OpenPagePaperSizeDialogCommand,
    openParagraphFormattingDialog: OpenParagraphFormattingDialogCommand,
    openSectionColumnsDialog: OpenSectionColumnsDialogCommand,
    openSpellingDialog: OpenSpellingDialogCommand,
    openTableBordersAndShadingDialog: OpenTableBordersAndShadingDialogCommand,
    openTableFormattingDialog: OpenTableFormattingDialogCommand,
    openTabsDialog: OpenTabsDialogCommand,
    paste: PasteCommand,
    redo: RedoCommand,
    removeNextWord: RemoveNextWordCommand,
    removeNumeration: RemoveNumerationCommand,
    removePrevWord: RemovePrevWordCommand,
    removeSpacingAfterParagraph: RemoveSpacingAfterParagraphCommand,
    removeSpacingBeforeParagraph: RemoveSpacingBeforeParagraphCommand,
    removeTableCellBorders: RemoveTableCellBordersCommand,
    replaceAll: ReplaceAllCommand,
    replaceNext: ReplaceNextCommand,
    restartNumberingList: RestartNumberingListCommand,
    setDifferentFirstPageHeaderFooter: SetDifferentFirstPageHeaderFooterCommand,
    setDifferentOddAndEvenPagesHeaderFooter: SetDifferentOddAndEvenPagesHeaderFooterCommand,
    setDoubleParagraphSpacing: SetDoubleParagraphSpacingCommand,
    setFullscreen: SetFullscreenCommand,
    setPageSizeDialog: SetPageSizeDialogCommand,
    setParagraphLevel: SetParagraphLevelCommand,
    setSesquialteralParagraphSpacing: SetSesquialteralParagraphSpacingCommand,
    setSingleParagraphSpacing: SetSingleParagraphSpacingCommand,
    showAllFieldCodes: ShowAllFieldCodesCommand,
    showFieldCodes: ShowFieldCodesCommand,
    showHiddenSymbols: ShowHiddenSymbolsCommand,
    showHorizontalRuler: ShowHorizontalRulerCommand,
    showMergedData: ShowMergedDataCommand,
    showTableGridLines: ShowTableGridLinesCommand,
    splitTableCells: SplitTableCellsCommand,
    splitTableCellsDialog: SplitTableCellsDialogCommand,
    switchTextCase: SwitchTextCaseCommand,
    toggleBulletedList: ToggleBulletedListCommand,
    toggleMultilevelList: ToggleMultilevelListCommand,
    toggleNumberingList: ToggleNumberingListCommand,
    toggleParagraphAlignmentCenter: ToggleParagraphAlignmentCenterCommand,
    toggleParagraphAlignmentJustify: ToggleParagraphAlignmentJustifyCommand,
    toggleParagraphAlignmentLeft: ToggleParagraphAlignmentLeftCommand,
    toggleParagraphAlignmentRight: ToggleParagraphAlignmentRightCommand,
    toggleTableAutoFitContents: ToggleTableAutoFitContentsCommand,
    toggleTableAutoFitWindow: ToggleTableAutoFitWindowCommand,
    toggleTableCellAlignBottomCenter: ToggleTableCellAlignBottomCenterCommand,
    toggleTableCellAlignBottomLeft: ToggleTableCellAlignBottomLeftCommand,
    toggleTableCellAlignBottomRight: ToggleTableCellAlignBottomRightCommand,
    toggleTableCellAlignMiddleCenter: ToggleTableCellAlignMiddleCenterCommand,
    toggleTableCellAlignMiddleLeft: ToggleTableCellAlignMiddleLeftCommand,
    toggleTableCellAlignMiddleRight: ToggleTableCellAlignMiddleRightCommand,
    toggleTableCellAlignTopCenter: ToggleTableCellAlignTopCenterCommand,
    toggleTableCellAlignTopLeft: ToggleTableCellAlignTopLeftCommand,
    toggleTableCellAlignTopRight: ToggleTableCellAlignTopRightCommand,
    toggleTableCellAllBorders: ToggleTableCellAllBordersCommand,
    toggleTableCellBottomBorder: ToggleTableCellBottomBorderCommand,
    toggleTableCellInsideBorders: ToggleTableCellInsideBordersCommand,
    toggleTableCellInsideHorizontalBorders: ToggleTableCellInsideHorizontalBordersCommand,
    toggleTableCellInsideVerticalBorders: ToggleTableCellInsideVerticalBordersCommand,
    toggleTableCellLeftBorder: ToggleTableCellLeftBorderCommand,
    toggleTableCellOutsideBorders: ToggleTableCellOutsideBordersCommand,
    toggleTableCellRightBorder: ToggleTableCellRightBorderCommand,
    toggleTableCellTopBorder: ToggleTableCellTopBorderCommand,
    toggleTableFixedColumnWidth: ToggleTableFixedColumnWidthCommand,
    toggleTextCase: ToggleTextCaseCommand,
    undo: UndoCommand,
    updateAllFields: UpdateAllFieldsCommand,
    updateField: UpdateFieldCommand,
    updateTableOfContents: UpdateTableOfContentsCommand
  ): RichEditCommands = {
    val __obj = js.Dynamic.literal(addSpacingAfterParagraph = addSpacingAfterParagraph.asInstanceOf[js.Any], addSpacingBeforeParagraph = addSpacingBeforeParagraph.asInstanceOf[js.Any], assignShortcut = assignShortcut.asInstanceOf[js.Any], backspace = backspace.asInstanceOf[js.Any], beginUpdate = js.Any.fromFunction0(beginUpdate), capitalizeEachWordTextCase = capitalizeEachWordTextCase.asInstanceOf[js.Any], changeCustomNumberingList = changeCustomNumberingList.asInstanceOf[js.Any], changeFloatingObjectAbsolutePosition = changeFloatingObjectAbsolutePosition.asInstanceOf[js.Any], changeFloatingObjectAbsoluteSize = changeFloatingObjectAbsoluteSize.asInstanceOf[js.Any], changeFloatingObjectAlignmentPosition = changeFloatingObjectAlignmentPosition.asInstanceOf[js.Any], changeFloatingObjectFillColor = changeFloatingObjectFillColor.asInstanceOf[js.Any], changeFloatingObjectLockAnchor = changeFloatingObjectLockAnchor.asInstanceOf[js.Any], changeFloatingObjectLockAspectRatio = changeFloatingObjectLockAspectRatio.asInstanceOf[js.Any], changeFloatingObjectOutlineColor = changeFloatingObjectOutlineColor.asInstanceOf[js.Any], changeFloatingObjectOutlineWidth = changeFloatingObjectOutlineWidth.asInstanceOf[js.Any], changeFloatingObjectRelativePosition = changeFloatingObjectRelativePosition.asInstanceOf[js.Any], changeFloatingObjectRotation = changeFloatingObjectRotation.asInstanceOf[js.Any], changeFloatingObjectTextWrapping = changeFloatingObjectTextWrapping.asInstanceOf[js.Any], changeFontBackColor = changeFontBackColor.asInstanceOf[js.Any], changeFontBold = changeFontBold.asInstanceOf[js.Any], changeFontForeColor = changeFontForeColor.asInstanceOf[js.Any], changeFontFormatting = changeFontFormatting.asInstanceOf[js.Any], changeFontItalic = changeFontItalic.asInstanceOf[js.Any], changeFontName = changeFontName.asInstanceOf[js.Any], changeFontSize = changeFontSize.asInstanceOf[js.Any], changeFontStrikeout = changeFontStrikeout.asInstanceOf[js.Any], changeFontSubscript = changeFontSubscript.asInstanceOf[js.Any], changeFontSuperscript = changeFontSuperscript.asInstanceOf[js.Any], changeFontUnderline = changeFontUnderline.asInstanceOf[js.Any], changeHyperlink = changeHyperlink.asInstanceOf[js.Any], changePageColor = changePageColor.asInstanceOf[js.Any], changePageMargins = changePageMargins.asInstanceOf[js.Any], changePageOrientation = changePageOrientation.asInstanceOf[js.Any], changePageSize = changePageSize.asInstanceOf[js.Any], changeParagraphBackColor = changeParagraphBackColor.asInstanceOf[js.Any], changeParagraphFormatting = changeParagraphFormatting.asInstanceOf[js.Any], changePictureScale = changePictureScale.asInstanceOf[js.Any], changeSectionColumns = changeSectionColumns.asInstanceOf[js.Any], changeSectionEqualColumnCount = changeSectionEqualColumnCount.asInstanceOf[js.Any], changeStyle = changeStyle.asInstanceOf[js.Any], changeTableBorderRepositoryItem = changeTableBorderRepositoryItem.asInstanceOf[js.Any], changeTableBordersAndShading = changeTableBordersAndShading.asInstanceOf[js.Any], changeTableCellFormatting = changeTableCellFormatting.asInstanceOf[js.Any], changeTableCellPreferredWidth = changeTableCellPreferredWidth.asInstanceOf[js.Any], changeTableCellShading = changeTableCellShading.asInstanceOf[js.Any], changeTableColumnPreferredWidth = changeTableColumnPreferredWidth.asInstanceOf[js.Any], changeTableFormatting = changeTableFormatting.asInstanceOf[js.Any], changeTableLook = changeTableLook.asInstanceOf[js.Any], changeTableRowPreferredHeight = changeTableRowPreferredHeight.asInstanceOf[js.Any], changeTableStyle = changeTableStyle.asInstanceOf[js.Any], changeTabs = changeTabs.asInstanceOf[js.Any], changeTextBoxContentMargins = changeTextBoxContentMargins.asInstanceOf[js.Any], changeTextBoxRelativeSize = changeTextBoxRelativeSize.asInstanceOf[js.Any], changeTextBoxResizeShapeToFitText = changeTextBoxResizeShapeToFitText.asInstanceOf[js.Any], changeViewType = changeViewType.asInstanceOf[js.Any], clearFormatting = clearFormatting.asInstanceOf[js.Any], closeHeaderFooter = closeHeaderFooter.asInstanceOf[js.Any], continueNumberingList = continueNumberingList.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], copyContent = copyContent.asInstanceOf[js.Any], createDateField = createDateField.asInstanceOf[js.Any], createField = createField.asInstanceOf[js.Any], createMergeField = createMergeField.asInstanceOf[js.Any], createPageCountField = createPageCountField.asInstanceOf[js.Any], createPageField = createPageField.asInstanceOf[js.Any], createTimeField = createTimeField.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], decreaseFontSize = decreaseFontSize.asInstanceOf[js.Any], decreaseIndent = decreaseIndent.asInstanceOf[js.Any], decrementNumberingIndent = decrementNumberingIndent.asInstanceOf[js.Any], decrementParagraphLeftIndent = decrementParagraphLeftIndent.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], deleteBookmark = deleteBookmark.asInstanceOf[js.Any], deleteHyperlink = deleteHyperlink.asInstanceOf[js.Any], deleteHyperlinks = deleteHyperlinks.asInstanceOf[js.Any], deleteTable = deleteTable.asInstanceOf[js.Any], deleteTableCellsDialog = deleteTableCellsDialog.asInstanceOf[js.Any], deleteTableCellsWithShiftHorizontally = deleteTableCellsWithShiftHorizontally.asInstanceOf[js.Any], deleteTableCellsWithShiftVertically = deleteTableCellsWithShiftVertically.asInstanceOf[js.Any], deleteTableColumns = deleteTableColumns.asInstanceOf[js.Any], deleteTableRows = deleteTableRows.asInstanceOf[js.Any], endUpdate = js.Any.fromFunction0(endUpdate), fileDownload = fileDownload.asInstanceOf[js.Any], fileNew = fileNew.asInstanceOf[js.Any], fileOpen = fileOpen.asInstanceOf[js.Any], fileOpenDialog = fileOpenDialog.asInstanceOf[js.Any], filePrint = filePrint.asInstanceOf[js.Any], fileSave = fileSave.asInstanceOf[js.Any], fileSaveAs = fileSaveAs.asInstanceOf[js.Any], fileSaveAsDialog = fileSaveAsDialog.asInstanceOf[js.Any], findAll = findAll.asInstanceOf[js.Any], forceSyncWithServer = forceSyncWithServer.asInstanceOf[js.Any], getRtf = getRtf.asInstanceOf[js.Any], goToBookmark = goToBookmark.asInstanceOf[js.Any], goToDataRecord = goToDataRecord.asInstanceOf[js.Any], goToFirstDataRecord = goToFirstDataRecord.asInstanceOf[js.Any], goToFooter = goToFooter.asInstanceOf[js.Any], goToHeader = goToHeader.asInstanceOf[js.Any], goToLastDataRecord = goToLastDataRecord.asInstanceOf[js.Any], goToNextDataRecord = goToNextDataRecord.asInstanceOf[js.Any], goToNextHeaderFooter = goToNextHeaderFooter.asInstanceOf[js.Any], goToPreviousDataRecord = goToPreviousDataRecord.asInstanceOf[js.Any], goToPreviousHeaderFooter = goToPreviousHeaderFooter.asInstanceOf[js.Any], hideFindResults = hideFindResults.asInstanceOf[js.Any], increaseFontSize = increaseFontSize.asInstanceOf[js.Any], increaseIndent = increaseIndent.asInstanceOf[js.Any], incrementNumberingIndent = incrementNumberingIndent.asInstanceOf[js.Any], incrementParagraphLeftIndent = incrementParagraphLeftIndent.asInstanceOf[js.Any], insertBookmark = insertBookmark.asInstanceOf[js.Any], insertColumnBreak = insertColumnBreak.asInstanceOf[js.Any], insertContentFromServer = insertContentFromServer.asInstanceOf[js.Any], insertEquationsCaption = insertEquationsCaption.asInstanceOf[js.Any], insertFiguresCaption = insertFiguresCaption.asInstanceOf[js.Any], insertFloatingTextBox = insertFloatingTextBox.asInstanceOf[js.Any], insertFooter = insertFooter.asInstanceOf[js.Any], insertHeader = insertHeader.asInstanceOf[js.Any], insertHtml = insertHtml.asInstanceOf[js.Any], insertHyperlink = insertHyperlink.asInstanceOf[js.Any], insertLineBreak = insertLineBreak.asInstanceOf[js.Any], insertNonBreakingSpace = insertNonBreakingSpace.asInstanceOf[js.Any], insertNumeration = insertNumeration.asInstanceOf[js.Any], insertPageBreak = insertPageBreak.asInstanceOf[js.Any], insertParagraph = insertParagraph.asInstanceOf[js.Any], insertPicture = insertPicture.asInstanceOf[js.Any], insertRtf = insertRtf.asInstanceOf[js.Any], insertSectionBreakEvenPage = insertSectionBreakEvenPage.asInstanceOf[js.Any], insertSectionBreakNextPage = insertSectionBreakNextPage.asInstanceOf[js.Any], insertSectionBreakOddPage = insertSectionBreakOddPage.asInstanceOf[js.Any], insertSymbol = insertSymbol.asInstanceOf[js.Any], insertTab = insertTab.asInstanceOf[js.Any], insertTable = insertTable.asInstanceOf[js.Any], insertTableCellWithShiftToTheLeft = insertTableCellWithShiftToTheLeft.asInstanceOf[js.Any], insertTableCellsDialog = insertTableCellsDialog.asInstanceOf[js.Any], insertTableCellsWithShiftToTheVertically = insertTableCellsWithShiftToTheVertically.asInstanceOf[js.Any], insertTableColumnToTheLeft = insertTableColumnToTheLeft.asInstanceOf[js.Any], insertTableColumnToTheRight = insertTableColumnToTheRight.asInstanceOf[js.Any], insertTableOfContents = insertTableOfContents.asInstanceOf[js.Any], insertTableOfEquations = insertTableOfEquations.asInstanceOf[js.Any], insertTableOfFigures = insertTableOfFigures.asInstanceOf[js.Any], insertTableOfTables = insertTableOfTables.asInstanceOf[js.Any], insertTableRowAbove = insertTableRowAbove.asInstanceOf[js.Any], insertTableRowBelow = insertTableRowBelow.asInstanceOf[js.Any], insertTablesCaption = insertTablesCaption.asInstanceOf[js.Any], insertText = insertText.asInstanceOf[js.Any], linkHeaderFooterToPrevious = linkHeaderFooterToPrevious.asInstanceOf[js.Any], mailMergeAndDownload = mailMergeAndDownload.asInstanceOf[js.Any], mailMergeAndSaveAs = mailMergeAndSaveAs.asInstanceOf[js.Any], mailMergeDialog = mailMergeDialog.asInstanceOf[js.Any], makeTextLowerCase = makeTextLowerCase.asInstanceOf[js.Any], makeTextSentenceCase = makeTextSentenceCase.asInstanceOf[js.Any], makeTextUpperCase = makeTextUpperCase.asInstanceOf[js.Any], mergeFieldDialog = mergeFieldDialog.asInstanceOf[js.Any], mergeTableCells = mergeTableCells.asInstanceOf[js.Any], moveContent = moveContent.asInstanceOf[js.Any], openCustomNumberingListDialog = openCustomNumberingListDialog.asInstanceOf[js.Any], openFindAndReplaceDialog = openFindAndReplaceDialog.asInstanceOf[js.Any], openFindPanel = openFindPanel.asInstanceOf[js.Any], openFontFormattingDialog = openFontFormattingDialog.asInstanceOf[js.Any], openHyperlink = openHyperlink.asInstanceOf[js.Any], openInsertBookmarkDialog = openInsertBookmarkDialog.asInstanceOf[js.Any], openInsertHyperlinkDialog = openInsertHyperlinkDialog.asInstanceOf[js.Any], openInsertPictureDialog = openInsertPictureDialog.asInstanceOf[js.Any], openInsertSymbolDialog = openInsertSymbolDialog.asInstanceOf[js.Any], openInsertTableDialog = openInsertTableDialog.asInstanceOf[js.Any], openLayoutOptionsDialog = openLayoutOptionsDialog.asInstanceOf[js.Any], openNumberingListDialog = openNumberingListDialog.asInstanceOf[js.Any], openPageMarginsDialog = openPageMarginsDialog.asInstanceOf[js.Any], openPagePaperSizeDialog = openPagePaperSizeDialog.asInstanceOf[js.Any], openParagraphFormattingDialog = openParagraphFormattingDialog.asInstanceOf[js.Any], openSectionColumnsDialog = openSectionColumnsDialog.asInstanceOf[js.Any], openSpellingDialog = openSpellingDialog.asInstanceOf[js.Any], openTableBordersAndShadingDialog = openTableBordersAndShadingDialog.asInstanceOf[js.Any], openTableFormattingDialog = openTableFormattingDialog.asInstanceOf[js.Any], openTabsDialog = openTabsDialog.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], redo = redo.asInstanceOf[js.Any], removeNextWord = removeNextWord.asInstanceOf[js.Any], removeNumeration = removeNumeration.asInstanceOf[js.Any], removePrevWord = removePrevWord.asInstanceOf[js.Any], removeSpacingAfterParagraph = removeSpacingAfterParagraph.asInstanceOf[js.Any], removeSpacingBeforeParagraph = removeSpacingBeforeParagraph.asInstanceOf[js.Any], removeTableCellBorders = removeTableCellBorders.asInstanceOf[js.Any], replaceAll = replaceAll.asInstanceOf[js.Any], replaceNext = replaceNext.asInstanceOf[js.Any], restartNumberingList = restartNumberingList.asInstanceOf[js.Any], setDifferentFirstPageHeaderFooter = setDifferentFirstPageHeaderFooter.asInstanceOf[js.Any], setDifferentOddAndEvenPagesHeaderFooter = setDifferentOddAndEvenPagesHeaderFooter.asInstanceOf[js.Any], setDoubleParagraphSpacing = setDoubleParagraphSpacing.asInstanceOf[js.Any], setFullscreen = setFullscreen.asInstanceOf[js.Any], setPageSizeDialog = setPageSizeDialog.asInstanceOf[js.Any], setParagraphLevel = setParagraphLevel.asInstanceOf[js.Any], setSesquialteralParagraphSpacing = setSesquialteralParagraphSpacing.asInstanceOf[js.Any], setSingleParagraphSpacing = setSingleParagraphSpacing.asInstanceOf[js.Any], showAllFieldCodes = showAllFieldCodes.asInstanceOf[js.Any], showFieldCodes = showFieldCodes.asInstanceOf[js.Any], showHiddenSymbols = showHiddenSymbols.asInstanceOf[js.Any], showHorizontalRuler = showHorizontalRuler.asInstanceOf[js.Any], showMergedData = showMergedData.asInstanceOf[js.Any], showTableGridLines = showTableGridLines.asInstanceOf[js.Any], splitTableCells = splitTableCells.asInstanceOf[js.Any], splitTableCellsDialog = splitTableCellsDialog.asInstanceOf[js.Any], switchTextCase = switchTextCase.asInstanceOf[js.Any], toggleBulletedList = toggleBulletedList.asInstanceOf[js.Any], toggleMultilevelList = toggleMultilevelList.asInstanceOf[js.Any], toggleNumberingList = toggleNumberingList.asInstanceOf[js.Any], toggleParagraphAlignmentCenter = toggleParagraphAlignmentCenter.asInstanceOf[js.Any], toggleParagraphAlignmentJustify = toggleParagraphAlignmentJustify.asInstanceOf[js.Any], toggleParagraphAlignmentLeft = toggleParagraphAlignmentLeft.asInstanceOf[js.Any], toggleParagraphAlignmentRight = toggleParagraphAlignmentRight.asInstanceOf[js.Any], toggleTableAutoFitContents = toggleTableAutoFitContents.asInstanceOf[js.Any], toggleTableAutoFitWindow = toggleTableAutoFitWindow.asInstanceOf[js.Any], toggleTableCellAlignBottomCenter = toggleTableCellAlignBottomCenter.asInstanceOf[js.Any], toggleTableCellAlignBottomLeft = toggleTableCellAlignBottomLeft.asInstanceOf[js.Any], toggleTableCellAlignBottomRight = toggleTableCellAlignBottomRight.asInstanceOf[js.Any], toggleTableCellAlignMiddleCenter = toggleTableCellAlignMiddleCenter.asInstanceOf[js.Any], toggleTableCellAlignMiddleLeft = toggleTableCellAlignMiddleLeft.asInstanceOf[js.Any], toggleTableCellAlignMiddleRight = toggleTableCellAlignMiddleRight.asInstanceOf[js.Any], toggleTableCellAlignTopCenter = toggleTableCellAlignTopCenter.asInstanceOf[js.Any], toggleTableCellAlignTopLeft = toggleTableCellAlignTopLeft.asInstanceOf[js.Any], toggleTableCellAlignTopRight = toggleTableCellAlignTopRight.asInstanceOf[js.Any], toggleTableCellAllBorders = toggleTableCellAllBorders.asInstanceOf[js.Any], toggleTableCellBottomBorder = toggleTableCellBottomBorder.asInstanceOf[js.Any], toggleTableCellInsideBorders = toggleTableCellInsideBorders.asInstanceOf[js.Any], toggleTableCellInsideHorizontalBorders = toggleTableCellInsideHorizontalBorders.asInstanceOf[js.Any], toggleTableCellInsideVerticalBorders = toggleTableCellInsideVerticalBorders.asInstanceOf[js.Any], toggleTableCellLeftBorder = toggleTableCellLeftBorder.asInstanceOf[js.Any], toggleTableCellOutsideBorders = toggleTableCellOutsideBorders.asInstanceOf[js.Any], toggleTableCellRightBorder = toggleTableCellRightBorder.asInstanceOf[js.Any], toggleTableCellTopBorder = toggleTableCellTopBorder.asInstanceOf[js.Any], toggleTableFixedColumnWidth = toggleTableFixedColumnWidth.asInstanceOf[js.Any], toggleTextCase = toggleTextCase.asInstanceOf[js.Any], undo = undo.asInstanceOf[js.Any], updateAllFields = updateAllFields.asInstanceOf[js.Any], updateField = updateField.asInstanceOf[js.Any], updateTableOfContents = updateTableOfContents.asInstanceOf[js.Any])
    __obj.asInstanceOf[RichEditCommands]
  }
  @scala.inline
  implicit class RichEditCommandsOps[Self <: RichEditCommands] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddSpacingAfterParagraph(value: AddSpacingAfterParagraphCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSpacingAfterParagraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddSpacingBeforeParagraph(value: AddSpacingBeforeParagraphCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSpacingBeforeParagraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignShortcut(value: AssignShortcutCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignShortcut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackspace(value: BackspaceCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeginUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginUpdate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCapitalizeEachWordTextCase(value: CapitalizeEachWordTextCaseCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capitalizeEachWordTextCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeCustomNumberingList(value: ChangeCustomNumberingListCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeCustomNumberingList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeFloatingObjectAbsolutePosition(value: ChangeFloatingObjectAbsolutePositionCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFloatingObjectAbsolutePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeFloatingObjectAbsoluteSize(value: ChangeFloatingObjectAbsoluteSizeCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFloatingObjectAbsoluteSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeFloatingObjectAlignmentPosition(value: ChangeFloatingObjectAlignmentPositionCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFloatingObjectAlignmentPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeFloatingObjectFillColor(value: ChangeFloatingObjectFillColorCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFloatingObjectFillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeFloatingObjectLockAnchor(value: ChangeFloatingObjectLockAnchorCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFloatingObjectLockAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeFloatingObjectLockAspectRatio(value: ChangeFloatingObjectLockAspectRatioCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFloatingObjectLockAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeFloatingObjectOutlineColor(value: ChangeFloatingObjectOutlineColorCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFloatingObjectOutlineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeFloatingObjectOutlineWidth(value: ChangeFloatingObjectOutlineWidthCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFloatingObjectOutlineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeFloatingObjectRelativePosition(value: ChangeFloatingObjectRelativePositionCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFloatingObjectRelativePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeFloatingObjectRotation(value: ChangeFloatingObjectRotationCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFloatingObjectRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeFloatingObjectTextWrapping(value: ChangeFloatingObjectTextWrappingCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFloatingObjectTextWrapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeFontBackColor(value: ChangeFontBackColorCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFontBackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeFontBold(value: ChangeFontBoldCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFontBold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeFontForeColor(value: ChangeFontForeColorCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFontForeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeFontFormatting(value: ChangeFontFormattingCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFontFormatting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeFontItalic(value: ChangeFontItalicCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFontItalic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeFontName(value: ChangeFontNameCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFontName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeFontSize(value: ChangeFontSizeCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeFontStrikeout(value: ChangeFontStrikeoutCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFontStrikeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeFontSubscript(value: ChangeFontSubscriptCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFontSubscript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeFontSuperscript(value: ChangeFontSuperscriptCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFontSuperscript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeFontUnderline(value: ChangeFontUnderlineCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeFontUnderline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeHyperlink(value: ChangeHyperlinkCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeHyperlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangePageColor(value: ChangePageColorCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changePageColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangePageMargins(value: ChangePageMarginsCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changePageMargins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangePageOrientation(value: ChangePageOrientationCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changePageOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangePageSize(value: ChangePageSizeCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changePageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeParagraphBackColor(value: ChangeParagraphBackColorCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeParagraphBackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeParagraphFormatting(value: ChangeParagraphFormattingCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeParagraphFormatting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangePictureScale(value: ChangePictureScaleCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changePictureScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeSectionColumns(value: ChangeSectionColumnsCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeSectionColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeSectionEqualColumnCount(value: ChangeSectionEqualColumnCountCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeSectionEqualColumnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeStyle(value: ChangeStyleCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeTableBorderRepositoryItem(value: ChangeTableBorderRepositoryItemCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeTableBorderRepositoryItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeTableBordersAndShading(value: ChangeTableBordersAndShadingCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeTableBordersAndShading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeTableCellFormatting(value: ChangeTableCellFormattingCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeTableCellFormatting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeTableCellPreferredWidth(value: ChangeTableCellPreferredWidthCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeTableCellPreferredWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeTableCellShading(value: ChangeTableCellShadingCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeTableCellShading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeTableColumnPreferredWidth(value: ChangeTableColumnPreferredWidthCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeTableColumnPreferredWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeTableFormatting(value: ChangeTableFormattingCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeTableFormatting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeTableLook(value: ChangeTableLookCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeTableLook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeTableRowPreferredHeight(value: ChangeTableRowPreferredHeightCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeTableRowPreferredHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeTableStyle(value: ChangeTableStyleCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeTableStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeTabs(value: ChangeTabsCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeTabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeTextBoxContentMargins(value: ChangeTextBoxContentMarginsCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeTextBoxContentMargins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeTextBoxRelativeSize(value: ChangeTextBoxRelativeSizeCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeTextBoxRelativeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeTextBoxResizeShapeToFitText(value: ChangeTextBoxResizeShapeToFitTextCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeTextBoxResizeShapeToFitText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeViewType(value: ChangeViewTypeCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeViewType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearFormatting(value: ClearFormattingCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearFormatting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseHeaderFooter(value: CloseHeaderFooterCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeHeaderFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContinueNumberingList(value: ContinueNumberingListCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueNumberingList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopy(value: CopyCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyContent(value: CopyContentCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDateField(value: CreateDateFieldCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDateField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateField(value: CreateFieldCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateMergeField(value: CreateMergeFieldCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createMergeField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatePageCountField(value: CreatePageCountFieldCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createPageCountField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatePageField(value: CreatePageFieldCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createPageField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateTimeField(value: CreateTimeFieldCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTimeField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCut(value: CutCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecreaseFontSize(value: DecreaseFontSizeCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decreaseFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecreaseIndent(value: DecreaseIndentCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decreaseIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecrementNumberingIndent(value: DecrementNumberingIndentCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decrementNumberingIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecrementParagraphLeftIndent(value: DecrementParagraphLeftIndentCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decrementParagraphLeftIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: DeleteCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteBookmark(value: DeleteBookmarkCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteBookmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteHyperlink(value: DeleteHyperlinkCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteHyperlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteHyperlinks(value: DeleteHyperlinksCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteHyperlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteTable(value: DeleteTableCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteTableCellsDialog(value: DeleteTableCellsDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTableCellsDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteTableCellsWithShiftHorizontally(value: DeleteTableCellsWithShiftHorizontallyCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTableCellsWithShiftHorizontally")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteTableCellsWithShiftVertically(value: DeleteTableCellsWithShiftVerticallyCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTableCellsWithShiftVertically")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteTableColumns(value: DeleteTableColumnsCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTableColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteTableRows(value: DeleteTableRowsCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTableRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endUpdate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFileDownload(value: FileDownloadCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileDownload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileNew(value: FileNewCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileNew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileOpen(value: FileOpenCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileOpenDialog(value: FileOpenDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileOpenDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilePrint(value: FilePrintCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSave(value: FileSaveCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSaveAs(value: FileSaveAsCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSaveAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSaveAsDialog(value: FileSaveAsDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSaveAsDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindAll(value: FindAllCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceSyncWithServer(value: ForceSyncWithServerCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSyncWithServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRtf(value: GetRtfCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRtf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoToBookmark(value: GoToBookmarkCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToBookmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoToDataRecord(value: GoToDataRecordCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToDataRecord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoToFirstDataRecord(value: GoToFirstDataRecordCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToFirstDataRecord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoToFooter(value: GoToFooterCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoToHeader(value: GoToHeaderCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoToLastDataRecord(value: GoToLastDataRecordCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToLastDataRecord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoToNextDataRecord(value: GoToNextDataRecordCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToNextDataRecord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoToNextHeaderFooter(value: GoToNextHeaderFooterCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToNextHeaderFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoToPreviousDataRecord(value: GoToPreviousDataRecordCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToPreviousDataRecord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoToPreviousHeaderFooter(value: GoToPreviousHeaderFooterCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToPreviousHeaderFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideFindResults(value: HideFindResultsCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFindResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncreaseFontSize(value: IncreaseFontSizeCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increaseFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncreaseIndent(value: IncreaseIndentCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increaseIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncrementNumberingIndent(value: IncrementNumberingIndentCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementNumberingIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncrementParagraphLeftIndent(value: IncrementParagraphLeftIndentCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementParagraphLeftIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertBookmark(value: InsertBookmarkCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBookmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertColumnBreak(value: InsertColumnBreakCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertColumnBreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertContentFromServer(value: InsertContentFromServerCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertContentFromServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertEquationsCaption(value: InsertEquationsCaptionCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertEquationsCaption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertFiguresCaption(value: InsertFiguresCaptionCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertFiguresCaption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertFloatingTextBox(value: InsertFloatingTextBoxCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertFloatingTextBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertFooter(value: InsertFooterCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertHeader(value: InsertHeaderCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertHtml(value: InsertHtmlCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertHyperlink(value: InsertHyperlinkCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertHyperlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertLineBreak(value: InsertLineBreakCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertLineBreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertNonBreakingSpace(value: InsertNonBreakingSpaceCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertNonBreakingSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertNumeration(value: InsertNumerationCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertNumeration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertPageBreak(value: InsertPageBreakCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertPageBreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertParagraph(value: InsertParagraphCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertParagraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertPicture(value: InsertPictureCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertPicture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertRtf(value: InsertRtfCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertRtf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertSectionBreakEvenPage(value: InsertSectionBreakEvenPageCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSectionBreakEvenPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertSectionBreakNextPage(value: InsertSectionBreakNextPageCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSectionBreakNextPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertSectionBreakOddPage(value: InsertSectionBreakOddPageCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSectionBreakOddPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertSymbol(value: InsertSymbolCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertTab(value: InsertTabCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertTable(value: InsertTableCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertTableCellWithShiftToTheLeft(value: InsertTableCellWithShiftToTheLeftCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTableCellWithShiftToTheLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertTableCellsDialog(value: InsertTableCellsDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTableCellsDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertTableCellsWithShiftToTheVertically(value: InsertTableCellsWithShiftToTheVerticallyCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTableCellsWithShiftToTheVertically")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertTableColumnToTheLeft(value: InsertTableColumnToTheLeftCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTableColumnToTheLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertTableColumnToTheRight(value: InsertTableColumnToTheRightCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTableColumnToTheRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertTableOfContents(value: InsertTableOfContentsCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTableOfContents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertTableOfEquations(value: InsertTableOfEquationsCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTableOfEquations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertTableOfFigures(value: InsertTableOfFiguresCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTableOfFigures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertTableOfTables(value: InsertTableOfTablesCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTableOfTables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertTableRowAbove(value: InsertTableRowAboveCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTableRowAbove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertTableRowBelow(value: InsertTableRowBelowCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTableRowBelow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertTablesCaption(value: InsertTablesCaptionCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTablesCaption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertText(value: InsertTextCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkHeaderFooterToPrevious(value: LinkHeaderFooterToPreviousCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkHeaderFooterToPrevious")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMailMergeAndDownload(value: MailMergeAndDownloadCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailMergeAndDownload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMailMergeAndSaveAs(value: MailMergeAndSaveAsCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailMergeAndSaveAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMailMergeDialog(value: MailMergeDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailMergeDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMakeTextLowerCase(value: MakeTextLowerCaseCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeTextLowerCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMakeTextSentenceCase(value: MakeTextSentenceCaseCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeTextSentenceCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMakeTextUpperCase(value: MakeTextUpperCaseCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeTextUpperCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeFieldDialog(value: MergeFieldDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeFieldDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeTableCells(value: MergeTableCellsCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeTableCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoveContent(value: MoveContentCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenCustomNumberingListDialog(value: OpenCustomNumberingListDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openCustomNumberingListDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenFindAndReplaceDialog(value: OpenFindAndReplaceDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openFindAndReplaceDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenFindPanel(value: OpenFindPanelCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openFindPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenFontFormattingDialog(value: OpenFontFormattingDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openFontFormattingDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenHyperlink(value: OpenHyperlinkCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openHyperlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenInsertBookmarkDialog(value: OpenInsertBookmarkDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openInsertBookmarkDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenInsertHyperlinkDialog(value: OpenInsertHyperlinkDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openInsertHyperlinkDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenInsertPictureDialog(value: OpenInsertPictureDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openInsertPictureDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenInsertSymbolDialog(value: OpenInsertSymbolDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openInsertSymbolDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenInsertTableDialog(value: OpenInsertTableDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openInsertTableDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenLayoutOptionsDialog(value: OpenLayoutOptionsDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openLayoutOptionsDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenNumberingListDialog(value: OpenNumberingListDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openNumberingListDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenPageMarginsDialog(value: OpenPageMarginsDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openPageMarginsDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenPagePaperSizeDialog(value: OpenPagePaperSizeDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openPagePaperSizeDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenParagraphFormattingDialog(value: OpenParagraphFormattingDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openParagraphFormattingDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenSectionColumnsDialog(value: OpenSectionColumnsDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openSectionColumnsDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenSpellingDialog(value: OpenSpellingDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openSpellingDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenTableBordersAndShadingDialog(value: OpenTableBordersAndShadingDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openTableBordersAndShadingDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenTableFormattingDialog(value: OpenTableFormattingDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openTableFormattingDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenTabsDialog(value: OpenTabsDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openTabsDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaste(value: PasteCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedo(value: RedoCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveNextWord(value: RemoveNextWordCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeNextWord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveNumeration(value: RemoveNumerationCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeNumeration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemovePrevWord(value: RemovePrevWordCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePrevWord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveSpacingAfterParagraph(value: RemoveSpacingAfterParagraphCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSpacingAfterParagraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveSpacingBeforeParagraph(value: RemoveSpacingBeforeParagraphCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSpacingBeforeParagraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveTableCellBorders(value: RemoveTableCellBordersCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeTableCellBorders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceAll(value: ReplaceAllCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceNext(value: ReplaceNextCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestartNumberingList(value: RestartNumberingListCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartNumberingList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetDifferentFirstPageHeaderFooter(value: SetDifferentFirstPageHeaderFooterCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDifferentFirstPageHeaderFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetDifferentOddAndEvenPagesHeaderFooter(value: SetDifferentOddAndEvenPagesHeaderFooterCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDifferentOddAndEvenPagesHeaderFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetDoubleParagraphSpacing(value: SetDoubleParagraphSpacingCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDoubleParagraphSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetFullscreen(value: SetFullscreenCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetPageSizeDialog(value: SetPageSizeDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPageSizeDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetParagraphLevel(value: SetParagraphLevelCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParagraphLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetSesquialteralParagraphSpacing(value: SetSesquialteralParagraphSpacingCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSesquialteralParagraphSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetSingleParagraphSpacing(value: SetSingleParagraphSpacingCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSingleParagraphSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowAllFieldCodes(value: ShowAllFieldCodesCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAllFieldCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowFieldCodes(value: ShowFieldCodesCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFieldCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowHiddenSymbols(value: ShowHiddenSymbolsCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHiddenSymbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowHorizontalRuler(value: ShowHorizontalRulerCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHorizontalRuler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowMergedData(value: ShowMergedDataCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMergedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowTableGridLines(value: ShowTableGridLinesCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTableGridLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplitTableCells(value: SplitTableCellsCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitTableCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplitTableCellsDialog(value: SplitTableCellsDialogCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitTableCellsDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwitchTextCase(value: SwitchTextCaseCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchTextCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleBulletedList(value: ToggleBulletedListCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleBulletedList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleMultilevelList(value: ToggleMultilevelListCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleMultilevelList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleNumberingList(value: ToggleNumberingListCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleNumberingList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleParagraphAlignmentCenter(value: ToggleParagraphAlignmentCenterCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleParagraphAlignmentCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleParagraphAlignmentJustify(value: ToggleParagraphAlignmentJustifyCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleParagraphAlignmentJustify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleParagraphAlignmentLeft(value: ToggleParagraphAlignmentLeftCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleParagraphAlignmentLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleParagraphAlignmentRight(value: ToggleParagraphAlignmentRightCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleParagraphAlignmentRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleTableAutoFitContents(value: ToggleTableAutoFitContentsCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleTableAutoFitContents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleTableAutoFitWindow(value: ToggleTableAutoFitWindowCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleTableAutoFitWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleTableCellAlignBottomCenter(value: ToggleTableCellAlignBottomCenterCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleTableCellAlignBottomCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleTableCellAlignBottomLeft(value: ToggleTableCellAlignBottomLeftCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleTableCellAlignBottomLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleTableCellAlignBottomRight(value: ToggleTableCellAlignBottomRightCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleTableCellAlignBottomRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleTableCellAlignMiddleCenter(value: ToggleTableCellAlignMiddleCenterCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleTableCellAlignMiddleCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleTableCellAlignMiddleLeft(value: ToggleTableCellAlignMiddleLeftCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleTableCellAlignMiddleLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleTableCellAlignMiddleRight(value: ToggleTableCellAlignMiddleRightCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleTableCellAlignMiddleRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleTableCellAlignTopCenter(value: ToggleTableCellAlignTopCenterCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleTableCellAlignTopCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleTableCellAlignTopLeft(value: ToggleTableCellAlignTopLeftCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleTableCellAlignTopLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleTableCellAlignTopRight(value: ToggleTableCellAlignTopRightCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleTableCellAlignTopRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleTableCellAllBorders(value: ToggleTableCellAllBordersCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleTableCellAllBorders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleTableCellBottomBorder(value: ToggleTableCellBottomBorderCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleTableCellBottomBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleTableCellInsideBorders(value: ToggleTableCellInsideBordersCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleTableCellInsideBorders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleTableCellInsideHorizontalBorders(value: ToggleTableCellInsideHorizontalBordersCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleTableCellInsideHorizontalBorders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleTableCellInsideVerticalBorders(value: ToggleTableCellInsideVerticalBordersCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleTableCellInsideVerticalBorders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleTableCellLeftBorder(value: ToggleTableCellLeftBorderCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleTableCellLeftBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleTableCellOutsideBorders(value: ToggleTableCellOutsideBordersCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleTableCellOutsideBorders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleTableCellRightBorder(value: ToggleTableCellRightBorderCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleTableCellRightBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleTableCellTopBorder(value: ToggleTableCellTopBorderCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleTableCellTopBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleTableFixedColumnWidth(value: ToggleTableFixedColumnWidthCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleTableFixedColumnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleTextCase(value: ToggleTextCaseCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleTextCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndo(value: UndoCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateAllFields(value: UpdateAllFieldsCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAllFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateField(value: UpdateFieldCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateTableOfContents(value: UpdateTableOfContentsCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTableOfContents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

