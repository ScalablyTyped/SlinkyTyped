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
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.bagpipes.bagpipesStrings.system
    - typingsSlinky.bagpipes.bagpipesStrings.user
    - java.lang.String
  */
  type FittingType = typingsSlinky.bagpipes.mod._FittingType | java.lang.String
  type FittingTypesMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.bagpipes.mod.FittingFactory]
  type PipeDef = js.Array[js.Any] | java.lang.String | typingsSlinky.bagpipes.mod.FittingDef
  type PipeDefMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.bagpipes.mod.PipeDef]
}
