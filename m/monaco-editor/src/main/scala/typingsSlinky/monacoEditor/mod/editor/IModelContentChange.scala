package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.IRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModelContentChange extends StObject {
  
  /**
    * The range that got replaced.
    */
  val range: IRange = js.native
  
  /**
    * The length of the range that got replaced.
    */
  val rangeLength: Double = js.native
  
  /**
    * The offset of the range that got replaced.
    */
  val rangeOffset: Double = js.native
  
  /**
    * The new text for the range.
    */
  val text: String = js.native
}
object IModelContentChange {
  
  @scala.inline
  def apply(range: IRange, rangeLength: Double, rangeOffset: Double, text: String): IModelContentChange = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], rangeLength = rangeLength.asInstanceOf[js.Any], rangeOffset = rangeOffset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelContentChange]
  }
  
  @scala.inline
  implicit class IModelContentChangeMutableBuilder[Self <: IModelContentChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeLength(value: Double): Self = StObject.set(x, "rangeLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeOffset(value: Double): Self = StObject.set(x, "rangeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
