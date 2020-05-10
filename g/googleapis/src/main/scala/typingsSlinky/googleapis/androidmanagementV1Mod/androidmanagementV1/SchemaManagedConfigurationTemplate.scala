package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The managed configurations template for the app, saved from the managed
  * configurations iframe.
  */
@js.native
trait SchemaManagedConfigurationTemplate extends js.Object {
  /**
    * Optional, a map containing &lt;key, value&gt; configuration variables
    * defined for the configuration.
    */
  var configurationVariables: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The ID of the managed configurations template.
    */
  var templateId: js.UndefOr[String] = js.native
}

object SchemaManagedConfigurationTemplate {
  @scala.inline
  def apply(): SchemaManagedConfigurationTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedConfigurationTemplate]
  }
  @scala.inline
  implicit class SchemaManagedConfigurationTemplateOps[Self <: SchemaManagedConfigurationTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationVariables(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationVariables")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateId")(js.undefined)
        ret
    }
  }
  
}

