package typingsSlinky.knockback.Knockback

import typingsSlinky.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** parameter of ko.observable constructor
	Options Hash: (option):
	key (String) — the name of the attribute.
	read (Function) — a function used to provide transform the attribute value before passing it to the caller. Signature: read()
	write (Function) — a function used to provide transform the value before passing it to the model set function. Signature: write(value)
	args (Array) — arguments to pass to the read and write functions (they can be ko.observables). Can be useful for passing arguments to a locale manager.
	localizer (Constructor) — a concrete kb.LocalizedObservable constructor for localization.
	default (Data|ko.observable) — the default value. Can be a value, string or ko.observable.
	path (String) — the path to the value (used to create related observables from the factory).
	store (kb.Store) — a store used to cache and share view models.
	factory (kb.Factory) — a factory used to create view models.
	options (Object) — a set of options merge into these options using _.defaults. Useful for extending options when deriving classes rather than merging them by hand.
	*/
@js.native
trait IObservableOptions extends js.Object {
  var args: js.UndefOr[js.Array[KnockoutObservable[_]]] = js.native
  var default: js.UndefOr[js.Any] = js.native
  var factory: js.UndefOr[js.Any] = js.native
  var key: String = js.native
  var localizer: js.UndefOr[LocalizedObservable] = js.native
  var options: js.UndefOr[js.Any] = js.native
  var path: js.UndefOr[String] = js.native
  var read: js.UndefOr[js.Function0[_]] = js.native
  var store: js.UndefOr[js.Any] = js.native
  var write: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
}

object IObservableOptions {
  @scala.inline
  def apply(key: String): IObservableOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObservableOptions]
  }
  @scala.inline
  implicit class IObservableOptionsOps[Self <: IObservableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgs(value: js.Array[KnockoutObservable[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withFactory(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalizer(value: LocalizedObservable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizer")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
    @scala.inline
    def withWrite(value: /* value */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.undefined)
        ret
    }
  }
  
}

