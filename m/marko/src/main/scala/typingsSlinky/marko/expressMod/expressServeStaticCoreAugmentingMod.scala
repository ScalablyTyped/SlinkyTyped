package typingsSlinky.marko.expressMod

import typingsSlinky.marko.templateMod.Template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-serve-static-core", JSImport.Namespace)
@js.native
object expressServeStaticCoreAugmentingMod extends js.Object {
  
  @js.native
  trait Response extends js.Object {
    
    def marko(template: Template): Unit = js.native
    def marko(template: Template, data: js.Any): Unit = js.native
  }
}
