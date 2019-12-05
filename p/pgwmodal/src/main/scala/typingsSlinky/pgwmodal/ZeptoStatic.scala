package typingsSlinky.pgwmodal

import typingsSlinky.pgwmodal.pgwmodalStrings.close
import typingsSlinky.pgwmodal.pgwmodalStrings.getData
import typingsSlinky.pgwmodal.pgwmodalStrings.isOpen
import typingsSlinky.pgwmodal.pgwmodalStrings.reposition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZeptoStatic extends js.Object {
  @JSName("pgwModal")
  var pgwModal_Original: PgwModalMethod = js.native
  def pgwModal(action: String): js.Any = js.native
  def pgwModal(option: PgwModalOption): Boolean = js.native
  @JSName("pgwModal")
  def pgwModal_close(action: close): Boolean = js.native
  @JSName("pgwModal")
  def pgwModal_getData(action: getData): js.Any = js.native
  @JSName("pgwModal")
  def pgwModal_isOpen(action: isOpen): Boolean = js.native
  @JSName("pgwModal")
  def pgwModal_reposition(action: reposition): Boolean = js.native
}

