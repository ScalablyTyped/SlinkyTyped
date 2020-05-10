package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Shared request options for all RPC methods.
  */
@js.native
trait SchemaRequestOptions extends js.Object {
  /**
    * Debug options of the request
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.native
  /**
    * The BCP-47 language code, such as &quot;en-US&quot; or
    * &quot;sr-Latn&quot;. For more information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. For
    * translations.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Id of the application created using SearchApplicationsService.
    */
  var searchApplicationId: js.UndefOr[String] = js.native
  /**
    * Current user&#39;s time zone id, such as &quot;America/Los_Angeles&quot;
    * or &quot;Australia/Sydney&quot;. These IDs are defined by [Unicode Common
    * Locale Data Repository (CLDR)](http://cldr.unicode.org/) project, and
    * currently available in the file
    * [timezone.xml](http://unicode.org/repos/cldr/trunk/common/bcp47/timezone.xml)
    */
  var timeZone: js.UndefOr[String] = js.native
}

object SchemaRequestOptions {
  @scala.inline
  def apply(): SchemaRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequestOptions]
  }
  @scala.inline
  implicit class SchemaRequestOptionsOps[Self <: SchemaRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebugOptions(value: SchemaDebugOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugOptions")(js.undefined)
        ret
    }
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
    def withSearchApplicationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchApplicationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchApplicationId")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(js.undefined)
        ret
    }
  }
  
}

