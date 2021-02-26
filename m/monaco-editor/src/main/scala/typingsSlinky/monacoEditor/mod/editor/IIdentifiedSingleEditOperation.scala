package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.IRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIdentifiedSingleEditOperation extends StObject {
  
  /**
    * This indicates that this operation has "insert" semantics.
    * i.e. forceMoveMarkers = true => if `range` is collapsed, all markers at the position will be moved.
    */
  var forceMoveMarkers: js.UndefOr[Boolean] = js.native
  
  /**
    * The range to replace. This can be empty to emulate a simple insert.
    */
  var range: IRange = js.native
  
  /**
    * The text to replace with. This can be null to emulate a simple delete.
    */
  var text: String | Null = js.native
}
object IIdentifiedSingleEditOperation {
  
  @scala.inline
  def apply(range: IRange): IIdentifiedSingleEditOperation = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIdentifiedSingleEditOperation]
  }
  
  @scala.inline
  implicit class IIdentifiedSingleEditOperationMutableBuilder[Self <: IIdentifiedSingleEditOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForceMoveMarkers(value: Boolean): Self = StObject.set(x, "forceMoveMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceMoveMarkersUndefined: Self = StObject.set(x, "forceMoveMarkers", js.undefined)
    
    @scala.inline
    def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextNull: Self = StObject.set(x, "text", null)
  }
}
