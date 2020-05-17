package typingsSlinky.nextServer.typesMod

import typingsSlinky.nextServer.anon.BodyParser
import typingsSlinky.nextServer.nextServerStrings.hybrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageConfig extends js.Object {
  var amp: js.UndefOr[Boolean | hybrid] = js.native
  var api: js.UndefOr[BodyParser] = js.native
  var experimentalPrerender: js.UndefOr[Boolean] = js.native
}

object PageConfig {
  @scala.inline
  def apply(): PageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageConfig]
  }
  @scala.inline
  implicit class PageConfigOps[Self <: PageConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmp(value: Boolean | hybrid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amp")(js.undefined)
        ret
    }
    @scala.inline
    def withApi(value: BodyParser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(js.undefined)
        ret
    }
    @scala.inline
    def withExperimentalPrerender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalPrerender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimentalPrerender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalPrerender")(js.undefined)
        ret
    }
  }
  
}

