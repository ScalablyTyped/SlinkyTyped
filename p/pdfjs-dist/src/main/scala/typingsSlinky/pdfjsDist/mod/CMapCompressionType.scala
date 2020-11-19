package typingsSlinky.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CMapCompressionType extends js.Object
@JSImport("pdfjs-dist", "CMapCompressionType")
@js.native
object CMapCompressionType extends js.Object {
  
  @js.native
  sealed trait BINARY extends CMapCompressionType
  
  @js.native
  sealed trait NONE extends CMapCompressionType
  
  @js.native
  sealed trait STREAM extends CMapCompressionType
}
