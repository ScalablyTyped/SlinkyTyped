package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModuleOptions extends js.Object {
  /** 
    * @deprecated
    * A callback function that is fired after the module has loaded.
    * It is recommended that the Bing Maps key be set as a URL parameter of the Bing Maps script reference.
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.native
  /** A Bing Maps key that is used with the module when the module is loaded without a map. */
  var credentials: js.UndefOr[String] = js.native
  /** A function that is called if there is an error loading the module. */
  var errorCallback: js.UndefOr[js.Function0[Unit]] = js.native
}

object IModuleOptions {
  @scala.inline
  def apply(): IModuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModuleOptions]
  }
  @scala.inline
  implicit class IModuleOptionsOps[Self <: IModuleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentials(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutErrorCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCallback")(js.undefined)
        ret
    }
  }
  
}

