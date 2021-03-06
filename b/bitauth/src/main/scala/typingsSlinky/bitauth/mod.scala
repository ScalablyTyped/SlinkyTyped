package typingsSlinky.bitauth

import typingsSlinky.bitauth.anon.Created
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.node.cryptoMod.BinaryLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bitauth", "decrypt")
  @js.native
  def decrypt(password: BinaryLike, str: String): String = js.native
  
  @JSImport("bitauth", "encrypt")
  @js.native
  def encrypt(password: BinaryLike, str: String): String = js.native
  
  @JSImport("bitauth", "generateSin")
  @js.native
  def generateSin(): Created = js.native
  
  @JSImport("bitauth", "getPublicKeyFromPrivateKey")
  @js.native
  def getPublicKeyFromPrivateKey(privkey: String): String = js.native
  @JSImport("bitauth", "getPublicKeyFromPrivateKey")
  @js.native
  def getPublicKeyFromPrivateKey(privkey: js.typedarray.Uint8Array): String = js.native
  
  @JSImport("bitauth", "getSinFromPublicKey")
  @js.native
  def getSinFromPublicKey(pubkey: String): String = js.native
  @JSImport("bitauth", "getSinFromPublicKey")
  @js.native
  def getSinFromPublicKey(pubkey: js.typedarray.Uint8Array): String = js.native
  
  @JSImport("bitauth", "middleware")
  @js.native
  def middleware(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("bitauth", "sign")
  @js.native
  def sign(data: String, privkey: String): js.typedarray.Uint8Array = js.native
  @JSImport("bitauth", "sign")
  @js.native
  def sign(data: String, privkey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  @JSImport("bitauth", "sign")
  @js.native
  def sign(data: js.typedarray.Uint8Array, privkey: String): js.typedarray.Uint8Array = js.native
  @JSImport("bitauth", "sign")
  @js.native
  def sign(data: js.typedarray.Uint8Array, privkey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  @JSImport("bitauth", "validateSin")
  @js.native
  def validateSin(sin: String): Boolean | Unit = js.native
  @JSImport("bitauth", "validateSin")
  @js.native
  def validateSin(sin: String, callback: callback): Boolean | Unit = js.native
  
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: String, pubkey: String, hexsignature: String): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: String, pubkey: String, hexsignature: String, callback: callback): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: String, pubkey: String, hexsignature: js.typedarray.Uint8Array): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: String, pubkey: String, hexsignature: js.typedarray.Uint8Array, callback: callback): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: String, pubkey: js.typedarray.Uint8Array, hexsignature: String): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: String, pubkey: js.typedarray.Uint8Array, hexsignature: String, callback: callback): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: String, pubkey: js.typedarray.Uint8Array, hexsignature: js.typedarray.Uint8Array): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(
    data: String,
    pubkey: js.typedarray.Uint8Array,
    hexsignature: js.typedarray.Uint8Array,
    callback: callback
  ): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: js.typedarray.Uint8Array, pubkey: String, hexsignature: String): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: js.typedarray.Uint8Array, pubkey: String, hexsignature: String, callback: callback): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: js.typedarray.Uint8Array, pubkey: String, hexsignature: js.typedarray.Uint8Array): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(
    data: js.typedarray.Uint8Array,
    pubkey: String,
    hexsignature: js.typedarray.Uint8Array,
    callback: callback
  ): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(data: js.typedarray.Uint8Array, pubkey: js.typedarray.Uint8Array, hexsignature: String): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(
    data: js.typedarray.Uint8Array,
    pubkey: js.typedarray.Uint8Array,
    hexsignature: String,
    callback: callback
  ): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(
    data: js.typedarray.Uint8Array,
    pubkey: js.typedarray.Uint8Array,
    hexsignature: js.typedarray.Uint8Array
  ): Boolean | Unit = js.native
  @JSImport("bitauth", "verifySignature")
  @js.native
  def verifySignature(
    data: js.typedarray.Uint8Array,
    pubkey: js.typedarray.Uint8Array,
    hexsignature: js.typedarray.Uint8Array,
    callback: callback
  ): Boolean | Unit = js.native
  
  type callback = js.Function2[/* err */ js.UndefOr[js.Error], /* valid */ js.UndefOr[Boolean], js.Any]
}
