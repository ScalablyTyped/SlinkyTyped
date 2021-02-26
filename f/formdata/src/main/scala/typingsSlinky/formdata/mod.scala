package typingsSlinky.formdata

import typingsSlinky.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("formdata", JSImport.Namespace)
  @js.native
  class ^ () extends FormData
  
  @js.native
  trait FormData extends StObject {
    
    def append(key: /* keyof any */ String, value: js.Any): js.UndefOr[js.Error] = js.native
    
    var boundary: js.UndefOr[String] = js.native
    
    def getContentType(): String = js.native
    
    var nodeChunkedEncoding: Boolean = js.native
    
    def serialize(): js.UndefOr[EventEmitter] = js.native
    def serialize(intendedType: String): js.UndefOr[EventEmitter] = js.native
    
    def setNodeChunkedEncoding(`val`: Boolean): Unit = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
}
