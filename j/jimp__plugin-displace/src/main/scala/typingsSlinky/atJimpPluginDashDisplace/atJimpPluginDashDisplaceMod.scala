package typingsSlinky.atJimpPluginDashDisplace

import typingsSlinky.atJimpCore.typesEtcMod.ImageCallback
import typingsSlinky.atJimpCore.typesJimpMod.Jimp
import typingsSlinky.atJimpPluginDashDisplace.atJimpPluginDashDisplaceMod.Displace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/plugin-displace", JSImport.Namespace)
@js.native
object atJimpPluginDashDisplaceMod extends js.Object {
  @js.native
  trait Displace extends js.Object {
    def displace(map: Jimp, offset: Double): this.type = js.native
    def displace(map: Jimp, offset: Double, cb: ImageCallback[this.type]): this.type = js.native
  }
  
  def default(): Displace = js.native
}

