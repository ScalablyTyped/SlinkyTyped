package typingsSlinky.passportOauth2.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function5[
/ * req * / typingsSlinky.express.mod.Request_[
  typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
  js.Any, 
  js.Any, 
  typingsSlinky.expressServeStaticCore.mod.Query
], 
/ * accessToken * / java.lang.String, 
/ * refreshToken * / java.lang.String, 
/ * profile * / js.Any, 
/ * verified * / typingsSlinky.passportOauth2.mod.VerifyCallback, 
scala.Unit]
  - js.Function6[
/ * req * / typingsSlinky.express.mod.Request_[
  typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
  js.Any, 
  js.Any, 
  typingsSlinky.expressServeStaticCore.mod.Query
], 
/ * accessToken * / java.lang.String, 
/ * refreshToken * / java.lang.String, 
/ * results * / js.Any, 
/ * profile * / js.Any, 
/ * verified * / typingsSlinky.passportOauth2.mod.VerifyCallback, 
scala.Unit]
*/
trait VerifyFunctionWithRequest extends js.Object

object VerifyFunctionWithRequest {
  @scala.inline
  implicit def apply(
    value: js.Function5[
      /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
      /* accessToken */ String, 
      /* refreshToken */ String, 
      /* profile */ js.Any, 
      /* verified */ VerifyCallback, 
      Unit
    ]
  ): VerifyFunctionWithRequest = value.asInstanceOf[VerifyFunctionWithRequest]
  @scala.inline
  implicit def apply(
    value: js.Function6[
      /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
      /* accessToken */ String, 
      /* refreshToken */ String, 
      /* results */ js.Any, 
      /* profile */ js.Any, 
      /* verified */ VerifyCallback, 
      Unit
    ]
  ): VerifyFunctionWithRequest = value.asInstanceOf[VerifyFunctionWithRequest]
}

