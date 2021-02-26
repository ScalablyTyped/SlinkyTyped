package typingsSlinky.hashJs

import typingsSlinky.hashJs.hashJsNumbers.`192`
import typingsSlinky.hashJs.hashJsNumbers.`256`
import typingsSlinky.hashJs.hashJsNumbers.`512`
import typingsSlinky.hashJs.hashJsNumbers.`64`
import typingsSlinky.hashJs.hashJsStrings.big
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sha256
  extends BlockHash[Sha256]
     with MessageDigest[Sha256] {
  
  @JSName("blockSize")
  var blockSize_Sha256: `512` = js.native
  
  @JSName("endian")
  var endian_Sha256: big = js.native
  
  @JSName("hmacStrength")
  var hmacStrength_Sha256: `192` = js.native
  
  @JSName("outSize")
  var outSize_Sha256: `256` = js.native
  
  @JSName("padLength")
  var padLength_Sha256: `64` = js.native
}
