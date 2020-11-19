package typingsSlinky.ol.overviewMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverviewMap
  extends typingsSlinky.ol.controlControlMod.default {
  
  def getCollapsed(): Boolean = js.native
  
  def getCollapsible(): Boolean = js.native
  
  def getOverviewMap(): typingsSlinky.ol.pluggableMapMod.default = js.native
  
  def getRotateWithView(): Boolean = js.native
  
  def setCollapsed(collapsed: Boolean): Unit = js.native
  
  def setCollapsible(collapsible: Boolean): Unit = js.native
  
  def setRotateWithView(rotateWithView: Boolean): Unit = js.native
}
