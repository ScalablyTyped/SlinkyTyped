package typingsSlinky.muiDatatables.anon

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lookup extends js.Object {
  var data: js.Array[Index] = js.native
  var lookup: NumberDictionary[Boolean] = js.native
}

object Lookup {
  @scala.inline
  def apply(data: js.Array[Index], lookup: NumberDictionary[Boolean]): Lookup = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lookup]
  }
  @scala.inline
  implicit class LookupOps[Self <: Lookup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[Index]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLookup(value: NumberDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

