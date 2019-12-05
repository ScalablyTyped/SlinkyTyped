package typingsSlinky.pkgcloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pkgcloudMod {
  import typingsSlinky.std.Partial

  type ProviderOptions = BaseProviderOptions with (Partial[
    AmazonProviderOptions | AzureProviderOptions | GoogleProviderOptions | OpenstackProviderOptions | RackspaceProviderOptions
  ])
}
