package typingsSlinky.gapiClientDiscovery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDiscriminant extends js.Object {
  /** The name of the type discriminant property. */
  var discriminant: js.UndefOr[String] = js.native
  /** The map of discriminant value to schema to use for parsing.. */
  var map: js.UndefOr[js.Array[AnonRef]] = js.native
}

object AnonDiscriminant {
  @scala.inline
  def apply(): AnonDiscriminant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDiscriminant]
  }
  @scala.inline
  implicit class AnonDiscriminantOps[Self <: AnonDiscriminant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiscriminant(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discriminant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscriminant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discriminant")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: js.Array[AnonRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
  }
  
}

