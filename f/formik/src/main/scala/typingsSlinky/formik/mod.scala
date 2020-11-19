package typingsSlinky.formik

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.formik.anon.Dirty
import typingsSlinky.formik.anon.Formik
import typingsSlinky.formik.anon.PickDetailedHTMLPropsForm
import typingsSlinky.formik.errorMessageMod.ErrorMessageProps
import typingsSlinky.formik.fieldArrayMod.FieldArrayConfig
import typingsSlinky.formik.fieldMod.FieldAttributes
import typingsSlinky.formik.fieldMod.FieldHookConfig
import typingsSlinky.formik.typesMod.FieldHelperProps
import typingsSlinky.formik.typesMod.FieldInputProps
import typingsSlinky.formik.typesMod.FieldMetaProps
import typingsSlinky.formik.typesMod.FormikConfig
import typingsSlinky.formik.typesMod.FormikContextType
import typingsSlinky.formik.typesMod.FormikErrors
import typingsSlinky.formik.typesMod.FormikProps
import typingsSlinky.formik.typesMod.FormikValues
import typingsSlinky.formik.withFormikMod.ComponentDecorator
import typingsSlinky.formik.withFormikMod.WithFormikConfig
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.ProviderProps
import typingsSlinky.std.ArrayLike
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("formik", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ErrorMessage: ReactComponentClass[ErrorMessageProps] = js.native
  
  val FastField: ReactComponentClass[js.Any] = js.native
  
  def Field(hasValidateNameRenderChildrenAsComponentProps: FieldAttributes[_]): js.Any = js.native
  
  val FieldArray: ReactComponentClass[FieldArrayConfig] = js.native
  
  val Form: ForwardRefExoticComponent[PickDetailedHTMLPropsForm] = js.native
  
  def Formik[Values /* <: FormikValues */, ExtraProps](props: FormikConfig[Values] with ExtraProps): ReactElement = js.native
  
  val FormikConsumer: ReactComponentClass[ConsumerProps[FormikContextType[js.Any]]] = js.native
  
  val FormikContext: Context[FormikContextType[js.Any]] = js.native
  
  val FormikProvider: ReactComponentClass[ProviderProps[FormikContextType[js.Any]]] = js.native
  
  def connect[OuterProps, Values](Comp: ReactComponentClass[OuterProps with Formik[Values]]): ReactComponentClass[OuterProps] = js.native
  
  def getActiveElement(): Element | Null = js.native
  def getActiveElement(doc: Document): Element | Null = js.native
  
  def getIn(obj: js.Any, key: String): js.Any = js.native
  def getIn(obj: js.Any, key: String, `def`: js.UndefOr[scala.Nothing], p: Double): js.Any = js.native
  def getIn(obj: js.Any, key: String, `def`: js.Any): js.Any = js.native
  def getIn(obj: js.Any, key: String, `def`: js.Any, p: Double): js.Any = js.native
  def getIn(obj: js.Any, key: js.Array[String]): js.Any = js.native
  def getIn(obj: js.Any, key: js.Array[String], `def`: js.UndefOr[scala.Nothing], p: Double): js.Any = js.native
  def getIn(obj: js.Any, key: js.Array[String], `def`: js.Any): js.Any = js.native
  def getIn(obj: js.Any, key: js.Array[String], `def`: js.Any, p: Double): js.Any = js.native
  
  def insert(arrayLike: ArrayLike[_], index: Double, value: js.Any): js.Array[_] = js.native
  
  def isEmptyArray(): Boolean = js.native
  def isEmptyArray(value: js.Any): Boolean = js.native
  
  def isEmptyChildren(children: js.Any): Boolean = js.native
  
  def isFunction(obj: js.Any): /* is std.Function */ Boolean = js.native
  
  def isInputEvent(value: js.Any): /* is react.react.SyntheticEvent<any, std.Event> */ Boolean = js.native
  
  def isInteger(obj: js.Any): Boolean = js.native
  
  def isNaN(obj: js.Any): Boolean = js.native
  
  def isObject(obj: js.Any): /* is std.Object */ Boolean = js.native
  
  def isPromise(value: js.Any): /* is std.PromiseLike<any> */ Boolean = js.native
  
  def isString(obj: js.Any): /* is string */ Boolean = js.native
  
  def move(array: js.Array[_], from: Double, to: Double): js.Array[_] = js.native
  
  def prepareDataForValidation[T /* <: FormikValues */](values: T): FormikValues = js.native
  
  def replace(arrayLike: ArrayLike[_], index: Double, value: js.Any): js.Array[_] = js.native
  
  def setIn(obj: js.Any, path: String, value: js.Any): js.Any = js.native
  
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any): T = js.native
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any, visited: js.UndefOr[scala.Nothing], response: js.Any): T = js.native
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any, visited: js.Any): T = js.native
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any, visited: js.Any, response: js.Any): T = js.native
  
  def swap(arrayLike: ArrayLike[_], indexA: Double, indexB: Double): js.Array[_] = js.native
  
  def useField[Val](propsOrFieldName: String): js.Tuple3[FieldInputProps[Val], FieldMetaProps[Val], FieldHelperProps[Val]] = js.native
  def useField[Val](propsOrFieldName: FieldHookConfig[Val]): js.Tuple3[FieldInputProps[Val], FieldMetaProps[Val], FieldHelperProps[Val]] = js.native
  
  def useFormik[Values /* <: FormikValues */](
    hasValidateOnChangeValidateOnBlurValidateOnMountIsInitialValidEnableReinitializeOnSubmitRest: FormikConfig[Values]
  ): Dirty[Values] = js.native
  
  def useFormikContext[Values](): FormikContextType[Values] = js.native
  
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any): js.Promise[Partial[T]] = js.native
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any, sync: js.UndefOr[scala.Nothing], context: js.Any): js.Promise[Partial[T]] = js.native
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any, sync: Boolean): js.Promise[Partial[T]] = js.native
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any, sync: Boolean, context: js.Any): js.Promise[Partial[T]] = js.native
  
  def withFormik[OuterProps /* <: js.Object */, Values /* <: FormikValues */, Payload](hasMapPropsToValuesConfig: WithFormikConfig[OuterProps, Values, Payload]): ComponentDecorator[OuterProps, OuterProps with FormikProps[Values]] = js.native
  
  def yupToFormErrors[Values](yupError: js.Any): FormikErrors[Values] = js.native
}
