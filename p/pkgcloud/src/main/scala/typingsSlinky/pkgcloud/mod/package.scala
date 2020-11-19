package typingsSlinky.pkgcloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ProviderOptions = typingsSlinky.pkgcloud.mod.BaseProviderOptions with (typingsSlinky.std.Partial[
    typingsSlinky.pkgcloud.mod.AmazonProviderOptions | typingsSlinky.pkgcloud.mod.AzureProviderOptions | typingsSlinky.pkgcloud.mod.GoogleProviderOptions | typingsSlinky.pkgcloud.mod.OpenstackProviderOptions | typingsSlinky.pkgcloud.mod.RackspaceProviderOptions
  ])
}
