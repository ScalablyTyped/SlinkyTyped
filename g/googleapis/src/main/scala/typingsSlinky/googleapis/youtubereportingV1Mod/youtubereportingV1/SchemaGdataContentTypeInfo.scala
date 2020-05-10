package typingsSlinky.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait SchemaGdataContentTypeInfo extends js.Object {
  /**
    * gdata
    */
  var bestGuess: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var fromBytes: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var fromFileName: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var fromHeader: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var fromUrlPath: js.UndefOr[String] = js.native
}

object SchemaGdataContentTypeInfo {
  @scala.inline
  def apply(): SchemaGdataContentTypeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataContentTypeInfo]
  }
  @scala.inline
  implicit class SchemaGdataContentTypeInfoOps[Self <: SchemaGdataContentTypeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBestGuess(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bestGuess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBestGuess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bestGuess")(js.undefined)
        ret
    }
    @scala.inline
    def withFromBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withFromFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withFromHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withFromUrlPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromUrlPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromUrlPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromUrlPath")(js.undefined)
        ret
    }
  }
  
}

