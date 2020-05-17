package typingsSlinky.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait fuzzyFactory extends js.Object {
  var lookuptable: js.Any = js.native
  var multiplier: Double = js.native
  def lookupOrCreate(els: js.Any, creatorCallback: js.Any): js.Any = js.native
}

object fuzzyFactory {
  @scala.inline
  def apply(lookupOrCreate: (js.Any, js.Any) => js.Any, lookuptable: js.Any, multiplier: Double): fuzzyFactory = {
    val __obj = js.Dynamic.literal(lookupOrCreate = js.Any.fromFunction2(lookupOrCreate), lookuptable = lookuptable.asInstanceOf[js.Any], multiplier = multiplier.asInstanceOf[js.Any])
    __obj.asInstanceOf[fuzzyFactory]
  }
  @scala.inline
  implicit class fuzzyFactoryOps[Self <: fuzzyFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLookupOrCreate(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupOrCreate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLookuptable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookuptable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

