package typingsSlinky.apolloServerPluginBase.mod

import typingsSlinky.apolloServerPluginBase.apolloServerPluginBaseStrings.document
import typingsSlinky.apolloServerPluginBase.apolloServerPluginBaseStrings.errors
import typingsSlinky.apolloServerPluginBase.apolloServerPluginBaseStrings.metrics
import typingsSlinky.apolloServerPluginBase.apolloServerPluginBaseStrings.operation
import typingsSlinky.apolloServerPluginBase.apolloServerPluginBaseStrings.operationName
import typingsSlinky.apolloServerPluginBase.apolloServerPluginBaseStrings.response
import typingsSlinky.apolloServerPluginBase.apolloServerPluginBaseStrings.source
import typingsSlinky.apolloServerTypes.mod.GraphQLRequestContext
import typingsSlinky.apolloServerTypes.mod.GraphQLResponse
import typingsSlinky.apolloServerTypes.mod.ValueOrPromise
import typingsSlinky.apolloServerTypes.mod.WithRequired
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequestListener[TContext] extends js.Object {
  var didEncounterErrors: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[GraphQLRequestContext[TContext], metrics | source | errors], 
      ValueOrPromise[Unit]
    ]
  ] = js.undefined
  var didResolveOperation: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[
        GraphQLRequestContext[TContext], 
        metrics | source | document | operationName | operation
      ], 
      ValueOrPromise[Unit]
    ]
  ] = js.undefined
  var executionDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[
        GraphQLRequestContext[TContext], 
        metrics | source | document | operationName | operation
      ], 
      (js.Function1[/* err */ js.UndefOr[js.Error], Unit]) | Unit
    ]
  ] = js.undefined
  var parsingDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[GraphQLRequestContext[TContext], metrics | source], 
      (js.Function1[/* err */ js.UndefOr[js.Error], Unit]) | Unit
    ]
  ] = js.undefined
  var responseForOperation: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[
        GraphQLRequestContext[TContext], 
        metrics | source | document | operationName | operation
      ], 
      ValueOrPromise[GraphQLResponse | Null]
    ]
  ] = js.undefined
  var validationDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[GraphQLRequestContext[TContext], metrics | source | document], 
      (js.Function1[/* err */ js.UndefOr[js.Array[js.Error]], Unit]) | Unit
    ]
  ] = js.undefined
  var willSendResponse: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[GraphQLRequestContext[TContext], metrics | response], 
      ValueOrPromise[Unit]
    ]
  ] = js.undefined
}

object GraphQLRequestListener {
  @scala.inline
  def apply[TContext](
    didEncounterErrors: /* requestContext */ WithRequired[GraphQLRequestContext[TContext], metrics | source | errors] => ValueOrPromise[Unit] = null,
    didResolveOperation: /* requestContext */ WithRequired[
      GraphQLRequestContext[TContext], 
      metrics | source | document | operationName | operation
    ] => ValueOrPromise[Unit] = null,
    executionDidStart: /* requestContext */ WithRequired[
      GraphQLRequestContext[TContext], 
      metrics | source | document | operationName | operation
    ] => (js.Function1[/* err */ js.UndefOr[js.Error], Unit]) | Unit = null,
    parsingDidStart: /* requestContext */ WithRequired[GraphQLRequestContext[TContext], metrics | source] => (js.Function1[/* err */ js.UndefOr[js.Error], Unit]) | Unit = null,
    responseForOperation: /* requestContext */ WithRequired[
      GraphQLRequestContext[TContext], 
      metrics | source | document | operationName | operation
    ] => ValueOrPromise[GraphQLResponse | Null] = null,
    validationDidStart: /* requestContext */ WithRequired[GraphQLRequestContext[TContext], metrics | source | document] => (js.Function1[/* err */ js.UndefOr[js.Array[js.Error]], Unit]) | Unit = null,
    willSendResponse: /* requestContext */ WithRequired[GraphQLRequestContext[TContext], metrics | response] => ValueOrPromise[Unit] = null
  ): GraphQLRequestListener[TContext] = {
    val __obj = js.Dynamic.literal()
    if (didEncounterErrors != null) __obj.updateDynamic("didEncounterErrors")(js.Any.fromFunction1(didEncounterErrors))
    if (didResolveOperation != null) __obj.updateDynamic("didResolveOperation")(js.Any.fromFunction1(didResolveOperation))
    if (executionDidStart != null) __obj.updateDynamic("executionDidStart")(js.Any.fromFunction1(executionDidStart))
    if (parsingDidStart != null) __obj.updateDynamic("parsingDidStart")(js.Any.fromFunction1(parsingDidStart))
    if (responseForOperation != null) __obj.updateDynamic("responseForOperation")(js.Any.fromFunction1(responseForOperation))
    if (validationDidStart != null) __obj.updateDynamic("validationDidStart")(js.Any.fromFunction1(validationDidStart))
    if (willSendResponse != null) __obj.updateDynamic("willSendResponse")(js.Any.fromFunction1(willSendResponse))
    __obj.asInstanceOf[GraphQLRequestListener[TContext]]
  }
}

