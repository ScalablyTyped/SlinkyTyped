package typingsSlinky.reactForm.mod

import typingsSlinky.react.mod.ChildContextProvider
import typingsSlinky.react.mod.Component
import typingsSlinky.reactForm.anon.FormApiValidator
import typingsSlinky.reactForm.anon.FormPropschildrenpropsFor
import typingsSlinky.reactForm.anon.ReadonlyPartialFormProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-form", "Form")
@js.native
class Form ()
  extends Component[FormPropschildrenpropsFor, js.Object, js.Any]
     with ChildContextProvider[FormContext] {
  @JSName("componentWillMount")
  def componentWillMount_MForm(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MForm(nextProps: ReadonlyPartialFormProps, nextContext: js.Any): Unit = js.native
  def componentWillUmount(): Unit = js.native
  /* CompleteClass */
  override def getChildContext(): FormContext = js.native
  def getDefaultState(): FormState = js.native
}

/* static members */
@JSImport("react-form", "Form")
@js.native
object Form extends js.Object {
  var childContextTypes: FormApiValidator = js.native
  var defaultProps: FormProps = js.native
}

