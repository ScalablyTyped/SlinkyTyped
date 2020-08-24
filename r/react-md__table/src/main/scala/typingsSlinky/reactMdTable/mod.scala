package typingsSlinky.reactMdTable

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLTableCaptionElement
import org.scalajs.dom.raw.HTMLTableElement
import org.scalajs.dom.raw.HTMLTableRowElement
import org.scalajs.dom.raw.HTMLTableSectionElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdTable.captionMod.CaptionProps
import typingsSlinky.reactMdTable.tableBodyMod.TableBodyProps
import typingsSlinky.reactMdTable.tableCellContentMod.TableCellContentProps
import typingsSlinky.reactMdTable.tableCellMod.TableCellElement
import typingsSlinky.reactMdTable.tableCellMod.TableCellProps
import typingsSlinky.reactMdTable.tableCheckboxMod.TableCheckboxProps
import typingsSlinky.reactMdTable.tableContainerMod.TableContainerProps
import typingsSlinky.reactMdTable.tableFooterMod.TableFooterProps
import typingsSlinky.reactMdTable.tableHeaderMod.TableHeaderProps
import typingsSlinky.reactMdTable.tableMod.TableProps
import typingsSlinky.reactMdTable.tableRowMod.TableRowProps
import typingsSlinky.std.HTMLTableDataCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/table", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * This component is really just a simple wrapper for applying the `<caption>`
    * typography styles and probably doesn't have much real use if you don't use
    * captions.
    */
  val Caption: ForwardRefExoticComponent[CaptionProps with RefAttributes[HTMLTableCaptionElement]] = js.native
  /**
    * Creates a `<table>` element with some default styles and a quick way to
    * configure the other styles within a table. That being said, styling tables is
    * awful if you are used to flexbox and this component will not be helping with
    * layout styles of tables.
    *
    * The table will not be responsive by default, but you can easily create a
    * responsive table with overflow by wrapping with the `TableContainer`
    * component or just adding `overflow: auto` to a parent element. Note that
    * horizontal scrolling is still not one of the best user interactions and it
    * might be better to render a table in a different manner for mobile devices to
    * help display all the required data.
    */
  val Table: ForwardRefExoticComponent[TableProps with RefAttributes[HTMLTableElement]] = js.native
  /**
    * Creates a `<tbody>` element that also allows for overriding all the child
    * `TableCell` components with additional styling behavior.
    */
  val TableBody: ForwardRefExoticComponent[TableBodyProps with RefAttributes[HTMLTableSectionElement]] = js.native
  /**
    * Creates a `<th>` or `<td>` cell with sensible styled defaults. You can create
    * a `<th>` element by enabling the `header` prop OR having a `TableCell` as a
    * child of the `TableHeader` component.
    *
    * Note: If you have a checkbox column in the `TableHeader` without any labels,
    * you will need to manually set the `header={false}` prop for that cell since
    * it is invalid to have a `<th>` without any readable content for screen
    * readers.
    */
  val TableCell: ForwardRefExoticComponent[TableCellProps with RefAttributes[TableCellElement]] = js.native
  /**
    * This is mostly an internal component since it is automatically used within
    * the `TableCell` component but this will conditionally wrap the `children`
    * within an `UnstyledButton` to make a clickable cell. This is really to help
    * with sort behavior within headers.
    */
  val TableCellContent: ForwardRefExoticComponent[TableCellContentProps with RefAttributes[HTMLButtonElement]] = js.native
  /**
    * This is a simple wrapper for the `Checkbox` component that allows you to
    * render a nicely styled `Checkbox` within a `TableCell` element. This will
    * mostly just remove the additional padding applied and default an `aria-label`
    * since you normally don't want a checkbox with a label within a table since
    * it's more for selection.
    */
  val TableCheckbox: ForwardRefExoticComponent[TableCheckboxProps with RefAttributes[HTMLTableDataCellElement]] = js.native
  /**
    * An extremely "useful" component that should be used with the `Table`
    * component if you want to make a responsive table within the page. If you
    * don't want to use this component, you can just apply `overflow: auto` to a
    * parent element of the table.
    */
  val TableContainer: ForwardRefExoticComponent[TableContainerProps with RefAttributes[HTMLDivElement]] = js.native
  /**
    * Creates a `<tfoot>` element with some basic styles. This component will
    * disable the hover effect and line wrapping by default, but the hover effect
    * and line-wrapping can be re-enabled if desired through the `hoverable` and
    * `disableNoWrap` props.
    */
  val TableFooter: ForwardRefExoticComponent[TableFooterProps with RefAttributes[HTMLTableSectionElement]] = js.native
  /**
    * Creates a `<thead>` element with some basic styles. This component will also
    * update the table configuration so that all the `TableCell` children will
    * automatically become `<th>` elements instead of the normal `<td>` as well as
    * disabling the hover effect and line wrapping. The hover effect and
    * line-wrapping can be re-enabled if desired through the `hoverable` and
    * `disableNoWrap` props.
    */
  val TableHeader: ForwardRefExoticComponent[TableHeaderProps with RefAttributes[HTMLTableSectionElement]] = js.native
  /**
    * Creates a `<tr>` element with some general styles that are inherited from the
    * base table configuration.
    */
  val TableRow: ForwardRefExoticComponent[TableRowProps with RefAttributes[HTMLTableRowElement]] = js.native
}

