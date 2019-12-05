package typingsSlinky.passportDashSaml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashSamlMod {
  import typingsSlinky.express.expressMod.Request
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type CertCallback = js.Function1[
    /* callback */ js.Function2[/* err */ js.Error | Null, /* cert */ js.UndefOr[String | js.Array[String]], Unit], 
    Unit
  ]
  type VerifiedCallback = js.Function3[
    /* err */ js.Error | Null, 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    Unit
  ]
  type VerifyWithRequest = js.Function3[
    /* req */ Request[ParamsDictionary], 
    /* profile */ Profile, 
    /* done */ VerifiedCallback, 
    Unit
  ]
  type VerifyWithoutRequest = js.Function2[/* profile */ Profile, /* done */ VerifiedCallback, Unit]
}
