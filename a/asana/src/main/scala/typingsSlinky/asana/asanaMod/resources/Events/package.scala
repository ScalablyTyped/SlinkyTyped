package typingsSlinky.asana.asanaMod.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Events {
  import typingsSlinky.std.Partial

  type EventProject = EventResource with Partial[typingsSlinky.asana.asanaMod.resources.Tasks.Type]
  type EventSection = EventSectionResource with Partial[typingsSlinky.asana.asanaMod.resources.Sections.Type]
  type EventStory = EventResource with Partial[typingsSlinky.asana.asanaMod.resources.Stories.Type]
  type EventTask = EventResource with Partial[typingsSlinky.asana.asanaMod.resources.Tasks.Type]
}
