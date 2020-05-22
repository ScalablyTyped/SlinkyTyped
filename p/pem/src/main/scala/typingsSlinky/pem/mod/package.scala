package typingsSlinky.pem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[/* error */ js.Any, /* result */ T, js.Any]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pem.pemStrings.md5
    - typingsSlinky.pem.pemStrings.sha1
    - typingsSlinky.pem.pemStrings.sha256
    - java.lang.String
  */
  type HashFunction = typingsSlinky.pem.mod._HashFunction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pem.pemStrings.aes128
    - typingsSlinky.pem.pemStrings.aes192
    - typingsSlinky.pem.pemStrings.aes256
    - typingsSlinky.pem.pemStrings.camellia128
    - typingsSlinky.pem.pemStrings.camellia192
    - typingsSlinky.pem.pemStrings.camellia256
    - typingsSlinky.pem.pemStrings.des
    - typingsSlinky.pem.pemStrings.des3
    - typingsSlinky.pem.pemStrings.idea
    - java.lang.String
  */
  type PrivateKeyCipher = typingsSlinky.pem.mod._PrivateKeyCipher | java.lang.String
}
