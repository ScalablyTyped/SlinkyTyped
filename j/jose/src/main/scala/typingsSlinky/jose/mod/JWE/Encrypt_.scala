package typingsSlinky.jose.mod.JWE

import typingsSlinky.jose.joseStrings.compact
import typingsSlinky.jose.joseStrings.flattened
import typingsSlinky.jose.joseStrings.general
import typingsSlinky.jose.mod.ProduceKeyInput
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jose", "JWE.Encrypt")
@js.native
class Encrypt_ protected () extends js.Object {
  def this(cleartext: String) = this()
  def this(cleartext: Buffer) = this()
  def this(cleartext: String, `protected`: js.Object) = this()
  def this(cleartext: Buffer, `protected`: js.Object) = this()
  def this(cleartext: String, `protected`: js.UndefOr[scala.Nothing], aad: String) = this()
  def this(cleartext: String, `protected`: js.Object, aad: String) = this()
  def this(cleartext: Buffer, `protected`: js.UndefOr[scala.Nothing], aad: String) = this()
  def this(cleartext: Buffer, `protected`: js.Object, aad: String) = this()
  def this(
    cleartext: String,
    `protected`: js.UndefOr[scala.Nothing],
    aad: js.UndefOr[scala.Nothing],
    unprotected: js.Object
  ) = this()
  def this(cleartext: String, `protected`: js.UndefOr[scala.Nothing], aad: String, unprotected: js.Object) = this()
  def this(cleartext: String, `protected`: js.Object, aad: js.UndefOr[scala.Nothing], unprotected: js.Object) = this()
  def this(cleartext: String, `protected`: js.Object, aad: String, unprotected: js.Object) = this()
  def this(
    cleartext: Buffer,
    `protected`: js.UndefOr[scala.Nothing],
    aad: js.UndefOr[scala.Nothing],
    unprotected: js.Object
  ) = this()
  def this(cleartext: Buffer, `protected`: js.UndefOr[scala.Nothing], aad: String, unprotected: js.Object) = this()
  def this(cleartext: Buffer, `protected`: js.Object, aad: js.UndefOr[scala.Nothing], unprotected: js.Object) = this()
  def this(cleartext: Buffer, `protected`: js.Object, aad: String, unprotected: js.Object) = this()
  
  @JSName("encrypt")
  def encrypt_compact(serialization: compact): String = js.native
  @JSName("encrypt")
  def encrypt_flattened(serialization: flattened): FlattenedJWE = js.native
  @JSName("encrypt")
  def encrypt_general(serialization: general): GeneralJWE = js.native
  
  def recipient(key: ProduceKeyInput): Unit = js.native
  def recipient(key: ProduceKeyInput, header: js.Object): Unit = js.native
}
