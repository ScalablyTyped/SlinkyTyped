package typingsSlinky.googleapisCommon.schemaMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleapisCommon.AnonFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FragmentResponse extends js.Object {
  var codeFragment: StringDictionary[AnonFragment]
}

object FragmentResponse {
  @scala.inline
  def apply(codeFragment: StringDictionary[AnonFragment]): FragmentResponse = {
    val __obj = js.Dynamic.literal(codeFragment = codeFragment.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FragmentResponse]
  }
}

