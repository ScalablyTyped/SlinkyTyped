package typingsSlinky.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hits extends js.Object {
  /**
    * A cursor that can be used to retrieve the next set of matching documents when you want to page through a large result set.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * The total number of documents that match the search request.
    */
  var found: js.UndefOr[Long] = js.native
  /**
    * A document that matches the search request.
    */
  var hit: js.UndefOr[HitList] = js.native
  /**
    * The index of the first matching document.
    */
  var start: js.UndefOr[Long] = js.native
}

object Hits {
  @scala.inline
  def apply(): Hits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hits]
  }
  @scala.inline
  implicit class HitsOps[Self <: Hits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withFound(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("found")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("found")(js.undefined)
        ret
    }
    @scala.inline
    def withHit(value: HitList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hit")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

