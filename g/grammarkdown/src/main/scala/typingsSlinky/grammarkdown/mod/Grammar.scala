package typingsSlinky.grammarkdown.mod

import typingsSlinky.esfxCancelable.distMod.Cancelable
import typingsSlinky.grammarkdown.optionsMod.CompilerOptions
import typingsSlinky.prex.mod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Grammar")
@js.native
class Grammar protected ()
  extends typingsSlinky.grammarkdown.grammarMod.Grammar {
  def this(rootNames: js.Iterable[String]) = this()
  def this(rootNames: js.Iterable[String], options: CompilerOptions) = this()
  def this(
    rootNames: js.Iterable[String],
    options: CompilerOptions,
    host: typingsSlinky.grammarkdown.hostMod.AsyncHost
  ) = this()
  def this(
    rootNames: js.Iterable[String],
    options: CompilerOptions,
    host: typingsSlinky.grammarkdown.hostMod.Host
  ) = this()
  def this(
    rootNames: js.Iterable[String],
    options: CompilerOptions,
    host: typingsSlinky.grammarkdown.hostMod.SyncHost
  ) = this()
}

/* static members */
@JSImport("grammarkdown", "Grammar")
@js.native
object Grammar extends js.Object {
  /** @deprecated since 2.1.0 - `prex.CancellationToken` may no longer be accepted in future releases. Please use a token that implements `@esfx/cancelable.Cancelable` */
  def convert(content: String): String = js.native
  def convert(content: String, options: CompilerOptions): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typingsSlinky.grammarkdown.hostMod.AsyncHost
  ): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typingsSlinky.grammarkdown.hostMod.AsyncHost,
    cancelable: Cancelable
  ): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typingsSlinky.grammarkdown.hostMod.AsyncHost,
    cancelable: CancellationToken
  ): String = js.native
  def convert(content: String, options: CompilerOptions, hostFallback: typingsSlinky.grammarkdown.hostMod.Host): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typingsSlinky.grammarkdown.hostMod.Host,
    cancelable: Cancelable
  ): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typingsSlinky.grammarkdown.hostMod.Host,
    cancelable: CancellationToken
  ): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typingsSlinky.grammarkdown.hostMod.SyncHost
  ): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typingsSlinky.grammarkdown.hostMod.SyncHost,
    cancelable: Cancelable
  ): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typingsSlinky.grammarkdown.hostMod.SyncHost,
    cancelable: CancellationToken
  ): String = js.native
}

