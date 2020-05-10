package typingsSlinky.qlik.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitialPropertiesHyperCube
  extends /* key */ StringDictionary[js.Any]
     with InitialProperties {
  var qHyperCubeDef: HyperCubeDef = js.native
}

object InitialPropertiesHyperCube {
  @scala.inline
  def apply(qHyperCubeDef: HyperCubeDef): InitialPropertiesHyperCube = {
    val __obj = js.Dynamic.literal(qHyperCubeDef = qHyperCubeDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialPropertiesHyperCube]
  }
  @scala.inline
  implicit class InitialPropertiesHyperCubeOps[Self <: InitialPropertiesHyperCube] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQHyperCubeDef(value: HyperCubeDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qHyperCubeDef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

