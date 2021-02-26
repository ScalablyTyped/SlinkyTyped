package typingsSlinky.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseTableHeaderGroupProps[D /* <: js.Object */] extends StObject {
  
  def getFooterGroupProps(): TableFooterProps = js.native
  def getFooterGroupProps(propGetter: FooterGroupPropGetter[D]): TableFooterProps = js.native
  
  def getHeaderGroupProps(): TableHeaderProps = js.native
  def getHeaderGroupProps(propGetter: HeaderGroupPropGetter[D]): TableHeaderProps = js.native
  
  var headers: js.Array[HeaderGroup[D]] = js.native
  
  var totalHeaderCount: Double = js.native
}
