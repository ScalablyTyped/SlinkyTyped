package typingsSlinky.dndCore.interfacesMod

import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Backend extends StObject {
  
  def connectDragPreview(sourceId: js.Any): Unsubscribe = js.native
  def connectDragPreview(sourceId: js.Any, node: js.UndefOr[scala.Nothing], options: js.Any): Unsubscribe = js.native
  def connectDragPreview(sourceId: js.Any, node: js.Any): Unsubscribe = js.native
  def connectDragPreview(sourceId: js.Any, node: js.Any, options: js.Any): Unsubscribe = js.native
  
  def connectDragSource(sourceId: js.Any): Unsubscribe = js.native
  def connectDragSource(sourceId: js.Any, node: js.UndefOr[scala.Nothing], options: js.Any): Unsubscribe = js.native
  def connectDragSource(sourceId: js.Any, node: js.Any): Unsubscribe = js.native
  def connectDragSource(sourceId: js.Any, node: js.Any, options: js.Any): Unsubscribe = js.native
  
  def connectDropTarget(targetId: js.Any): Unsubscribe = js.native
  def connectDropTarget(targetId: js.Any, node: js.UndefOr[scala.Nothing], options: js.Any): Unsubscribe = js.native
  def connectDropTarget(targetId: js.Any, node: js.Any): Unsubscribe = js.native
  def connectDropTarget(targetId: js.Any, node: js.Any, options: js.Any): Unsubscribe = js.native
  
  def profile(): Record[String, Double] = js.native
  
  def setup(): Unit = js.native
  
  def teardown(): Unit = js.native
}
