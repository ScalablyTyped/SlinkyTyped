package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreDefinitionVersion extends js.Object {
  /**
    * A list of cores in the core definition version.
    */
  var Cores: js.UndefOr[listOfCore] = js.native
}

object CoreDefinitionVersion {
  @scala.inline
  def apply(): CoreDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreDefinitionVersion]
  }
  @scala.inline
  implicit class CoreDefinitionVersionOps[Self <: CoreDefinitionVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCores(value: listOfCore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cores")(js.undefined)
        ret
    }
  }
  
}

