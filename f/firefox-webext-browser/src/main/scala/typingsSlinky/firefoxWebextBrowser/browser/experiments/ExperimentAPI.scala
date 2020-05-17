package typingsSlinky.firefoxWebextBrowser.browser.experiments

import typingsSlinky.firefoxWebextBrowser.anon.Events
import typingsSlinky.firefoxWebextBrowser.anon.Paths
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* experiments types */
@js.native
trait ExperimentAPI extends js.Object {
  var child: js.UndefOr[Paths] = js.native
  var parent: js.UndefOr[Events] = js.native
  var schema: ExperimentURL = js.native
}

object ExperimentAPI {
  @scala.inline
  def apply(schema: ExperimentURL): ExperimentAPI = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExperimentAPI]
  }
  @scala.inline
  implicit class ExperimentAPIOps[Self <: ExperimentAPI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSchema(value: ExperimentURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChild(value: Paths): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: Events): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
  }
  
}

