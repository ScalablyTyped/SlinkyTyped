package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicBuilder[Topic] extends DisplayBuilder[TopicBuilder[Topic]] {
  def withTopicId(topicId: Double): TopicBuilder[Topic] = js.native
}

object TopicBuilder {
  @scala.inline
  def apply[Topic](
    build: () => AdWordsOperation[TopicBuilder[Topic]],
    exclude: () => AdWordsOperation[TopicBuilder[Topic]],
    withCpc: Double => TopicBuilder[Topic],
    withCpm: Double => TopicBuilder[Topic],
    withTopicId: Double => TopicBuilder[Topic]
  ): TopicBuilder[Topic] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm), withTopicId = js.Any.fromFunction1(withTopicId))
    __obj.asInstanceOf[TopicBuilder[Topic]]
  }
  @scala.inline
  implicit class TopicBuilderOps[Self[topic] <: TopicBuilder[topic], Topic] (val x: Self[Topic]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Topic] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Topic]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Topic] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Topic] with Other]
    @scala.inline
    def withWithTopicId(value: Double => TopicBuilder[Topic]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withTopicId")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

