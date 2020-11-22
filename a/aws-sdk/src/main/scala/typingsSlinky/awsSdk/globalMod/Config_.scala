package typingsSlinky.awsSdk.globalMod

import typingsSlinky.awsSdk.configMod.APIVersions
import typingsSlinky.awsSdk.configServicePlaceholdersMod.ConfigurationServicePlaceholders
import typingsSlinky.awsSdk.coreMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/global", "Config")
@js.native
/**
  * Creates a new configuration object.
  * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
  */
class Config_ () extends Config {
  def this(options: typingsSlinky.awsSdk.configBaseMod.ConfigurationOptions with ConfigurationServicePlaceholders with APIVersions) = this()
}
