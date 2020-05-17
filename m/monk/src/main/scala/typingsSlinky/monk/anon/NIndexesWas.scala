package typingsSlinky.monk.anon

import typingsSlinky.monk.monkNumbers.`0`
import typingsSlinky.monk.monkNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NIndexesWas extends js.Object {
  var nIndexesWas: Double = js.native
  var ok: `1` | `0` = js.native
}

object NIndexesWas {
  @scala.inline
  def apply(nIndexesWas: Double, ok: `1` | `0`): NIndexesWas = {
    val __obj = js.Dynamic.literal(nIndexesWas = nIndexesWas.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[NIndexesWas]
  }
  @scala.inline
  implicit class NIndexesWasOps[Self <: NIndexesWas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNIndexesWas(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nIndexesWas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOk(value: `1` | `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

