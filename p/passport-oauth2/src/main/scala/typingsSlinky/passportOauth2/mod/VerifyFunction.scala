package typingsSlinky.passportOauth2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function4[
/ * accessToken * / java.lang.String, 
/ * refreshToken * / java.lang.String, 
/ * profile * / js.Any, 
/ * verified * / typingsSlinky.passportOauth2.mod.VerifyCallback, 
scala.Unit]
  - js.Function5[
/ * accessToken * / java.lang.String, 
/ * refreshToken * / java.lang.String, 
/ * results * / js.Any, 
/ * profile * / js.Any, 
/ * verified * / typingsSlinky.passportOauth2.mod.VerifyCallback, 
scala.Unit]
*/
trait VerifyFunction extends js.Object

object VerifyFunction {
  @scala.inline
  implicit def apply(
    value: js.Function4[
      /* accessToken */ String, 
      /* refreshToken */ String, 
      /* profile */ js.Any, 
      /* verified */ VerifyCallback, 
      Unit
    ]
  ): VerifyFunction = value.asInstanceOf[VerifyFunction]
  @scala.inline
  implicit def apply(
    value: js.Function5[
      /* accessToken */ String, 
      /* refreshToken */ String, 
      /* results */ js.Any, 
      /* profile */ js.Any, 
      /* verified */ VerifyCallback, 
      Unit
    ]
  ): VerifyFunction = value.asInstanceOf[VerifyFunction]
}

