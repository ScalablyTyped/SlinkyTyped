package typingsSlinky.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object updateMod {
  type UpdatePattern1[I1, O] = js.Tuple2[
    typingsSlinky.baconjs.observableMod.default[I1], 
    O | (js.Function2[/* acc */ O, /* a */ I1, O])
  ]
  type UpdatePattern2[I1, I2, O] = js.Tuple3[
    typingsSlinky.baconjs.observableMod.default[I1], 
    typingsSlinky.baconjs.observableMod.default[I1], 
    O | (js.Function3[/* acc */ O, /* a */ I1, /* b */ I2, O])
  ]
  type UpdatePattern3[I1, I2, I3, O] = js.Tuple4[
    typingsSlinky.baconjs.observableMod.default[I1], 
    typingsSlinky.baconjs.observableMod.default[I1], 
    typingsSlinky.baconjs.observableMod.default[I3], 
    O | (js.Function4[/* acc */ O, /* a */ I1, /* b */ I2, /* c */ I3, O])
  ]
  type UpdatePattern4[I1, I2, I3, I4, O] = js.Tuple5[
    typingsSlinky.baconjs.observableMod.default[I1], 
    typingsSlinky.baconjs.observableMod.default[I1], 
    typingsSlinky.baconjs.observableMod.default[I3], 
    typingsSlinky.baconjs.observableMod.default[I4], 
    O | (js.Function5[/* acc */ O, /* a */ I1, /* b */ I2, /* c */ I3, /* d */ I4, O])
  ]
  type UpdatePattern5[I1, I2, I3, I4, I5, O] = js.Tuple6[
    typingsSlinky.baconjs.observableMod.default[I1], 
    typingsSlinky.baconjs.observableMod.default[I1], 
    typingsSlinky.baconjs.observableMod.default[I3], 
    typingsSlinky.baconjs.observableMod.default[I4], 
    typingsSlinky.baconjs.observableMod.default[I5], 
    O | (js.Function6[/* acc */ O, /* a */ I1, /* b */ I2, /* c */ I3, /* d */ I4, /* e */ I5, O])
  ]
  type UpdatePattern6[I1, I2, I3, I4, I5, I6, O] = js.Tuple7[
    typingsSlinky.baconjs.observableMod.default[I1], 
    typingsSlinky.baconjs.observableMod.default[I1], 
    typingsSlinky.baconjs.observableMod.default[I3], 
    typingsSlinky.baconjs.observableMod.default[I4], 
    typingsSlinky.baconjs.observableMod.default[I5], 
    typingsSlinky.baconjs.observableMod.default[I6], 
    O | (js.Function7[/* acc */ O, /* a */ I1, /* b */ I2, /* c */ I3, /* d */ I4, /* e */ I5, /* f */ I6, O])
  ]
}
