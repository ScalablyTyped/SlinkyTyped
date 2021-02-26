package typingsSlinky.openfin

import typingsSlinky.openfin.GoldenLayout.Container
import typingsSlinky.openfin.shapesIdentityMod.Identity
import typingsSlinky.openfin.utilsMod.ViewComponent
import typingsSlinky.openfin.v2MainMod.Fin
import typingsSlinky.openfin.v2MainMod.View
import typingsSlinky.openfin.viewViewMod.ViewCreationOptions
import typingsSlinky.resizeObserverBrowser.ResizeObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizableViewMod {
  
  @JSImport("openfin/_v2/api/platform/resizable-view", "ResizableView")
  @js.native
  class ResizableView protected () extends StObject {
    def this(fin: Fin, hasContainerComponentState: ViewComponent, viewObserver: ResizeObserver) = this()
    
    var container: Container = js.native
    
    def createOrAttachView(): js.Promise[Unit] = js.native
    
    var fin: js.Any = js.native
    
    var ofView: View = js.native
    
    var options: js.Any = js.native
    
    def renderIntoComponent(): js.Promise[Unit] = js.native
    
    var resizeObserver: ResizeObserver = js.native
    
    var windowIdentity: Identity = js.native
  }
  
  @js.native
  trait ViewState extends ViewCreationOptions
  object ViewState {
    
    @scala.inline
    def apply(name: String, target: typingsSlinky.openfin.identityMod.Identity, url: String): ViewState = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewState]
    }
  }
}
