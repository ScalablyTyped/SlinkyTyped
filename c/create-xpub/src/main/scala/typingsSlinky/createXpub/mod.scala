package typingsSlinky.createXpub

import typingsSlinky.createXpub.createXpubNumbers.`0x043587CF`
import typingsSlinky.createXpub.createXpubNumbers.`0x0488B21E`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates a Base58 encoded extended public key (xpub) for use in a
    * [BIP32 hierarchical deterministic wallet](https://github.com/bitcoin/bips/blob/master/bip-0032.mediawiki).
    *
    * Tip: If you're working with ledgerjs you can pass the output of
    * [`getWalletPublicKey()`](http://ledgerhq.github.io/ledgerjs/docs/#btcgetwalletpublickey) almost directly in.
    *
    * @returns A Base58 encoded extended public key.
    */
  @JSImport("create-xpub", JSImport.Namespace)
  @js.native
  def apply(options: Options): String = js.native
  
  /**
    * Mainnet (xpub) version bytes.
    */
  @JSImport("create-xpub", "mainnet")
  @js.native
  val mainnet: `0x0488B21E` = js.native
  
  /**
    * Testnet (tpub) version bytes.
    */
  @JSImport("create-xpub", "testnet")
  @js.native
  val testnet: `0x043587CF` = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The chain code.
      */
    var chainCode: String = js.native
    
    /**
      * The child number.
      */
    var childNumber: Double = js.native
    
    /**
      * The depth of the derived key.
      */
    var depth: Double = js.native
    
    /**
      * Network version bytes.
      * @default 0x0488B21E
      */
    var networkVersion: js.UndefOr[Double] = js.native
    
    /**
      * The public key in compressed or uncompressed form.
      */
    var publicKey: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(chainCode: String, childNumber: Double, depth: Double, publicKey: String): Options = {
      val __obj = js.Dynamic.literal(chainCode = chainCode.asInstanceOf[js.Any], childNumber = childNumber.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChainCode(value: String): Self = StObject.set(x, "chainCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildNumber(value: Double): Self = StObject.set(x, "childNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkVersion(value: Double): Self = StObject.set(x, "networkVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkVersionUndefined: Self = StObject.set(x, "networkVersion", js.undefined)
      
      @scala.inline
      def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
}
