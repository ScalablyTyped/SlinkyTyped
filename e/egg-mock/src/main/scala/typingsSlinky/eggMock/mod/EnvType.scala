package typingsSlinky.eggMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.eggMock.eggMockStrings.default
  - typingsSlinky.eggMock.eggMockStrings.test
  - typingsSlinky.eggMock.eggMockStrings.prod
  - typingsSlinky.eggMock.eggMockStrings.local
  - typingsSlinky.eggMock.eggMockStrings.unittest
*/
trait EnvType extends js.Object

object EnvType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsSlinky.eggMock.eggMockStrings.default = this.cast("default")
  @scala.inline
  def local: typingsSlinky.eggMock.eggMockStrings.local = this.cast("local")
  @scala.inline
  def prod: typingsSlinky.eggMock.eggMockStrings.prod = this.cast("prod")
  @scala.inline
  def test: typingsSlinky.eggMock.eggMockStrings.test = this.cast("test")
  @scala.inline
  def unittest: typingsSlinky.eggMock.eggMockStrings.unittest = this.cast("unittest")
}

