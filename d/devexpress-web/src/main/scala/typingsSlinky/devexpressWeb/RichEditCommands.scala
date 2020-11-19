package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Gets a command to prevent the control UI from being updated until the RichEditCommands.endUpdate method is called.
    */
  def beginUpdate(): Unit = js.native
  
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
    * Re-enables render operations after a call to the RichEditCommands.beginUpdate method and forces immediate re-rendering.
    */
  def endUpdate(): Unit = js.native
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddSpacingAfterParagraph(value: AddSpacingAfterParagraphCommand): Self = this.set("addSpacingAfterParagraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSpacingBeforeParagraph(value: AddSpacingBeforeParagraphCommand): Self = this.set("addSpacingBeforeParagraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignShortcut(value: AssignShortcutCommand): Self = this.set("assignShortcut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackspace(value: BackspaceCommand): Self = this.set("backspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginUpdate(value: () => Unit): Self = this.set("beginUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCapitalizeEachWordTextCase(value: CapitalizeEachWordTextCaseCommand): Self = this.set("capitalizeEachWordTextCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeCustomNumberingList(value: ChangeCustomNumberingListCommand): Self = this.set("changeCustomNumberingList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeFloatingObjectAbsolutePosition(value: ChangeFloatingObjectAbsolutePositionCommand): Self = this.set("changeFloatingObjectAbsolutePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeFloatingObjectAbsoluteSize(value: ChangeFloatingObjectAbsoluteSizeCommand): Self = this.set("changeFloatingObjectAbsoluteSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeFloatingObjectAlignmentPosition(value: ChangeFloatingObjectAlignmentPositionCommand): Self = this.set("changeFloatingObjectAlignmentPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeFloatingObjectFillColor(value: ChangeFloatingObjectFillColorCommand): Self = this.set("changeFloatingObjectFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeFloatingObjectLockAnchor(value: ChangeFloatingObjectLockAnchorCommand): Self = this.set("changeFloatingObjectLockAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeFloatingObjectLockAspectRatio(value: ChangeFloatingObjectLockAspectRatioCommand): Self = this.set("changeFloatingObjectLockAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeFloatingObjectOutlineColor(value: ChangeFloatingObjectOutlineColorCommand): Self = this.set("changeFloatingObjectOutlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeFloatingObjectOutlineWidth(value: ChangeFloatingObjectOutlineWidthCommand): Self = this.set("changeFloatingObjectOutlineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeFloatingObjectRelativePosition(value: ChangeFloatingObjectRelativePositionCommand): Self = this.set("changeFloatingObjectRelativePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeFloatingObjectRotation(value: ChangeFloatingObjectRotationCommand): Self = this.set("changeFloatingObjectRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeFloatingObjectTextWrapping(value: ChangeFloatingObjectTextWrappingCommand): Self = this.set("changeFloatingObjectTextWrapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeFontBackColor(value: ChangeFontBackColorCommand): Self = this.set("changeFontBackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeFontBold(value: ChangeFontBoldCommand): Self = this.set("changeFontBold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeFontForeColor(value: ChangeFontForeColorCommand): Self = this.set("changeFontForeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeFontFormatting(value: ChangeFontFormattingCommand): Self = this.set("changeFontFormatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeFontItalic(value: ChangeFontItalicCommand): Self = this.set("changeFontItalic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeFontName(value: ChangeFontNameCommand): Self = this.set("changeFontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeFontSize(value: ChangeFontSizeCommand): Self = this.set("changeFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeFontStrikeout(value: ChangeFontStrikeoutCommand): Self = this.set("changeFontStrikeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeFontSubscript(value: ChangeFontSubscriptCommand): Self = this.set("changeFontSubscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeFontSuperscript(value: ChangeFontSuperscriptCommand): Self = this.set("changeFontSuperscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeFontUnderline(value: ChangeFontUnderlineCommand): Self = this.set("changeFontUnderline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeHyperlink(value: ChangeHyperlinkCommand): Self = this.set("changeHyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangePageColor(value: ChangePageColorCommand): Self = this.set("changePageColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangePageMargins(value: ChangePageMarginsCommand): Self = this.set("changePageMargins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangePageOrientation(value: ChangePageOrientationCommand): Self = this.set("changePageOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangePageSize(value: ChangePageSizeCommand): Self = this.set("changePageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeParagraphBackColor(value: ChangeParagraphBackColorCommand): Self = this.set("changeParagraphBackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeParagraphFormatting(value: ChangeParagraphFormattingCommand): Self = this.set("changeParagraphFormatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangePictureScale(value: ChangePictureScaleCommand): Self = this.set("changePictureScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSectionColumns(value: ChangeSectionColumnsCommand): Self = this.set("changeSectionColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSectionEqualColumnCount(value: ChangeSectionEqualColumnCountCommand): Self = this.set("changeSectionEqualColumnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeStyle(value: ChangeStyleCommand): Self = this.set("changeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTableBorderRepositoryItem(value: ChangeTableBorderRepositoryItemCommand): Self = this.set("changeTableBorderRepositoryItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTableBordersAndShading(value: ChangeTableBordersAndShadingCommand): Self = this.set("changeTableBordersAndShading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTableCellFormatting(value: ChangeTableCellFormattingCommand): Self = this.set("changeTableCellFormatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTableCellPreferredWidth(value: ChangeTableCellPreferredWidthCommand): Self = this.set("changeTableCellPreferredWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTableCellShading(value: ChangeTableCellShadingCommand): Self = this.set("changeTableCellShading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTableColumnPreferredWidth(value: ChangeTableColumnPreferredWidthCommand): Self = this.set("changeTableColumnPreferredWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTableFormatting(value: ChangeTableFormattingCommand): Self = this.set("changeTableFormatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTableLook(value: ChangeTableLookCommand): Self = this.set("changeTableLook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTableRowPreferredHeight(value: ChangeTableRowPreferredHeightCommand): Self = this.set("changeTableRowPreferredHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTableStyle(value: ChangeTableStyleCommand): Self = this.set("changeTableStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTabs(value: ChangeTabsCommand): Self = this.set("changeTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTextBoxContentMargins(value: ChangeTextBoxContentMarginsCommand): Self = this.set("changeTextBoxContentMargins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTextBoxRelativeSize(value: ChangeTextBoxRelativeSizeCommand): Self = this.set("changeTextBoxRelativeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTextBoxResizeShapeToFitText(value: ChangeTextBoxResizeShapeToFitTextCommand): Self = this.set("changeTextBoxResizeShapeToFitText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeViewType(value: ChangeViewTypeCommand): Self = this.set("changeViewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearFormatting(value: ClearFormattingCommand): Self = this.set("clearFormatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseHeaderFooter(value: CloseHeaderFooterCommand): Self = this.set("closeHeaderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueNumberingList(value: ContinueNumberingListCommand): Self = this.set("continueNumberingList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy(value: CopyCommand): Self = this.set("copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyContent(value: CopyContentCommand): Self = this.set("copyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateField(value: CreateDateFieldCommand): Self = this.set("createDateField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateField(value: CreateFieldCommand): Self = this.set("createField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateMergeField(value: CreateMergeFieldCommand): Self = this.set("createMergeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatePageCountField(value: CreatePageCountFieldCommand): Self = this.set("createPageCountField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatePageField(value: CreatePageFieldCommand): Self = this.set("createPageField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeField(value: CreateTimeFieldCommand): Self = this.set("createTimeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCut(value: CutCommand): Self = this.set("cut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecreaseFontSize(value: DecreaseFontSizeCommand): Self = this.set("decreaseFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecreaseIndent(value: DecreaseIndentCommand): Self = this.set("decreaseIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecrementNumberingIndent(value: DecrementNumberingIndentCommand): Self = this.set("decrementNumberingIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecrementParagraphLeftIndent(value: DecrementParagraphLeftIndentCommand): Self = this.set("decrementParagraphLeftIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: DeleteCommand): Self = this.set("delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteBookmark(value: DeleteBookmarkCommand): Self = this.set("deleteBookmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteHyperlink(value: DeleteHyperlinkCommand): Self = this.set("deleteHyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteHyperlinks(value: DeleteHyperlinksCommand): Self = this.set("deleteHyperlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTable(value: DeleteTableCommand): Self = this.set("deleteTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTableCellsDialog(value: DeleteTableCellsDialogCommand): Self = this.set("deleteTableCellsDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTableCellsWithShiftHorizontally(value: DeleteTableCellsWithShiftHorizontallyCommand): Self = this.set("deleteTableCellsWithShiftHorizontally", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTableCellsWithShiftVertically(value: DeleteTableCellsWithShiftVerticallyCommand): Self = this.set("deleteTableCellsWithShiftVertically", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTableColumns(value: DeleteTableColumnsCommand): Self = this.set("deleteTableColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTableRows(value: DeleteTableRowsCommand): Self = this.set("deleteTableRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUpdate(value: () => Unit): Self = this.set("endUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFileDownload(value: FileDownloadCommand): Self = this.set("fileDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNew(value: FileNewCommand): Self = this.set("fileNew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileOpen(value: FileOpenCommand): Self = this.set("fileOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileOpenDialog(value: FileOpenDialogCommand): Self = this.set("fileOpenDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePrint(value: FilePrintCommand): Self = this.set("filePrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSave(value: FileSaveCommand): Self = this.set("fileSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSaveAs(value: FileSaveAsCommand): Self = this.set("fileSaveAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSaveAsDialog(value: FileSaveAsDialogCommand): Self = this.set("fileSaveAsDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindAll(value: FindAllCommand): Self = this.set("findAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceSyncWithServer(value: ForceSyncWithServerCommand): Self = this.set("forceSyncWithServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRtf(value: GetRtfCommand): Self = this.set("getRtf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoToBookmark(value: GoToBookmarkCommand): Self = this.set("goToBookmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoToDataRecord(value: GoToDataRecordCommand): Self = this.set("goToDataRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoToFirstDataRecord(value: GoToFirstDataRecordCommand): Self = this.set("goToFirstDataRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoToFooter(value: GoToFooterCommand): Self = this.set("goToFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoToHeader(value: GoToHeaderCommand): Self = this.set("goToHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoToLastDataRecord(value: GoToLastDataRecordCommand): Self = this.set("goToLastDataRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoToNextDataRecord(value: GoToNextDataRecordCommand): Self = this.set("goToNextDataRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoToNextHeaderFooter(value: GoToNextHeaderFooterCommand): Self = this.set("goToNextHeaderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoToPreviousDataRecord(value: GoToPreviousDataRecordCommand): Self = this.set("goToPreviousDataRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoToPreviousHeaderFooter(value: GoToPreviousHeaderFooterCommand): Self = this.set("goToPreviousHeaderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideFindResults(value: HideFindResultsCommand): Self = this.set("hideFindResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncreaseFontSize(value: IncreaseFontSizeCommand): Self = this.set("increaseFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncreaseIndent(value: IncreaseIndentCommand): Self = this.set("increaseIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementNumberingIndent(value: IncrementNumberingIndentCommand): Self = this.set("incrementNumberingIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementParagraphLeftIndent(value: IncrementParagraphLeftIndentCommand): Self = this.set("incrementParagraphLeftIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertBookmark(value: InsertBookmarkCommand): Self = this.set("insertBookmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertColumnBreak(value: InsertColumnBreakCommand): Self = this.set("insertColumnBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertContentFromServer(value: InsertContentFromServerCommand): Self = this.set("insertContentFromServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertEquationsCaption(value: InsertEquationsCaptionCommand): Self = this.set("insertEquationsCaption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertFiguresCaption(value: InsertFiguresCaptionCommand): Self = this.set("insertFiguresCaption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertFloatingTextBox(value: InsertFloatingTextBoxCommand): Self = this.set("insertFloatingTextBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertFooter(value: InsertFooterCommand): Self = this.set("insertFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertHeader(value: InsertHeaderCommand): Self = this.set("insertHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertHtml(value: InsertHtmlCommand): Self = this.set("insertHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertHyperlink(value: InsertHyperlinkCommand): Self = this.set("insertHyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertLineBreak(value: InsertLineBreakCommand): Self = this.set("insertLineBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertNonBreakingSpace(value: InsertNonBreakingSpaceCommand): Self = this.set("insertNonBreakingSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertNumeration(value: InsertNumerationCommand): Self = this.set("insertNumeration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertPageBreak(value: InsertPageBreakCommand): Self = this.set("insertPageBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertParagraph(value: InsertParagraphCommand): Self = this.set("insertParagraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertPicture(value: InsertPictureCommand): Self = this.set("insertPicture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertRtf(value: InsertRtfCommand): Self = this.set("insertRtf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSectionBreakEvenPage(value: InsertSectionBreakEvenPageCommand): Self = this.set("insertSectionBreakEvenPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSectionBreakNextPage(value: InsertSectionBreakNextPageCommand): Self = this.set("insertSectionBreakNextPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSectionBreakOddPage(value: InsertSectionBreakOddPageCommand): Self = this.set("insertSectionBreakOddPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSymbol(value: InsertSymbolCommand): Self = this.set("insertSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTab(value: InsertTabCommand): Self = this.set("insertTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTable(value: InsertTableCommand): Self = this.set("insertTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTableCellWithShiftToTheLeft(value: InsertTableCellWithShiftToTheLeftCommand): Self = this.set("insertTableCellWithShiftToTheLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTableCellsDialog(value: InsertTableCellsDialogCommand): Self = this.set("insertTableCellsDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTableCellsWithShiftToTheVertically(value: InsertTableCellsWithShiftToTheVerticallyCommand): Self = this.set("insertTableCellsWithShiftToTheVertically", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTableColumnToTheLeft(value: InsertTableColumnToTheLeftCommand): Self = this.set("insertTableColumnToTheLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTableColumnToTheRight(value: InsertTableColumnToTheRightCommand): Self = this.set("insertTableColumnToTheRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTableOfContents(value: InsertTableOfContentsCommand): Self = this.set("insertTableOfContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTableOfEquations(value: InsertTableOfEquationsCommand): Self = this.set("insertTableOfEquations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTableOfFigures(value: InsertTableOfFiguresCommand): Self = this.set("insertTableOfFigures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTableOfTables(value: InsertTableOfTablesCommand): Self = this.set("insertTableOfTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTableRowAbove(value: InsertTableRowAboveCommand): Self = this.set("insertTableRowAbove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTableRowBelow(value: InsertTableRowBelowCommand): Self = this.set("insertTableRowBelow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTablesCaption(value: InsertTablesCaptionCommand): Self = this.set("insertTablesCaption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertText(value: InsertTextCommand): Self = this.set("insertText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkHeaderFooterToPrevious(value: LinkHeaderFooterToPreviousCommand): Self = this.set("linkHeaderFooterToPrevious", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailMergeAndDownload(value: MailMergeAndDownloadCommand): Self = this.set("mailMergeAndDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailMergeAndSaveAs(value: MailMergeAndSaveAsCommand): Self = this.set("mailMergeAndSaveAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailMergeDialog(value: MailMergeDialogCommand): Self = this.set("mailMergeDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMakeTextLowerCase(value: MakeTextLowerCaseCommand): Self = this.set("makeTextLowerCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMakeTextSentenceCase(value: MakeTextSentenceCaseCommand): Self = this.set("makeTextSentenceCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMakeTextUpperCase(value: MakeTextUpperCaseCommand): Self = this.set("makeTextUpperCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeFieldDialog(value: MergeFieldDialogCommand): Self = this.set("mergeFieldDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeTableCells(value: MergeTableCellsCommand): Self = this.set("mergeTableCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveContent(value: MoveContentCommand): Self = this.set("moveContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenCustomNumberingListDialog(value: OpenCustomNumberingListDialogCommand): Self = this.set("openCustomNumberingListDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenFindAndReplaceDialog(value: OpenFindAndReplaceDialogCommand): Self = this.set("openFindAndReplaceDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenFindPanel(value: OpenFindPanelCommand): Self = this.set("openFindPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenFontFormattingDialog(value: OpenFontFormattingDialogCommand): Self = this.set("openFontFormattingDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenHyperlink(value: OpenHyperlinkCommand): Self = this.set("openHyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenInsertBookmarkDialog(value: OpenInsertBookmarkDialogCommand): Self = this.set("openInsertBookmarkDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenInsertHyperlinkDialog(value: OpenInsertHyperlinkDialogCommand): Self = this.set("openInsertHyperlinkDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenInsertPictureDialog(value: OpenInsertPictureDialogCommand): Self = this.set("openInsertPictureDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenInsertSymbolDialog(value: OpenInsertSymbolDialogCommand): Self = this.set("openInsertSymbolDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenInsertTableDialog(value: OpenInsertTableDialogCommand): Self = this.set("openInsertTableDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenLayoutOptionsDialog(value: OpenLayoutOptionsDialogCommand): Self = this.set("openLayoutOptionsDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenNumberingListDialog(value: OpenNumberingListDialogCommand): Self = this.set("openNumberingListDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenPageMarginsDialog(value: OpenPageMarginsDialogCommand): Self = this.set("openPageMarginsDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenPagePaperSizeDialog(value: OpenPagePaperSizeDialogCommand): Self = this.set("openPagePaperSizeDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenParagraphFormattingDialog(value: OpenParagraphFormattingDialogCommand): Self = this.set("openParagraphFormattingDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenSectionColumnsDialog(value: OpenSectionColumnsDialogCommand): Self = this.set("openSectionColumnsDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenSpellingDialog(value: OpenSpellingDialogCommand): Self = this.set("openSpellingDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenTableBordersAndShadingDialog(value: OpenTableBordersAndShadingDialogCommand): Self = this.set("openTableBordersAndShadingDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenTableFormattingDialog(value: OpenTableFormattingDialogCommand): Self = this.set("openTableFormattingDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenTabsDialog(value: OpenTabsDialogCommand): Self = this.set("openTabsDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaste(value: PasteCommand): Self = this.set("paste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedo(value: RedoCommand): Self = this.set("redo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveNextWord(value: RemoveNextWordCommand): Self = this.set("removeNextWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveNumeration(value: RemoveNumerationCommand): Self = this.set("removeNumeration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovePrevWord(value: RemovePrevWordCommand): Self = this.set("removePrevWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveSpacingAfterParagraph(value: RemoveSpacingAfterParagraphCommand): Self = this.set("removeSpacingAfterParagraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveSpacingBeforeParagraph(value: RemoveSpacingBeforeParagraphCommand): Self = this.set("removeSpacingBeforeParagraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveTableCellBorders(value: RemoveTableCellBordersCommand): Self = this.set("removeTableCellBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceAll(value: ReplaceAllCommand): Self = this.set("replaceAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceNext(value: ReplaceNextCommand): Self = this.set("replaceNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartNumberingList(value: RestartNumberingListCommand): Self = this.set("restartNumberingList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDifferentFirstPageHeaderFooter(value: SetDifferentFirstPageHeaderFooterCommand): Self = this.set("setDifferentFirstPageHeaderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDifferentOddAndEvenPagesHeaderFooter(value: SetDifferentOddAndEvenPagesHeaderFooterCommand): Self = this.set("setDifferentOddAndEvenPagesHeaderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDoubleParagraphSpacing(value: SetDoubleParagraphSpacingCommand): Self = this.set("setDoubleParagraphSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFullscreen(value: SetFullscreenCommand): Self = this.set("setFullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetPageSizeDialog(value: SetPageSizeDialogCommand): Self = this.set("setPageSizeDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetParagraphLevel(value: SetParagraphLevelCommand): Self = this.set("setParagraphLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetSesquialteralParagraphSpacing(value: SetSesquialteralParagraphSpacingCommand): Self = this.set("setSesquialteralParagraphSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetSingleParagraphSpacing(value: SetSingleParagraphSpacingCommand): Self = this.set("setSingleParagraphSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAllFieldCodes(value: ShowAllFieldCodesCommand): Self = this.set("showAllFieldCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFieldCodes(value: ShowFieldCodesCommand): Self = this.set("showFieldCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHiddenSymbols(value: ShowHiddenSymbolsCommand): Self = this.set("showHiddenSymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHorizontalRuler(value: ShowHorizontalRulerCommand): Self = this.set("showHorizontalRuler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMergedData(value: ShowMergedDataCommand): Self = this.set("showMergedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTableGridLines(value: ShowTableGridLinesCommand): Self = this.set("showTableGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitTableCells(value: SplitTableCellsCommand): Self = this.set("splitTableCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitTableCellsDialog(value: SplitTableCellsDialogCommand): Self = this.set("splitTableCellsDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchTextCase(value: SwitchTextCaseCommand): Self = this.set("switchTextCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleBulletedList(value: ToggleBulletedListCommand): Self = this.set("toggleBulletedList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleMultilevelList(value: ToggleMultilevelListCommand): Self = this.set("toggleMultilevelList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleNumberingList(value: ToggleNumberingListCommand): Self = this.set("toggleNumberingList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleParagraphAlignmentCenter(value: ToggleParagraphAlignmentCenterCommand): Self = this.set("toggleParagraphAlignmentCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleParagraphAlignmentJustify(value: ToggleParagraphAlignmentJustifyCommand): Self = this.set("toggleParagraphAlignmentJustify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleParagraphAlignmentLeft(value: ToggleParagraphAlignmentLeftCommand): Self = this.set("toggleParagraphAlignmentLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleParagraphAlignmentRight(value: ToggleParagraphAlignmentRightCommand): Self = this.set("toggleParagraphAlignmentRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleTableAutoFitContents(value: ToggleTableAutoFitContentsCommand): Self = this.set("toggleTableAutoFitContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleTableAutoFitWindow(value: ToggleTableAutoFitWindowCommand): Self = this.set("toggleTableAutoFitWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleTableCellAlignBottomCenter(value: ToggleTableCellAlignBottomCenterCommand): Self = this.set("toggleTableCellAlignBottomCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleTableCellAlignBottomLeft(value: ToggleTableCellAlignBottomLeftCommand): Self = this.set("toggleTableCellAlignBottomLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleTableCellAlignBottomRight(value: ToggleTableCellAlignBottomRightCommand): Self = this.set("toggleTableCellAlignBottomRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleTableCellAlignMiddleCenter(value: ToggleTableCellAlignMiddleCenterCommand): Self = this.set("toggleTableCellAlignMiddleCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleTableCellAlignMiddleLeft(value: ToggleTableCellAlignMiddleLeftCommand): Self = this.set("toggleTableCellAlignMiddleLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleTableCellAlignMiddleRight(value: ToggleTableCellAlignMiddleRightCommand): Self = this.set("toggleTableCellAlignMiddleRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleTableCellAlignTopCenter(value: ToggleTableCellAlignTopCenterCommand): Self = this.set("toggleTableCellAlignTopCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleTableCellAlignTopLeft(value: ToggleTableCellAlignTopLeftCommand): Self = this.set("toggleTableCellAlignTopLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleTableCellAlignTopRight(value: ToggleTableCellAlignTopRightCommand): Self = this.set("toggleTableCellAlignTopRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleTableCellAllBorders(value: ToggleTableCellAllBordersCommand): Self = this.set("toggleTableCellAllBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleTableCellBottomBorder(value: ToggleTableCellBottomBorderCommand): Self = this.set("toggleTableCellBottomBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleTableCellInsideBorders(value: ToggleTableCellInsideBordersCommand): Self = this.set("toggleTableCellInsideBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleTableCellInsideHorizontalBorders(value: ToggleTableCellInsideHorizontalBordersCommand): Self = this.set("toggleTableCellInsideHorizontalBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleTableCellInsideVerticalBorders(value: ToggleTableCellInsideVerticalBordersCommand): Self = this.set("toggleTableCellInsideVerticalBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleTableCellLeftBorder(value: ToggleTableCellLeftBorderCommand): Self = this.set("toggleTableCellLeftBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleTableCellOutsideBorders(value: ToggleTableCellOutsideBordersCommand): Self = this.set("toggleTableCellOutsideBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleTableCellRightBorder(value: ToggleTableCellRightBorderCommand): Self = this.set("toggleTableCellRightBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleTableCellTopBorder(value: ToggleTableCellTopBorderCommand): Self = this.set("toggleTableCellTopBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleTableFixedColumnWidth(value: ToggleTableFixedColumnWidthCommand): Self = this.set("toggleTableFixedColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleTextCase(value: ToggleTextCaseCommand): Self = this.set("toggleTextCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndo(value: UndoCommand): Self = this.set("undo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAllFields(value: UpdateAllFieldsCommand): Self = this.set("updateAllFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateField(value: UpdateFieldCommand): Self = this.set("updateField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTableOfContents(value: UpdateTableOfContentsCommand): Self = this.set("updateTableOfContents", value.asInstanceOf[js.Any])
  }
}
