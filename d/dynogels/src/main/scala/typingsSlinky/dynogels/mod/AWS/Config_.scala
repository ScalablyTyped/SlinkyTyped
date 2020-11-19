package typingsSlinky.dynogels.mod.AWS

import typingsSlinky.awsSdk.configMod.APIVersions
import typingsSlinky.awsSdk.configMod.ConfigurationOptions
import typingsSlinky.awsSdk.configServicePlaceholdersMod.ConfigurationServicePlaceholders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dynogels", "AWS.Config")
@js.native
/**
  * Creates a new configuration object.
  * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
  */
class Config_ ()
  extends typingsSlinky.awsSdk.mod.Config_ {
  def this(options: ConfigurationOptions with ConfigurationServicePlaceholders with APIVersions) = this()
}
