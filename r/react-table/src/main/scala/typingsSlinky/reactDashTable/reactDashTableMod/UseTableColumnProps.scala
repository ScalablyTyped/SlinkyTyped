package typingsSlinky.reactDashTable.reactDashTableMod

import slinky.core.TagMod
import typingsSlinky.reactDashTable.reactDashTableStrings.Footer
import typingsSlinky.reactDashTable.reactDashTableStrings.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseTableColumnProps[D /* <: js.Object */] extends js.Object {
  var columns: js.Array[ColumnInstance[D]] = js.native
  var depth: Double = js.native
  var id: IdType[D] = js.native
   // not documented
  var index: Double = js.native
  var isVisible: Boolean = js.native
  var parent: ColumnInstance[D] = js.native
  var totalLeft: Double = js.native
  var totalWidth: Double = js.native
  def getFooterProps(): TableFooterProps = js.native
  def getFooterProps(propGetter: FooterPropGetter[D]): TableFooterProps = js.native
  def getHeaderProps(): TableHeaderProps = js.native
  def getHeaderProps(propGetter: HeaderPropGetter[D]): TableHeaderProps = js.native
   // not documented
  def getToggleHideColumnsProps(userProps: js.Any): js.Any = js.native
  def render(`type`: String): TagMod[Any] = js.native
  def render(`type`: String, props: js.Object): TagMod[Any] = js.native
  @JSName("render")
  def render_Footer(`type`: Footer): TagMod[Any] = js.native
  @JSName("render")
  def render_Footer(`type`: Footer, props: js.Object): TagMod[Any] = js.native
  @JSName("render")
  def render_Header(`type`: Header): TagMod[Any] = js.native
  @JSName("render")
  def render_Header(`type`: Header, props: js.Object): TagMod[Any] = js.native
  def toggleHidden(): Unit = js.native
  def toggleHidden(value: Boolean): Unit = js.native
}

