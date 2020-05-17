package typingsSlinky.passportOauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type StateStoreStoreCallback = js.Function2[/* err */ js.Error | scala.Null, /* state */ js.Any, scala.Unit]
  type StateStoreVerifyCallback = js.Function3[/* err */ js.Error, /* ok */ scala.Boolean, /* state */ js.Any, scala.Unit]
  type Strategy = typingsSlinky.passportOauth2.mod.OAuth2Strategy
  type VerifyCallback = js.Function3[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    scala.Unit
  ]
}
