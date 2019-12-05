package typingsSlinky.maquette

import typingsSlinky.maquette.distInterfacesMod.VNode
import typingsSlinky.maquette.distInterfacesMod.VNodeChild
import typingsSlinky.maquette.distInterfacesMod.VNodeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maquette/dist/h", JSImport.Namespace)
@js.native
object distHMod extends js.Object {
  def h(selector: String): VNode = js.native
  def h(selector: String, children: js.Array[VNodeChild]): VNode = js.native
  def h(selector: String, properties: VNodeProperties): VNode = js.native
  def h(selector: String, properties: VNodeProperties, children: js.Array[VNodeChild]): VNode = js.native
}

