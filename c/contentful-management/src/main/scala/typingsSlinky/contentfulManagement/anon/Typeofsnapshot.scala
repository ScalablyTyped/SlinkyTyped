package typingsSlinky.contentfulManagement.anon

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import typingsSlinky.contentfulManagement.snapshotMod.Snapshot
import typingsSlinky.contentfulManagement.snapshotMod.SnapshotProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofsnapshot extends js.Object {
  
  def wrapSnapshot[T](_http: AxiosInstance, data: SnapshotProps[T]): Snapshot[T] = js.native
  
  def wrapSnapshotCollection[T](http: AxiosInstance, data: CollectionProp[SnapshotProps[T]]): Collection[Snapshot[T], SnapshotProps[T]] = js.native
}
object Typeofsnapshot {
  
  @scala.inline
  def apply(
    wrapSnapshot: (AxiosInstance, SnapshotProps[js.Any]) => Snapshot[js.Any],
    wrapSnapshotCollection: (AxiosInstance, CollectionProp[SnapshotProps[js.Any]]) => Collection[Snapshot[js.Any], SnapshotProps[js.Any]]
  ): Typeofsnapshot = {
    val __obj = js.Dynamic.literal(wrapSnapshot = js.Any.fromFunction2(wrapSnapshot), wrapSnapshotCollection = js.Any.fromFunction2(wrapSnapshotCollection))
    __obj.asInstanceOf[Typeofsnapshot]
  }
  
  @scala.inline
  implicit class TypeofsnapshotOps[Self <: Typeofsnapshot] (val x: Self) extends AnyVal {
    
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
    def setWrapSnapshot(value: (AxiosInstance, SnapshotProps[js.Any]) => Snapshot[js.Any]): Self = this.set("wrapSnapshot", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapSnapshotCollection(
      value: (AxiosInstance, CollectionProp[SnapshotProps[js.Any]]) => Collection[Snapshot[js.Any], SnapshotProps[js.Any]]
    ): Self = this.set("wrapSnapshotCollection", js.Any.fromFunction2(value))
  }
}
