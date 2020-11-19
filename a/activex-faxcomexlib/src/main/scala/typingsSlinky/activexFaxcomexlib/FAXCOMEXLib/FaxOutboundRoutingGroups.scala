package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutboundRoutingGroups Class */
@js.native
trait FaxOutboundRoutingGroups extends js.Object {
  
  def apply(vIndex: String): FaxOutboundRoutingGroup = js.native
  def apply(vIndex: Double): FaxOutboundRoutingGroup = js.native
  
  /** Add a group */
  def Add(bstrName: String): FaxOutboundRoutingGroup = js.native
  
  val Count: Double = js.native
  
  def Item(vIndex: String): FaxOutboundRoutingGroup = js.native
  def Item(vIndex: Double): FaxOutboundRoutingGroup = js.native
  
  def Remove(vIndex: String): Unit = js.native
  /** Remove a group */
  def Remove(vIndex: Double): Unit = js.native
}
