package typingsSlinky.reactDashTimeago

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashTimeagoMod {
  import slinky.core.ReactComponentClass
  import slinky.core.TagMod
  import typingsSlinky.react.reactMod.ComponentProps

  type Formatter = js.Function5[
    /* value */ Double, 
    /* unit */ Unit, 
    /* suffix */ Suffix, 
    /* epochMiliseconds */ Double, 
    /* nextFormatter */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias react-timeago.react-timeago.Formatter */ js.Object
    ], 
    TagMod[Any]
  ]
  type ReactTimeago[T /* <: ReactComponentClass[js.Object] */] = ReactComponentClass[ReactTimeagoProps[T] with ComponentProps[T]]
}
