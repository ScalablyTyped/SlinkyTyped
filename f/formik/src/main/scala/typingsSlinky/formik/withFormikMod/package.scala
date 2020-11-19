package typingsSlinky.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object withFormikMod {
  
  type ComponentDecorator[TOwnProps, TMergedProps] = js.Function1[
    /* component */ typingsSlinky.formik.withFormikMod.CompositeComponent[TMergedProps], 
    slinky.core.ReactComponentClass[TOwnProps]
  ]
  
  type CompositeComponent[P] = slinky.core.ReactComponentClass[P]
  
  type InferableComponentDecorator[TOwnProps] = js.Function1[
    /* component */ typingsSlinky.formik.withFormikMod.CompositeComponent[TOwnProps], 
    typingsSlinky.formik.withFormikMod.CompositeComponent[TOwnProps]
  ]
  
  type InjectedFormikProps[Props, Values] = Props with typingsSlinky.formik.typesMod.FormikProps[Values]
}
