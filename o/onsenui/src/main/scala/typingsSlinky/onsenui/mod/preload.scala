package typingsSlinky.onsenui.mod

import org.scalajs.dom.raw.DocumentFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("onsenui", "preload")
@js.native
object preload extends js.Object {
  
  /**
    * @description Separated files need to be requested on demand and this can slightly delay pushing new pages. This method requests and caches templates for later use.
    * @return Promise that resolves when all the templates are cached.
    */
  def apply(args: js.Any*): js.Promise[js.Array[DocumentFragment]] = js.native
}
