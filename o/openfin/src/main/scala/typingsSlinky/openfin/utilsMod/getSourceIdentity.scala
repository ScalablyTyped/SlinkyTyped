package typingsSlinky.openfin.utilsMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery.DragEventBase
import typingsSlinky.openfin.anon.Uuid
import typingsSlinky.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/api/platform/utils", "getSourceIdentity")
@js.native
object getSourceIdentity extends js.Object {
  
  def apply(e: DragEventBase[HTMLElement, Identity, HTMLElement, HTMLElement]): Uuid = js.native
}
