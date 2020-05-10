package typingsSlinky.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeederConfig extends js.Object {
  var directory: js.UndefOr[String] = js.native
  var extension: js.UndefOr[String] = js.native
  var loadExtensions: js.UndefOr[js.Array[String]] = js.native
  var specific: js.UndefOr[String] = js.native
}

object SeederConfig {
  @scala.inline
  def apply(): SeederConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeederConfig]
  }
  @scala.inline
  implicit class SeederConfigOps[Self <: SeederConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(js.undefined)
        ret
    }
    @scala.inline
    def withExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecific(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specific")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecific: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specific")(js.undefined)
        ret
    }
  }
  
}

