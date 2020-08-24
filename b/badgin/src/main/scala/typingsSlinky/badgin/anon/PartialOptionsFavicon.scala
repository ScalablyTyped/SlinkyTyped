package typingsSlinky.badgin.anon

import typingsSlinky.badgin.faviconMod.Options
import typingsSlinky.badgin.mod.Method
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<badgin.badgin.Options> */
@js.native
trait PartialOptionsFavicon extends js.Object {
  var favicon: js.UndefOr[Partial[Options]] = js.native
  var method: js.UndefOr[Method] = js.native
  var title: js.UndefOr[Partial[typingsSlinky.badgin.titleMod.Options]] = js.native
}

object PartialOptionsFavicon {
  @scala.inline
  def apply(): PartialOptionsFavicon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsFavicon]
  }
  @scala.inline
  implicit class PartialOptionsFaviconOps[Self <: PartialOptionsFavicon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFavicon(value: Partial[Options]): Self = this.set("favicon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFavicon: Self = this.set("favicon", js.undefined)
    @scala.inline
    def setMethod(value: Method): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setTitle(value: Partial[typingsSlinky.badgin.titleMod.Options]): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

