package typingsSlinky.blake2

import typingsSlinky.node.Buffer
import typingsSlinky.node.cryptoMod.HexBase64Latin1Encoding
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("blake2", "Hash")
  @js.native
  class Hash protected () extends Transform {
    def this(algorithm: Blake2Algorithm) = this()
    def this(algorithm: Blake2Algorithm, options: Blake2Options) = this()
    
    def copy(): this.type = js.native
    
    def digest(): Buffer = js.native
    def digest(encoding: HexBase64Latin1Encoding): String = js.native
    
    def update(buf: Buffer): this.type = js.native
  }
  
  @JSImport("blake2", "KeyedHash")
  @js.native
  class KeyedHash protected () extends Transform {
    def this(algorithm: Blake2Algorithm, key: Buffer) = this()
    def this(algorithm: Blake2Algorithm, key: Buffer, options: Blake2Options) = this()
    
    def copy(): this.type = js.native
    
    def digest(): Buffer = js.native
    def digest(encoding: HexBase64Latin1Encoding): String = js.native
    
    def update(buf: Buffer): this.type = js.native
  }
  
  @JSImport("blake2", "createHash")
  @js.native
  def createHash(algorithm: Blake2Algorithm): Hash = js.native
  @JSImport("blake2", "createHash")
  @js.native
  def createHash(algorithm: Blake2Algorithm, options: Blake2Options): Hash = js.native
  
  @JSImport("blake2", "createKeyedHash")
  @js.native
  def createKeyedHash(algorithm: Blake2Algorithm, key: Buffer): KeyedHash = js.native
  @JSImport("blake2", "createKeyedHash")
  @js.native
  def createKeyedHash(algorithm: Blake2Algorithm, key: Buffer, options: Blake2Options): KeyedHash = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.blake2.blake2Strings.blake2b
    - typingsSlinky.blake2.blake2Strings.blake2bp
    - typingsSlinky.blake2.blake2Strings.blake2s
    - typingsSlinky.blake2.blake2Strings.blake2sp
    - typingsSlinky.blake2.blake2Strings.bypass
  */
  trait Blake2Algorithm extends StObject
  object Blake2Algorithm {
    
    @scala.inline
    def blake2b: typingsSlinky.blake2.blake2Strings.blake2b = "blake2b".asInstanceOf[typingsSlinky.blake2.blake2Strings.blake2b]
    
    @scala.inline
    def blake2bp: typingsSlinky.blake2.blake2Strings.blake2bp = "blake2bp".asInstanceOf[typingsSlinky.blake2.blake2Strings.blake2bp]
    
    @scala.inline
    def blake2s: typingsSlinky.blake2.blake2Strings.blake2s = "blake2s".asInstanceOf[typingsSlinky.blake2.blake2Strings.blake2s]
    
    @scala.inline
    def blake2sp: typingsSlinky.blake2.blake2Strings.blake2sp = "blake2sp".asInstanceOf[typingsSlinky.blake2.blake2Strings.blake2sp]
    
    @scala.inline
    def bypass: typingsSlinky.blake2.blake2Strings.bypass = "bypass".asInstanceOf[typingsSlinky.blake2.blake2Strings.bypass]
  }
  
  @js.native
  trait Blake2Options extends TransformOptions {
    
    var digestLength: Double = js.native
  }
  object Blake2Options {
    
    @scala.inline
    def apply(digestLength: Double): Blake2Options = {
      val __obj = js.Dynamic.literal(digestLength = digestLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[Blake2Options]
    }
    
    @scala.inline
    implicit class Blake2OptionsMutableBuilder[Self <: Blake2Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDigestLength(value: Double): Self = StObject.set(x, "digestLength", value.asInstanceOf[js.Any])
    }
  }
}
