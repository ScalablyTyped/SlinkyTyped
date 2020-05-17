package typingsSlinky.rcFieldForm.fieldMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.rcFieldForm.anon.Child
import typingsSlinky.rcFieldForm.anon.ResetCount
import typingsSlinky.rcFieldForm.interfaceMod.FormInstance
import typingsSlinky.rcFieldForm.interfaceMod.InternalNamePath
import typingsSlinky.rcFieldForm.interfaceMod.Meta
import typingsSlinky.rcFieldForm.interfaceMod.NotifyInfo
import typingsSlinky.rcFieldForm.interfaceMod.RuleObject
import typingsSlinky.rcFieldForm.interfaceMod.Store
import typingsSlinky.rcFieldForm.interfaceMod.ValidateOptions
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactPortal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.rcFieldForm.interfaceMod.FieldEntity because var conflicts: props. Inlined onStoreChange, onStoreChange, isFieldTouched, isFieldValidating, validateRules, validateRules, getMeta, getNamePath, getErrors */ @js.native
trait Field
  extends Component[FieldProps, FieldState, js.Any] {
  var cancelRegisterFunc: js.Any = js.native
  var destroy: js.Any = js.native
  var errors: js.Any = js.native
  var onStoreChange: js.Function3[
    /* store */ Store, 
    /* namePathList */ js.Array[InternalNamePath] | Null, 
    /* info */ NotifyInfo, 
    Unit
  ] = js.native
  var prevValidating: js.Any = js.native
  @JSName("state")
  var state_Field: ResetCount = js.native
  /**
    * Follow state should not management in State since it will async update by React.
    * This makes first render of form can not get correct state value.
    */
  var touched: js.Any = js.native
  var validatePromise: js.Any = js.native
  def cancelRegister(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MField(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MField(): Unit = js.native
  def getControlled(): StringDictionary[js.Any] = js.native
  def getControlled(childProps: ChildProps): StringDictionary[js.Any] = js.native
  def getErrors(): js.Array[String] = js.native
  def getMeta(): Meta = js.native
  def getNamePath(): InternalNamePath = js.native
  def getOnlyChild(children: String): Child = js.native
  def getOnlyChild(
    children: js.Function3[/* control */ ChildProps, /* meta */ Meta, /* context */ FormInstance, TagMod[Any]]
  ): Child = js.native
  def getOnlyChild(children: js.Object): Child = js.native
  def getOnlyChild(children: Boolean): Child = js.native
  def getOnlyChild(children: Double): Child = js.native
  def getOnlyChild(children: ReactElement): Child = js.native
  def getOnlyChild(children: ReactNodeArray): Child = js.native
  def getOnlyChild(children: ReactPortal): Child = js.native
  def getRules(): js.Array[RuleObject] = js.native
  def getValue(): js.Any = js.native
  def getValue(store: Store): js.Any = js.native
  def isFieldTouched(): Boolean = js.native
  def isFieldValidating(): Boolean = js.native
  def onStoreChange(store: Store, namePathList: js.Array[InternalNamePath], info: NotifyInfo): Unit = js.native
  def onStoreChange(store: Store, namePathList: Null, info: NotifyInfo): Unit = js.native
  def reRender(): Unit = js.native
  def refresh(): Unit = js.native
  def validateRules(): js.Promise[js.Array[String]] = js.native
  def validateRules(options: ValidateOptions): js.Promise[js.Array[String]] = js.native
}

