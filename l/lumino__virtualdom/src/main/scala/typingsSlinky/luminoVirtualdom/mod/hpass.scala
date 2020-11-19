package typingsSlinky.luminoVirtualdom.mod

import typingsSlinky.luminoVirtualdom.mod.VirtualElementPass.IRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/virtualdom", "hpass")
@js.native
object hpass extends js.Object {
  
  def apply(tag: String): VirtualElementPass = js.native
  def apply(tag: String, attrs: ElementAttrs): VirtualElementPass = js.native
  def apply(tag: String, attrs: ElementAttrs, renderer: IRenderer): VirtualElementPass = js.native
  def apply(tag: String, renderer: IRenderer): VirtualElementPass = js.native
}
