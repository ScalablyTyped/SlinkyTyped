package typingsSlinky.mz.anon

import typingsSlinky.mz.mzBooleans.`false`
import typingsSlinky.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithFileTypes extends StObject {
  
  var encoding: BufferEncoding | Null = js.native
  
  var withFileTypes: js.UndefOr[`false`] = js.native
}
object WithFileTypes {
  
  @scala.inline
  def apply(): WithFileTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithFileTypes]
  }
  
  @scala.inline
  implicit class WithFileTypesMutableBuilder[Self <: WithFileTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    @scala.inline
    def setWithFileTypes(value: `false`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
  }
}
