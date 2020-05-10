package typingsSlinky.domSerializer.mod

import typingsSlinky.domSerializer.domSerializerStrings.foreign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomSerializerOptions extends js.Object {
  var decodeEntities: js.UndefOr[Boolean] = js.native
  var xmlMode: js.UndefOr[Boolean | foreign] = js.native
}

object DomSerializerOptions {
  @scala.inline
  def apply(): DomSerializerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomSerializerOptions]
  }
  @scala.inline
  implicit class DomSerializerOptionsOps[Self <: DomSerializerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecodeEntities(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeEntities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecodeEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeEntities")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlMode(value: Boolean | foreign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlMode")(js.undefined)
        ret
    }
  }
  
}

