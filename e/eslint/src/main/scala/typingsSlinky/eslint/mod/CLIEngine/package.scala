package typingsSlinky.eslint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CLIEngine {
  type DeprecatedRuleUse = typingsSlinky.eslint.mod.ESLint.DeprecatedRuleUse
  type Formatter = js.Function2[
    /* results */ js.Array[typingsSlinky.eslint.mod.CLIEngine.LintResult], 
    /* data */ js.UndefOr[typingsSlinky.eslint.mod.CLIEngine.LintResultData], 
    java.lang.String
  ]
  type LintResult = typingsSlinky.eslint.mod.ESLint.LintResult
  type LintResultData = typingsSlinky.eslint.mod.ESLint.LintResultData
}
