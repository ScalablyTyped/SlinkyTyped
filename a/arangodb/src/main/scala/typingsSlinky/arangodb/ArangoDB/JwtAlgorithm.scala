package typingsSlinky.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arangodb.arangodbStrings.HS512
  - typingsSlinky.arangodb.arangodbStrings.HS384
  - typingsSlinky.arangodb.arangodbStrings.HS256
*/
trait JwtAlgorithm extends js.Object

object JwtAlgorithm {
  @scala.inline
  def HS256: typingsSlinky.arangodb.arangodbStrings.HS256 = this.cast("HS256")
  @scala.inline
  def HS384: typingsSlinky.arangodb.arangodbStrings.HS384 = this.cast("HS384")
  @scala.inline
  def HS512: typingsSlinky.arangodb.arangodbStrings.HS512 = this.cast("HS512")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

