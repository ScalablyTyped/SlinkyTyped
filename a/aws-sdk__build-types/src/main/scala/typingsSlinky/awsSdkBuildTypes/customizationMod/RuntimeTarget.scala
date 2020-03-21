package typingsSlinky.awsSdkBuildTypes.customizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.node
  - typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.browser
  - typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.universal
*/
trait RuntimeTarget extends js.Object

object RuntimeTarget {
  @scala.inline
  def browser: typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.browser = this.cast("browser")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def node: typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.node = this.cast("node")
  @scala.inline
  def universal: typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.universal = this.cast("universal")
}

