package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists the media files. Is the layout for MediaListDef.
  *
  * Note: This struct is deprecated.
  */
@js.native
trait IMediaList extends js.Object {
  /**
    * Information about the list of media files.
    * In Qlik Sense Desktop, the media files are retrieved from:
    *
    * %userprofile%\Documents\Qlik\Sense\Content\Default
    * In Qlik Sense Enterprise, the media files are retrieved from:
    *
    * <installation_directory>\Qlik\Sense\Repository\Content\Default
    * The default installation directory is ProgramData.
    */
  var qItems: js.Array[IMediaListItem] = js.native
}

object IMediaList {
  @scala.inline
  def apply(qItems: js.Array[IMediaListItem]): IMediaList = {
    val __obj = js.Dynamic.literal(qItems = qItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaList]
  }
  @scala.inline
  implicit class IMediaListOps[Self <: IMediaList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQItems(value: js.Array[IMediaListItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

