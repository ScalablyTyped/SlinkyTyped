package typingsSlinky.jose.mod.JWS

import typingsSlinky.jose.joseStrings.compact
import typingsSlinky.jose.joseStrings.flattened
import typingsSlinky.jose.joseStrings.general
import typingsSlinky.jose.mod.ProduceKeyInputWithNone
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jose", "JWS.Sign")
@js.native
class Sign_ protected () extends js.Object {
  def this(payload: String) = this()
  def this(payload: js.Object) = this()
  def this(payload: Buffer) = this()
  
  def recipient(key: ProduceKeyInputWithNone): Unit = js.native
  def recipient(key: ProduceKeyInputWithNone, `protected`: js.UndefOr[scala.Nothing], header: js.Object): Unit = js.native
  def recipient(key: ProduceKeyInputWithNone, `protected`: js.Object): Unit = js.native
  def recipient(key: ProduceKeyInputWithNone, `protected`: js.Object, header: js.Object): Unit = js.native
  
  @JSName("sign")
  def sign_compact(serialization: compact): String = js.native
  @JSName("sign")
  def sign_flattened(serialization: flattened): FlattenedJWS = js.native
  @JSName("sign")
  def sign_general(serialization: general): GeneralJWS = js.native
}
