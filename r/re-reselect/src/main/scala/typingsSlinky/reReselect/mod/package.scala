package typingsSlinky.reReselect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type KeySelector[S] = js.Function2[/* state */ S, /* repeated */ js.Any, js.Any]
  type KeySelectorCreator[S, C, D] = js.Function1[
    /* selectorInputs */ typingsSlinky.reReselect.anon.InputSelectors[D, C, S], 
    typingsSlinky.reReselect.mod.KeySelector[S]
  ]
  type ObjectCacheKey = java.lang.String | scala.Double
  type OutputCachedSelector[S, R, C, D] = js.Function1[
    /* options */ typingsSlinky.reReselect.mod.KeySelector[S] | (typingsSlinky.reReselect.mod.Options[S, C, D]), 
    (typingsSlinky.reReselect.mod.OutputSelector[S, R, C, D]) with (typingsSlinky.reReselect.anon.Cache[S, R, C, D])
  ]
  type OutputParametricCachedSelector[S, P, R, C, D] = js.Function1[
    /* options */ (typingsSlinky.reReselect.mod.ParametricKeySelector[S, P]) | (typingsSlinky.reReselect.mod.ParametricOptions[S, P, C, D]), 
    (typingsSlinky.reReselect.mod.OutputParametricSelector[S, P, R, C, D]) with (typingsSlinky.reReselect.anon.ClearCache[S, P, R, C, D])
  ]
  type OutputParametricSelector[S, P, R, C, D] = (typingsSlinky.reReselect.mod.ParametricSelector[S, P, R]) with (typingsSlinky.reReselect.anon.Dependencies[C, D])
  type OutputSelector[S, R, C, D] = (typingsSlinky.reReselect.mod.Selector[S, R]) with (typingsSlinky.reReselect.anon.Dependencies[C, D])
  type ParametricKeySelector[S, P] = js.Function3[/* state */ S, /* props */ P, /* repeated */ js.Any, js.Any]
  type ParametricKeySelectorCreator[S, P, C, D] = js.Function1[
    /* selectorInputs */ typingsSlinky.reReselect.anon.KeySelector[D, C, S, P], 
    typingsSlinky.reReselect.mod.ParametricKeySelector[S, P]
  ]
  type ParametricSelector[S, P, R] = js.Function3[/* state */ S, /* props */ P, /* repeated */ js.Any, R]
  type Selector[S, R] = js.Function1[/* state */ S, R]
  type Values[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
