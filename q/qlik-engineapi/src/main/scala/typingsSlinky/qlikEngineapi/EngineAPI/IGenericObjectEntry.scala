package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericObjectEntry...
  */
@js.native
trait IGenericObjectEntry extends js.Object {
  /**
    * Information about the children of the generic object.
    */
  var qChildren: js.Array[IGenericObjectEntry] = js.native
  /**
    * Reference to a bookmark/snapshot that is embedded in the generic object.
    */
  var qEmbeddedSnapshotRef: IGenericBookmarkEntry = js.native
  /**
    * Information about the generic object properties.
    */
  var qProperty: IGenericObjectProperties = js.native
}

object IGenericObjectEntry {
  @scala.inline
  def apply(
    qChildren: js.Array[IGenericObjectEntry],
    qEmbeddedSnapshotRef: IGenericBookmarkEntry,
    qProperty: IGenericObjectProperties
  ): IGenericObjectEntry = {
    val __obj = js.Dynamic.literal(qChildren = qChildren.asInstanceOf[js.Any], qEmbeddedSnapshotRef = qEmbeddedSnapshotRef.asInstanceOf[js.Any], qProperty = qProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericObjectEntry]
  }
  @scala.inline
  implicit class IGenericObjectEntryOps[Self <: IGenericObjectEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQChildren(value: js.Array[IGenericObjectEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQEmbeddedSnapshotRef(value: IGenericBookmarkEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qEmbeddedSnapshotRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQProperty(value: IGenericObjectProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qProperty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

