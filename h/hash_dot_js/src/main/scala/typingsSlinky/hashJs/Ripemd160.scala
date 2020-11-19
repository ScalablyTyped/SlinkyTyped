package typingsSlinky.hashJs

import typingsSlinky.hashJs.hashJsNumbers.`160`
import typingsSlinky.hashJs.hashJsNumbers.`192`
import typingsSlinky.hashJs.hashJsNumbers.`512`
import typingsSlinky.hashJs.hashJsNumbers.`64`
import typingsSlinky.hashJs.hashJsStrings.little
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ripemd160
  extends BlockHash[Ripemd160]
     with MessageDigest[Ripemd160] {
  
  @JSName("blockSize")
  var blockSize_Ripemd160: `512` = js.native
  
  @JSName("endian")
  var endian_Ripemd160: little = js.native
  
  @JSName("hmacStrength")
  var hmacStrength_Ripemd160: `192` = js.native
  
  @JSName("outSize")
  var outSize_Ripemd160: `160` = js.native
  
  @JSName("padLength")
  var padLength_Ripemd160: `64` = js.native
}
