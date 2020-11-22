package typingsSlinky.ethers.mod.utils

import typingsSlinky.ethersprojectBytes.mod.BytesLike
import typingsSlinky.ethersprojectStrings.utf8Mod.Utf8ErrorFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "utils.toUtf8String")
@js.native
object toUtf8String extends js.Object {
  
  def apply(bytes: BytesLike): String = js.native
  def apply(bytes: BytesLike, onError: Utf8ErrorFunc): String = js.native
}
