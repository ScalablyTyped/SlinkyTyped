package typingsSlinky.eslint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CLIEngine {
  type Formatter = js.Function2[
    /* results */ js.Array[typingsSlinky.eslint.mod.CLIEngine.LintResult], 
    /* data */ js.UndefOr[typingsSlinky.eslint.mod.CLIEngine.LintResultData], 
    java.lang.String
  ]
}
