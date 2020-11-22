package typingsSlinky.contentfulManagement.snapshotMod

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/entities/snapshot", "wrapSnapshotCollection")
@js.native
object wrapSnapshotCollection extends js.Object {
  
  def apply[T](http: AxiosInstance, data: CollectionProp[SnapshotProps[T]]): Collection[Snapshot[T], SnapshotProps[T]] = js.native
}
