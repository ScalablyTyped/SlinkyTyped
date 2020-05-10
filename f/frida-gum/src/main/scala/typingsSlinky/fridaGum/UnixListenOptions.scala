package typingsSlinky.fridaGum

import typingsSlinky.fridaGum.fridaGumStrings.unix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnixListenOptions
  extends BaseListenOptions
     with SocketListenOptions {
  /**
    * Address family.
    */
  var family: unix = js.native
  /**
    * UNIX socket path to listen on.
    */
  var path: String = js.native
  /**
    * Type of UNIX socket to listen on. Defaults to UnixSocketType.Path.
    */
  var `type`: js.UndefOr[UnixSocketType] = js.native
}

object UnixListenOptions {
  @scala.inline
  def apply(family: unix, path: String): UnixListenOptions = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnixListenOptions]
  }
  @scala.inline
  implicit class UnixListenOptionsOps[Self <: UnixListenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFamily(value: unix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: UnixSocketType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

