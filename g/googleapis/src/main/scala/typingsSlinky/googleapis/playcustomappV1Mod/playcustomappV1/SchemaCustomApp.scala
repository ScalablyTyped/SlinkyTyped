package typingsSlinky.googleapis.playcustomappV1Mod.playcustomappV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This resource represents a custom app.
  */
@js.native
trait SchemaCustomApp extends js.Object {
  /**
    * Default listing language in BCP 47 format.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Title for the Android app.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaCustomApp {
  @scala.inline
  def apply(): SchemaCustomApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomApp]
  }
  @scala.inline
  implicit class SchemaCustomAppOps[Self <: SchemaCustomApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguageCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

