package typingsSlinky.rScript.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.rScript.rScriptStrings.ISO8601
import typingsSlinky.rScript.rScriptStrings.`null`
import typingsSlinky.rScript.rScriptStrings.base64
import typingsSlinky.rScript.rScriptStrings.columnmajor
import typingsSlinky.rScript.rScriptStrings.colums
import typingsSlinky.rScript.rScriptStrings.epoch
import typingsSlinky.rScript.rScriptStrings.hex
import typingsSlinky.rScript.rScriptStrings.integer
import typingsSlinky.rScript.rScriptStrings.list
import typingsSlinky.rScript.rScriptStrings.mongo
import typingsSlinky.rScript.rScriptStrings.rowmajor
import typingsSlinky.rScript.rScriptStrings.rows
import typingsSlinky.rScript.rScriptStrings.string
import typingsSlinky.rScript.rScriptStrings.values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends /* key */ StringDictionary[js.Any] {
  var Date: js.UndefOr[ISO8601 | epoch] = js.native
  var POSIXt: js.UndefOr[string | ISO8601 | epoch | mongo] = js.native
  var auto_unbox: js.UndefOr[Boolean] = js.native
  var complex: js.UndefOr[string | list] = js.native
  var dataframe: js.UndefOr[rows | colums | values] = js.native
  var digits: js.UndefOr[Double] = js.native
  var factor: js.UndefOr[string | integer] = js.native
  var force: js.UndefOr[Boolean] = js.native
  var matrix: js.UndefOr[rowmajor | columnmajor] = js.native
  var na: js.UndefOr[`null` | string] = js.native
  var `null`: js.UndefOr[list | typingsSlinky.rScript.rScriptStrings.`null`] = js.native
  var pretty: js.UndefOr[Boolean] = js.native
  var raw: js.UndefOr[base64 | hex | mongo] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: ISO8601 | epoch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Date")(js.undefined)
        ret
    }
    @scala.inline
    def withPOSIXt(value: string | ISO8601 | epoch | mongo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("POSIXt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPOSIXt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("POSIXt")(js.undefined)
        ret
    }
    @scala.inline
    def withAuto_unbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_unbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuto_unbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_unbox")(js.undefined)
        ret
    }
    @scala.inline
    def withComplex(value: string | list): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complex")(js.undefined)
        ret
    }
    @scala.inline
    def withDataframe(value: rows | colums | values): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataframe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataframe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataframe")(js.undefined)
        ret
    }
    @scala.inline
    def withDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digits")(js.undefined)
        ret
    }
    @scala.inline
    def withFactor(value: string | integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(js.undefined)
        ret
    }
    @scala.inline
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
    @scala.inline
    def withMatrix(value: rowmajor | columnmajor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatrix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrix")(js.undefined)
        ret
    }
    @scala.inline
    def withNa(value: `null` | string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("na")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("na")(js.undefined)
        ret
    }
    @scala.inline
    def withNull(value: list | `null`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("null")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("null")(js.undefined)
        ret
    }
    @scala.inline
    def withPretty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPretty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretty")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: base64 | hex | mongo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
  }
  
}

