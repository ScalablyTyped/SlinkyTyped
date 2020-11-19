package typingsSlinky.ol.sourceSourceMod

import typingsSlinky.ol.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source
  extends typingsSlinky.ol.objectMod.default {
  
  def getAttributions(): Attribution = js.native
  
  def getAttributionsCollapsible(): Boolean = js.native
  
  def getProjection(): typingsSlinky.ol.projectionMod.default = js.native
  
  def getResolutions(): js.Array[Double] = js.native
  
  def getState(): State = js.native
  
  def getWrapX(): Boolean = js.native
  
  def refresh(): Unit = js.native
  
  def setAttributions(): Unit = js.native
  def setAttributions(attributions: AttributionLike): Unit = js.native
  
  /* protected */ def setState(state: State): Unit = js.native
}
