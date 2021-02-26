package typingsSlinky.pvtsutils

import typingsSlinky.std.ArrayBufferLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMod {
  
  @JSImport("pvtsutils/build/types/helper", "assign")
  @js.native
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
  
  @JSImport("pvtsutils/build/types/helper", "combine")
  @js.native
  def combine(buf: js.typedarray.ArrayBuffer*): ArrayBufferLike = js.native
  
  @JSImport("pvtsutils/build/types/helper", "isEqual")
  @js.native
  def isEqual(bytes1: js.typedarray.ArrayBuffer, bytes2: js.typedarray.ArrayBuffer): Boolean = js.native
}
