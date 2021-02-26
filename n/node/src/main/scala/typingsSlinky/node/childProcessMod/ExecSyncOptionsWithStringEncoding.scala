package typingsSlinky.node.childProcessMod

import typingsSlinky.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecSyncOptionsWithStringEncoding extends ExecSyncOptions {
  
  @JSName("encoding")
  var encoding_ExecSyncOptionsWithStringEncoding: BufferEncoding = js.native
}
object ExecSyncOptionsWithStringEncoding {
  
  @scala.inline
  def apply(encoding: BufferEncoding): ExecSyncOptionsWithStringEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecSyncOptionsWithStringEncoding]
  }
  
  @scala.inline
  implicit class ExecSyncOptionsWithStringEncodingMutableBuilder[Self <: ExecSyncOptionsWithStringEncoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
