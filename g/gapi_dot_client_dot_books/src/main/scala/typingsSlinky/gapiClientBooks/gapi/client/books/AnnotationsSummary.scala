package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClientBooks.anon.LayerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsSummary extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var layers: js.UndefOr[js.Array[LayerId]] = js.native
}

object AnnotationsSummary {
  @scala.inline
  def apply(): AnnotationsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsSummary]
  }
  @scala.inline
  implicit class AnnotationsSummaryOps[Self <: AnnotationsSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLayers(value: js.Array[LayerId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
  }
  
}

