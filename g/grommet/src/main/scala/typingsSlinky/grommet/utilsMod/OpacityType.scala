package typingsSlinky.grommet.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grommet.grommetStrings.weak
  - typingsSlinky.grommet.grommetStrings.medium
  - typingsSlinky.grommet.grommetStrings.strong
  - java.lang.String
  - typingsSlinky.grommet.grommetBooleans.`true`
  - typingsSlinky.grommet.grommetBooleans.`false`
  - scala.Double
*/
trait OpacityType extends js.Object

object OpacityType {
  @scala.inline
  def weak: typingsSlinky.grommet.grommetStrings.weak = "weak".asInstanceOf[typingsSlinky.grommet.grommetStrings.weak]
  @scala.inline
  def medium: typingsSlinky.grommet.grommetStrings.medium = "medium".asInstanceOf[typingsSlinky.grommet.grommetStrings.medium]
  @scala.inline
  def strong: typingsSlinky.grommet.grommetStrings.strong = "strong".asInstanceOf[typingsSlinky.grommet.grommetStrings.strong]
  @scala.inline
  def `true`: typingsSlinky.grommet.grommetBooleans.`true` = true.asInstanceOf[typingsSlinky.grommet.grommetBooleans.`true`]
  @scala.inline
  def `false`: typingsSlinky.grommet.grommetBooleans.`false` = false.asInstanceOf[typingsSlinky.grommet.grommetBooleans.`false`]
  @scala.inline
  implicit def apply(value: Double): OpacityType = value.asInstanceOf[OpacityType]
  @scala.inline
  implicit def apply(value: String): OpacityType = value.asInstanceOf[OpacityType]
}

