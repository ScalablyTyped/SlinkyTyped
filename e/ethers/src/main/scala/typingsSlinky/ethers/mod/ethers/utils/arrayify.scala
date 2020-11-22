package typingsSlinky.ethers.mod.ethers.utils

import typingsSlinky.ethersprojectBytes.mod.BytesLike
import typingsSlinky.ethersprojectBytes.mod.DataOptions
import typingsSlinky.ethersprojectBytes.mod.Hexable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.utils.arrayify")
@js.native
object arrayify extends js.Object {
  
  def apply(value: Double): js.typedarray.Uint8Array = js.native
  def apply(value: Double, options: DataOptions): js.typedarray.Uint8Array = js.native
  def apply(value: BytesLike): js.typedarray.Uint8Array = js.native
  def apply(value: BytesLike, options: DataOptions): js.typedarray.Uint8Array = js.native
  def apply(value: Hexable): js.typedarray.Uint8Array = js.native
  def apply(value: Hexable, options: DataOptions): js.typedarray.Uint8Array = js.native
}
