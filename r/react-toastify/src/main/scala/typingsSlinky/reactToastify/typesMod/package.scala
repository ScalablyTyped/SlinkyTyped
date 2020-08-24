package typingsSlinky.reactToastify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ClassName = java.lang.String | scala.Null
  type Id = scala.Double | java.lang.String
  type Nullable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] | null}
    */ typingsSlinky.reactToastify.reactToastifyStrings.Nullable with org.scalablytyped.runtime.TopLevel[T]
  type ToastContent = slinky.core.facade.ReactElement | (js.Function1[
    /* props */ typingsSlinky.reactToastify.typesMod.ToastContentProps, 
    slinky.core.facade.ReactElement
  ])
  type ToastTransition = slinky.core.ReactComponentClass[typingsSlinky.reactToastify.typesMod.ToastTransitionProps]
}
