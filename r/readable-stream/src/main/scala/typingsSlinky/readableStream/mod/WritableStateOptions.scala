package typingsSlinky.readableStream.mod

import typingsSlinky.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WritableStateOptions extends StObject {
  
  var decodeStrings: js.UndefOr[Boolean] = js.native
  
  var defaultEncoding: js.UndefOr[BufferEncoding] = js.native
  
  var highWaterMark: js.UndefOr[Double] = js.native
  
  var objectMode: js.UndefOr[Boolean] = js.native
  
  var writableHighWaterMark: js.UndefOr[Double] = js.native
  
  var writableObjectMode: js.UndefOr[Boolean] = js.native
}
object WritableStateOptions {
  
  @scala.inline
  def apply(): WritableStateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WritableStateOptions]
  }
  
  @scala.inline
  implicit class WritableStateOptionsMutableBuilder[Self <: WritableStateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecodeStrings(value: Boolean): Self = StObject.set(x, "decodeStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecodeStringsUndefined: Self = StObject.set(x, "decodeStrings", js.undefined)
    
    @scala.inline
    def setDefaultEncoding(value: BufferEncoding): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
    
    @scala.inline
    def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    
    @scala.inline
    def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    
    @scala.inline
    def setWritableHighWaterMark(value: Double): Self = StObject.set(x, "writableHighWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritableHighWaterMarkUndefined: Self = StObject.set(x, "writableHighWaterMark", js.undefined)
    
    @scala.inline
    def setWritableObjectMode(value: Boolean): Self = StObject.set(x, "writableObjectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritableObjectModeUndefined: Self = StObject.set(x, "writableObjectMode", js.undefined)
  }
}
