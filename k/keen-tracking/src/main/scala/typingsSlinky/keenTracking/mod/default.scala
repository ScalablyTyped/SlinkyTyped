package typingsSlinky.keenTracking.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.keenTracking.anon.Created
import typingsSlinky.keenTracking.anon.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keen-tracking", JSImport.Default)
@js.native
class default protected () extends KeenTracking {
  def this(options: ProjectId) = this()
  /* CompleteClass */
  override def recordEvent(collectionName: String, event: js.Object): js.Promise[Created] = js.native
  /* CompleteClass */
  override def recordEvents(events: StringDictionary[js.Array[js.Object]]): js.Promise[StringDictionary[js.Array[Boolean]]] = js.native
}

