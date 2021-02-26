package typingsSlinky.googleAppsScript.global.GoogleAppsScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Forms {
  
  /**
    * An enum representing the supported types of image alignment. Alignment types can be accessed from
    * FormApp.Alignment.
    *
    *     // Open a form by ID and add a new image item with alignment
    *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
    *     var img = UrlFetchApp.fetch('https://www.google.com/images/srpr/logo4w.png');
    *     form.addImageItem()
    *         .setImage(img)
    *         .setAlignment(FormApp.Alignment.CENTER);
    */
  @JSGlobal("GoogleAppsScript.Forms.Alignment")
  @js.native
  object Alignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.Alignment with Double] = js.native
    
    /* 1 */ val CENTER: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.Alignment.CENTER with Double = js.native
    
    /* 0 */ val LEFT: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.Alignment.LEFT with Double = js.native
    
    /* 2 */ val RIGHT: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.Alignment.RIGHT with Double = js.native
  }
  
  /**
    * An enum representing the supported types of form-response destinations. All forms, including
    * those that do not have a destination set explicitly, save a copy of responses in the form's
    * response store. Destination types can be accessed from FormApp.DestinationType.
    *
    *     // Open a form by ID and create a new spreadsheet.
    *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
    *     var ss = SpreadsheetApp.create('Spreadsheet Name');
    *
    *     // Update the form's response destination.
    *     form.setDestination(FormApp.DestinationType.SPREADSHEET, ss.getId());
    */
  @JSGlobal("GoogleAppsScript.Forms.DestinationType")
  @js.native
  object DestinationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.DestinationType with Double
      ] = js.native
    
    /* 0 */ val SPREADSHEET: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.DestinationType.SPREADSHEET with Double = js.native
  }
  
  /**
    * An enum representing the supported types of feedback. Feedback types can be accessed from FormApp.FeedbackType.
    *
    *     // Open a form by ID and add a new list item.
    *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
    *     var item = form.addListItem();
    *     item.setTitle('Do you prefer cats or dogs?');
    *     // Set "Dogs" as the correct answer to this question.
    *     item.setChoices([
    *       item.createChoice('Dogs', true),
    *       item.createChoice('Cats', false)]);
    *     // Add feedback which will be shown for correct responses; ie "Dogs".
    *     item.setFeedbackForCorrect(
    *         FormApp.createFeedback().setDisplayText("Dogs rule, cats drool.").build());
    */
  @JSGlobal("GoogleAppsScript.Forms.FeedbackType")
  @js.native
  object FeedbackType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.FeedbackType with Double] = js.native
    
    /* 0 */ val CORRECT: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.FeedbackType.CORRECT with Double = js.native
    
    /* 2 */ val GENERAL: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.FeedbackType.GENERAL with Double = js.native
    
    /* 1 */ val INCORRECT: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.FeedbackType.INCORRECT with Double = js.native
  }
  
  /**
    * An enum representing the supported types of form items. Item types can be accessed from FormApp.ItemType.
    *
    *     // Open a form by ID and add a new section header.
    *     var form = FormApp.create('Form Name');
    *     var item = form.addSectionHeaderItem();
    *     item.setTitle('Title of new section');
    *
    *     // Check the item type.
    *     if (item.getType() == FormApp.ItemType.SECTION_HEADER) {
    *       item.setHelpText('Description of new section.');
    *     }
    */
  @JSGlobal("GoogleAppsScript.Forms.ItemType")
  @js.native
  object ItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.ItemType with Double] = js.native
    
    /* 0 */ val CHECKBOX: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.ItemType.CHECKBOX with Double = js.native
    
    /* 1 */ val CHECKBOX_GRID: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.ItemType.CHECKBOX_GRID with Double = js.native
    
    /* 2 */ val DATE: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.ItemType.DATE with Double = js.native
    
    /* 3 */ val DATETIME: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.ItemType.DATETIME with Double = js.native
    
    /* 4 */ val DURATION: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.ItemType.DURATION with Double = js.native
    
    /* 5 */ val GRID: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.ItemType.GRID with Double = js.native
    
    /* 6 */ val IMAGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.ItemType.IMAGE with Double = js.native
    
    /* 7 */ val LIST: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.ItemType.LIST with Double = js.native
    
    /* 8 */ val MULTIPLE_CHOICE: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.ItemType.MULTIPLE_CHOICE with Double = js.native
    
    /* 9 */ val PAGE_BREAK: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.ItemType.PAGE_BREAK with Double = js.native
    
    /* 10 */ val PARAGRAPH_TEXT: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.ItemType.PARAGRAPH_TEXT with Double = js.native
    
    /* 11 */ val SCALE: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.ItemType.SCALE with Double = js.native
    
    /* 12 */ val SECTION_HEADER: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.ItemType.SECTION_HEADER with Double = js.native
    
    /* 13 */ val TEXT: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.ItemType.TEXT with Double = js.native
    
    /* 14 */ val TIME: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.ItemType.TIME with Double = js.native
    
    /* 15 */ val VIDEO: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.ItemType.VIDEO with Double = js.native
  }
  
  /**
    * An enum representing the supported types of page navigation. Page navigation types can be
    * accessed from FormApp.PageNavigationType.
    *
    * The page navigation occurs after the respondent completes a page that contains the option, and
    * only if the respondent chose that option. If the respondent chose multiple options with
    * page-navigation instructions on the same page, only the last navigation option has any effect.
    * Page navigation also has no effect on the last page of a form.
    *
    * Choices that use page navigation cannot be combined in the same item with choices that do not
    * use page navigation.
    *
    *     // Create a form and add a new multiple-choice item and a page-break item.
    *     var form = FormApp.create('Form Name');
    *     var item = form.addMultipleChoiceItem();
    *     var pageBreak = form.addPageBreakItem();
    *
    *     // Set some choices with go-to-page logic.
    *     var rightChoice = item.createChoice('Vanilla', FormApp.PageNavigationType.SUBMIT);
    *     var wrongChoice = item.createChoice('Chocolate', FormApp.PageNavigationType.RESTART);
    *
    *     // For GO_TO_PAGE, just pass in the page break item. For CONTINUE (normally the default), pass in
    *     // CONTINUE explicitly because page navigation cannot be mixed with non-navigation choices.
    *     var iffyChoice = item.createChoice('Peanut', pageBreak);
    *     var otherChoice = item.createChoice('Strawberry', FormApp.PageNavigationType.CONTINUE);
    *     item.setChoices([rightChoice, wrongChoice, iffyChoice, otherChoice]);
    */
  @JSGlobal("GoogleAppsScript.Forms.PageNavigationType")
  @js.native
  object PageNavigationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.PageNavigationType with Double
      ] = js.native
    
    /* 0 */ val CONTINUE: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.PageNavigationType.CONTINUE with Double = js.native
    
    /* 1 */ val GO_TO_PAGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.PageNavigationType.GO_TO_PAGE with Double = js.native
    
    /* 2 */ val RESTART: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.PageNavigationType.RESTART with Double = js.native
    
    /* 3 */ val SUBMIT: typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.PageNavigationType.SUBMIT with Double = js.native
  }
}
