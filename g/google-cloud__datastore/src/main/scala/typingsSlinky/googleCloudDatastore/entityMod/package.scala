package typingsSlinky.googleCloudDatastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object entityMod {
  /**
    * DatastoreKeyPath is structured as [kind, identifier, kind, identifier, ...]
    * `kind` must be a string, `identifier` is a PathElement
    */
  type DatastoreKeyPath = js.Array[typingsSlinky.googleCloudDatastore.entityMod.PathElement]
  type KEY_SYMBOL = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Datastore.KEY */ js.Any
}
