package typingsSlinky.hapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vhost extends js.Object {
  /**
    * string added as prefix to any route path (must begin with '/'). If a plugin registers a child plugin the prefix is passed on to the child or is added in front of the child-specific prefix.
    */
  var prefix: String = js.native
  /**
    * virtual host string (or array of strings) applied to every route. The outer-most vhost overrides the any nested configuration.
    */
  var vhost: js.UndefOr[String | js.Array[String]] = js.native
}

object Vhost {
  @scala.inline
  def apply(prefix: String): Vhost = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vhost]
  }
  @scala.inline
  implicit class VhostOps[Self <: Vhost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVhost(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vhost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVhost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vhost")(js.undefined)
        ret
    }
  }
  
}

