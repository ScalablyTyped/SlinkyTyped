package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdgeSearchEngine extends EdgeSearchEngineBase {
  /**
    * Allows IT admins to set a predefined default search engine for MDM-Controlled devices. Possible values are: default,
    * bing.
    */
  var edgeSearchEngineType: js.UndefOr[EdgeSearchEngineType] = js.native
}

object EdgeSearchEngine {
  @scala.inline
  def apply(): EdgeSearchEngine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeSearchEngine]
  }
  @scala.inline
  implicit class EdgeSearchEngineOps[Self <: EdgeSearchEngine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdgeSearchEngineType(value: EdgeSearchEngineType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeSearchEngineType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeSearchEngineType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeSearchEngineType")(js.undefined)
        ret
    }
  }
  
}

