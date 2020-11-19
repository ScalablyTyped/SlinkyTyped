package typingsSlinky.eqJs.eq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EqjsStatic extends js.Object {
  
  /**
    * Runs through all nodes and writes their eq status.
    * @param nodes An array or NodeList of nodes to query
    * @returns {}
    */
  def nodeWrites(): Unit = js.native
  def nodeWrites(nodes: AvailableElementType): Unit = js.native
  
  /**
    * List of all nodes.
    */
  var nodes: EqjsNodesTable = js.native
  
  /**
    * Number of nodes in eqjs.nodes.
    */
  var nodesLength: Double = js.native
  
  /**
    * Runs through all nodes and finds their widths and points
    * @param nodes
    * @param callback function to use as a callback once query and nodeWrites have finished
    */
  def query(nodes: AvailableElementType): Unit = js.native
  def query(nodes: AvailableElementType, callback: js.Function): Unit = js.native
  
  /**
    *  Refreshes the list of nodes for eqjs to work with
    */
  def refreshNodes(): Unit = js.native
  
  /**
    * Sorts a simple object (key: value) by value and returns a sorted object.
    * @param obj e.g. "small: 380, medium: 490, large: 600"
    * @returns {}
    */
  def sortObj(obj: String): js.Array[EqjsKeyValuePair] = js.native
}
