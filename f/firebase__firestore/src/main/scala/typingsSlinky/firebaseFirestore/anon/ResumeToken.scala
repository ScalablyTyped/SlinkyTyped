package typingsSlinky.firebaseFirestore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResumeToken extends js.Object {
  var query: typingsSlinky.firebaseFirestore.coreQueryMod.Query
  var resumeToken: js.UndefOr[String] = js.undefined
}

object ResumeToken {
  @scala.inline
  def apply(query: typingsSlinky.firebaseFirestore.coreQueryMod.Query, resumeToken: String = null): ResumeToken = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (resumeToken != null) __obj.updateDynamic("resumeToken")(resumeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumeToken]
  }
}

