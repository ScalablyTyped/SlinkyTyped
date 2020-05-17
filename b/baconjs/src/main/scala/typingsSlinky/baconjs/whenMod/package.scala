package typingsSlinky.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object whenMod {
  type AnyFunction = js.Function
  type AnyObservable = typingsSlinky.baconjs.observableMod.default[js.Any]
  type AnySource = typingsSlinky.baconjs.sourceMod.Source[js.Any, js.Any]
  type Pattern1[I1, O] = js.Tuple2[
    typingsSlinky.baconjs.whenMod.ObservableOrSource[I1], 
    O | (js.Function1[/* a */ I1, O])
  ]
  type Pattern2[I1, I2, O] = js.Tuple3[
    typingsSlinky.baconjs.whenMod.ObservableOrSource[I1], 
    typingsSlinky.baconjs.whenMod.ObservableOrSource[I1], 
    O | (js.Function2[/* a */ I1, /* b */ I2, O])
  ]
  type Pattern3[I1, I2, I3, O] = js.Tuple4[
    typingsSlinky.baconjs.whenMod.ObservableOrSource[I1], 
    typingsSlinky.baconjs.whenMod.ObservableOrSource[I1], 
    typingsSlinky.baconjs.whenMod.ObservableOrSource[I3], 
    O | (js.Function3[/* a */ I1, /* b */ I2, /* c */ I3, O])
  ]
  type Pattern4[I1, I2, I3, I4, O] = js.Tuple5[
    typingsSlinky.baconjs.whenMod.ObservableOrSource[I1], 
    typingsSlinky.baconjs.whenMod.ObservableOrSource[I1], 
    typingsSlinky.baconjs.whenMod.ObservableOrSource[I3], 
    typingsSlinky.baconjs.whenMod.ObservableOrSource[I4], 
    O | (js.Function4[/* a */ I1, /* b */ I2, /* c */ I3, /* d */ I4, O])
  ]
  type Pattern5[I1, I2, I3, I4, I5, O] = js.Tuple6[
    typingsSlinky.baconjs.whenMod.ObservableOrSource[I1], 
    typingsSlinky.baconjs.whenMod.ObservableOrSource[I1], 
    typingsSlinky.baconjs.whenMod.ObservableOrSource[I3], 
    typingsSlinky.baconjs.whenMod.ObservableOrSource[I4], 
    typingsSlinky.baconjs.whenMod.ObservableOrSource[I5], 
    O | (js.Function5[/* a */ I1, /* b */ I2, /* c */ I3, /* d */ I4, /* e */ I5, O])
  ]
  type Pattern6[I1, I2, I3, I4, I5, I6, O] = js.Tuple7[
    typingsSlinky.baconjs.whenMod.ObservableOrSource[I1], 
    typingsSlinky.baconjs.whenMod.ObservableOrSource[I1], 
    typingsSlinky.baconjs.whenMod.ObservableOrSource[I3], 
    typingsSlinky.baconjs.whenMod.ObservableOrSource[I4], 
    typingsSlinky.baconjs.whenMod.ObservableOrSource[I5], 
    typingsSlinky.baconjs.whenMod.ObservableOrSource[I6], 
    O | (js.Function6[/* a */ I1, /* b */ I2, /* c */ I3, /* d */ I4, /* e */ I5, /* f */ I6, O])
  ]
  type RawPattern = js.Tuple2[
    js.Array[typingsSlinky.baconjs.whenMod.AnyObservableOrSource], 
    typingsSlinky.baconjs.whenMod.AnyFunction
  ]
}
