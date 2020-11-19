package typingsSlinky.hashJs

import typingsSlinky.hashJs.hashJsNumbers.`1024`
import typingsSlinky.hashJs.hashJsNumbers.`128`
import typingsSlinky.hashJs.hashJsNumbers.`192`
import typingsSlinky.hashJs.hashJsNumbers.`512`
import typingsSlinky.hashJs.hashJsStrings.big
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sha512
  extends BlockHash[Sha512]
     with MessageDigest[Sha512] {
  
  @JSName("blockSize")
  var blockSize_Sha512: `1024` = js.native
  
  @JSName("endian")
  var endian_Sha512: big = js.native
  
  @JSName("hmacStrength")
  var hmacStrength_Sha512: `192` = js.native
  
  @JSName("outSize")
  var outSize_Sha512: `512` = js.native
  
  @JSName("padLength")
  var padLength_Sha512: `128` = js.native
}
