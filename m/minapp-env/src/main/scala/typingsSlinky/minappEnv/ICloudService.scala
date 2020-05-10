package typingsSlinky.minappEnv

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICloudService extends js.Object {
  var name: java.lang.String = js.native
  def getAPIs(): StringDictionary[IAPIFunction[_, _]] = js.native
}

object ICloudService {
  @scala.inline
  def apply(getAPIs: () => StringDictionary[IAPIFunction[_, _]], name: java.lang.String): ICloudService = {
    val __obj = js.Dynamic.literal(getAPIs = js.Any.fromFunction0(getAPIs), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICloudService]
  }
  @scala.inline
  implicit class ICloudServiceOps[Self <: ICloudService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAPIs(value: () => StringDictionary[IAPIFunction[_, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAPIs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

