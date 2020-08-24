package typingsSlinky.formsyReact.formsyMod

import typingsSlinky.formsyReact.anon.Disabled
import typingsSlinky.formsyReact.anon.IsRequired
import typingsSlinky.formsyReact.anon.PartialFormsyProps
import typingsSlinky.formsyReact.interfacesMod.IModel
import typingsSlinky.formsyReact.interfacesMod.IUpdateInputsWithError
import typingsSlinky.formsyReact.interfacesMod.IUpdateInputsWithValue
import typingsSlinky.formsyReact.interfacesMod.InputComponent
import typingsSlinky.formsyReact.withFormsyMod.PassDownProps
import typingsSlinky.react.mod.Component
import typingsSlinky.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formsy-react/dist/Formsy", "Formsy")
@js.native
class Formsy protected ()
  extends Component[FormsyProps, FormsyState, js.Any] {
  def this(props: FormsyProps) = this()
  var emptyArray: js.Array[_] = js.native
  var inputs: js.Array[InstanceType[js.Any with PassDownProps[_]]] = js.native
  var prevInputNames: js.Array[_] | Null = js.native
  var resetInternal: js.Any = js.native
  var resetModel: js.Any = js.native
  var updateInputsWithError: IUpdateInputsWithError = js.native
  var updateInputsWithValue: IUpdateInputsWithValue[_] = js.native
  def attachToForm(component: js.Any): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MFormsy(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MFormsy(prevProps: FormsyProps): Unit = js.native
  def detachFromForm[V](component: InputComponent[V]): Unit = js.native
  def getCurrentValues(): js.Any = js.native
  def getModel(): js.Any = js.native
  def getPristineValues(): js.Any = js.native
  def isChanged(): Boolean = js.native
  def isFormDisabled(): Boolean = js.native
  def isValidValue(component: js.Any, value: js.Any): Boolean = js.native
  def mapModel(model: IModel): IModel = js.native
  def reset(): Unit = js.native
  def reset(model: IModel): Unit = js.native
  def runValidation[V](component: InputComponent[V]): IsRequired = js.native
  def runValidation[V](component: InputComponent[V], value: V): IsRequired = js.native
  def setFormPristine(isPristine: Boolean): Unit = js.native
  def setFormValidState(allIsValid: Boolean): Unit = js.native
  def setInputValidationErrors(errors: js.Any): Unit = js.native
  def submit(): Unit = js.native
  def submit(event: js.Any): Unit = js.native
  def validate[V](component: InputComponent[V]): Unit = js.native
  def validateForm(): Unit = js.native
}

/* static members */
@JSImport("formsy-react/dist/Formsy", "Formsy")
@js.native
object Formsy extends js.Object {
  var defaultProps: PartialFormsyProps = js.native
  var displayName: String = js.native
  var propTypes: Disabled = js.native
}

