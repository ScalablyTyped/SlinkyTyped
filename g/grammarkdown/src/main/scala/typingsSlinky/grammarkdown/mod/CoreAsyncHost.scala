package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.hostMod.CoreAsyncHostOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "CoreAsyncHost")
@js.native
class CoreAsyncHost protected ()
  extends typingsSlinky.grammarkdown.hostMod.CoreAsyncHost {
  /**
    * @param options The options used to configure the host.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  def this(options: CoreAsyncHostOptions) = this()
  def this(options: CoreAsyncHostOptions, hostFallback: typingsSlinky.grammarkdown.hostMod.CoreAsyncHost) = this()
  def this(options: CoreAsyncHostOptions, hostFallback: typingsSlinky.grammarkdown.hostMod.CoreSyncHost) = this()
}
/* static members */
@JSImport("grammarkdown", "CoreAsyncHost")
@js.native
object CoreAsyncHost extends js.Object {
  
  def forFile(content: String): typingsSlinky.grammarkdown.hostMod.StringAsyncHost = js.native
  def forFile(
    content: String,
    file: js.UndefOr[scala.Nothing],
    hostFallback: typingsSlinky.grammarkdown.hostMod.CoreAsyncHost
  ): typingsSlinky.grammarkdown.hostMod.StringAsyncHost = js.native
  def forFile(
    content: String,
    file: js.UndefOr[scala.Nothing],
    hostFallback: typingsSlinky.grammarkdown.hostMod.CoreSyncHost
  ): typingsSlinky.grammarkdown.hostMod.StringAsyncHost = js.native
  def forFile(content: String, file: String): typingsSlinky.grammarkdown.hostMod.StringAsyncHost = js.native
  def forFile(content: String, file: String, hostFallback: typingsSlinky.grammarkdown.hostMod.CoreAsyncHost): typingsSlinky.grammarkdown.hostMod.StringAsyncHost = js.native
  def forFile(content: String, file: String, hostFallback: typingsSlinky.grammarkdown.hostMod.CoreSyncHost): typingsSlinky.grammarkdown.hostMod.StringAsyncHost = js.native
  /**
    * Creates a {@link StringAsyncHost} for the provided content.
    * @param content The content of the file.
    * @param file The file name for the content.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  def forFile(content: js.Thenable[String]): typingsSlinky.grammarkdown.hostMod.StringAsyncHost = js.native
  def forFile(
    content: js.Thenable[String],
    file: js.UndefOr[scala.Nothing],
    hostFallback: typingsSlinky.grammarkdown.hostMod.CoreAsyncHost
  ): typingsSlinky.grammarkdown.hostMod.StringAsyncHost = js.native
  def forFile(
    content: js.Thenable[String],
    file: js.UndefOr[scala.Nothing],
    hostFallback: typingsSlinky.grammarkdown.hostMod.CoreSyncHost
  ): typingsSlinky.grammarkdown.hostMod.StringAsyncHost = js.native
  def forFile(content: js.Thenable[String], file: String): typingsSlinky.grammarkdown.hostMod.StringAsyncHost = js.native
  def forFile(
    content: js.Thenable[String],
    file: String,
    hostFallback: typingsSlinky.grammarkdown.hostMod.CoreAsyncHost
  ): typingsSlinky.grammarkdown.hostMod.StringAsyncHost = js.native
  def forFile(
    content: js.Thenable[String],
    file: String,
    hostFallback: typingsSlinky.grammarkdown.hostMod.CoreSyncHost
  ): typingsSlinky.grammarkdown.hostMod.StringAsyncHost = js.native
  
  /**
    * Creates a `CoreAsyncHost`.
    * @param options The options used to configure the host.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  def from(custom: CoreAsyncHostOptions): typingsSlinky.grammarkdown.hostMod.CoreAsyncHost = js.native
  def from(custom: CoreAsyncHostOptions, hostFallback: typingsSlinky.grammarkdown.hostMod.CoreAsyncHost): typingsSlinky.grammarkdown.hostMod.CoreAsyncHost = js.native
  def from(custom: CoreAsyncHostOptions, hostFallback: typingsSlinky.grammarkdown.hostMod.CoreSyncHost): typingsSlinky.grammarkdown.hostMod.CoreAsyncHost = js.native
}
