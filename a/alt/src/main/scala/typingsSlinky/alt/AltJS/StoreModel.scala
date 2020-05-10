package typingsSlinky.alt.AltJS

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreModel[S] extends js.Object {
  var afterEach: js.UndefOr[js.Function2[/* payload */ js.Object, /* state */ js.Object, Unit]] = js.native
  var alt: js.UndefOr[Alt] = js.native
  var beforeEach: js.UndefOr[js.Function2[/* payload */ js.Object, /* state */ js.Object, Unit]] = js.native
  //Actions
  var bindAction: js.UndefOr[js.Function2[/* action */ Action[_], /* handler */ ActionHandler, Unit]] = js.native
  var bindActions: js.UndefOr[js.Function1[/* actions */ ActionsClass, Unit]] = js.native
  var bindListeners: js.UndefOr[js.Function1[/* config */ StringDictionary[Action[_] | Actions], Unit]] = js.native
  // TODO: Embed dispatcher interface in def
  var dispatcher: js.UndefOr[js.Any] = js.native
  var displayName: js.UndefOr[String] = js.native
  var emitChange: js.UndefOr[js.Function0[Unit]] = js.native
  var exportAsync: js.UndefOr[js.Function1[/* source */ Source, Unit]] = js.native
  //Methods/Listeners
  var exportPublicMethods: js.UndefOr[js.Function1[/* exportConfig */ js.Any, Unit]] = js.native
  //instance
  var getInstance: js.UndefOr[js.Function0[AltStore[S]]] = js.native
  var getState: js.UndefOr[js.Function0[S]] = js.native
  var observe: js.UndefOr[js.Function1[/* alt */ Alt, _]] = js.native
  var on: js.UndefOr[js.Function2[/* event */ lifeCycleEvents, /* callback */ js.Function0[_], Unit]] = js.native
  var onDeserialize: js.UndefOr[js.Function1[/* fn */ js.Function1[/* data */ js.Any, _], Unit]] = js.native
  //events
  var onSerialize: js.UndefOr[js.Function1[/* fn */ js.Function1[/* data */ js.Any, _], Unit]] = js.native
  var otherwise: js.UndefOr[js.Function2[/* data */ js.Any, /* action */ Action[_], Unit]] = js.native
  var preventDefault: js.UndefOr[js.Function0[Unit]] = js.native
  var reduce: js.UndefOr[js.Function2[/* state */ js.Any, /* config */ StoreReduce, js.Object]] = js.native
  var registerAsync: js.UndefOr[js.Function1[/* datasource */ Source, Unit]] = js.native
  //state
  var setState: js.UndefOr[
    (js.Function1[/* state */ S, Unit]) with (js.Function1[/* stateFn */ js.Function2[/* currentState */ S, /* nextState */ S, S], Unit])
  ] = js.native
  var waitFor: js.UndefOr[
    (js.Function1[/* store */ AltStore[_], Unit]) with (js.Function1[/* storeOrStores */ AltStore[_] | js.Array[AltStore[_]], Unit])
  ] = js.native
}

object StoreModel {
  @scala.inline
  def apply[S](): StoreModel[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreModel[S]]
  }
  @scala.inline
  implicit class StoreModelOps[Self[s] <: StoreModel[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withAfterEach(value: (/* payload */ js.Object, /* state */ js.Object) => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterEach")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterEach: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterEach")(js.undefined)
        ret
    }
    @scala.inline
    def withAlt(value: Alt): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlt: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeEach(value: (/* payload */ js.Object, /* state */ js.Object) => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEach")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeEach: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEach")(js.undefined)
        ret
    }
    @scala.inline
    def withBindAction(value: (/* action */ Action[_], /* handler */ ActionHandler) => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindAction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBindAction: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindAction")(js.undefined)
        ret
    }
    @scala.inline
    def withBindActions(value: /* actions */ ActionsClass => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindActions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBindActions: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindActions")(js.undefined)
        ret
    }
    @scala.inline
    def withBindListeners(value: /* config */ StringDictionary[Action[_] | Actions] => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindListeners")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBindListeners: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindListeners")(js.undefined)
        ret
    }
    @scala.inline
    def withDispatcher(value: js.Any): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDispatcher: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatcher")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEmitChange(value: () => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutEmitChange: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitChange")(js.undefined)
        ret
    }
    @scala.inline
    def withExportAsync(value: /* source */ Source => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExportAsync: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withExportPublicMethods(value: /* exportConfig */ js.Any => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportPublicMethods")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExportPublicMethods: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportPublicMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInstance(value: () => AltStore[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInstance: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(js.undefined)
        ret
    }
    @scala.inline
    def withGetState(value: () => S): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetState: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.undefined)
        ret
    }
    @scala.inline
    def withObserve(value: /* alt */ Alt => _): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutObserve: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observe")(js.undefined)
        ret
    }
    @scala.inline
    def withOn(value: (/* event */ lifeCycleEvents, /* callback */ js.Function0[_]) => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOn: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDeserialize(value: /* fn */ js.Function1[/* data */ js.Any, _] => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeserialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDeserialize: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeserialize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSerialize(value: /* fn */ js.Function1[/* data */ js.Any, _] => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSerialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSerialize: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSerialize")(js.undefined)
        ret
    }
    @scala.inline
    def withOtherwise(value: (/* data */ js.Any, /* action */ Action[_]) => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherwise")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOtherwise: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherwise")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDefault(value: () => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPreventDefault: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withReduce(value: (/* state */ js.Any, /* config */ StoreReduce) => js.Object): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReduce: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisterAsync(value: /* datasource */ Source => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRegisterAsync: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withSetState(
      value: (js.Function1[/* state */ S, Unit]) with (js.Function1[/* stateFn */ js.Function2[/* currentState */ S, /* nextState */ S, S], Unit])
    ): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetState: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setState")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitFor(
      value: (js.Function1[/* store */ AltStore[_], Unit]) with (js.Function1[/* storeOrStores */ AltStore[_] | js.Array[AltStore[_]], Unit])
    ): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitFor: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitFor")(js.undefined)
        ret
    }
  }
  
}

