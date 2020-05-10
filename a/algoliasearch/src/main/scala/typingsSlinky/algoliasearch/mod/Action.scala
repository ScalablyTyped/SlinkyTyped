package typingsSlinky.algoliasearch.mod

import typingsSlinky.algoliasearch.algoliasearchStrings.addObject
import typingsSlinky.algoliasearch.algoliasearchStrings.clear
import typingsSlinky.algoliasearch.algoliasearchStrings.delete
import typingsSlinky.algoliasearch.algoliasearchStrings.deleteObject
import typingsSlinky.algoliasearch.algoliasearchStrings.partialUpdateObject
import typingsSlinky.algoliasearch.algoliasearchStrings.partialUpdateObjectNoCreate
import typingsSlinky.algoliasearch.algoliasearchStrings.updateObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describe the action object used for batch operation
  */
@js.native
trait Action extends js.Object {
  /**
    * Type of the batch action
    */
  var action: addObject | updateObject | partialUpdateObject | partialUpdateObjectNoCreate | deleteObject | delete | clear = js.native
  /**
    * Name of the index where the bact will be performed
    */
  var indexName: String = js.native
}

object Action {
  @scala.inline
  def apply(
    action: addObject | updateObject | partialUpdateObject | partialUpdateObjectNoCreate | deleteObject | delete | clear,
    indexName: String
  ): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], indexName = indexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(
      value: addObject | updateObject | partialUpdateObject | partialUpdateObjectNoCreate | deleteObject | delete | clear
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

