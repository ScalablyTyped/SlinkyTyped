package typingsSlinky.codepage.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CPConv extends js.Object {
  var dec: NumberDictionary[String] = js.native
  var enc: StringDictionary[Double] = js.native
}

object CPConv {
  @scala.inline
  def apply(dec: NumberDictionary[String], enc: StringDictionary[Double]): CPConv = {
    val __obj = js.Dynamic.literal(dec = dec.asInstanceOf[js.Any], enc = enc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPConv]
  }
  @scala.inline
  implicit class CPConvOps[Self <: CPConv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDec(value: NumberDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnc(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enc")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

