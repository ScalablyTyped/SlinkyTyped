package typingsSlinky.reactTimeago

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Formatter = js.Function5[
    /* value */ scala.Double, 
    /* unit */ typingsSlinky.reactTimeago.mod.Unit, 
    /* suffix */ typingsSlinky.reactTimeago.mod.Suffix, 
    /* epochMiliseconds */ scala.Double, 
    /* nextFormatter */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-timeago.react-timeago.Formatter */ js.Object
    ], 
    slinky.core.facade.ReactElement
  ]
  type ReactTimeago[T /* <: slinky.core.ReactComponentClass[js.Object] */] = slinky.core.ReactComponentClass[
    typingsSlinky.reactTimeago.mod.ReactTimeagoProps[T] with typingsSlinky.react.mod.ComponentProps[T]
  ]
}
