package typingsSlinky.activexLibreoffice.com_.sun.star

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object sheet {
  
  /**
    * represents the shape of a cell annotation object attached to a spreadsheet cell.
    * @see com.sun.star.sheet.CellAnnotation
    */
  type CellAnnotationShape = typingsSlinky.activexLibreoffice.com_.sun.star.drawing.CaptionShape
  
  /**
    * represents an enumeration of cell annotations in a spreadsheet document.
    * @see com.sun.star.sheet.CellAnnotations
    */
  type CellAnnotationsEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /**
    * represents an enumeration of cell area links.
    * @see com.sun.star.sheet.CellAreaLink
    */
  type CellAreaLinksEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /**
    * represents an enumeration of equal-formatted cell ranges.
    * @see com.sun.star.sheet.CellFormatRanges
    */
  type CellFormatRangesEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /**
    * represents a collection of used cells in a spreadsheet document.
    * @see com.sun.star.sheet.SheetCell
    */
  type Cells = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
  
  /**
    * represents an enumeration of spreadsheet cells.
    * @see com.sun.star.sheet.Cells
    */
  type CellsEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /**
    * contains all settings of a data consolidation in a spreadsheet document.
    * @see com.sun.star.sheet.XConsolidatable
    */
  type ConsolidationDescriptor = typingsSlinky.activexLibreoffice.com_.sun.star.sheet.XConsolidationDescriptor
  
  /**
    * represents an enumeration of DDE links.
    * @see com.sun.star.sheet.DDELink
    */
  type DDELinksEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /**
    * represents an enumeration of members in a DataPilot field group.
    * @see DataPilotFieldGroupItem
    * @see DataPilotFieldGroup
    */
  type DataPilotFieldGroupEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /**
    * represents the member in a data pilot field group.
    * @see com.sun.star.sheet.DataPilotFieldGroup
    */
  type DataPilotFieldGroupItem = typingsSlinky.activexLibreoffice.com_.sun.star.container.XNamed
  
  /**
    * represents an enumeration of member groups in a DataPilot field.
    * @see DataPilotFieldGroup
    * @see DataPilotFieldGroups
    */
  type DataPilotFieldGroupsEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /**
    * represents an enumeration of data pilot fields.
    * @see com.sun.star.sheet.DataPilotField
    */
  type DataPilotFieldsEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /**
    * represents an enumeration of data pilot items.
    * @see com.sun.star.sheet.DataPilotItem
    */
  type DataPilotItemsEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /**
    * represents the collection of dimensions in a data pilot source.
    * @see com.sun.star.sheet.DataPilotSource
    */
  type DataPilotSourceDimensions = typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
  
  /**
    * represents the collection of hierarchies in a data pilot source dimension.
    * @see com.sun.star.sheet.DataPilotSourceDimension
    * @see com.sun.star.sheet.DataPilotSource
    */
  type DataPilotSourceHierarchies = typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
  
  /**
    * represents the collection of levels in a data pilot source hierarchy.
    * @see com.sun.star.sheet.DataPilotSourceHierarchy
    * @see com.sun.star.sheet.DataPilotSource
    */
  type DataPilotSourceLevels = typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
  
  /**
    * represents the collection of members in a data pilot source level.
    * @see com.sun.star.sheet.DataPilotSourceLevel
    * @see com.sun.star.sheet.DataPilotSource
    */
  type DataPilotSourceMembers = typingsSlinky.activexLibreoffice.com_.sun.star.sheet.XMembersAccess
  
  /**
    * represents an enumeration of data pilot tables.
    * @see com.sun.star.sheet.DataPilotTable
    */
  type DataPilotTablesEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /**
    * represents an enumeration of database ranges.
    * @see com.sun.star.sheet.DatabaseRange
    */
  type DatabaseRangesEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /**
    * Represents a single external document link.
    *
    * An external document link contains cached data used for external cell and cell range references as well as external range names.
    * @see com.sun.star.sheet.XExternalDocLink
    * @since OOo 3.1
    */
  type ExternalDocLink = typingsSlinky.activexLibreoffice.com_.sun.star.sheet.XExternalDocLink
  
  /**
    * Represents a collection of external document links.
    *
    * An external document link contains cached data used for external cell and cell range references as well as external range names.
    * @see com.sun.star.sheet.ExternalDocLink
    * @see com.sun.star.sheet.XExternalDocLinks
    * @since OOo 3.1
    */
  type ExternalDocLinks = typingsSlinky.activexLibreoffice.com_.sun.star.sheet.XExternalDocLinks
  
  /**
    * A single sheet cache for an external document.
    *
    * This cached data is used for external cell and cell range references, as well as external range names. An {@link com.sun.star.sheet.ExternalDocLink}
    * instance contains a set of these sheet caches.
    * @see com.sun.star.sheet.ExternalDocLink
    * @see com.sun.star.sheet.XExternalSheetCache
    * @since OOo 3.1
    */
  type ExternalSheetCache = typingsSlinky.activexLibreoffice.com_.sun.star.sheet.XExternalSheetCache
  
  /** A service used to implement parsing and printing formula strings in a specific formula language. */
  type FilterFormulaParser = typingsSlinky.activexLibreoffice.com_.sun.star.sheet.XFilterFormulaParser
  
  type FormulaOpCodeMapper = typingsSlinky.activexLibreoffice.com_.sun.star.sheet.XFormulaOpCodeMapper
  
  /**
    * represents an enumeration of Function Descriptions.
    * @see com.sun.star.sheet.FunctionDescription
    */
  type FunctionDescriptionEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /**
    * contributes properties to access the settings for all spreadsheets of a spreadsheet document.
    *
    * For backwards compatibility, the attributes of {@link XGlobalSheetSettings} can still be accessed via {@link com.sun.star.beans.XPropertySet} , too.
    */
  type GlobalSheetSettings = typingsSlinky.activexLibreoffice.com_.sun.star.sheet.XGlobalSheetSettings
  
  /**
    * represents the contents of a header or footer line in a page style.
    * @see com.sun.star.sheet.TablePageStyle
    */
  type HeaderFooterContent = typingsSlinky.activexLibreoffice.com_.sun.star.sheet.XHeaderFooterContent
  
  /**
    * represents a cell area that contains labels and values related to the labels.
    *
    * Label ranges can be used in formulas to refer to cells in cell ranges with row or column titles. The formula uses the cell value that is related to
    * the specified row or column title.
    */
  type LabelRange = typingsSlinky.activexLibreoffice.com_.sun.star.sheet.XLabelRange
  
  /**
    * represents an enumeration of label ranges.
    * @see com.sun.star.sheet.LabelRange
    */
  type LabelRangesEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /**
    * represents an enumeration of named ranges.
    * @see com.sun.star.sheet.NamedRange
    */
  type NamedRangesEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /**
    * Thrown by a Calc Add-In function this exception indicates the function's algorithm did not converge to a meaningful result.
    * @since OOo 3.3
    */
  type NoConvergenceException = typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
  
  /** contains the list of recently used spreadsheet functions. */
  type RecentFunctions = typingsSlinky.activexLibreoffice.com_.sun.star.sheet.XRecentFunctions
  
  /**
    * represents an enumeration of scenarios.
    * @see com.sun.star.sheet.Spreadsheet
    */
  type ScenariosEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /**
    * represents an enumeration of cell ranges in a spreadsheet document.
    * @see com.sun.star.sheet.SheetCellRanges
    */
  type SheetCellRangesEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /**
    * represents an enumeration of sheet links.
    * @see com.sun.star.sheet.SheetLink
    */
  type SheetLinksEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /** A solver for a model that is defined by spreadsheet cells. */
  type Solver = typingsSlinky.activexLibreoffice.com_.sun.star.sheet.XSolver
  
  /**
    * represents an enumeration of spreadsheet view panes.
    * @see com.sun.star.sheet.SpreadsheetViewPane
    */
  type SpreadsheetViewPanesEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /**
    * represents an enumeration of spreadsheets in a spreadsheet document.
    * @see com.sun.star.sheet.Spreadsheets
    */
  type SpreadsheetsEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /**
    * represents a single field in a subtotal descriptor.
    *
    * A subtotal field contains all columns for which subtotal values will be calculated and the column used to create subtotal groups.
    * @see com.sun.star.sheet.SubTotalDescriptor
    */
  type SubTotalField = typingsSlinky.activexLibreoffice.com_.sun.star.sheet.XSubTotalField
  
  /**
    * represents an enumeration of sub total fields.
    * @see com.sun.star.sheet.SubTotalField
    */
  type SubTotalFieldsEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /**
    * represents an enumeration of AutoFormat fields in an AutoFormat.
    * @see com.sun.star.sheet.TableAutoFormat
    */
  type TableAutoFormatEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /**
    * represents an enumeration of AutoFormats.
    * @see com.sun.star.sheet.TableAutoFormats
    */
  type TableAutoFormatsEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /**
    * represents an enumeration of conditional entries.
    * @see com.sun.star.sheet.TableConditionalEntry
    */
  type TableConditionalEntryEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /**
    * represents an enumeration of equal-formatted cell range collections.
    * @see com.sun.star.sheet.UniqueCellFormatRanges
    */
  type UniqueCellFormatRangesEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /**
    * represents a volatile function result.
    *
    * A volatile function result can change its value over time. The {@link XVolatileResult} interface allows the addition of listeners which are notified
    * when the value changes.
    * @see com.sun.star.sheet.AddIn
    */
  type VolatileResult = typingsSlinky.activexLibreoffice.com_.sun.star.sheet.XVolatileResult
}
