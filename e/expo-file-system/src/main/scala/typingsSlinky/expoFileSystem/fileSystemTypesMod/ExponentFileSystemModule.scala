package typingsSlinky.expoFileSystem.fileSystemTypesMod

import typingsSlinky.expoFileSystem.expoFileSystemStrings.ExponentFileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExponentFileSystemModule extends js.Object {
  val bundleDirectory: String | Null = js.native
  val bundledAssets: String | Null = js.native
  val cacheDirectory: String | Null = js.native
  val copyAsync: js.UndefOr[PlatformMethod] = js.native
  val deleteAsync: js.UndefOr[PlatformMethod] = js.native
  val documentDirectory: String | Null = js.native
  val downloadAsync: js.UndefOr[PlatformMethod] = js.native
  val downloadResumablePauseAsync: js.UndefOr[PlatformMethod] = js.native
  val downloadResumableStartAsync: js.UndefOr[PlatformMethod] = js.native
  val getContentUriAsync: js.UndefOr[PlatformMethod] = js.native
  val getFreeDiskStorageAsync: js.UndefOr[PlatformMethod] = js.native
  val getInfoAsync: js.UndefOr[PlatformMethod] = js.native
  val getTotalDiskCapacityAsync: js.UndefOr[PlatformMethod] = js.native
  val makeDirectoryAsync: js.UndefOr[PlatformMethod] = js.native
  val moveAsync: js.UndefOr[PlatformMethod] = js.native
  val name: ExponentFileSystem = js.native
  val readAsStringAsync: js.UndefOr[PlatformMethod] = js.native
  val readDirectoryAsync: js.UndefOr[PlatformMethod] = js.native
  var startObserving: js.UndefOr[js.Function0[Unit]] = js.native
  var stopObserving: js.UndefOr[js.Function0[Unit]] = js.native
  val writeAsStringAsync: js.UndefOr[PlatformMethod] = js.native
  def addListener(eventName: String): Unit = js.native
  def removeListeners(count: Double): Unit = js.native
}

object ExponentFileSystemModule {
  @scala.inline
  def apply(addListener: String => Unit, name: ExponentFileSystem, removeListeners: Double => Unit): ExponentFileSystemModule = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), name = name.asInstanceOf[js.Any], removeListeners = js.Any.fromFunction1(removeListeners))
    __obj.asInstanceOf[ExponentFileSystemModule]
  }
  @scala.inline
  implicit class ExponentFileSystemModuleOps[Self <: ExponentFileSystemModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddListener(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: ExponentFileSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveListeners(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListeners")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBundleDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBundleDirectoryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleDirectory")(null)
        ret
    }
    @scala.inline
    def withBundledAssets(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundledAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBundledAssetsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundledAssets")(null)
        ret
    }
    @scala.inline
    def withCacheDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheDirectoryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheDirectory")(null)
        ret
    }
    @scala.inline
    def withCopyAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCopyAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDeleteAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentDirectoryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentDirectory")(null)
        ret
    }
    @scala.inline
    def withDownloadAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDownloadAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadResumablePauseAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadResumablePauseAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDownloadResumablePauseAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadResumablePauseAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadResumableStartAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadResumableStartAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDownloadResumableStartAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadResumableStartAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withGetContentUriAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentUriAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetContentUriAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentUriAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFreeDiskStorageAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFreeDiskStorageAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetFreeDiskStorageAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFreeDiskStorageAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInfoAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInfoAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetInfoAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInfoAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTotalDiskCapacityAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTotalDiskCapacityAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetTotalDiskCapacityAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTotalDiskCapacityAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withMakeDirectoryAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeDirectoryAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMakeDirectoryAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeDirectoryAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMoveAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withReadAsStringAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readAsStringAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReadAsStringAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readAsStringAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withReadDirectoryAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readDirectoryAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReadDirectoryAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readDirectoryAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withStartObserving(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startObserving")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStartObserving: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startObserving")(js.undefined)
        ret
    }
    @scala.inline
    def withStopObserving(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopObserving")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStopObserving: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopObserving")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteAsStringAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeAsStringAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWriteAsStringAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeAsStringAsync")(js.undefined)
        ret
    }
  }
  
}

