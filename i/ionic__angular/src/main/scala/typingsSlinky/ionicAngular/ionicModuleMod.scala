package typingsSlinky.ionicAngular

import typingsSlinky.angularCore.mod.ModuleWithProviders
import typingsSlinky.ionicCore.utilsConfigMod.IonicConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/ionic-module", JSImport.Namespace)
@js.native
object ionicModuleMod extends js.Object {
  @js.native
  class IonicModule () extends js.Object
  
  /* static members */
  @js.native
  object IonicModule extends js.Object {
    def forRoot(): ModuleWithProviders[IonicModule] = js.native
    def forRoot(config: IonicConfig): ModuleWithProviders[IonicModule] = js.native
  }
  
}

