package typingsSlinky.reactTable.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactTable.reactTableStrings.Footer
import typingsSlinky.reactTable.reactTableStrings.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseTableColumnProps[D /* <: js.Object */] extends js.Object {
  
  var columns: js.Array[ColumnInstance[D]] = js.native
  
  var depth: Double = js.native
  
  def getFooterProps(): TableFooterProps = js.native
  def getFooterProps(propGetter: FooterPropGetter[D]): TableFooterProps = js.native
  
  def getHeaderProps(): TableHeaderProps = js.native
  def getHeaderProps(propGetter: HeaderPropGetter[D]): TableHeaderProps = js.native
  
   // not documented
  def getToggleHiddenProps(): js.Any = js.native
  def getToggleHiddenProps(userProps: js.Any): js.Any = js.native
  
  var id: IdType[D] = js.native
  
   // not documented
  var index: Double = js.native
  
  var isVisible: Boolean = js.native
  
  var parent: ColumnInstance[D] = js.native
  
   // not documented
  var placeholderOf: js.UndefOr[ColumnInstance[js.Object]] = js.native
  
  def render(`type`: String): ReactElement = js.native
  def render(`type`: String, props: js.Object): ReactElement = js.native
  @JSName("render")
  def render_Footer(`type`: Footer): ReactElement = js.native
  @JSName("render")
  def render_Footer(`type`: Footer, props: js.Object): ReactElement = js.native
  @JSName("render")
  def render_Header(`type`: Header): ReactElement = js.native
  @JSName("render")
  def render_Header(`type`: Header, props: js.Object): ReactElement = js.native
  
  def toggleHidden(): Unit = js.native
  def toggleHidden(value: Boolean): Unit = js.native
  
  var totalLeft: Double = js.native
  
  var totalWidth: Double = js.native
}
