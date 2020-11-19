package typingsSlinky.fluentuiReactIcons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type SvgIconChildrenFn[TProps] = js.Function1[
    /* svgIcon */ typingsSlinky.fluentuiReactIcons.typesMod.SvgIconFuncArg[TProps], 
    slinky.core.facade.ReactElement
  ]
  
  type SvgIconChildrenFnWithRoot[TProps] = js.Function1[
    /* svgIcon */ typingsSlinky.fluentuiReactIcons.typesMod.SvgIconFuncWithRootArg[TProps], 
    slinky.core.facade.ReactElement
  ]
}
