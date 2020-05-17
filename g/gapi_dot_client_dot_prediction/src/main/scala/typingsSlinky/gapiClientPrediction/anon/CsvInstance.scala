package typingsSlinky.gapiClientPrediction.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CsvInstance extends js.Object {
  /** A list of input features, these can be strings or doubles. */
  var csvInstance: js.UndefOr[js.Array[_]] = js.native
}

object CsvInstance {
  @scala.inline
  def apply(): CsvInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsvInstance]
  }
  @scala.inline
  implicit class CsvInstanceOps[Self <: CsvInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCsvInstance(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvInstance")(js.undefined)
        ret
    }
  }
  
}

