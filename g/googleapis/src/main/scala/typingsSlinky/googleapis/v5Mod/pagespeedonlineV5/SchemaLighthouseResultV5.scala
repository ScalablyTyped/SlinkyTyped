package typingsSlinky.googleapis.v5Mod.pagespeedonlineV5

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleapis.AnonAccessibility
import typingsSlinky.googleapis.AnonBenchmarkIndex
import typingsSlinky.googleapis.AnonCodeMessage
import typingsSlinky.googleapis.AnonDescriptionTitle
import typingsSlinky.googleapis.AnonEmulatedFormFactor
import typingsSlinky.googleapis.AnonRendererFormattedStrings
import typingsSlinky.googleapis.AnonTotal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLighthouseResultV5 extends js.Object {
  /**
    * Map of audits in the LHR.
    */
  var audits: js.UndefOr[StringDictionary[SchemaLighthouseAuditResultV5]] = js.native
  /**
    * Map of categories in the LHR.
    */
  var categories: js.UndefOr[AnonAccessibility] = js.native
  /**
    * Map of category groups in the LHR.
    */
  var categoryGroups: js.UndefOr[StringDictionary[AnonDescriptionTitle]] = js.native
  /**
    * The configuration settings for this LHR.
    */
  var configSettings: js.UndefOr[AnonEmulatedFormFactor] = js.native
  /**
    * Environment settings that were used when making this LHR.
    */
  var environment: js.UndefOr[AnonBenchmarkIndex] = js.native
  /**
    * The time that this run was fetched.
    */
  var fetchTime: js.UndefOr[String] = js.native
  /**
    * The final resolved url that was audited.
    */
  var finalUrl: js.UndefOr[String] = js.native
  /**
    * The internationalization strings that are required to render the LHR.
    */
  var i18n: js.UndefOr[AnonRendererFormattedStrings] = js.native
  /**
    * The lighthouse version that was used to generate this LHR.
    */
  var lighthouseVersion: js.UndefOr[String] = js.native
  /**
    * The original requested url.
    */
  var requestedUrl: js.UndefOr[String] = js.native
  /**
    * List of all run warnings in the LHR. Will always output to at least `[]`.
    */
  var runWarnings: js.UndefOr[js.Array[_]] = js.native
  /**
    * A top-level error message that, if present, indicates a serious enough
    * problem that this Lighthouse result may need to be discarded.
    */
  var runtimeError: js.UndefOr[AnonCodeMessage] = js.native
  /**
    * Timing information for this LHR.
    */
  var timing: js.UndefOr[AnonTotal] = js.native
  /**
    * The user agent that was used to run this LHR.
    */
  var userAgent: js.UndefOr[String] = js.native
}

object SchemaLighthouseResultV5 {
  @scala.inline
  def apply(): SchemaLighthouseResultV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLighthouseResultV5]
  }
  @scala.inline
  implicit class SchemaLighthouseResultV5Ops[Self <: SchemaLighthouseResultV5] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudits(value: StringDictionary[SchemaLighthouseAuditResultV5]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audits")(js.undefined)
        ret
    }
    @scala.inline
    def withCategories(value: AnonAccessibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(js.undefined)
        ret
    }
    @scala.inline
    def withCategoryGroups(value: StringDictionary[AnonDescriptionTitle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoryGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigSettings(value: AnonEmulatedFormFactor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: AnonBenchmarkIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withI18n(value: AnonRendererFormattedStrings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI18n: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(js.undefined)
        ret
    }
    @scala.inline
    def withLighthouseVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lighthouseVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLighthouseVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lighthouseVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRunWarnings(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runWarnings")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntimeError(value: AnonCodeMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntimeError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeError")(js.undefined)
        ret
    }
    @scala.inline
    def withTiming(value: AnonTotal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(js.undefined)
        ret
    }
  }
  
}

