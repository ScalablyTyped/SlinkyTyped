package typingsSlinky.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class TopicBuilderMutableBuilder[Self <: TopicBuilder[_], Topic] (val x: Self with TopicBuilder[Topic]) extends AnyVal {
    
    @scala.inline
    def setWithTopicId(value: Double => TopicBuilder[Topic]): Self = StObject.set(x, "withTopicId", js.Any.fromFunction1(value))
  }
}
