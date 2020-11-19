package typingsSlinky.gulpTypescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type FinalTransformers = js.UndefOr[
    js.Function1[
      /* program */ js.UndefOr[typingsSlinky.typescript.mod.Program], 
      typingsSlinky.typescript.mod.CustomTransformers
    ]
  ]
  
  type GetCustomTransformers = java.lang.String | (js.Function1[
    /* program */ js.UndefOr[typingsSlinky.typescript.mod.Program], 
    js.UndefOr[typingsSlinky.typescript.mod.CustomTransformers]
  ])
}
