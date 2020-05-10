package typingsSlinky.elasticElasticsearch

import typingsSlinky.elasticElasticsearch.connectionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAborted[C] extends js.Object {
  var aborted: Boolean = js.native
  var attempts: Double = js.native
  var connection: default = js.native
  var context: C = js.native
  var name: String = js.native
  var request: AnonOptions = js.native
  var sniff: js.UndefOr[AnonHosts] = js.native
}

object AnonAborted {
  @scala.inline
  def apply[C](
    aborted: Boolean,
    attempts: Double,
    connection: default,
    context: C,
    name: String,
    request: AnonOptions
  ): AnonAborted[C] = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], attempts = attempts.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAborted[C]]
  }
  @scala.inline
  implicit class AnonAbortedOps[Self[c] <: AnonAborted[c], C] (val x: Self[C]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[C] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[C] with Other]
    @scala.inline
    def withAborted(value: Boolean): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aborted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttempts(value: Double): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection(value: default): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: C): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: AnonOptions): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSniff(value: AnonHosts): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sniff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSniff: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sniff")(js.undefined)
        ret
    }
  }
  
}

