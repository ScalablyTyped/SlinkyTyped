package typingsSlinky.passportDashLocal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashLocalMod {
  import typingsSlinky.express.expressMod.Request
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type VerifyFunction = js.Function3[
    /* username */ String, 
    /* password */ String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[IVerifyOptions], 
      Unit
    ], 
    Unit
  ]
  type VerifyFunctionWithRequest = js.Function4[
    /* req */ Request[ParamsDictionary], 
    /* username */ String, 
    /* password */ String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[IVerifyOptions], 
      Unit
    ], 
    Unit
  ]
}
