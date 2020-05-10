package typingsSlinky.googleapis.booksV1Mod.booksV1

import typingsSlinky.googleapis.AnonBannerwithcontentcontainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDiscoveryclusters extends js.Object {
  var clusters: js.UndefOr[js.Array[AnonBannerwithcontentcontainer]] = js.native
  /**
    * Resorce type.
    */
  var kind: js.UndefOr[String] = js.native
  var totalClusters: js.UndefOr[Double] = js.native
}

object SchemaDiscoveryclusters {
  @scala.inline
  def apply(): SchemaDiscoveryclusters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiscoveryclusters]
  }
  @scala.inline
  implicit class SchemaDiscoveryclustersOps[Self <: SchemaDiscoveryclusters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusters(value: js.Array[AnonBannerwithcontentcontainer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusters")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalClusters(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalClusters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalClusters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalClusters")(js.undefined)
        ret
    }
  }
  
}

