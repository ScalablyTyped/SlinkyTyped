package typingsSlinky.kdbxweb.mod

import typingsSlinky.kdbxweb.anon.Aes
import typingsSlinky.kdbxweb.anon.Apple
import typingsSlinky.kdbxweb.anon.ArcFourVariant
import typingsSlinky.kdbxweb.anon.Argon2
import typingsSlinky.kdbxweb.anon.BadSignature
import typingsSlinky.kdbxweb.anon.FileMagic
import typingsSlinky.kdbxweb.anon.GZip
import typingsSlinky.kdbxweb.anon.HistoryMaxItems
import typingsSlinky.kdbxweb.anon.None
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "Consts")
@js.native
object Consts extends js.Object {
  
  var AutoTypeObfuscationOptions: None = js.native
  
  var CipherId: Aes = js.native
  
  var CompressionAlgorithm: GZip = js.native
  
  var CrsAlgorithm: ArcFourVariant = js.native
  
  var Defaults: HistoryMaxItems = js.native
  
  var ErrorCodes: BadSignature = js.native
  
  var Icons: Apple = js.native
  
  var KdfId: Argon2 = js.native
  
  var Signatures: FileMagic = js.native
}
