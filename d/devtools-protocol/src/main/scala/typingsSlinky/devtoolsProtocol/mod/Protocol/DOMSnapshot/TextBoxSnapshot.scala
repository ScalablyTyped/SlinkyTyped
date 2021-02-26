package typingsSlinky.devtoolsProtocol.mod.Protocol.DOMSnapshot

import typingsSlinky.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextBoxSnapshot extends StObject {
  
  /**
    * The absolute position bounding box.
    */
  var bounds: js.Array[Rectangle] = js.native
  
  /**
    * Index of the layout tree node that owns this box collection.
    */
  var layoutIndex: js.Array[integer] = js.native
  
  /**
    * The number of characters in this post layout textbox substring. Characters that would be
    * represented as a surrogate pair in UTF-16 have length 2.
    */
  var length: js.Array[integer] = js.native
  
  /**
    * The starting index in characters, for this post layout textbox substring. Characters that
    * would be represented as a surrogate pair in UTF-16 have length 2.
    */
  var start: js.Array[integer] = js.native
}
object TextBoxSnapshot {
  
  @scala.inline
  def apply(
    bounds: js.Array[Rectangle],
    layoutIndex: js.Array[integer],
    length: js.Array[integer],
    start: js.Array[integer]
  ): TextBoxSnapshot = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], layoutIndex = layoutIndex.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextBoxSnapshot]
  }
  
  @scala.inline
  implicit class TextBoxSnapshotMutableBuilder[Self <: TextBoxSnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: js.Array[Rectangle]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsVarargs(value: Rectangle*): Self = StObject.set(x, "bounds", js.Array(value :_*))
    
    @scala.inline
    def setLayoutIndex(value: js.Array[integer]): Self = StObject.set(x, "layoutIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutIndexVarargs(value: integer*): Self = StObject.set(x, "layoutIndex", js.Array(value :_*))
    
    @scala.inline
    def setLength(value: js.Array[integer]): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthVarargs(value: integer*): Self = StObject.set(x, "length", js.Array(value :_*))
    
    @scala.inline
    def setStart(value: js.Array[integer]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartVarargs(value: integer*): Self = StObject.set(x, "start", js.Array(value :_*))
  }
}
