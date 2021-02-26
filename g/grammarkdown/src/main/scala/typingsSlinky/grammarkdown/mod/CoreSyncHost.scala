package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.hostMod.CoreSyncHostOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "CoreSyncHost")
@js.native
class CoreSyncHost protected ()
  extends typingsSlinky.grammarkdown.hostMod.CoreSyncHost {
  /**
    * @param options The options used to configure the host.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  def this(options: CoreSyncHostOptions) = this()
  def this(options: CoreSyncHostOptions, hostFallback: typingsSlinky.grammarkdown.hostMod.CoreSyncHost) = this()
}
/* static members */
object CoreSyncHost {
  
  /**
    * Creates a {@link StringSyncHost} for the provided content.
    * @param content The content of the file.
    * @param file The file name for the content.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  @JSImport("grammarkdown", "CoreSyncHost.forFile")
  @js.native
  def forFile(content: String): typingsSlinky.grammarkdown.hostMod.StringSyncHost = js.native
  @JSImport("grammarkdown", "CoreSyncHost.forFile")
  @js.native
  def forFile(
    content: String,
    file: js.UndefOr[scala.Nothing],
    hostFallback: typingsSlinky.grammarkdown.hostMod.CoreSyncHost
  ): typingsSlinky.grammarkdown.hostMod.StringSyncHost = js.native
  @JSImport("grammarkdown", "CoreSyncHost.forFile")
  @js.native
  def forFile(content: String, file: String): typingsSlinky.grammarkdown.hostMod.StringSyncHost = js.native
  @JSImport("grammarkdown", "CoreSyncHost.forFile")
  @js.native
  def forFile(content: String, file: String, hostFallback: typingsSlinky.grammarkdown.hostMod.CoreSyncHost): typingsSlinky.grammarkdown.hostMod.StringSyncHost = js.native
  
  /**
    * Creates a `CoreSyncHost`.
    * @param options The options used to configure the host.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  @JSImport("grammarkdown", "CoreSyncHost.from")
  @js.native
  def from(options: CoreSyncHostOptions): typingsSlinky.grammarkdown.hostMod.CoreSyncHost = js.native
  @JSImport("grammarkdown", "CoreSyncHost.from")
  @js.native
  def from(options: CoreSyncHostOptions, hostFallback: typingsSlinky.grammarkdown.hostMod.CoreSyncHost): typingsSlinky.grammarkdown.hostMod.CoreSyncHost = js.native
}
