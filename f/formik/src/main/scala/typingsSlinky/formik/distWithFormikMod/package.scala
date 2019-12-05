package typingsSlinky.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distWithFormikMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.formik.Anon_Props
  import typingsSlinky.formik.distTypesMod.FormikActions
  import typingsSlinky.formik.distTypesMod.FormikProps

  type ComponentDecorator[TOwnProps, TMergedProps] = js.Function1[/* component */ CompositeComponent[TMergedProps], ReactComponentClass[TOwnProps]]
  type CompositeComponent[P] = ReactComponentClass[P] | ReactComponentClass[P]
  type FormikBag[P, V] = Anon_Props[P] with FormikActions[V]
  type InferableComponentDecorator[TOwnProps] = js.Function1[/* component */ CompositeComponent[TOwnProps], CompositeComponent[TOwnProps]]
  type InjectedFormikProps[Props, Values] = Props with FormikProps[Values]
}
