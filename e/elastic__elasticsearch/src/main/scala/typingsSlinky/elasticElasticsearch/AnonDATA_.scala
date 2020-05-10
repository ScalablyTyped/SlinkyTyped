package typingsSlinky.elasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDATA_ extends js.Object {
  var DATA: String = js.native
  var INGEST: String = js.native
  var MASTER: String = js.native
  var ML: String = js.native
}

object AnonDATA_ {
  @scala.inline
  def apply(DATA: String, INGEST: String, MASTER: String, ML: String): AnonDATA_ = {
    val __obj = js.Dynamic.literal(DATA = DATA.asInstanceOf[js.Any], INGEST = INGEST.asInstanceOf[js.Any], MASTER = MASTER.asInstanceOf[js.Any], ML = ML.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDATA_]
  }
  @scala.inline
  implicit class AnonDATA_Ops[Self <: AnonDATA_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDATA(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DATA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINGEST(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INGEST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMASTER(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MASTER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ML")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

