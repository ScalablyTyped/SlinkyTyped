package typingsSlinky.passportWindowsauth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Verified = js.Function3[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  type Verify = js.Function2[
    /* profile */ typingsSlinky.passport.mod.Profile, 
    /* done */ typingsSlinky.passportWindowsauth.mod.Verified, 
    scala.Unit
  ]
  type VerifyWithReq = js.Function3[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* profile */ typingsSlinky.passport.mod.Profile, 
    /* done */ typingsSlinky.passportWindowsauth.mod.Verified, 
    scala.Unit
  ]
  type windowsauth = typingsSlinky.passport.mod.Strategy
}
