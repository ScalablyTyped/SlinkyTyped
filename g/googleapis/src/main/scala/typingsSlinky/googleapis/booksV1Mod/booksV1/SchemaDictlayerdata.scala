package typingsSlinky.googleapis.booksV1Mod.booksV1

import typingsSlinky.googleapis.AnonTitle
import typingsSlinky.googleapis.AnonWords
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDictlayerdata extends js.Object {
  var common: js.UndefOr[AnonTitle] = js.native
  var dict: js.UndefOr[AnonWords] = js.native
  var kind: js.UndefOr[String] = js.native
}

object SchemaDictlayerdata {
  @scala.inline
  def apply(): SchemaDictlayerdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDictlayerdata]
  }
  @scala.inline
  implicit class SchemaDictlayerdataOps[Self <: SchemaDictlayerdata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommon(value: AnonTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("common")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("common")(js.undefined)
        ret
    }
    @scala.inline
    def withDict(value: AnonWords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dict")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

