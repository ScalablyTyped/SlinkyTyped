package typingsSlinky.nextServer

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroups extends js.Object {
  var groups: StringDictionary[Double]
  var re: js.RegExp
}

object AnonGroups {
  @scala.inline
  def apply(groups: StringDictionary[Double], re: js.RegExp): AnonGroups = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], re = re.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGroups]
  }
}

