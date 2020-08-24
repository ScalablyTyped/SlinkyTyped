package typingsSlinky.digibyte.mod

import typingsSlinky.digibyte.mod.Networks.Network
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("digibyte", "Address")
@js.native
class Address protected () extends js.Object {
  def this(data: String) = this()
  def this(data: js.Object) = this()
  def this(data: Buffer) = this()
  def this(data: js.typedarray.Uint8Array) = this()
  def this(data: String, network: Network) = this()
  def this(data: js.Object, network: Network) = this()
  def this(data: Buffer, network: Network) = this()
  def this(data: js.typedarray.Uint8Array, network: Network) = this()
  def this(data: String, network: js.UndefOr[scala.Nothing], `type`: String) = this()
  def this(data: String, network: Network, `type`: String) = this()
  def this(data: js.Object, network: js.UndefOr[scala.Nothing], `type`: String) = this()
  def this(data: js.Object, network: Network, `type`: String) = this()
  def this(data: Buffer, network: js.UndefOr[scala.Nothing], `type`: String) = this()
  def this(data: Buffer, network: Network, `type`: String) = this()
  def this(data: js.typedarray.Uint8Array, network: js.UndefOr[scala.Nothing], `type`: String) = this()
  def this(data: js.typedarray.Uint8Array, network: Network, `type`: String) = this()
  val hashBuffer: Buffer = js.native
  val network: Network = js.native
  val `type`: String = js.native
}

/* static members */
@JSImport("digibyte", "Address")
@js.native
object Address extends js.Object {
  def getValidationError(input: String): js.Error = js.native
  def getValidationError(input: String, network: js.UndefOr[scala.Nothing], payToPublicKeyHash: String): js.Error = js.native
  def getValidationError(input: String, network: js.UndefOr[scala.Nothing], payToPublicKeyHash: Buffer): js.Error = js.native
  def getValidationError(input: String, network: Network): js.Error = js.native
  def getValidationError(input: String, network: Network, payToPublicKeyHash: String): js.Error = js.native
  def getValidationError(input: String, network: Network, payToPublicKeyHash: Buffer): js.Error = js.native
  def isValid(input: String): Boolean = js.native
  def isValid(input: String, network: js.UndefOr[scala.Nothing], payToPublicKeyHash: String): Boolean = js.native
  def isValid(input: String, network: js.UndefOr[scala.Nothing], payToPublicKeyHash: Buffer): Boolean = js.native
  def isValid(input: String, network: Network): Boolean = js.native
  def isValid(input: String, network: Network, payToPublicKeyHash: String): Boolean = js.native
  def isValid(input: String, network: Network, payToPublicKeyHash: Buffer): Boolean = js.native
}

