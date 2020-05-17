package typingsSlinky.reactFilepond.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactFilepond.mod.ActualFileObject
import typingsSlinky.reactFilepond.mod.FetchServerConfigFunction
import typingsSlinky.reactFilepond.mod.LoadServerConfigFunction
import typingsSlinky.reactFilepond.mod.ProcessServerConfigFunction
import typingsSlinky.reactFilepond.mod.ProgressServerConfigFunction
import typingsSlinky.reactFilepond.mod.RestoreServerConfigFunction
import typingsSlinky.reactFilepond.mod.RevertServerConfigFunction
import typingsSlinky.reactFilepond.mod.ServerUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fetch extends js.Object {
  var fetch: js.UndefOr[String | ServerUrl | FetchServerConfigFunction] = js.native
  var load: js.UndefOr[String | ServerUrl | LoadServerConfigFunction] = js.native
  var process: js.UndefOr[String | ServerUrl | ProcessServerConfigFunction] = js.native
  var restore: js.UndefOr[String | ServerUrl | RestoreServerConfigFunction] = js.native
  var revert: js.UndefOr[String | ServerUrl | RevertServerConfigFunction] = js.native
}

object Fetch {
  @scala.inline
  def apply(): Fetch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fetch]
  }
  @scala.inline
  implicit class FetchOps[Self <: Fetch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFetchFunction6(
      value: (/* url */ String, /* load */ js.Function1[/* file */ ActualFileObject, Unit], /* error */ js.Function1[/* errorText */ String, Unit], /* progress */ ProgressServerConfigFunction, /* abort */ js.Function0[Unit], /* headers */ js.Function1[/* headersString */ String, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withFetch(value: String | ServerUrl | FetchServerConfigFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadFunction6(
      value: (/* source */ js.Any, /* load */ js.Function1[/* file */ ActualFileObject, Unit], /* error */ js.Function1[/* errorText */ String, Unit], /* progress */ ProgressServerConfigFunction, /* abort */ js.Function0[Unit], /* headers */ js.Function1[/* headersString */ String, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withLoad(value: String | ServerUrl | LoadServerConfigFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessFunction7(
      value: (/* fieldName */ String, /* file */ ActualFileObject, /* metadata */ StringDictionary[js.Any], /* load */ js.Function1[/* p */ String | StringDictionary[js.Any], Unit], /* error */ js.Function1[/* errorText */ String, Unit], /* progress */ ProgressServerConfigFunction, /* abort */ js.Function0[Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withProcess(value: String | ServerUrl | ProcessServerConfigFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(js.undefined)
        ret
    }
    @scala.inline
    def withRestoreFunction6(
      value: (/* uniqueFileId */ js.Any, /* load */ js.Function1[/* file */ ActualFileObject, Unit], /* error */ js.Function1[/* errorText */ String, Unit], /* progress */ ProgressServerConfigFunction, /* abort */ js.Function0[Unit], /* headers */ js.Function1[/* headersString */ String, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withRestore(value: String | ServerUrl | RestoreServerConfigFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(js.undefined)
        ret
    }
    @scala.inline
    def withRevertFunction3(
      value: (/* uniqueFieldId */ js.Any, /* load */ js.Function0[Unit], /* error */ js.Function1[/* errorText */ String, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRevert(value: String | ServerUrl | RevertServerConfigFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(js.undefined)
        ret
    }
  }
  
}

