package typingsSlinky.pgwmodal

import typingsSlinky.pgwmodal.pgwmodalStrings.close
import typingsSlinky.pgwmodal.pgwmodalStrings.getData
import typingsSlinky.pgwmodal.pgwmodalStrings.isOpen
import typingsSlinky.pgwmodal.pgwmodalStrings.reposition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PgwModalMethod extends js.Object {
  
  def apply(action: String): js.Any = js.native
  def apply(action: close): Boolean = js.native
  def apply(action: getData): js.Any = js.native
  def apply(action: isOpen): Boolean = js.native
  def apply(action: reposition): Boolean = js.native
  def apply(option: PgwModalOption): Boolean = js.native
}
