package typingsSlinky.analyticsNode.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeVersion
  extends /* key */ StringDictionary[js.Any] {
  var nodeVersion: String = js.native
}

object NodeVersion {
  @scala.inline
  def apply(nodeVersion: String): NodeVersion = {
    val __obj = js.Dynamic.literal(nodeVersion = nodeVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeVersion]
  }
  @scala.inline
  implicit class NodeVersionOps[Self <: NodeVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodeVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

