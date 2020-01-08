package typingsSlinky.formik

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import typingsSlinky.formik.distErrorMessageMod.ErrorMessageProps
import typingsSlinky.formik.distFieldArrayMod.FieldArrayConfig
import typingsSlinky.formik.distTypesMod.FormikConfig
import typingsSlinky.formik.distTypesMod.FormikContext
import typingsSlinky.formik.distTypesMod.FormikErrors
import typingsSlinky.formik.distTypesMod.FormikProps
import typingsSlinky.formik.distTypesMod.FormikValues
import typingsSlinky.formik.distWithFormikMod.ComponentDecorator
import typingsSlinky.formik.distWithFormikMod.WithFormikConfig
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.ComponentType
import typingsSlinky.react.reactMod.FormHTMLAttributes
import typingsSlinky.react.reactMod.ProviderProps
import typingsSlinky.std.HTMLFormElement
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik", JSImport.Namespace)
@js.native
object formikMod extends js.Object {
  @js.native
  class ErrorMessage protected ()
    extends Component[ErrorMessageProps, ComponentState, js.Any] {
    def this(props: ErrorMessageProps) = this()
    def this(props: ErrorMessageProps, context: js.Any) = this()
  }
  
  @js.native
  class FastField protected ()
    extends Component[js.Any, ComponentState, js.Any] {
    def this(props: js.Any) = this()
    def this(props: js.Any, context: js.Any) = this()
  }
  
  @js.native
  class Field protected ()
    extends Component[js.Any, ComponentState, js.Any] {
    def this(props: js.Any) = this()
    def this(props: js.Any, context: js.Any) = this()
  }
  
  @js.native
  class FieldArray protected ()
    extends Component[FieldArrayConfig, ComponentState, js.Any] {
    def this(props: FieldArrayConfig) = this()
    def this(props: FieldArrayConfig, context: js.Any) = this()
  }
  
  @js.native
  class Form protected ()
    extends Component[
          Pick[
            FormHTMLAttributes[HTMLFormElement], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 255 */ js.Any
          ], 
          ComponentState, 
          js.Any
        ] {
    def this(props: Pick[
            FormHTMLAttributes[org.scalajs.dom.raw.HTMLFormElement], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 255 */ js.Any
          ]) = this()
    def this(
      props: Pick[
            FormHTMLAttributes[org.scalajs.dom.raw.HTMLFormElement], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 255 */ js.Any
          ],
      context: js.Any
    ) = this()
  }
  
  @js.native
  class Formik[Values] protected ()
    extends typingsSlinky.formik.distFormikMod.Formik[Values] {
    def this(props: FormikConfig[Values]) = this()
  }
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(FormikConsumer) */ val FormikProvider: ReactComponentClass[ProviderProps[FormikContext[js.Any]]] = js.native
  def connect[OuterProps, Values](Comp: ReactComponentClass[OuterProps with Anon_FormikFormikContext[Values]]): ReactComponentClass[OuterProps] = js.native
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
  object ErrorMessage extends TopLevel[ComponentType[ErrorMessageProps]]
  
  @js.native
  object FastField
    extends TopLevel[ComponentType[js.Any]]
  
  @js.native
  object Field
    extends TopLevel[ComponentType[js.Any]]
  
  @js.native
  object FieldArray extends TopLevel[ComponentType[FieldArrayConfig]]
  
  @js.native
  object Form
    extends TopLevel[
          ComponentType[
            Pick[
              FormHTMLAttributes[HTMLFormElement], 
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 255 */ js.Any
            ]
          ]
        ]
  
  /* static members */
  @js.native
  object Formik extends js.Object {
    var defaultProps: Anon_EnableReinitialize = js.native
  }
  
}

