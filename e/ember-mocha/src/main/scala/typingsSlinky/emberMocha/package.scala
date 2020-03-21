package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object emberMocha {
  type mochaAfter = typingsSlinky.mocha.Mocha_.HookFunction
  type mochaAfterEach = typingsSlinky.mocha.Mocha_.HookFunction
  // these globals are re-exported as named exports by ember-mocha
  type mochaBefore = typingsSlinky.mocha.Mocha_.HookFunction
  type mochaBeforeEach = typingsSlinky.mocha.Mocha_.HookFunction
  type mochaSetup = typingsSlinky.mocha.Mocha_.HookFunction
  type mochaSuiteSetup = typingsSlinky.mocha.Mocha_.HookFunction
  type mochaSuiteTeardown = typingsSlinky.mocha.Mocha_.HookFunction
  type mochaTeardown = typingsSlinky.mocha.Mocha_.HookFunction
}
