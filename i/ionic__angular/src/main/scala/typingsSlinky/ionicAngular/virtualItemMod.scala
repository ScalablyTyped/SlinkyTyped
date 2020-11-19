package typingsSlinky.ionicAngular

import typingsSlinky.angularCore.mod.TemplateRef
import typingsSlinky.angularCore.mod.ViewContainerRef
import typingsSlinky.ionicAngular.virtualUtilsMod.VirtualContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/virtual-scroll/virtual-item", JSImport.Namespace)
@js.native
object virtualItemMod extends js.Object {
  
  @js.native
  class VirtualItem protected () extends js.Object {
    def this(templateRef: TemplateRef[VirtualContext], viewContainer: ViewContainerRef) = this()
    
    var templateRef: TemplateRef[VirtualContext] = js.native
    
    var viewContainer: ViewContainerRef = js.native
  }
}
