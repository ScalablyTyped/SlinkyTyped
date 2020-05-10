package typingsSlinky.azure

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictkey extends /* key */ StringDictionary[String] {
  var VersionEndpointEnvironmentName: String = js.native
}

object AnonDictkey {
  @scala.inline
  def apply(VersionEndpointEnvironmentName: String): AnonDictkey = {
    val __obj = js.Dynamic.literal(VersionEndpointEnvironmentName = VersionEndpointEnvironmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictkey]
  }
  @scala.inline
  implicit class AnonDictkeyOps[Self <: AnonDictkey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVersionEndpointEnvironmentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionEndpointEnvironmentName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

