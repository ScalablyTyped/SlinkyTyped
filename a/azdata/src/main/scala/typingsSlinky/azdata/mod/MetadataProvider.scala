package typingsSlinky.azdata.mod

import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataProvider extends DataProvider {
  def getDatabases(connectionUri: String): Thenable[js.Array[String]] = js.native
  def getMetadata(connectionUri: String): Thenable[ProviderMetadata] = js.native
  def getTableInfo(connectionUri: String, metadata: ObjectMetadata): Thenable[js.Array[ColumnMetadata]] = js.native
  def getViewInfo(connectionUri: String, metadata: ObjectMetadata): Thenable[js.Array[ColumnMetadata]] = js.native
}

object MetadataProvider {
  @scala.inline
  def apply(
    getDatabases: String => Thenable[js.Array[String]],
    getMetadata: String => Thenable[ProviderMetadata],
    getTableInfo: (String, ObjectMetadata) => Thenable[js.Array[ColumnMetadata]],
    getViewInfo: (String, ObjectMetadata) => Thenable[js.Array[ColumnMetadata]],
    providerId: String
  ): MetadataProvider = {
    val __obj = js.Dynamic.literal(getDatabases = js.Any.fromFunction1(getDatabases), getMetadata = js.Any.fromFunction1(getMetadata), getTableInfo = js.Any.fromFunction2(getTableInfo), getViewInfo = js.Any.fromFunction2(getViewInfo), providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataProvider]
  }
  @scala.inline
  implicit class MetadataProviderOps[Self <: MetadataProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDatabases(value: String => Thenable[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDatabases")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMetadata(value: String => Thenable[ProviderMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetadata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTableInfo(value: (String, ObjectMetadata) => Thenable[js.Array[ColumnMetadata]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTableInfo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetViewInfo(value: (String, ObjectMetadata) => Thenable[js.Array[ColumnMetadata]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewInfo")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

