package typingsSlinky.angularForms.mod

import typingsSlinky.angularCore.mod.OnDestroy
import typingsSlinky.angularCore.mod.OnInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "AbstractFormGroupDirective")
@js.native
class AbstractFormGroupDirective ()
  extends ControlContainer
     with OnInit
     with OnDestroy {
  /**
    * @description
    * The async validators registered with this group.
    */
  val asyncValidator: AsyncValidatorFn | Null = js.native
  /**
    * @description
    * The `FormGroup` bound to this directive.
    */
  @JSName("control")
  val control_AbstractFormGroupDirective: FormGroup = js.native
  /**
    * @description
    * The path to this group from the top-level directive.
    */
  @JSName("path")
  val path_AbstractFormGroupDirective: js.Array[String] = js.native
  /**
    * @description
    * The synchronous validators registered with this group.
    */
  val validator: ValidatorFn | Null = js.native
}

