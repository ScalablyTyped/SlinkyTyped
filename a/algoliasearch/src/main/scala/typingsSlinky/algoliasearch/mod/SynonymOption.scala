package typingsSlinky.algoliasearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes option used when making operation on synonyms
  */
@js.native
trait SynonymOption extends js.Object {
  /**
    * You can forward all settings updates to the replicas of an index
    */
  var forwardToReplicas: js.UndefOr[Boolean] = js.native
  /**
    * Replace all existing synonyms on the index with the content of the batch
    */
  var replaceExistingSynonyms: js.UndefOr[Boolean] = js.native
}

object SynonymOption {
  @scala.inline
  def apply(): SynonymOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynonymOption]
  }
  @scala.inline
  implicit class SynonymOptionOps[Self <: SynonymOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForwardToReplicas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardToReplicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardToReplicas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardToReplicas")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceExistingSynonyms(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceExistingSynonyms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceExistingSynonyms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceExistingSynonyms")(js.undefined)
        ret
    }
  }
  
}

