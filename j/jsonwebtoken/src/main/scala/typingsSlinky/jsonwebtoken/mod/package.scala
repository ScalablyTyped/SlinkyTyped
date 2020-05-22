package typingsSlinky.jsonwebtoken

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GetPublicKeyOrSecret = js.Function2[
    /* header */ typingsSlinky.jsonwebtoken.mod.JwtHeader, 
    /* callback */ typingsSlinky.jsonwebtoken.mod.SigningKeyCallback, 
    scala.Unit
  ]
  type Secret = java.lang.String | typingsSlinky.node.Buffer | typingsSlinky.jsonwebtoken.anon.Key
  type SignCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* encoded */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type SigningKeyCallback = js.Function2[
    /* err */ js.Any, 
    /* signingKey */ js.UndefOr[typingsSlinky.jsonwebtoken.mod.Secret], 
    scala.Unit
  ]
  type VerifyCallback = js.Function2[
    /* err */ typingsSlinky.jsonwebtoken.mod.VerifyErrors | scala.Null, 
    /* decoded */ js.UndefOr[js.Object], 
    scala.Unit
  ]
}
