package typingsSlinky.ltijs.mod

import typingsSlinky.ltijs.databaseMod.DatabaseOptions
import typingsSlinky.ltijs.providerMod.ProviderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ltijs", "Provider")
@js.native
class Provider protected ()
  extends typingsSlinky.ltijs.providerMod.Provider {
  def this(encryptionKey: String, database: DatabaseOptions) = this()
  def this(encryptionKey: String, database: DatabaseOptions, options: ProviderOptions) = this()
}

