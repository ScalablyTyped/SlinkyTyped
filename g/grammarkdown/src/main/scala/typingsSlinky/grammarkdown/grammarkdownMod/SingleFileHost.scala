package typingsSlinky.grammarkdown.grammarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "SingleFileHost")
@js.native
class SingleFileHost protected () extends Host {
  def this(content: String) = this()
  def this(content: String, file: String) = this()
  def this(content: String, file: js.UndefOr[scala.Nothing], hostFallback: Host) = this()
  def this(content: String, file: String, hostFallback: Host) = this()
  
  val content: String = js.native
  
  val file: String = js.native
  
  var hostFallback: js.Any = js.native
}
