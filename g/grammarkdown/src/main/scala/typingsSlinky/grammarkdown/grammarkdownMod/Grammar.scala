package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.distOptionsMod.CompilerOptions
import typingsSlinky.prex.prexMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Grammar")
@js.native
class Grammar protected ()
  extends typingsSlinky.grammarkdown.distGrammarMod.Grammar {
  def this(rootNames: js.Iterable[String]) = this()
  def this(rootNames: js.Iterable[String], options: CompilerOptions) = this()
  def this(
    rootNames: js.Iterable[String],
    options: CompilerOptions,
    host: typingsSlinky.grammarkdown.distHostMod.AsyncHost
  ) = this()
  def this(
    rootNames: js.Iterable[String],
    options: CompilerOptions,
    host: typingsSlinky.grammarkdown.distHostMod.Host
  ) = this()
  def this(
    rootNames: js.Iterable[String],
    options: CompilerOptions,
    host: typingsSlinky.grammarkdown.distHostMod.SyncHost
  ) = this()
}

/* static members */
@JSImport("grammarkdown", "Grammar")
@js.native
object Grammar extends js.Object {
  def convert(content: String): String = js.native
  def convert(content: String, options: CompilerOptions): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typingsSlinky.grammarkdown.distHostMod.AsyncHost
  ): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typingsSlinky.grammarkdown.distHostMod.AsyncHost,
    cancellationToken: CancellationToken
  ): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typingsSlinky.grammarkdown.distHostMod.Host
  ): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typingsSlinky.grammarkdown.distHostMod.Host,
    cancellationToken: CancellationToken
  ): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typingsSlinky.grammarkdown.distHostMod.SyncHost
  ): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typingsSlinky.grammarkdown.distHostMod.SyncHost,
    cancellationToken: CancellationToken
  ): String = js.native
}

