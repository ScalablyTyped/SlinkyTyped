package typingsSlinky.jestTypes.circusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jestTypes.jestTypesStrings.afterEach
  - typingsSlinky.jestTypes.jestTypesStrings.beforeEach
  - typingsSlinky.jestTypes.jestTypesStrings.afterAll
  - typingsSlinky.jestTypes.jestTypesStrings.beforeAll
*/
trait HookType extends js.Object

object HookType {
  @scala.inline
  def afterAll: typingsSlinky.jestTypes.jestTypesStrings.afterAll = this.cast("afterAll")
  @scala.inline
  def afterEach: typingsSlinky.jestTypes.jestTypesStrings.afterEach = this.cast("afterEach")
  @scala.inline
  def beforeAll: typingsSlinky.jestTypes.jestTypesStrings.beforeAll = this.cast("beforeAll")
  @scala.inline
  def beforeEach: typingsSlinky.jestTypes.jestTypesStrings.beforeEach = this.cast("beforeEach")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

