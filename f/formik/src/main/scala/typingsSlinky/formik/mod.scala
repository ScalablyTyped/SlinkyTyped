package typingsSlinky.formik

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import typingsSlinky.formik.anon.EnableReinitialize
import typingsSlinky.formik.anon.FormikFormikContext
import typingsSlinky.formik.anon.PickFormHTMLAttributesHTM
import typingsSlinky.formik.errorMessageMod.ErrorMessageProps
import typingsSlinky.formik.fieldArrayMod.FieldArrayConfig
import typingsSlinky.formik.typesMod.FormikConfig
import typingsSlinky.formik.typesMod.FormikContext
import typingsSlinky.formik.typesMod.FormikErrors
import typingsSlinky.formik.typesMod.FormikProps
import typingsSlinky.formik.typesMod.FormikValues
import typingsSlinky.formik.withFormikMod.ComponentDecorator
import typingsSlinky.formik.withFormikMod.WithFormikConfig
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ProviderProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ErrorMessage protected ()
    extends Component[ErrorMessageProps, js.Object, js.Any] {
    def this(props: ErrorMessageProps) = this()
    def this(props: ErrorMessageProps, context: js.Any) = this()
  }
  
  @js.native
  class FastField protected ()
    extends Component[js.Any, js.Object, js.Any] {
    def this(props: js.Any) = this()
    def this(props: js.Any, context: js.Any) = this()
  }
  
  @js.native
  class Field protected ()
    extends Component[js.Any, js.Object, js.Any] {
    def this(props: js.Any) = this()
    def this(props: js.Any, context: js.Any) = this()
  }
  
  @js.native
  class FieldArray protected ()
    extends Component[FieldArrayConfig, js.Object, js.Any] {
    def this(props: FieldArrayConfig) = this()
    def this(props: FieldArrayConfig, context: js.Any) = this()
  }
  
  @js.native
  class Form protected ()
    extends Component[PickFormHTMLAttributesHTM, js.Object, js.Any] {
    def this(props: PickFormHTMLAttributesHTM) = this()
    def this(props: PickFormHTMLAttributesHTM, context: js.Any) = this()
  }
  
  @js.native
  class Formik[Values] protected ()
    extends typingsSlinky.formik.formikMod.Formik[Values] {
    def this(props: FormikConfig[Values]) = this()
  }
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(FormikConsumer) */ val FormikProvider: ReactComponentClass[ProviderProps[FormikContext[js.Any]]] = js.native
  def connect[OuterProps, Values](Comp: ReactComponentClass[OuterProps with FormikFormikContext[Values]]): ReactComponentClass[OuterProps] = js.native
  def getActiveElement(): Element | Null = js.native
  def getActiveElement(doc: Document): Element | Null = js.native
  def getIn(obj: js.Any, key: String): js.Any = js.native
  def getIn(obj: js.Any, key: String, `def`: js.Any): js.Any = js.native
  def getIn(obj: js.Any, key: String, `def`: js.Any, p: Double): js.Any = js.native
  def getIn(obj: js.Any, key: js.Array[String]): js.Any = js.native
  def getIn(obj: js.Any, key: js.Array[String], `def`: js.Any): js.Any = js.native
  def getIn(obj: js.Any, key: js.Array[String], `def`: js.Any, p: Double): js.Any = js.native
  def insert(array: js.Array[_], index: Double, value: js.Any): js.Array[_] = js.native
  def isEmptyChildren(children: js.Any): Boolean = js.native
  def isFunction(obj: js.Any): /* is std.Function */ Boolean = js.native
  def isInputEvent(value: js.Any): /* is react.react.SyntheticEvent<any, std.Event> */ Boolean = js.native
  def isInteger(obj: js.Any): Boolean = js.native
  def isNaN(obj: js.Any): Boolean = js.native
  def isObject(obj: js.Any): Boolean = js.native
  def isPromise(value: js.Any): /* is std.PromiseLike<any> */ Boolean = js.native
  def isString(obj: js.Any): /* is string */ Boolean = js.native
  def makeCancelable[T /* <: js.Promise[_] */](promise: T): js.Tuple2[T, js.Function0[Unit]] = js.native
  def move(array: js.Array[_], from: Double, to: Double): js.Array[_] = js.native
  def replace(array: js.Array[_], index: Double, value: js.Any): js.Array[_] = js.native
  def setIn(obj: js.Any, path: String, value: js.Any): js.Any = js.native
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any): T = js.native
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any, visited: js.Any): T = js.native
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any, visited: js.Any, response: js.Any): T = js.native
  def swap(array: js.Array[_], indexA: Double, indexB: Double): js.Array[_] = js.native
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any): js.Promise[Partial[T]] = js.native
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any, sync: Boolean): js.Promise[Partial[T]] = js.native
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any, sync: Boolean, context: js.Any): js.Promise[Partial[T]] = js.native
  def withFormik[OuterProps, Values /* <: FormikValues */, Payload](hasMapPropsToValuesConfig: WithFormikConfig[OuterProps, Values, Payload]): ComponentDecorator[OuterProps, OuterProps with FormikProps[Values]] = js.native
  def yupToFormErrors[Values](yupError: js.Any): FormikErrors[Values] = js.native
  @js.native
  object ErrorMessage extends TopLevel[ReactComponentClass[ErrorMessageProps]]
  
  @js.native
  object FastField
    extends TopLevel[ReactComponentClass[js.Any]]
  
  @js.native
  object Field
    extends TopLevel[ReactComponentClass[js.Any]]
  
  @js.native
  object FieldArray extends TopLevel[ReactComponentClass[FieldArrayConfig]]
  
  @js.native
  object Form extends TopLevel[ReactComponentClass[PickFormHTMLAttributesHTM]]
  
  /* static members */
  @js.native
  object Formik extends js.Object {
    var defaultProps: EnableReinitialize = js.native
  }
  
}

