package typingsSlinky.contentfulManagement.anon

import typingsSlinky.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends StObject {
  
  var file: String | js.typedarray.ArrayBuffer | Stream = js.native
}
object `0` {
  
  @scala.inline
  def apply(file: String | js.typedarray.ArrayBuffer | Stream): `0` = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: String | js.typedarray.ArrayBuffer | Stream): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
  }
}
