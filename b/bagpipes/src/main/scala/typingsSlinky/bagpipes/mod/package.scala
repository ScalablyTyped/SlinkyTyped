package typingsSlinky.bagpipes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Fitting = js.Function2[
    /* context */ typingsSlinky.bagpipes.mod.FittingContext, 
    /* next */ js.Function2[
      /* err */ js.UndefOr[js.Error | scala.Null], 
      /* res */ js.UndefOr[js.Any], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type FittingFactory = js.Function2[
    /* fittingDef */ typingsSlinky.bagpipes.mod.FittingDef, 
    /* bagpipes */ js.Any, 
    typingsSlinky.bagpipes.mod.Fitting
  ]
  type FittingTypesMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.bagpipes.mod.FittingFactory]
  type PipeDefMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.bagpipes.mod.PipeDef]
}
