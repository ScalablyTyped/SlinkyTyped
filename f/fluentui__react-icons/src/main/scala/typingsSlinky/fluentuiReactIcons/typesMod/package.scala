package typingsSlinky.fluentuiReactIcons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type SvgIconChildrenFn[TProps] = js.Function1[
    /* svgIcon */ typingsSlinky.fluentuiReactIcons.typesMod.SvgIconFuncArg[TProps], 
    slinky.core.TagMod[scala.Any]
  ]
  type SvgIconChildrenFnWithRoot[TProps] = js.Function1[
    /* svgIcon */ typingsSlinky.fluentuiReactIcons.typesMod.SvgIconFuncWithRootArg[TProps], 
    slinky.core.facade.ReactElement
  ]
}
