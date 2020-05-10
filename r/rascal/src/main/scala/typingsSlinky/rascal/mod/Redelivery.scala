package typingsSlinky.rascal.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.rascal.AnonSizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Redelivery extends js.Object {
  var counters: js.UndefOr[StringDictionary[AnonSizeType]] = js.native
}

object Redelivery {
  @scala.inline
  def apply(): Redelivery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Redelivery]
  }
  @scala.inline
  implicit class RedeliveryOps[Self <: Redelivery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCounters(value: StringDictionary[AnonSizeType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counters")(js.undefined)
        ret
    }
  }
  
}

