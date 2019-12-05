package typingsSlinky.eggDashMock.eggDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eggDashMock.eggDashMockStrings.default
  - typings.eggDashMock.eggDashMockStrings.test
  - typings.eggDashMock.eggDashMockStrings.prod
  - typings.eggDashMock.eggDashMockStrings.local
  - typings.eggDashMock.eggDashMockStrings.unittest
*/
trait EnvType extends js.Object

object EnvType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsSlinky.eggDashMock.eggDashMockStrings.default = this.cast("default")
  @scala.inline
  def local: typingsSlinky.eggDashMock.eggDashMockStrings.local = this.cast("local")
  @scala.inline
  def prod: typingsSlinky.eggDashMock.eggDashMockStrings.prod = this.cast("prod")
  @scala.inline
  def test: typingsSlinky.eggDashMock.eggDashMockStrings.test = this.cast("test")
  @scala.inline
  def unittest: typingsSlinky.eggDashMock.eggDashMockStrings.unittest = this.cast("unittest")
}

