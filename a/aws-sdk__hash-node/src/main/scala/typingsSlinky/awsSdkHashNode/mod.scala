package typingsSlinky.awsSdkHashNode

import typingsSlinky.awsSdkHashNode.awsSdkHashNodeStrings.ascii
import typingsSlinky.awsSdkHashNode.awsSdkHashNodeStrings.latin1
import typingsSlinky.awsSdkHashNode.awsSdkHashNodeStrings.utf8
import typingsSlinky.awsSdkTypes.cryptoMod.SourceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/hash-node", "Hash")
  @js.native
  class Hash protected ()
    extends typingsSlinky.awsSdkTypes.cryptoMod.Hash {
    def this(algorithmIdentifier: String) = this()
    def this(algorithmIdentifier: String, secret: SourceData) = this()
    
    val hash: js.Any = js.native
    
    @JSName("update")
    def update_ascii(toHash: SourceData, encoding: ascii): Unit = js.native
    @JSName("update")
    def update_latin1(toHash: SourceData, encoding: latin1): Unit = js.native
    @JSName("update")
    def update_utf8(toHash: SourceData, encoding: utf8): Unit = js.native
  }
}
