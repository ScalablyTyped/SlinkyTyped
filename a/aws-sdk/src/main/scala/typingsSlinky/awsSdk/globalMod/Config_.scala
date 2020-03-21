package typingsSlinky.awsSdk.globalMod

import typingsSlinky.awsSdk.configMod.APIVersions
import typingsSlinky.awsSdk.configMod.ConfigurationOptions
import typingsSlinky.awsSdk.configServicePlaceholdersMod.ConfigurationServicePlaceholders
import typingsSlinky.awsSdk.coreMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/global", "Config")
@js.native
/**
  * Creates a new configuration object.
  * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
  */
class Config_ () extends Config {
  def this(options: ConfigurationOptions with ConfigurationServicePlaceholders with APIVersions) = this()
}

