package typingsSlinky.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tslint:disable:interface-name */
@js.native
trait IPAM extends js.Object {
  var Config: js.UndefOr[StringDictionary[String]] = js.native
  var Driver: String = js.native
  var Options: js.UndefOr[js.Array[StringDictionary[String]]] = js.native
}

object IPAM {
  @scala.inline
  def apply(Driver: String): IPAM = {
    val __obj = js.Dynamic.literal(Driver = Driver.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPAM]
  }
  @scala.inline
  implicit class IPAMOps[Self <: IPAM] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriver(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Driver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Config")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[StringDictionary[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(js.undefined)
        ret
    }
  }
  
}

