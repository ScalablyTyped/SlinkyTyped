package typingsSlinky.googleAppsScript.global.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An enumeration representing the data validation criteria that can be set on a range.
  *
  *     // Change existing data-validation rules that require a date in 2013 to require a date in 2014.
  *     var oldDates = [new Date('1/1/2013'), new Date('12/31/2013')];
  *     var newDates = [new Date('1/1/2014'), new Date('12/31/2014')];
  *     var sheet = SpreadsheetApp.getActiveSheet();
  *     var range = sheet.getRange(1, 1, sheet.getMaxRows(), sheet.getMaxColumns());
  *     var rules = range.getDataValidations();
  *
  *     for (var i = 0; i < rules.length; i++) {
  *       for (var j = 0; j < rules[i].length; j++) {
  *         var rule = rules[i][j];
  *
  *         if (rule != null) {
  *           var criteria = rule.getCriteriaType();
  *           var args = rule.getCriteriaValues();
  *
  *           if (criteria == SpreadsheetApp.DataValidationCriteria.DATE_BETWEEN
  *               && args[0].getTime() == oldDates[0].getTime()
  *               && args[1].getTime() == oldDates[1].getTime()) {
  *             // Create a builder from the existing rule, then change the dates.
  *             rules[i][j] = rule.copy().withCriteria(criteria, newDates).build();
  *           }
  *         }
  *       }
  *     }
  *     range.setDataValidations(rules);
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.DataValidationCriteria")
@js.native
object DataValidationCriteria extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria with Double
  ] = js.native
  
  /* 24 */ val CHECKBOX: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.CHECKBOX with Double = js.native
  
  /* 23 */ val CUSTOM_FORMULA: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.CUSTOM_FORMULA with Double = js.native
  
  /* 0 */ val DATE_AFTER: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.DATE_AFTER with Double = js.native
  
  /* 1 */ val DATE_BEFORE: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.DATE_BEFORE with Double = js.native
  
  /* 2 */ val DATE_BETWEEN: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.DATE_BETWEEN with Double = js.native
  
  /* 3 */ val DATE_EQUAL_TO: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.DATE_EQUAL_TO with Double = js.native
  
  /* 4 */ val DATE_IS_VALID_DATE: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.DATE_IS_VALID_DATE with Double = js.native
  
  /* 5 */ val DATE_NOT_BETWEEN: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.DATE_NOT_BETWEEN with Double = js.native
  
  /* 6 */ val DATE_ON_OR_AFTER: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.DATE_ON_OR_AFTER with Double = js.native
  
  /* 7 */ val DATE_ON_OR_BEFORE: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.DATE_ON_OR_BEFORE with Double = js.native
  
  /* 8 */ val NUMBER_BETWEEN: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.NUMBER_BETWEEN with Double = js.native
  
  /* 9 */ val NUMBER_EQUAL_TO: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.NUMBER_EQUAL_TO with Double = js.native
  
  /* 10 */ val NUMBER_GREATER_THAN: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.NUMBER_GREATER_THAN with Double = js.native
  
  /* 11 */ val NUMBER_GREATER_THAN_OR_EQUAL_TO: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.NUMBER_GREATER_THAN_OR_EQUAL_TO with Double = js.native
  
  /* 12 */ val NUMBER_LESS_THAN: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.NUMBER_LESS_THAN with Double = js.native
  
  /* 13 */ val NUMBER_LESS_THAN_OR_EQUAL_TO: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.NUMBER_LESS_THAN_OR_EQUAL_TO with Double = js.native
  
  /* 14 */ val NUMBER_NOT_BETWEEN: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.NUMBER_NOT_BETWEEN with Double = js.native
  
  /* 15 */ val NUMBER_NOT_EQUAL_TO: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.NUMBER_NOT_EQUAL_TO with Double = js.native
  
  /* 16 */ val TEXT_CONTAINS: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.TEXT_CONTAINS with Double = js.native
  
  /* 17 */ val TEXT_DOES_NOT_CONTAIN: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.TEXT_DOES_NOT_CONTAIN with Double = js.native
  
  /* 18 */ val TEXT_EQUAL_TO: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.TEXT_EQUAL_TO with Double = js.native
  
  /* 19 */ val TEXT_IS_VALID_EMAIL: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.TEXT_IS_VALID_EMAIL with Double = js.native
  
  /* 20 */ val TEXT_IS_VALID_URL: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.TEXT_IS_VALID_URL with Double = js.native
  
  /* 21 */ val VALUE_IN_LIST: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.VALUE_IN_LIST with Double = js.native
  
  /* 22 */ val VALUE_IN_RANGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.VALUE_IN_RANGE with Double = js.native
}
