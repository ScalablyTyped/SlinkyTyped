package typingsSlinky.nodeForge.mod.util

import typingsSlinky.nodeForge.mod.Utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-forge", "util.text")
@js.native
object text extends js.Object {
  
  @js.native
  object utf16 extends js.Object {
    
    def decode(bytes: js.typedarray.Uint8Array): String = js.native
    
    def encode(str: String): js.typedarray.Uint8Array = js.native
    def encode(str: String, output: js.UndefOr[scala.Nothing], offset: Double): js.typedarray.Uint8Array = js.native
    def encode(str: String, output: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    def encode(str: String, output: js.typedarray.Uint8Array, offset: Double): js.typedarray.Uint8Array = js.native
  }
  
  @js.native
  object utf8 extends js.Object {
    
    def decode(bytes: js.typedarray.Uint8Array): Utf8 = js.native
    
    def encode(str: String): js.typedarray.Uint8Array = js.native
    def encode(str: String, output: js.UndefOr[scala.Nothing], offset: Double): js.typedarray.Uint8Array = js.native
    def encode(str: String, output: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    def encode(str: String, output: js.typedarray.Uint8Array, offset: Double): js.typedarray.Uint8Array = js.native
  }
}
