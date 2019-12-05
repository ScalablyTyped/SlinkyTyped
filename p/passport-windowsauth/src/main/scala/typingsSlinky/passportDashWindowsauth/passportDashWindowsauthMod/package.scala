package typingsSlinky.passportDashWindowsauth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashWindowsauthMod {
  import typingsSlinky.express.expressMod.Request
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
  import typingsSlinky.passport.passportMod.Profile
  import typingsSlinky.passport.passportMod.Strategy

  type Verified = js.Function3[
    /* err */ js.UndefOr[js.Error | Null], 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    Unit
  ]
  type Verify = js.Function2[/* profile */ Profile, /* done */ Verified, Unit]
  type VerifyWithReq = js.Function3[/* req */ Request[ParamsDictionary], /* profile */ Profile, /* done */ Verified, Unit]
  type windowsauth = Strategy
}
