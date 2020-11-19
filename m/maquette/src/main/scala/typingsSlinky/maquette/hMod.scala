package typingsSlinky.maquette

import typingsSlinky.maquette.interfacesMod.VNode
import typingsSlinky.maquette.interfacesMod.VNodeChild
import typingsSlinky.maquette.interfacesMod.VNodeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maquette/dist/h", JSImport.Namespace)
@js.native
object hMod extends js.Object {
  
  def h(selector: String): VNode = js.native
  def h(selector: String, children: js.Array[VNodeChild]): VNode = js.native
  def h(selector: String, properties: js.UndefOr[scala.Nothing], children: js.Array[VNodeChild]): VNode = js.native
  def h(selector: String, properties: VNodeProperties): VNode = js.native
  def h(selector: String, properties: VNodeProperties, children: js.Array[VNodeChild]): VNode = js.native
}
