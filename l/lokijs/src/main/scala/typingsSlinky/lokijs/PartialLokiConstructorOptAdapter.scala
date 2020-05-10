package typingsSlinky.lokijs

import typingsSlinky.lokijs.lokijsStrings.BROWSER
import typingsSlinky.lokijs.lokijsStrings.CORDOVA
import typingsSlinky.lokijs.lokijsStrings.NA
import typingsSlinky.lokijs.lokijsStrings.NATIVESCRIPT
import typingsSlinky.lokijs.lokijsStrings.NODEJS
import typingsSlinky.lokijs.lokijsStrings.destructured
import typingsSlinky.lokijs.lokijsStrings.fs
import typingsSlinky.lokijs.lokijsStrings.localStorage
import typingsSlinky.lokijs.lokijsStrings.memory
import typingsSlinky.lokijs.lokijsStrings.normal
import typingsSlinky.lokijs.lokijsStrings.pretty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<lokijs.LokiConstructorOptions> & std.Partial<lokijs.LokiConfigOptions> & std.Partial<lokijs.ThrottledSaveDrainOptions> */
@js.native
trait PartialLokiConstructorOptAdapter extends js.Object {
  var adapter: js.UndefOr[LokiPersistenceAdapter] = js.native
  var autoload: js.UndefOr[Boolean] = js.native
  var autoloadCallback: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.native
  var autosave: js.UndefOr[Boolean] = js.native
  var autosaveCallback: js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Any], Unit]] = js.native
  var autosaveInterval: js.UndefOr[String | Double] = js.native
  var destructureDelimiter: js.UndefOr[String] = js.native
  var env: js.UndefOr[NATIVESCRIPT | NODEJS | CORDOVA | BROWSER | NA] = js.native
  var persistenceMethod: js.UndefOr[fs | localStorage | memory] = js.native
  var recursiveWait: js.UndefOr[Boolean] = js.native
  var recursiveWaitLimit: js.UndefOr[Boolean] = js.native
  var recursiveWaitLimitDuration: js.UndefOr[Double] = js.native
  var serializationMethod: js.UndefOr[normal | pretty | destructured] = js.native
  var started: js.UndefOr[Double] = js.native
  var throttledSaves: js.UndefOr[Boolean] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object PartialLokiConstructorOptAdapter {
  @scala.inline
  def apply(): PartialLokiConstructorOptAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLokiConstructorOptAdapter]
  }
  @scala.inline
  implicit class PartialLokiConstructorOptAdapterOps[Self <: PartialLokiConstructorOptAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdapter(value: LokiPersistenceAdapter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdapter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoload")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoloadCallback(value: /* err */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoloadCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAutoloadCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoloadCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withAutosave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutosave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosave")(js.undefined)
        ret
    }
    @scala.inline
    def withAutosaveCallback(value: /* err */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosaveCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAutosaveCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosaveCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withAutosaveInterval(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosaveInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutosaveInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosaveInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withDestructureDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destructureDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestructureDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destructureDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: NATIVESCRIPT | NODEJS | CORDOVA | BROWSER | NA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistenceMethod(value: fs | localStorage | memory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistenceMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistenceMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistenceMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withRecursiveWait(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursiveWait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecursiveWait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursiveWait")(js.undefined)
        ret
    }
    @scala.inline
    def withRecursiveWaitLimit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursiveWaitLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecursiveWaitLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursiveWaitLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withRecursiveWaitLimitDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursiveWaitLimitDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecursiveWaitLimitDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursiveWaitLimitDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializationMethod(value: normal | pretty | destructured): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializationMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerializationMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializationMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withStarted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottledSaves(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttledSaves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottledSaves: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttledSaves")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

