package typingsSlinky.mapboxMapboxSdk.tilesetsMod

import typingsSlinky.mapboxMapboxSdk.AnonOwnerIdString
import typingsSlinky.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TilesetsService extends js.Object {
  def listTilesets(config: AnonOwnerIdString): MapiRequest = js.native
}

object TilesetsService {
  @scala.inline
  def apply(listTilesets: AnonOwnerIdString => MapiRequest): TilesetsService = {
    val __obj = js.Dynamic.literal(listTilesets = js.Any.fromFunction1(listTilesets))
    __obj.asInstanceOf[TilesetsService]
  }
  @scala.inline
  implicit class TilesetsServiceOps[Self <: TilesetsService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListTilesets(value: AnonOwnerIdString => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listTilesets")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

