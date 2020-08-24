package typingsSlinky.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type Literal = js.Function1[/* v */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, java.lang.String]
  type LogFn = js.Function1[/* msg */ java.lang.String, scala.Unit]
  type MigrationAction = js.Function2[
    /* pgm */ typingsSlinky.nodePgMigrate.distTypesMod.MigrationBuilder, 
    /* run */ js.UndefOr[js.Function0[scala.Unit]], 
    js.Promise[scala.Unit] | scala.Unit
  ]
  type RunnerOption = typingsSlinky.nodePgMigrate.distTypesMod.RunnerOptionConfig with (typingsSlinky.nodePgMigrate.distTypesMod.RunnerOptionClient | typingsSlinky.nodePgMigrate.distTypesMod.RunnerOptionUrl)
}
