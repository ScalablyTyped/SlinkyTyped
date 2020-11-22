package typingsSlinky.arrive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ArriveSignature = js.Function3[
    /* element */ java.lang.String, 
    /* handlerOrOptions */ (js.ThisFunction1[
      /* this */ typingsSlinky.arrive.mod.global.Element, 
      /* element */ typingsSlinky.arrive.mod.global.Element, 
      scala.Unit
    ]) | typingsSlinky.arrive.mod.Options, 
    /* handler */ js.UndefOr[
      js.ThisFunction1[
        /* this */ typingsSlinky.arrive.mod.global.Element, 
        /* element */ typingsSlinky.arrive.mod.global.Element, 
        scala.Unit
      ]
    ], 
    scala.Unit
  ]
  
  type LeaveSignature = js.Function3[
    /* element */ java.lang.String, 
    /* handlerOrOptions */ (js.ThisFunction1[
      /* this */ typingsSlinky.arrive.mod.global.Element, 
      /* element */ typingsSlinky.arrive.mod.global.Element, 
      scala.Unit
    ]) | typingsSlinky.arrive.mod.Options, 
    /* handler */ js.UndefOr[js.ThisFunction0[/* this */ typingsSlinky.arrive.mod.global.Element, scala.Unit]], 
    scala.Unit
  ]
  
  type UnbindArriveSignature = js.Function2[
    /* elementOrHandler */ js.UndefOr[
      java.lang.String | (js.ThisFunction1[
        /* this */ typingsSlinky.arrive.mod.global.Element, 
        /* element */ typingsSlinky.arrive.mod.global.Element, 
        scala.Unit
      ])
    ], 
    /* handler */ js.UndefOr[
      js.ThisFunction1[
        /* this */ typingsSlinky.arrive.mod.global.Element, 
        /* element */ typingsSlinky.arrive.mod.global.Element, 
        scala.Unit
      ]
    ], 
    scala.Unit
  ]
  
  type UnbindLeaveSignature = js.Function2[
    /* elementOrHandler */ js.UndefOr[
      java.lang.String | (js.ThisFunction1[
        /* this */ typingsSlinky.arrive.mod.global.Element, 
        /* element */ typingsSlinky.arrive.mod.global.Element, 
        scala.Unit
      ])
    ], 
    /* handler */ js.UndefOr[
      js.ThisFunction1[
        /* this */ typingsSlinky.arrive.mod.global.Element, 
        /* element */ typingsSlinky.arrive.mod.global.Element, 
        scala.Unit
      ]
    ], 
    scala.Unit
  ]
}
