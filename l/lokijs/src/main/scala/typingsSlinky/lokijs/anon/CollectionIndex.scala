package typingsSlinky.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionIndex extends js.Object {
  var collectionIndex: js.UndefOr[Double] = js.native
  var delimited: js.UndefOr[Boolean] = js.native
  var delimiter: js.UndefOr[String] = js.native
}

object CollectionIndex {
  @scala.inline
  def apply(): CollectionIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionIndex]
  }
  @scala.inline
  implicit class CollectionIndexOps[Self <: CollectionIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollectionIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimited(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimited")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
  }
  
}

