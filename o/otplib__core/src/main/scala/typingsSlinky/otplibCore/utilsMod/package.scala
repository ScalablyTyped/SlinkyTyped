package typingsSlinky.otplibCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsMod {
  type CreateDigest[T] = js.Function3[
    /* algorithm */ typingsSlinky.otplibCore.utilsMod.HashAlgorithms, 
    /* hmacKey */ typingsSlinky.otplibCore.utilsMod.HexString, 
    /* counter */ typingsSlinky.otplibCore.utilsMod.HexString, 
    T
  ]
  type CreateHmacKey[T] = js.Function3[
    /* algorithm */ typingsSlinky.otplibCore.utilsMod.HashAlgorithms, 
    /* secret */ typingsSlinky.otplibCore.utilsMod.SecretKey, 
    /* encoding */ typingsSlinky.otplibCore.utilsMod.KeyEncodings, 
    T
  ]
  type HexString = java.lang.String
  type OTPOptions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type SecretKey = java.lang.String
}
