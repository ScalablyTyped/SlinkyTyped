package typingsSlinky.cypress.mochaMod.reporters

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.cypress.Mocha.Runner
import typingsSlinky.cypress.Mocha.reporters.XUnit
import typingsSlinky.cypress.Mocha.reporters.XUnit.MochaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mocha", "reporters.xunit")
@js.native
object xunit
  extends TopLevel[
      Instantiable2[/* runner */ Runner, js.UndefOr[/* options */ MochaOptions], XUnit]
    ]

