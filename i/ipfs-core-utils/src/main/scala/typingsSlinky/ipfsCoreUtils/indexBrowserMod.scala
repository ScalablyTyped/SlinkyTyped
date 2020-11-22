package typingsSlinky.ipfsCoreUtils

import org.scalajs.dom.raw.Blob
import typingsSlinky.ipfsCoreUtils.normaliseInputNormaliseInputMod.Entry
import typingsSlinky.ipfsCoreUtils.normaliseInputNormaliseInputMod.Source
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core-utils/dist/src/files/normalise-input/index.browser", JSImport.Namespace)
@js.native
object indexBrowserMod extends js.Object {
  
  def apply(input: Source): AsyncIterable[Entry[Blob]] = js.native
}
