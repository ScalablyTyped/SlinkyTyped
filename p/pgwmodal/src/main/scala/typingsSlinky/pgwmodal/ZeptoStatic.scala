package typingsSlinky.pgwmodal

import typingsSlinky.pgwmodal.pgwmodalStrings.close
import typingsSlinky.pgwmodal.pgwmodalStrings.getData
import typingsSlinky.pgwmodal.pgwmodalStrings.isOpen
import typingsSlinky.pgwmodal.pgwmodalStrings.reposition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZeptoStatic extends StObject {
  
  def pgwModal(action: String): js.Any = js.native
  def pgwModal(option: PgwModalOption): Boolean = js.native
  @JSName("pgwModal")
  var pgwModal_Original: PgwModalMethod = js.native
  @JSName("pgwModal")
  def pgwModal_close(action: close): Boolean = js.native
  @JSName("pgwModal")
  def pgwModal_getData(action: getData): js.Any = js.native
  @JSName("pgwModal")
  def pgwModal_isOpen(action: isOpen): Boolean = js.native
  @JSName("pgwModal")
  def pgwModal_reposition(action: reposition): Boolean = js.native
}
