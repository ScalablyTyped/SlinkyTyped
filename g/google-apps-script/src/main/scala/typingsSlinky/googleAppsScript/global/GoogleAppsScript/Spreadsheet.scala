package typingsSlinky.googleAppsScript.global.GoogleAppsScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Spreadsheet {
  
  /**
    * An enumeration of the types of series used to calculate auto-filled values. The manner in which
    * these series affect calculated values differs depending on the type and amount of source data.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.AutoFillSeries")
  @js.native
  object AutoFillSeries extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.AutoFillSeries with Double
      ] = js.native
    
    /* 1 */ val ALTERNATE_SERIES: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.AutoFillSeries.ALTERNATE_SERIES with Double = js.native
    
    /* 0 */ val DEFAULT_SERIES: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.AutoFillSeries.DEFAULT_SERIES with Double = js.native
  }
  
  /**
    * An enumeration of banding themes. Each theme consists of several complementary colors that are
    * applied to different cells based on the banding settings.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.BandingTheme")
  @js.native
  object BandingTheme extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme with Double
      ] = js.native
    
    /* 5 */ val BLUE: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme.BLUE with Double = js.native
    
    /* 8 */ val BROWN: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme.BROWN with Double = js.native
    
    /* 1 */ val CYAN: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme.CYAN with Double = js.native
    
    /* 2 */ val GREEN: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme.GREEN with Double = js.native
    
    /* 7 */ val GREY: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme.GREY with Double = js.native
    
    /* 10 */ val INDIGO: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme.INDIGO with Double = js.native
    
    /* 9 */ val LIGHT_GREEN: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme.LIGHT_GREEN with Double = js.native
    
    /* 0 */ val LIGHT_GREY: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme.LIGHT_GREY with Double = js.native
    
    /* 4 */ val ORANGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme.ORANGE with Double = js.native
    
    /* 11 */ val PINK: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme.PINK with Double = js.native
    
    /* 6 */ val TEAL: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme.TEAL with Double = js.native
    
    /* 3 */ val YELLOW: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme.YELLOW with Double = js.native
  }
  
  /**
    * An enumeration representing the boolean criteria that can be used in conditional format or
    * filter.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.BooleanCriteria")
  @js.native
  object BooleanCriteria extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria with Double
      ] = js.native
    
    /* 0 */ val CELL_EMPTY: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.CELL_EMPTY with Double = js.native
    
    /* 1 */ val CELL_NOT_EMPTY: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.CELL_NOT_EMPTY with Double = js.native
    
    /* 21 */ val CUSTOM_FORMULA: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.CUSTOM_FORMULA with Double = js.native
    
    /* 2 */ val DATE_AFTER: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.DATE_AFTER with Double = js.native
    
    /* 5 */ val DATE_AFTER_RELATIVE: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.DATE_AFTER_RELATIVE with Double = js.native
    
    /* 3 */ val DATE_BEFORE: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.DATE_BEFORE with Double = js.native
    
    /* 6 */ val DATE_BEFORE_RELATIVE: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.DATE_BEFORE_RELATIVE with Double = js.native
    
    /* 4 */ val DATE_EQUAL_TO: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.DATE_EQUAL_TO with Double = js.native
    
    /* 7 */ val DATE_EQUAL_TO_RELATIVE: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.DATE_EQUAL_TO_RELATIVE with Double = js.native
    
    /* 8 */ val NUMBER_BETWEEN: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.NUMBER_BETWEEN with Double = js.native
    
    /* 9 */ val NUMBER_EQUAL_TO: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.NUMBER_EQUAL_TO with Double = js.native
    
    /* 10 */ val NUMBER_GREATER_THAN: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.NUMBER_GREATER_THAN with Double = js.native
    
    /* 11 */ val NUMBER_GREATER_THAN_OR_EQUAL_TO: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.NUMBER_GREATER_THAN_OR_EQUAL_TO with Double = js.native
    
    /* 12 */ val NUMBER_LESS_THAN: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.NUMBER_LESS_THAN with Double = js.native
    
    /* 13 */ val NUMBER_LESS_THAN_OR_EQUAL_TO: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.NUMBER_LESS_THAN_OR_EQUAL_TO with Double = js.native
    
    /* 14 */ val NUMBER_NOT_BETWEEN: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.NUMBER_NOT_BETWEEN with Double = js.native
    
    /* 15 */ val NUMBER_NOT_EQUAL_TO: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.NUMBER_NOT_EQUAL_TO with Double = js.native
    
    /* 16 */ val TEXT_CONTAINS: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.TEXT_CONTAINS with Double = js.native
    
    /* 17 */ val TEXT_DOES_NOT_CONTAIN: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.TEXT_DOES_NOT_CONTAIN with Double = js.native
    
    /* 20 */ val TEXT_ENDS_WITH: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.TEXT_ENDS_WITH with Double = js.native
    
    /* 18 */ val TEXT_EQUAL_TO: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.TEXT_EQUAL_TO with Double = js.native
    
    /* 19 */ val TEXT_STARTS_WITH: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.TEXT_STARTS_WITH with Double = js.native
  }
  
  /**
    * Styles that can be set on a range using Range.setBorder(top, left, bottom, right, vertical, horizontal, color, style).
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.BorderStyle")
  @js.native
  object BorderStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BorderStyle with Double
      ] = js.native
    
    /* 1 */ val DASHED: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BorderStyle.DASHED with Double = js.native
    
    /* 0 */ val DOTTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BorderStyle.DOTTED with Double = js.native
    
    /* 5 */ val DOUBLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BorderStyle.DOUBLE with Double = js.native
    
    /* 2 */ val SOLID: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BorderStyle.SOLID with Double = js.native
    
    /* 3 */ val SOLID_MEDIUM: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BorderStyle.SOLID_MEDIUM with Double = js.native
    
    /* 4 */ val SOLID_THICK: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.BorderStyle.SOLID_THICK with Double = js.native
  }
  
  /**
    * An enumeration of possible special paste types.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.CopyPasteType")
  @js.native
  object CopyPasteType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.CopyPasteType with Double
      ] = js.native
    
    /* 7 */ val PASTE_COLUMN_WIDTHS: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.CopyPasteType.PASTE_COLUMN_WIDTHS with Double = js.native
    
    /* 6 */ val PASTE_CONDITIONAL_FORMATTING: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.CopyPasteType.PASTE_CONDITIONAL_FORMATTING with Double = js.native
    
    /* 4 */ val PASTE_DATA_VALIDATION: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.CopyPasteType.PASTE_DATA_VALIDATION with Double = js.native
    
    /* 2 */ val PASTE_FORMAT: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.CopyPasteType.PASTE_FORMAT with Double = js.native
    
    /* 3 */ val PASTE_FORMULA: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.CopyPasteType.PASTE_FORMULA with Double = js.native
    
    /* 0 */ val PASTE_NORMAL: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.CopyPasteType.PASTE_NORMAL with Double = js.native
    
    /* 1 */ val PASTE_NO_BORDERS: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.CopyPasteType.PASTE_NO_BORDERS with Double = js.native
    
    /* 5 */ val PASTE_VALUES: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.CopyPasteType.PASTE_VALUES with Double = js.native
  }
  
  /**
    * An enumeration of data execution error codes.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.DataExecutionErrorCode")
  @js.native
  object DataExecutionErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode with Double
      ] = js.native
    
    /* 0 */ val DATA_EXECUTION_ERROR_CODE_UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.DATA_EXECUTION_ERROR_CODE_UNSUPPORTED with Double = js.native
    
    /* 8 */ val DUPLICATE_COLUMN_NAMES: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.DUPLICATE_COLUMN_NAMES with Double = js.native
    
    /* 5 */ val ENGINE: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.ENGINE with Double = js.native
    
    /* 9 */ val INTERRUPTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.INTERRUPTED with Double = js.native
    
    /* 1 */ val NONE: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.NONE with Double = js.native
    
    /* 10 */ val OTHER: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.OTHER with Double = js.native
    
    /* 6 */ val PARAMETER_INVALID: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.PARAMETER_INVALID with Double = js.native
    
    /* 2 */ val TIME_OUT: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.TIME_OUT with Double = js.native
    
    /* 4 */ val TOO_MANY_CELLS: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.TOO_MANY_CELLS with Double = js.native
    
    /* 11 */ val TOO_MANY_CHARS_PER_CELL: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.TOO_MANY_CHARS_PER_CELL with Double = js.native
    
    /* 3 */ val TOO_MANY_ROWS: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.TOO_MANY_ROWS with Double = js.native
    
    /* 7 */ val UNSUPPORTED_DATA_TYPE: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.UNSUPPORTED_DATA_TYPE with Double = js.native
  }
  
  /**
    * An enumeration of data execution states.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.DataExecutionState")
  @js.native
  object DataExecutionState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionState with Double
      ] = js.native
    
    /* 0 */ val DATA_EXECUTION_STATE_UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionState.DATA_EXECUTION_STATE_UNSUPPORTED with Double = js.native
    
    /* 3 */ val ERROR: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionState.ERROR with Double = js.native
    
    /* 4 */ val NOT_STARTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionState.NOT_STARTED with Double = js.native
    
    /* 1 */ val RUNNING: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionState.RUNNING with Double = js.native
    
    /* 2 */ val SUCCESS: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionState.SUCCESS with Double = js.native
  }
  
  /**
    * An enumeration of data source parameter types.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.DataSourceParameterType")
  @js.native
  object DataSourceParameterType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataSourceParameterType with Double
      ] = js.native
    
    /* 1 */ val CELL: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataSourceParameterType.CELL with Double = js.native
    
    /* 0 */ val DATA_SOURCE_PARAMETER_TYPE_UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataSourceParameterType.DATA_SOURCE_PARAMETER_TYPE_UNSUPPORTED with Double = js.native
  }
  
  /**
    * An enumeration of data source types.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.DataSourceType")
  @js.native
  object DataSourceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataSourceType with Double
      ] = js.native
    
    /* 1 */ val BIGQUERY: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataSourceType.BIGQUERY with Double = js.native
    
    /* 0 */ val DATA_SOURCE_TYPE_UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DataSourceType.DATA_SOURCE_TYPE_UNSUPPORTED with Double = js.native
  }
  
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
  object DataValidationCriteria extends StObject {
    
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
  
  /**
    * An enumeration of the types of developer metadata location types.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.DeveloperMetadataLocationType")
  @js.native
  object DeveloperMetadataLocationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataLocationType with Double
      ] = js.native
    
    /* 3 */ val COLUMN: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataLocationType.COLUMN with Double = js.native
    
    /* 2 */ val ROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataLocationType.ROW with Double = js.native
    
    /* 1 */ val SHEET: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataLocationType.SHEET with Double = js.native
    
    /* 0 */ val SPREADSHEET: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataLocationType.SPREADSHEET with Double = js.native
  }
  
  /**
    * An enumeration of the types of developer metadata visibility.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.DeveloperMetadataVisibility")
  @js.native
  object DeveloperMetadataVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataVisibility with Double
      ] = js.native
    
    /* 0 */ val DOCUMENT: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataVisibility.DOCUMENT with Double = js.native
    
    /* 1 */ val PROJECT: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataVisibility.PROJECT with Double = js.native
  }
  
  /**
    * An enumeration of possible directions along which data can be stored in a spreadsheet.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.Dimension")
  @js.native
  object Dimension extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.Dimension with Double
      ] = js.native
    
    /* 0 */ val COLUMNS: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.Dimension.COLUMNS with Double = js.native
    
    /* 1 */ val ROWS: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.Dimension.ROWS with Double = js.native
  }
  
  /**
    * An enumeration representing the possible directions that one can move within a spreadsheet using
    * the arrow keys.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.Direction")
  @js.native
  object Direction extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.Direction with Double
      ] = js.native
    
    /* 1 */ val DOWN: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.Direction.DOWN with Double = js.native
    
    /* 3 */ val NEXT: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.Direction.NEXT with Double = js.native
    
    /* 2 */ val PREVIOUS: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.Direction.PREVIOUS with Double = js.native
    
    /* 0 */ val UP: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.Direction.UP with Double = js.native
  }
  
  /**
    * An enumeration representing the possible positions that a group control toggle can have.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.GroupControlTogglePosition")
  @js.native
  object GroupControlTogglePosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.GroupControlTogglePosition with Double
      ] = js.native
    
    /* 1 */ val AFTER: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.GroupControlTogglePosition.AFTER with Double = js.native
    
    /* 0 */ val BEFORE: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.GroupControlTogglePosition.BEFORE with Double = js.native
  }
  
  /**
    * An enumeration representing the interpolation options for calculating a value to be used in a
    * GradientCondition in a ConditionalFormatRule.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.InterpolationType")
  @js.native
  object InterpolationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.InterpolationType with Double
      ] = js.native
    
    /* 4 */ val MAX: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.InterpolationType.MAX with Double = js.native
    
    /* 3 */ val MIN: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.InterpolationType.MIN with Double = js.native
    
    /* 0 */ val NUMBER: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.InterpolationType.NUMBER with Double = js.native
    
    /* 1 */ val PERCENT: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.InterpolationType.PERCENT with Double = js.native
    
    /* 2 */ val PERCENTILE: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.InterpolationType.PERCENTILE with Double = js.native
  }
  
  /**
    * An enumeration of functions that summarize pivot table data.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction")
  @js.native
  object PivotTableSummarizeFunction extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction with Double
      ] = js.native
    
    /* 5 */ val AVERAGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.AVERAGE with Double = js.native
    
    /* 3 */ val COUNT: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.COUNT with Double = js.native
    
    /* 2 */ val COUNTA: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.COUNTA with Double = js.native
    
    /* 4 */ val COUNTUNIQUE: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.COUNTUNIQUE with Double = js.native
    
    /* 0 */ val CUSTOM: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.CUSTOM with Double = js.native
    
    /* 6 */ val MAX: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.MAX with Double = js.native
    
    /* 8 */ val MEDIAN: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.MEDIAN with Double = js.native
    
    /* 7 */ val MIN: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.MIN with Double = js.native
    
    /* 9 */ val PRODUCT: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.PRODUCT with Double = js.native
    
    /* 10 */ val STDEV: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.STDEV with Double = js.native
    
    /* 11 */ val STDEVP: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.STDEVP with Double = js.native
    
    /* 1 */ val SUM: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.SUM with Double = js.native
    
    /* 12 */ val VAR: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.VAR with Double = js.native
    
    /* 13 */ val VARP: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.VARP with Double = js.native
  }
  
  /**
    * An enumeration of ways to display a pivot value as a function of another value.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.PivotValueDisplayType")
  @js.native
  object PivotValueDisplayType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotValueDisplayType with Double
      ] = js.native
    
    /* 0 */ val DEFAULT: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotValueDisplayType.DEFAULT with Double = js.native
    
    /* 2 */ val PERCENT_OF_COLUMN_TOTAL: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotValueDisplayType.PERCENT_OF_COLUMN_TOTAL with Double = js.native
    
    /* 3 */ val PERCENT_OF_GRAND_TOTAL: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotValueDisplayType.PERCENT_OF_GRAND_TOTAL with Double = js.native
    
    /* 1 */ val PERCENT_OF_ROW_TOTAL: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotValueDisplayType.PERCENT_OF_ROW_TOTAL with Double = js.native
  }
  
  /**
    * An enumeration representing the parts of a spreadsheet that can be protected from edits.
    *
    *     // Remove all range protections in the spreadsheet that the user has permission to edit.
    *     var ss = SpreadsheetApp.getActive();
    *     var protections = ss.getProtections(SpreadsheetApp.ProtectionType.RANGE);
    *     for (var i = 0; i < protections.length; i++) {
    *       var protection = protections[i];
    *       if (protection.canEdit()) {
    *         protection.remove();
    *       }
    *     }
    *
    *     // Removes sheet protection from the active sheet, if the user has permission to edit it.
    *     var sheet = SpreadsheetApp.getActiveSheet();
    *     var protection = sheet.getProtections(SpreadsheetApp.ProtectionType.SHEET)[0];
    *     if (protection && protection.canEdit()) {
    *       protection.remove();
    *     }
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.ProtectionType")
  @js.native
  object ProtectionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.ProtectionType with Double
      ] = js.native
    
    /* 0 */ val RANGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.ProtectionType.RANGE with Double = js.native
    
    /* 1 */ val SHEET: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.ProtectionType.SHEET with Double = js.native
  }
  
  /**
    * An enumeration representing the possible intervals used in spreadsheet recalculation.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.RecalculationInterval")
  @js.native
  object RecalculationInterval extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.RecalculationInterval with Double
      ] = js.native
    
    /* 2 */ val HOUR: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.RecalculationInterval.HOUR with Double = js.native
    
    /* 1 */ val MINUTE: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.RecalculationInterval.MINUTE with Double = js.native
    
    /* 0 */ val ON_CHANGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.RecalculationInterval.ON_CHANGE with Double = js.native
  }
  
  /**
    * An enumeration representing the relative date options for calculating a value to be used in
    * date-based BooleanCriteria.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.RelativeDate")
  @js.native
  object RelativeDate extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.RelativeDate with Double
      ] = js.native
    
    /* 4 */ val PAST_MONTH: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.RelativeDate.PAST_MONTH with Double = js.native
    
    /* 3 */ val PAST_WEEK: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.RelativeDate.PAST_WEEK with Double = js.native
    
    /* 5 */ val PAST_YEAR: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.RelativeDate.PAST_YEAR with Double = js.native
    
    /* 0 */ val TODAY: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.RelativeDate.TODAY with Double = js.native
    
    /* 1 */ val TOMORROW: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.RelativeDate.TOMORROW with Double = js.native
    
    /* 2 */ val YESTERDAY: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.RelativeDate.YESTERDAY with Double = js.native
  }
  
  /**
    * The different types of sheets that can exist in a spreadsheet.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.SheetType")
  @js.native
  object SheetType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.SheetType with Double
      ] = js.native
    
    /* 0 */ val GRID: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.SheetType.GRID with Double = js.native
    
    /* 1 */ val OBJECT: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.SheetType.OBJECT with Double = js.native
  }
  
  /**
    * An enumerations of text directions.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.TextDirection")
  @js.native
  object TextDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.TextDirection with Double
      ] = js.native
    
    /* 0 */ val LEFT_TO_RIGHT: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.TextDirection.LEFT_TO_RIGHT with Double = js.native
    
    /* 1 */ val RIGHT_TO_LEFT: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.TextDirection.RIGHT_TO_LEFT with Double = js.native
  }
  
  /**
    * An enumeration of the types of preset delimiters that can split a column of text into multiple
    * columns.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.TextToColumnsDelimiter")
  @js.native
  object TextToColumnsDelimiter extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.TextToColumnsDelimiter with Double
      ] = js.native
    
    /* 0 */ val COMMA: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.TextToColumnsDelimiter.COMMA with Double = js.native
    
    /* 2 */ val PERIOD: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.TextToColumnsDelimiter.PERIOD with Double = js.native
    
    /* 1 */ val SEMICOLON: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.TextToColumnsDelimiter.SEMICOLON with Double = js.native
    
    /* 3 */ val SPACE: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.TextToColumnsDelimiter.SPACE with Double = js.native
  }
  
  /**
    * An enum which describes various color entries supported in themes.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.ThemeColorType")
  @js.native
  object ThemeColorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.ThemeColorType with Double
      ] = js.native
    
    /* 3 */ val ACCENT1: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.ThemeColorType.ACCENT1 with Double = js.native
    
    /* 4 */ val ACCENT2: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.ThemeColorType.ACCENT2 with Double = js.native
    
    /* 5 */ val ACCENT3: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.ThemeColorType.ACCENT3 with Double = js.native
    
    /* 6 */ val ACCENT4: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.ThemeColorType.ACCENT4 with Double = js.native
    
    /* 7 */ val ACCENT5: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.ThemeColorType.ACCENT5 with Double = js.native
    
    /* 8 */ val ACCENT6: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.ThemeColorType.ACCENT6 with Double = js.native
    
    /* 2 */ val BACKGROUND: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.ThemeColorType.BACKGROUND with Double = js.native
    
    /* 9 */ val HYPERLINK: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.ThemeColorType.HYPERLINK with Double = js.native
    
    /* 1 */ val TEXT: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.ThemeColorType.TEXT with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.ThemeColorType.UNSUPPORTED with Double = js.native
  }
  
  /**
    * An enumeration of the strategies used to handle cell text wrapping.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.WrapStrategy")
  @js.native
  object WrapStrategy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.WrapStrategy with Double
      ] = js.native
    
    /* 2 */ val CLIP: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.WrapStrategy.CLIP with Double = js.native
    
    /* 1 */ val OVERFLOW: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.WrapStrategy.OVERFLOW with Double = js.native
    
    /* 0 */ val WRAP: typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.WrapStrategy.WRAP with Double = js.native
  }
}
