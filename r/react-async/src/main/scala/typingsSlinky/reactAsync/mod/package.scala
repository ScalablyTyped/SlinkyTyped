package typingsSlinky.reactAsync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def default: typingsSlinky.reactAsync.mod.GenericAsync = typingsSlinky.reactAsync.mod.^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[typingsSlinky.reactAsync.mod.GenericAsync]
  
  @scala.inline
  def Async: typingsSlinky.reactAsync.mod.GenericAsync = typingsSlinky.reactAsync.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Async").asInstanceOf[typingsSlinky.reactAsync.mod.GenericAsync]
  type Async[T] = slinky.core.ReactComponentClass[typingsSlinky.reactAsync.mod.AsyncProps[T]]
  
  type AsyncChildren[T] = (js.Function1[
    /* state */ typingsSlinky.reactAsync.mod.AsyncState[T, typingsSlinky.reactAsync.mod.AbstractState[T]], 
    slinky.core.facade.ReactElement
  ]) | slinky.core.facade.ReactElement
  
  type AsyncFulfilled[T, S] = S with typingsSlinky.reactAsync.anon.Data[T]
  
  type AsyncInitial[T, S] = S with typingsSlinky.reactAsync.anon.Error
  
  type AsyncPending[T, S] = S with typingsSlinky.reactAsync.anon.FinishedAt[T]
  
  type AsyncRejected[T, S] = S with typingsSlinky.reactAsync.anon.IsFulfilled[T]
  
  type AsyncState[T, S /* <: typingsSlinky.reactAsync.mod.AbstractState[T] */] = typingsSlinky.reactAsync.mod.BaseAsyncState[T, S]
  
  type BaseAsyncState[T, S] = (typingsSlinky.reactAsync.mod.AsyncInitial[T, S]) | (typingsSlinky.reactAsync.mod.AsyncPending[T, S]) | (typingsSlinky.reactAsync.mod.AsyncFulfilled[T, S]) | (typingsSlinky.reactAsync.mod.AsyncRejected[T, S])
  
  type DeferFn[T] = js.Function3[
    /* args */ js.Array[js.Any], 
    /* props */ typingsSlinky.reactAsync.mod.AsyncProps[T], 
    /* controller */ org.scalajs.dom.experimental.AbortController, 
    js.Promise[T]
  ]
  
  type FulfilledChildren[T] = (js.Function2[
    /* data */ T, 
    /* state */ typingsSlinky.reactAsync.mod.AsyncFulfilled[T, typingsSlinky.reactAsync.mod.AbstractState[T]], 
    slinky.core.facade.ReactElement
  ]) | slinky.core.facade.ReactElement
  
  type GenericAsync = (org.scalablytyped.runtime.Instantiable0[
    slinky.core.ReactComponentClass[typingsSlinky.reactAsync.mod.AsyncProps[js.Object]]
  ]) with typingsSlinky.reactAsync.anon.Fulfilled
  
  type InitialChildren[T] = (js.Function1[
    /* state */ typingsSlinky.reactAsync.mod.AsyncInitial[T, typingsSlinky.reactAsync.mod.AbstractState[T]], 
    slinky.core.facade.ReactElement
  ]) | slinky.core.facade.ReactElement
  
  /* Inlined react-async.react-async.AbstractAction['meta'] */
  type Meta = typingsSlinky.reactAsync.reactAsyncStrings.counter
  
  type PendingChildren[T] = (js.Function1[
    /* state */ typingsSlinky.reactAsync.mod.AsyncPending[T, typingsSlinky.reactAsync.mod.AbstractState[T]], 
    slinky.core.facade.ReactElement
  ]) | slinky.core.facade.ReactElement
  
  type PromiseFn[T] = js.Function2[
    /* props */ typingsSlinky.reactAsync.mod.AsyncProps[T], 
    /* controller */ org.scalajs.dom.experimental.AbortController, 
    js.Promise[T]
  ]
  
  type ReducerAsyncState[T] = typingsSlinky.reactAsync.mod.BaseAsyncState[T, typingsSlinky.reactAsync.mod.ReducerBaseState[T]]
  
  type RejectedChildren[T] = (js.Function2[
    /* error */ js.Error, 
    /* state */ typingsSlinky.reactAsync.mod.AsyncRejected[T, typingsSlinky.reactAsync.mod.AbstractState[T]], 
    slinky.core.facade.ReactElement
  ]) | slinky.core.facade.ReactElement
  
  type SettledChildren[T] = (js.Function1[
    /* state */ (typingsSlinky.reactAsync.mod.AsyncFulfilled[T, typingsSlinky.reactAsync.mod.AbstractState[T]]) | (typingsSlinky.reactAsync.mod.AsyncRejected[T, typingsSlinky.reactAsync.mod.AbstractState[T]]), 
    slinky.core.facade.ReactElement
  ]) | slinky.core.facade.ReactElement
  
  /**
    * createInstance allows you to create instances of Async that are bound to a specific promise.
    * A unique instance also uses its own React context for better nesting capability.
    */
  @scala.inline
  def createInstance[T](): typingsSlinky.reactAsync.mod.AsyncConstructor[T] = typingsSlinky.reactAsync.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[typingsSlinky.reactAsync.mod.AsyncConstructor[T]]
  @scala.inline
  def createInstance[T](defaultOptions: js.UndefOr[scala.Nothing], displayName: java.lang.String): typingsSlinky.reactAsync.mod.AsyncConstructor[T] = (typingsSlinky.reactAsync.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(defaultOptions.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactAsync.mod.AsyncConstructor[T]]
  @scala.inline
  def createInstance[T](defaultOptions: typingsSlinky.reactAsync.mod.AsyncProps[T]): typingsSlinky.reactAsync.mod.AsyncConstructor[T] = typingsSlinky.reactAsync.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(defaultOptions.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactAsync.mod.AsyncConstructor[T]]
  @scala.inline
  def createInstance[T](defaultOptions: typingsSlinky.reactAsync.mod.AsyncProps[T], displayName: java.lang.String): typingsSlinky.reactAsync.mod.AsyncConstructor[T] = (typingsSlinky.reactAsync.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(defaultOptions.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactAsync.mod.AsyncConstructor[T]]
  
  @scala.inline
  def dispatchMiddleware[T](
    dispatch: js.Function2[
      /* action */ typingsSlinky.reactAsync.mod.AsyncAction[T], 
      /* repeated */ js.Any, 
      scala.Unit
    ]
  ): js.Function2[
    /* action */ typingsSlinky.reactAsync.mod.AsyncAction[T], 
    /* repeated */ js.Any, 
    scala.Unit
  ] = typingsSlinky.reactAsync.mod.^.asInstanceOf[js.Dynamic].applyDynamic("dispatchMiddleware")(dispatch.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* action */ typingsSlinky.reactAsync.mod.AsyncAction[T], 
    /* repeated */ js.Any, 
    scala.Unit
  ]]
  
  /**
    * Universal global scope object. In the browser this is `self`, in Node.js and React Native it's `global`.
    * This file is excluded from coverage reporting because these globals are environment-specific so we can't test them all.
    */
  @scala.inline
  def globalScope: typingsSlinky.reactAsync.mod.GlobalScope_ = typingsSlinky.reactAsync.mod.^.asInstanceOf[js.Dynamic].selectDynamic("globalScope").asInstanceOf[typingsSlinky.reactAsync.mod.GlobalScope_]
  
  @scala.inline
  def init[T](hasInitialValuePromisePromiseFn: typingsSlinky.reactAsync.anon.InitialValue[T]): (typingsSlinky.reactAsync.mod.AsyncInitial[
    T, 
    typingsSlinky.std.Pick[
      typingsSlinky.reactAsync.mod.AbstractState[T], 
      typingsSlinky.reactAsync.reactAsyncStrings.initialValue | typingsSlinky.reactAsync.reactAsyncStrings.counter | typingsSlinky.reactAsync.reactAsyncStrings.promise
    ]
  ]) | (typingsSlinky.reactAsync.mod.AsyncPending[
    T, 
    typingsSlinky.std.Pick[
      typingsSlinky.reactAsync.mod.AbstractState[T], 
      typingsSlinky.reactAsync.reactAsyncStrings.initialValue | typingsSlinky.reactAsync.reactAsyncStrings.counter | typingsSlinky.reactAsync.reactAsyncStrings.promise
    ]
  ]) | (typingsSlinky.reactAsync.mod.AsyncFulfilled[
    T, 
    typingsSlinky.std.Pick[
      typingsSlinky.reactAsync.mod.AbstractState[T], 
      typingsSlinky.reactAsync.reactAsyncStrings.initialValue | typingsSlinky.reactAsync.reactAsyncStrings.counter | typingsSlinky.reactAsync.reactAsyncStrings.promise
    ]
  ]) | (typingsSlinky.reactAsync.mod.AsyncRejected[
    T, 
    typingsSlinky.std.Pick[
      typingsSlinky.reactAsync.mod.AbstractState[T], 
      typingsSlinky.reactAsync.reactAsyncStrings.initialValue | typingsSlinky.reactAsync.reactAsyncStrings.counter | typingsSlinky.reactAsync.reactAsyncStrings.promise
    ]
  ]) = typingsSlinky.reactAsync.mod.^.asInstanceOf[js.Dynamic].applyDynamic("init")(hasInitialValuePromisePromiseFn.asInstanceOf[js.Any]).asInstanceOf[(typingsSlinky.reactAsync.mod.AsyncInitial[
    T, 
    typingsSlinky.std.Pick[
      typingsSlinky.reactAsync.mod.AbstractState[T], 
      typingsSlinky.reactAsync.reactAsyncStrings.initialValue | typingsSlinky.reactAsync.reactAsyncStrings.counter | typingsSlinky.reactAsync.reactAsyncStrings.promise
    ]
  ]) | (typingsSlinky.reactAsync.mod.AsyncPending[
    T, 
    typingsSlinky.std.Pick[
      typingsSlinky.reactAsync.mod.AbstractState[T], 
      typingsSlinky.reactAsync.reactAsyncStrings.initialValue | typingsSlinky.reactAsync.reactAsyncStrings.counter | typingsSlinky.reactAsync.reactAsyncStrings.promise
    ]
  ]) | (typingsSlinky.reactAsync.mod.AsyncFulfilled[
    T, 
    typingsSlinky.std.Pick[
      typingsSlinky.reactAsync.mod.AbstractState[T], 
      typingsSlinky.reactAsync.reactAsyncStrings.initialValue | typingsSlinky.reactAsync.reactAsyncStrings.counter | typingsSlinky.reactAsync.reactAsyncStrings.promise
    ]
  ]) | (typingsSlinky.reactAsync.mod.AsyncRejected[
    T, 
    typingsSlinky.std.Pick[
      typingsSlinky.reactAsync.mod.AbstractState[T], 
      typingsSlinky.reactAsync.reactAsyncStrings.initialValue | typingsSlinky.reactAsync.reactAsyncStrings.counter | typingsSlinky.reactAsync.reactAsyncStrings.promise
    ]
  ])]
  
  @scala.inline
  def neverSettle: js.Promise[scala.Nothing] = typingsSlinky.reactAsync.mod.^.asInstanceOf[js.Dynamic].selectDynamic("neverSettle").asInstanceOf[js.Promise[scala.Nothing]]
  
  @scala.inline
  def reducer[T](
    state: (typingsSlinky.reactAsync.mod.AsyncFulfilled[
      T, 
      typingsSlinky.std.Pick[
        typingsSlinky.reactAsync.mod.AbstractState[T], 
        typingsSlinky.reactAsync.reactAsyncStrings.initialValue | typingsSlinky.reactAsync.reactAsyncStrings.counter | typingsSlinky.reactAsync.reactAsyncStrings.promise
      ]
    ]) | (typingsSlinky.reactAsync.mod.AsyncInitial[
      T, 
      typingsSlinky.std.Pick[
        typingsSlinky.reactAsync.mod.AbstractState[T], 
        typingsSlinky.reactAsync.reactAsyncStrings.initialValue | typingsSlinky.reactAsync.reactAsyncStrings.counter | typingsSlinky.reactAsync.reactAsyncStrings.promise
      ]
    ]) | (typingsSlinky.reactAsync.mod.AsyncPending[
      T, 
      typingsSlinky.std.Pick[
        typingsSlinky.reactAsync.mod.AbstractState[T], 
        typingsSlinky.reactAsync.reactAsyncStrings.initialValue | typingsSlinky.reactAsync.reactAsyncStrings.counter | typingsSlinky.reactAsync.reactAsyncStrings.promise
      ]
    ]) | (typingsSlinky.reactAsync.mod.AsyncRejected[
      T, 
      typingsSlinky.std.Pick[
        typingsSlinky.reactAsync.mod.AbstractState[T], 
        typingsSlinky.reactAsync.reactAsyncStrings.initialValue | typingsSlinky.reactAsync.reactAsyncStrings.counter | typingsSlinky.reactAsync.reactAsyncStrings.promise
      ]
    ]),
    action: typingsSlinky.reactAsync.mod.AsyncAction[T]
  ): (typingsSlinky.reactAsync.mod.AsyncInitial[
    T, 
    typingsSlinky.std.Pick[
      typingsSlinky.reactAsync.mod.AbstractState[T], 
      typingsSlinky.reactAsync.reactAsyncStrings.initialValue | typingsSlinky.reactAsync.reactAsyncStrings.counter | typingsSlinky.reactAsync.reactAsyncStrings.promise
    ]
  ]) | (typingsSlinky.reactAsync.mod.AsyncPending[
    T, 
    typingsSlinky.std.Pick[
      typingsSlinky.reactAsync.mod.AbstractState[T], 
      typingsSlinky.reactAsync.reactAsyncStrings.initialValue | typingsSlinky.reactAsync.reactAsyncStrings.counter | typingsSlinky.reactAsync.reactAsyncStrings.promise
    ]
  ]) | (typingsSlinky.reactAsync.mod.AsyncFulfilled[
    T, 
    typingsSlinky.std.Pick[
      typingsSlinky.reactAsync.mod.AbstractState[T], 
      typingsSlinky.reactAsync.reactAsyncStrings.initialValue | typingsSlinky.reactAsync.reactAsyncStrings.counter | typingsSlinky.reactAsync.reactAsyncStrings.promise
    ]
  ]) | (typingsSlinky.reactAsync.mod.AsyncRejected[
    T, 
    typingsSlinky.std.Pick[
      typingsSlinky.reactAsync.mod.AbstractState[T], 
      typingsSlinky.reactAsync.reactAsyncStrings.initialValue | typingsSlinky.reactAsync.reactAsyncStrings.counter | typingsSlinky.reactAsync.reactAsyncStrings.promise
    ]
  ]) = (typingsSlinky.reactAsync.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[(typingsSlinky.reactAsync.mod.AsyncInitial[
    T, 
    typingsSlinky.std.Pick[
      typingsSlinky.reactAsync.mod.AbstractState[T], 
      typingsSlinky.reactAsync.reactAsyncStrings.initialValue | typingsSlinky.reactAsync.reactAsyncStrings.counter | typingsSlinky.reactAsync.reactAsyncStrings.promise
    ]
  ]) | (typingsSlinky.reactAsync.mod.AsyncPending[
    T, 
    typingsSlinky.std.Pick[
      typingsSlinky.reactAsync.mod.AbstractState[T], 
      typingsSlinky.reactAsync.reactAsyncStrings.initialValue | typingsSlinky.reactAsync.reactAsyncStrings.counter | typingsSlinky.reactAsync.reactAsyncStrings.promise
    ]
  ]) | (typingsSlinky.reactAsync.mod.AsyncFulfilled[
    T, 
    typingsSlinky.std.Pick[
      typingsSlinky.reactAsync.mod.AbstractState[T], 
      typingsSlinky.reactAsync.reactAsyncStrings.initialValue | typingsSlinky.reactAsync.reactAsyncStrings.counter | typingsSlinky.reactAsync.reactAsyncStrings.promise
    ]
  ]) | (typingsSlinky.reactAsync.mod.AsyncRejected[
    T, 
    typingsSlinky.std.Pick[
      typingsSlinky.reactAsync.mod.AbstractState[T], 
      typingsSlinky.reactAsync.reactAsyncStrings.initialValue | typingsSlinky.reactAsync.reactAsyncStrings.counter | typingsSlinky.reactAsync.reactAsyncStrings.promise
    ]
  ])]
  
  /* was `typeof useAsync` */
  @scala.inline
  def useAsync[T](options: typingsSlinky.reactAsync.mod.AsyncOptions[T]): typingsSlinky.reactAsync.mod.AsyncState[T, typingsSlinky.reactAsync.mod.AbstractState[T]] = typingsSlinky.reactAsync.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useAsync")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactAsync.mod.AsyncState[T, typingsSlinky.reactAsync.mod.AbstractState[T]]]
  /* was `typeof useAsync` */
  @scala.inline
  def useAsync[T](promiseFn: typingsSlinky.reactAsync.mod.PromiseFn[T]): typingsSlinky.reactAsync.mod.AsyncState[T, typingsSlinky.reactAsync.mod.AbstractState[T]] = typingsSlinky.reactAsync.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useAsync")(promiseFn.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactAsync.mod.AsyncState[T, typingsSlinky.reactAsync.mod.AbstractState[T]]]
  @scala.inline
  def useAsync[T](
    promiseFn: typingsSlinky.reactAsync.mod.PromiseFn[T],
    options: typingsSlinky.reactAsync.mod.AsyncOptions[T]
  ): typingsSlinky.reactAsync.mod.AsyncState[T, typingsSlinky.reactAsync.mod.AbstractState[T]] = (typingsSlinky.reactAsync.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useAsync")(promiseFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactAsync.mod.AsyncState[T, typingsSlinky.reactAsync.mod.AbstractState[T]]]
  
  /**
    *
    * @param {RequestInfo} resource
    * @param {RequestInit} init
    * @param {FetchOptions} options
    * @returns {AsyncState<T, FetchRun<T>>}
    */
  /* was `typeof useAsyncFetch` */
  @scala.inline
  def useFetch[T](resource: typingsSlinky.std.RequestInfo, init: org.scalajs.dom.experimental.RequestInit): typingsSlinky.reactAsync.mod.AsyncState[T, typingsSlinky.reactAsync.mod.FetchRun[T]] = (typingsSlinky.reactAsync.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useFetch")(resource.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactAsync.mod.AsyncState[T, typingsSlinky.reactAsync.mod.FetchRun[T]]]
  @scala.inline
  def useFetch[T](
    resource: typingsSlinky.std.RequestInfo,
    init: org.scalajs.dom.experimental.RequestInit,
    hasDeferJsonOptions: typingsSlinky.reactAsync.mod.FetchOptions[T]
  ): typingsSlinky.reactAsync.mod.AsyncState[T, typingsSlinky.reactAsync.mod.FetchRun[T]] = (typingsSlinky.reactAsync.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useFetch")(resource.asInstanceOf[js.Any], init.asInstanceOf[js.Any], hasDeferJsonOptions.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactAsync.mod.AsyncState[T, typingsSlinky.reactAsync.mod.FetchRun[T]]]
}
