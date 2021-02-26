package typingsSlinky.elliptic.mod

import typingsSlinky.elliptic.ellipticStrings.ed25519
import typingsSlinky.elliptic.ellipticStrings.hex
import typingsSlinky.elliptic.mod.curve.base.BasePoint
import typingsSlinky.elliptic.mod.curve.edwards
import typingsSlinky.elliptic.mod.eddsa.Bytes
import typingsSlinky.elliptic.mod.eddsa.KeyPair
import typingsSlinky.elliptic.mod.eddsa.Point
import typingsSlinky.elliptic.mod.eddsa.Signature
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elliptic", "eddsa")
@js.native
class eddsa protected () extends StObject {
  def this(name: ed25519) = this()
  
  var curve: edwards = js.native
  
  def decodeInt(bytes: BNInput): js.Any = js.native
  
  def decodePoint(bytes: Bytes): Point = js.native
  
  def encodeInt(
    num: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
  ): Buffer = js.native
  
  def encodePoint(point: Point): Buffer = js.native
  
  def hashInt(): js.Any = js.native
  
  def isPoint(`val`: js.Any): Boolean = js.native
  
  def keyFromPublic(pub: Bytes): KeyPair = js.native
  def keyFromPublic(pub: KeyPair): KeyPair = js.native
  def keyFromPublic(pub: Point): KeyPair = js.native
  
  def keyFromSecret(secret: Bytes): KeyPair = js.native
  
  def makeSignature(sig: String): Signature = js.native
  def makeSignature(sig: Signature): Signature = js.native
  def makeSignature(sig: Buffer): Signature = js.native
  
  def sign(message: Bytes, secret: Bytes): Signature = js.native
  
  def verify(message: Bytes, sig: Bytes, pub: Bytes): Boolean = js.native
  def verify(message: Bytes, sig: Bytes, pub: KeyPair): Boolean = js.native
  def verify(message: Bytes, sig: Bytes, pub: Point): Boolean = js.native
  def verify(message: Bytes, sig: Signature, pub: Bytes): Boolean = js.native
  def verify(message: Bytes, sig: Signature, pub: KeyPair): Boolean = js.native
  def verify(message: Bytes, sig: Signature, pub: Point): Boolean = js.native
}
object eddsa {
  
  @JSImport("elliptic", "eddsa.KeyPair")
  @js.native
  class KeyPair protected () extends StObject {
    def this(eddsa: typingsSlinky.elliptic.mod.eddsa, params: KeyPairOptions) = this()
    
    def getPublic(): Buffer = js.native
    @JSName("getPublic")
    def getPublic_hex(enc: hex): String = js.native
    
    def getSecret(): Buffer = js.native
    @JSName("getSecret")
    def getSecret_hex(enc: hex): String = js.native
    
    def secret(): Buffer = js.native
    
    def sign(message: Bytes): Signature = js.native
    
    def verify(message: Bytes, sig: Bytes): Boolean = js.native
    def verify(message: Bytes, sig: Signature): Boolean = js.native
  }
  object KeyPair {
    
    /* static member */
    @JSImport("elliptic", "eddsa.KeyPair.fromPublic")
    @js.native
    def fromPublic(eddsa: eddsa, pub: Bytes): KeyPair = js.native
    
    /* static member */
    @JSImport("elliptic", "eddsa.KeyPair.fromSecret")
    @js.native
    def fromSecret(eddsa: eddsa, secret: Bytes): KeyPair = js.native
  }
  
  @JSImport("elliptic", "eddsa.Signature")
  @js.native
  class Signature protected () extends StObject {
    def this(eddsa: typingsSlinky.elliptic.mod.eddsa, sig: Bytes) = this()
    def this(eddsa: typingsSlinky.elliptic.mod.eddsa, sig: Signature) = this()
    
    def toBytes(): Buffer = js.native
    
    def toHex(): String = js.native
  }
  
  type Bytes = String | Buffer
  
  @js.native
  trait KeyPairOptions extends StObject {
    
    var pub: Buffer | Point = js.native
    
    var secret: Buffer = js.native
  }
  object KeyPairOptions {
    
    @scala.inline
    def apply(pub: Buffer | Point, secret: Buffer): KeyPairOptions = {
      val __obj = js.Dynamic.literal(pub = pub.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyPairOptions]
    }
    
    @scala.inline
    implicit class KeyPairOptionsMutableBuilder[Self <: KeyPairOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPub(value: Buffer | Point): Self = StObject.set(x, "pub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecret(value: Buffer): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
  
  type Point = BasePoint
}
