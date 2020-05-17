package typingsSlinky.gapiClientDiscovery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Discriminant extends js.Object {
  /** The name of the type discriminant property. */
  var discriminant: js.UndefOr[String] = js.native
  /** The map of discriminant value to schema to use for parsing.. */
  var map: js.UndefOr[js.Array[Ref]] = js.native
}

object Discriminant {
  @scala.inline
  def apply(): Discriminant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Discriminant]
  }
  @scala.inline
  implicit class DiscriminantOps[Self <: Discriminant] (val x: Self) extends AnyVal {
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
    def withMap(value: js.Array[Ref]): Self = {
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

