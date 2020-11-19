package typingsSlinky.angularForms.mod

import typingsSlinky.angularCore.mod.ModuleWithProviders
import typingsSlinky.angularForms.anon.WarnOnNgModelWithFormControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "ReactiveFormsModule")
@js.native
class ReactiveFormsModule () extends js.Object
/* static members */
@JSImport("@angular/forms", "ReactiveFormsModule")
@js.native
object ReactiveFormsModule extends js.Object {
  
  /**
    * @description
    * Provides options for configuring the reactive forms module.
    *
    * @param opts An object of configuration options
    * * `warnOnNgModelWithFormControl` Configures when to emit a warning when an `ngModel`
    * binding is used with reactive form directives.
    */
  def withConfig(opts: WarnOnNgModelWithFormControl): ModuleWithProviders[ReactiveFormsModule] = js.native
}
