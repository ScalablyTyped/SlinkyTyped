package typingsSlinky.jestRunner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type OnTestFailure = typingsSlinky.jestRunner.typesMod.OnTestFailure
  type OnTestStart = typingsSlinky.jestRunner.typesMod.OnTestStart
  type OnTestSuccess = typingsSlinky.jestRunner.typesMod.OnTestSuccess
  type Test = typingsSlinky.jestRunner.typesMod.Test
  type TestFileEvent = typingsSlinky.jestRunner.typesMod.TestFileEvent[
    /* keyof jest-runner.jest-runner/build/types.TestEvents */ typingsSlinky.jestRunner.jestRunnerStrings.`test-file-start` | typingsSlinky.jestRunner.jestRunnerStrings.`test-file-success` | typingsSlinky.jestRunner.jestRunnerStrings.`test-file-failure` | typingsSlinky.jestRunner.jestRunnerStrings.`test-case-result`
  ]
  type TestRunnerContext = typingsSlinky.jestRunner.typesMod.TestRunnerContext
  type TestRunnerOptions = typingsSlinky.jestRunner.typesMod.TestRunnerOptions
  type TestWatcher = typingsSlinky.jestRunner.typesMod.TestWatcher
}
