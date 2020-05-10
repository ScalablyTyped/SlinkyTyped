package typingsSlinky.nconf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFormats extends js.Object {
  var ini: IFormat = js.native
  var json: IFormat = js.native
}

object IFormats {
  @scala.inline
  def apply(ini: IFormat, json: IFormat): IFormats = {
    val __obj = js.Dynamic.literal(ini = ini.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFormats]
  }
  @scala.inline
  implicit class IFormatsOps[Self <: IFormats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIni(value: IFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ini")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJson(value: IFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

