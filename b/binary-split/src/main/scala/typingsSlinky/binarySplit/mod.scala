package typingsSlinky.binarySplit

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.std.SharedArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Split streams of binary data.
    * @param splitOn The matcher for the splitting points in the stream. Default: os.EOL
    */
  @JSImport("binary-split", JSImport.Namespace)
  @js.native
  def apply(): Transform = js.native
  @JSImport("binary-split", JSImport.Namespace)
  @js.native
  def apply(splitOn: String): Transform = js.native
  @JSImport("binary-split", JSImport.Namespace)
  @js.native
  def apply(splitOn: js.Array[js.BigInt | Double]): Transform = js.native
  @JSImport("binary-split", JSImport.Namespace)
  @js.native
  def apply(splitOn: js.Object): Transform = js.native
  @JSImport("binary-split", JSImport.Namespace)
  @js.native
  def apply(splitOn: js.typedarray.ArrayBuffer): Transform = js.native
  @JSImport("binary-split", JSImport.Namespace)
  @js.native
  def apply(splitOn: js.typedarray.Uint8Array): Transform = js.native
  @JSImport("binary-split", JSImport.Namespace)
  @js.native
  def apply(splitOn: Buffer): Transform = js.native
  @JSImport("binary-split", JSImport.Namespace)
  @js.native
  def apply(splitOn: SharedArrayBuffer): Transform = js.native
}
