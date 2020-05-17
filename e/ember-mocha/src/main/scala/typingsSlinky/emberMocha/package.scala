package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object emberMocha {
  type mochaAfter = typingsSlinky.mocha.Mocha.HookFunction
  type mochaAfterEach = typingsSlinky.mocha.Mocha.HookFunction
  // these globals are re-exported as named exports by ember-mocha
  type mochaBefore = typingsSlinky.mocha.Mocha.HookFunction
  type mochaBeforeEach = typingsSlinky.mocha.Mocha.HookFunction
  type mochaSetup = typingsSlinky.mocha.Mocha.HookFunction
  type mochaSuiteSetup = typingsSlinky.mocha.Mocha.HookFunction
  type mochaSuiteTeardown = typingsSlinky.mocha.Mocha.HookFunction
  type mochaTeardown = typingsSlinky.mocha.Mocha.HookFunction
}
