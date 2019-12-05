package typingsSlinky.atJupyterlabFilebrowser.libListingMod.DirListing

import typingsSlinky.atJupyterlabFilebrowser.atJupyterlabFilebrowserStrings.ascending
import typingsSlinky.atJupyterlabFilebrowser.atJupyterlabFilebrowserStrings.descending
import typingsSlinky.atJupyterlabFilebrowser.atJupyterlabFilebrowserStrings.last_modified
import typingsSlinky.atJupyterlabFilebrowser.atJupyterlabFilebrowserStrings.name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A sort state.
  */
trait ISortState extends js.Object {
  /**
    * The direction of sort.
    */
  var direction: ascending | descending
  /**
    * The sort key.
    */
  var key: name | last_modified
}

object ISortState {
  @scala.inline
  def apply(direction: ascending | descending, key: name | last_modified): ISortState = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISortState]
  }
}

