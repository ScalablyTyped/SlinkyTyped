package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.ionicStrings.yarn_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionic.ionicStrings.yarn_
  - typingsSlinky.ionic.ionicStrings.npm
*/
trait NpmClient extends js.Object

object NpmClient {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def npm: typingsSlinky.ionic.ionicStrings.npm = this.cast("npm")
  @scala.inline
  def yarn: yarn_ = this.cast("yarn")
}

