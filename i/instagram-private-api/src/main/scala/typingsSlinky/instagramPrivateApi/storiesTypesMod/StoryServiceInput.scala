package typingsSlinky.instagramPrivateApi.storiesTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[typingsSlinky.instagramPrivateApi.storiesTypesMod.StoryServiceSeenInputItems]
  - typingsSlinky.instagramPrivateApi.storiesTypesMod.StoryServiceSeenInputReels
*/
trait StoryServiceInput extends js.Object

object StoryServiceInput {
  @scala.inline
  implicit def apply(value: js.Array[StoryServiceSeenInputItems]): StoryServiceInput = value.asInstanceOf[StoryServiceInput]
  @scala.inline
  implicit def apply(value: StoryServiceSeenInputReels): StoryServiceInput = value.asInstanceOf[StoryServiceInput]
}

