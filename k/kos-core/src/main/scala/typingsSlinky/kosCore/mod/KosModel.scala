package typingsSlinky.kosCore.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.kosCore.anon.Payload
import typingsSlinky.kosCore.anon.PayloadParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KosModel[T] extends js.Object {
  var asyncs: StringDictionary[
    js.Function3[
      /* dispatch */ js.UndefOr[KosDispatch], 
      /* getState */ js.UndefOr[GetKosState[T]], 
      /* action */ js.UndefOr[Payload[T]], 
      Unit
    ]
  ] = js.native
  var getAsync: js.UndefOr[
    js.Function1[
      /* key */ String, 
      js.Function2[/* dispatch */ KosDispatch, /* getState */ js.UndefOr[GetKosState[_]], Unit]
    ]
  ] = js.native
  var initial: T = js.native
  var namespace: String = js.native
  var reducers: StringDictionary[js.Function2[/* state */ T, /* hasPayload */ Payload[T], Unit]] = js.native
  var setup: js.UndefOr[
    js.Function3[
      /* dispatch */ KosDispatch, 
      /* getState */ GetKosState[T], 
      /* action */ PayloadParam, 
      Unit
    ]
  ] = js.native
}

object KosModel {
  @scala.inline
  def apply[T](
    asyncs: StringDictionary[
      js.Function3[
        /* dispatch */ js.UndefOr[KosDispatch], 
        /* getState */ js.UndefOr[GetKosState[T]], 
        /* action */ js.UndefOr[Payload[T]], 
        Unit
      ]
    ],
    initial: T,
    namespace: String,
    reducers: StringDictionary[js.Function2[/* state */ T, /* hasPayload */ Payload[T], Unit]]
  ): KosModel[T] = {
    val __obj = js.Dynamic.literal(asyncs = asyncs.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], reducers = reducers.asInstanceOf[js.Any])
    __obj.asInstanceOf[KosModel[T]]
  }
  @scala.inline
  implicit class KosModelOps[Self[t] <: KosModel[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAsyncs(
      value: StringDictionary[
          js.Function3[
            /* dispatch */ js.UndefOr[KosDispatch], 
            /* getState */ js.UndefOr[GetKosState[T]], 
            /* action */ js.UndefOr[Payload[T]], 
            Unit
          ]
        ]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitial(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReducers(value: StringDictionary[js.Function2[/* state */ T, /* hasPayload */ Payload[T], Unit]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reducers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAsync(
      value: /* key */ String => js.Function2[/* dispatch */ KosDispatch, /* getState */ js.UndefOr[GetKosState[_]], Unit]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetAsync: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withSetup(
      value: (/* dispatch */ KosDispatch, /* getState */ GetKosState[T], /* action */ PayloadParam) => Unit
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSetup: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.undefined)
        ret
    }
  }
  
}

