package typingsSlinky.reactNative.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListViewProps extends ScrollViewProps {
  
  /**
    * An instance of [ListView.DataSource](docs/listviewdatasource.html) to use
    */
  var dataSource: ListViewDataSource = js.native
  
  /**
    * Flag indicating whether empty section headers should be rendered.
    * In the future release empty section headers will be rendered by
    * default, and the flag will be deprecated. If empty sections are not
    * desired to be rendered their indices should be excluded from
    * sectionID object.
    */
  var enableEmptySections: js.UndefOr[Boolean] = js.native
  
  /**
    * How many rows to render on initial component mount.  Use this to make
    * it so that the first screen worth of data apears at one time instead of
    * over the course of multiple frames.
    */
  var initialListSize: js.UndefOr[Double] = js.native
  
  /**
    * (visibleRows, changedRows) => void
    *
    * Called when the set of visible rows changes.  `visibleRows` maps
    * { sectionID: { rowID: true }} for all the visible rows, and
    * `changedRows` maps { sectionID: { rowID: true | false }} for the rows
    * that have changed their visibility, with true indicating visible, and
    * false indicating the view has moved out of view.
    */
  var onChangeVisibleRows: js.UndefOr[
    js.Function2[
      /* visibleRows */ js.Array[StringDictionary[StringDictionary[Boolean]]], 
      /* changedRows */ js.Array[StringDictionary[StringDictionary[Boolean]]], 
      Unit
    ]
  ] = js.native
  
  /**
    * Called when all rows have been rendered and the list has been scrolled
    * to within onEndReachedThreshold of the bottom.  The native scroll
    * event is provided.
    */
  var onEndReached: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Threshold in pixels for onEndReached.
    */
  var onEndReachedThreshold: js.UndefOr[Double] = js.native
  
  /**
    * Number of rows to render per event loop.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * () => renderable
    *
    * The header and footer are always rendered (if these props are provided)
    * on every render pass.  If they are expensive to re-render, wrap them
    * in StaticContainer or other mechanism as appropriate.  Footer is always
    * at the bottom of the list, and header at the top, on every render pass.
    */
  var renderFooter: js.UndefOr[js.Function0[ReactElement]] = js.native
  
  /**
    * () => renderable
    *
    * The header and footer are always rendered (if these props are provided)
    * on every render pass.  If they are expensive to re-render, wrap them
    * in StaticContainer or other mechanism as appropriate.  Footer is always
    * at the bottom of the list, and header at the top, on every render pass.
    */
  var renderHeader: js.UndefOr[js.Function0[ReactElement]] = js.native
  
  /**
    * (rowData, sectionID, rowID) => renderable
    * Takes a data entry from the data source and its ids and should return
    * a renderable component to be rendered as the row.  By default the data
    * is exactly what was put into the data source, but it's also possible to
    * provide custom extractors.
    */
  def renderRow(rowData: js.Any, sectionID: String, rowID: String): ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: String, rowID: String, highlightRow: Boolean): ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: String, rowID: Double): ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: String, rowID: Double, highlightRow: Boolean): ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: Double, rowID: String): ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: Double, rowID: String, highlightRow: Boolean): ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: Double, rowID: Double): ReactElement = js.native
  def renderRow(rowData: js.Any, sectionID: Double, rowID: Double, highlightRow: Boolean): ReactElement = js.native
  
  /**
    * A function that returns the scrollable component in which the list rows are rendered.
    * Defaults to returning a ScrollView with the given props.
    */
  var renderScrollComponent: js.UndefOr[js.Function1[/* props */ ScrollViewProps, ReactElement]] = js.native
  
  /**
    * (sectionData, sectionID) => renderable
    *
    * If provided, a sticky header is rendered for this section.  The sticky
    * behavior means that it will scroll with the content at the top of the
    * section until it reaches the top of the screen, at which point it will
    * stick to the top until it is pushed off the screen by the next section
    * header.
    */
  var renderSectionHeader: js.UndefOr[
    js.Function2[/* sectionData */ js.Any, /* sectionId */ String | Double, ReactElement]
  ] = js.native
  
  /**
    * (sectionID, rowID, adjacentRowHighlighted) => renderable
    * If provided, a renderable component to be rendered as the separator below each row
    * but not the last row if there is a section header below.
    * Take a sectionID and rowID of the row above and whether its adjacent row is highlighted.
    */
  var renderSeparator: js.UndefOr[
    js.Function3[
      /* sectionID */ String | Double, 
      /* rowID */ String | Double, 
      /* adjacentRowHighlighted */ js.UndefOr[Boolean], 
      ReactElement
    ]
  ] = js.native
  
  /**
    * How early to start rendering rows before they come on screen, in
    * pixels.
    */
  var scrollRenderAheadDistance: js.UndefOr[Double] = js.native
  
  /**
    * Makes the sections headers sticky. The sticky behavior means that it will scroll with the
    * content at the top of the section until it reaches the top of the screen, at which point it
    * will stick to the top until it is pushed off the screen by the next section header. This
    * property is not supported in conjunction with `horizontal={true}`. Only enabled by default
    * on iOS because of typical platform standards.
    */
  var stickySectionHeadersEnabled: js.UndefOr[Boolean] = js.native
}
