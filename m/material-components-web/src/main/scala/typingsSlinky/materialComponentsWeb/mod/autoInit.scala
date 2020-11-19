package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Document
import typingsSlinky.materialAutoInit.mod.MDCAttachable
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialBase.foundationMod.MDCFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-components-web", "autoInit")
@js.native
object autoInit extends js.Object {
  
  /**
    * Auto-initializes all MDC components on a page.
    */
  def apply(): js.Array[MDCComponent[MDCFoundation[js.Object]]] = js.native
  def apply(root: Document): js.Array[MDCComponent[MDCFoundation[js.Object]]] = js.native
  
  var deregister: js.Function1[/* componentName */ String, Unit] = js.native
  
  var deregisterAll: js.Function0[Unit] = js.native
  
  var register: js.Function3[
    /* componentName */ String, 
    /* Constructor */ MDCAttachable, 
    /* warn */ js.UndefOr[js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]], 
    Unit
  ] = js.native
}
