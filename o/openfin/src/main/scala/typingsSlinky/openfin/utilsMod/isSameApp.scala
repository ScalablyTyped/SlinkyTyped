package typingsSlinky.openfin.utilsMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery.DragEventBase
import typingsSlinky.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/api/platform/utils", "isSameApp")
@js.native
object isSameApp extends js.Object {
  
  def apply(
    e: DragEventBase[HTMLElement, js.UndefOr[scala.Nothing], HTMLElement, HTMLElement],
    currentWindow: Identity
  ): Boolean = js.native
}
