package typingsSlinky.algoliasearch.anon

import typingsSlinky.algoliasearch.algoliasearchStrings.contains
import typingsSlinky.algoliasearch.algoliasearchStrings.endsWith
import typingsSlinky.algoliasearch.algoliasearchStrings.is
import typingsSlinky.algoliasearch.algoliasearchStrings.startsWith
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anchoring extends js.Object {
  /**
    * Whether the pattern must match the beginning or the end of the query string, or both, or none.
    */
  var anchoring: js.UndefOr[is | startsWith | endsWith | contains] = js.native
  /**
    * Rule context (format: [A-Za-z0-9_-]+).
    * When specified, the rule is contextual and applies only when the same context is specified
    * at query time (using the ruleContexts parameter).
    * When absent, the rule is generic and always applies
    * (provided that its other conditions are met, of course).
    */
  var context: js.UndefOr[String] = js.native
  /**
    * Query pattern
    */
  var pattern: js.UndefOr[String] = js.native
}

object Anchoring {
  @scala.inline
  def apply(): Anchoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anchoring]
  }
  @scala.inline
  implicit class AnchoringOps[Self <: Anchoring] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchoring(value: is | startsWith | endsWith | contains): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchoring")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
  }
  
}

