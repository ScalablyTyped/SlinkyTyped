package typingsSlinky.awsSdk.configMod

import typingsSlinky.awsSdk.anon.ConfigurationOptionsConfi
import typingsSlinky.awsSdk.awsSdkBooleans.`true`
import typingsSlinky.awsSdk.configServicePlaceholdersMod.ConfigurationServicePlaceholders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/config", "Config")
@js.native
/**
  * Creates a new configuration object.
  * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
  */
class Config () extends ConfigBase {
  def this(options: ConfigurationOptions with ConfigurationServicePlaceholders with APIVersions) = this()
  
  /**
    * Updates the current configuration object with new options.
    *
    * @param {ConfigurationOptions} options - a map of option keys and values.
    * @param {boolean} allowUnknownKeys - Whether unknown keys can be set on the configuration object.
    */
  @JSName("update")
  def update_true(options: ConfigurationOptionsConfi, allowUnknownKeys: `true`): Unit = js.native
}
