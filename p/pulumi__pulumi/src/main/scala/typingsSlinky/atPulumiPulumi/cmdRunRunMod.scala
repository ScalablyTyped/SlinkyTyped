package typingsSlinky.atPulumiPulumi

import typingsSlinky.minimist.minimistMod.ParsedArgs
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/cmd/run/run", JSImport.Namespace)
@js.native
object cmdRunRunMod extends js.Object {
  def run(
    argv: ParsedArgs,
    programStarted: js.Function0[Unit],
    reportLoggedError: js.Function1[/* err */ js.Error, Unit]
  ): js.Promise[js.UndefOr[Record[String, _]]] = js.native
}

