package typingsSlinky.awsDashSdk.globalMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.awsDashSdk.libConfigMod.APIVersions
import typingsSlinky.awsDashSdk.libConfigMod.ConfigurationOptions
import typingsSlinky.awsDashSdk.libConfigMod.GlobalConfigInstance
import typingsSlinky.awsDashSdk.libConfigUnderscoreServiceUnderscorePlaceholdersMod.ConfigurationServicePlaceholders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/global", "Config")
@js.native
/**
  * Creates a new configuration object.
  * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
  */
class Config ()
  extends typingsSlinky.awsDashSdk.libCoreMod.Config {
  def this(options: ConfigurationOptions with ConfigurationServicePlaceholders with APIVersions) = this()
}

@JSImport("aws-sdk/global", "config")
@js.native
object config extends TopLevel[GlobalConfigInstance]

