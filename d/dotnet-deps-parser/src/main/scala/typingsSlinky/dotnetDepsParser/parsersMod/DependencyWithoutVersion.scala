package typingsSlinky.dotnetDepsParser.parsersMod

import typingsSlinky.dotnetDepsParser.dotnetDepsParserBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyWithoutVersion extends js.Object {
  var name: String
  var withoutVersion: `true`
}

object DependencyWithoutVersion {
  @scala.inline
  def apply(name: String, withoutVersion: `true`): DependencyWithoutVersion = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], withoutVersion = withoutVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyWithoutVersion]
  }
}

