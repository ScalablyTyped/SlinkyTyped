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
  type VerifyFunction = (js.Function4[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* profile */ js.Any, 
    /* verified */ typingsSlinky.passportOauth2.mod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function5[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* results */ js.Any, 
    /* profile */ js.Any, 
    /* verified */ typingsSlinky.passportOauth2.mod.VerifyCallback, 
    scala.Unit
  ])
  type VerifyFunctionWithRequest = (js.Function5[
    /* req */ typingsSlinky.express.mod.Request_[typingsSlinky.expressServeStaticCore.mod.ParamsDictionary], 
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* profile */ js.Any, 
    /* verified */ typingsSlinky.passportOauth2.mod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function6[
    /* req */ typingsSlinky.express.mod.Request_[typingsSlinky.expressServeStaticCore.mod.ParamsDictionary], 
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* results */ js.Any, 
    /* profile */ js.Any, 
    /* verified */ typingsSlinky.passportOauth2.mod.VerifyCallback, 
    scala.Unit
  ])
}
