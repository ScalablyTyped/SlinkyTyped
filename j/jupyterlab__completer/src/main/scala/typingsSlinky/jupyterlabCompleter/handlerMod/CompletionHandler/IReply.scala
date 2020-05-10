package typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler

import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reply to a completion request.
  */
@js.native
trait IReply extends js.Object {
  /**
    * The end index for the substring being replaced by completion.
    */
  var end: Double = js.native
  /**
    * A list of matching completion strings.
    */
  var matches: js.Array[String] = js.native
  /**
    * Any metadata that accompanies the completion reply.
    */
  var metadata: ReadonlyJSONObject = js.native
  /**
    * The starting index for the substring being replaced by completion.
    */
  var start: Double = js.native
}

object IReply {
  @scala.inline
  def apply(end: Double, matches: js.Array[String], metadata: ReadonlyJSONObject, start: Double): IReply = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReply]
  }
  @scala.inline
  implicit class IReplyOps[Self <: IReply] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatches(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: ReadonlyJSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

