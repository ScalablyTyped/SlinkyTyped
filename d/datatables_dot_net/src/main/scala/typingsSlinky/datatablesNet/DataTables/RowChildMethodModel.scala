package typingsSlinky.datatablesNet.DataTables

import org.scalajs.dom.raw.Node
import typingsSlinky.datatablesNet.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowChildMethodModel extends StObject {
  
  /**
    * Get the child row(s) that have been set for a parent row
    */
  def apply(): JQuery = js.native
  /**
    * Set the data to show in the child row(s). Note that calling this method will replace any child rows which are already attached to the parent row.
    *
    * @param data The data to be shown in the child row can be given in multiple different ways.
    * @param className Class name that is added to the td cell node(s) of the child row(s). As of 1.10.1 it is also added to the tr row node of the child row(s).
    */
  def apply(data: String): RowChildMethods = js.native
  def apply(data: String, className: String): RowChildMethods = js.native
  def apply(data: js.Array[String | Double | JQuery]): RowChildMethods = js.native
  def apply(data: js.Array[String | Double | JQuery], className: String): RowChildMethods = js.native
  def apply(data: Node): RowChildMethods = js.native
  def apply(data: Node, className: String): RowChildMethods = js.native
  def apply(data: JQuery): RowChildMethods = js.native
  def apply(data: JQuery, className: String): RowChildMethods = js.native
  /**
    * Get the child row(s) that have been set for a parent row
    *
    * @param showRemove This parameter can be given as true or false
    */
  def apply(showRemove: Boolean): RowChildMethods = js.native
  
  /**
    * Hide the child row(s) of a parent row
    */
  def hide(): Api = js.native
  
  /**
    * Check if the child rows of a parent row are visible
    */
  def isShown(): Api = js.native
  
  /**
    * Remove child row(s) from display and release any allocated memory
    */
  def remove(): Api = js.native
  
  /**
    * Show the child row(s) of a parent row
    */
  def show(): Api = js.native
}
