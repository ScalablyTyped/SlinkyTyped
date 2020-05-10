package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudienceBuilder[Audience] extends DisplayBuilder[AudienceBuilder[Audience]] {
  def withAudience(userList: UserList): AudienceBuilder[Audience] = js.native
  def withAudienceId(audienceId: Double): AudienceBuilder[Audience] = js.native
  def withAudienceType(audienceType: AudienceType): AudienceBuilder[Audience] = js.native
}

object AudienceBuilder {
  @scala.inline
  def apply[Audience](
    build: () => AdWordsOperation[AudienceBuilder[Audience]],
    exclude: () => AdWordsOperation[AudienceBuilder[Audience]],
    withAudience: UserList => AudienceBuilder[Audience],
    withAudienceId: Double => AudienceBuilder[Audience],
    withAudienceType: AudienceType => AudienceBuilder[Audience],
    withCpc: Double => AudienceBuilder[Audience],
    withCpm: Double => AudienceBuilder[Audience]
  ): AudienceBuilder[Audience] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withAudience = js.Any.fromFunction1(withAudience), withAudienceId = js.Any.fromFunction1(withAudienceId), withAudienceType = js.Any.fromFunction1(withAudienceType), withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm))
    __obj.asInstanceOf[AudienceBuilder[Audience]]
  }
  @scala.inline
  implicit class AudienceBuilderOps[Self[audience] <: AudienceBuilder[audience], Audience] (val x: Self[Audience]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Audience] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Audience]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Audience] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Audience] with Other]
    @scala.inline
    def withWithAudience(value: UserList => AudienceBuilder[Audience]): Self[Audience] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withAudience")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithAudienceId(value: Double => AudienceBuilder[Audience]): Self[Audience] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withAudienceId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithAudienceType(value: AudienceType => AudienceBuilder[Audience]): Self[Audience] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withAudienceType")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

