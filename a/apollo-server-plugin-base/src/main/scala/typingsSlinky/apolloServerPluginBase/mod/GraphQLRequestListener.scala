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

@js.native
trait GraphQLRequestListener[TContext] extends js.Object {
  var didEncounterErrors: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[GraphQLRequestContext[TContext], metrics | source | errors], 
      ValueOrPromise[Unit]
    ]
  ] = js.native
  var didResolveOperation: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[
        GraphQLRequestContext[TContext], 
        metrics | source | document | operationName | operation
      ], 
      ValueOrPromise[Unit]
    ]
  ] = js.native
  var executionDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[
        GraphQLRequestContext[TContext], 
        metrics | source | document | operationName | operation
      ], 
      (js.Function1[/* err */ js.UndefOr[js.Error], Unit]) | Unit
    ]
  ] = js.native
  var parsingDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[GraphQLRequestContext[TContext], metrics | source], 
      (js.Function1[/* err */ js.UndefOr[js.Error], Unit]) | Unit
    ]
  ] = js.native
  var responseForOperation: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[
        GraphQLRequestContext[TContext], 
        metrics | source | document | operationName | operation
      ], 
      ValueOrPromise[GraphQLResponse | Null]
    ]
  ] = js.native
  var validationDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[GraphQLRequestContext[TContext], metrics | source | document], 
      (js.Function1[/* err */ js.UndefOr[js.Array[js.Error]], Unit]) | Unit
    ]
  ] = js.native
  var willSendResponse: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[GraphQLRequestContext[TContext], metrics | response], 
      ValueOrPromise[Unit]
    ]
  ] = js.native
}

object GraphQLRequestListener {
  @scala.inline
  def apply[TContext](): GraphQLRequestListener[TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLRequestListener[TContext]]
  }
  @scala.inline
  implicit class GraphQLRequestListenerOps[Self[tcontext] <: GraphQLRequestListener[tcontext], TContext] (val x: Self[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TContext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TContext] with Other]
    @scala.inline
    def withDidEncounterErrors(
      value: /* requestContext */ WithRequired[GraphQLRequestContext[TContext], metrics | source | errors] => ValueOrPromise[Unit]
    ): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didEncounterErrors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDidEncounterErrors: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didEncounterErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withDidResolveOperation(
      value: /* requestContext */ WithRequired[
          GraphQLRequestContext[TContext], 
          metrics | source | document | operationName | operation
        ] => ValueOrPromise[Unit]
    ): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didResolveOperation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDidResolveOperation: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didResolveOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionDidStart(
      value: /* requestContext */ WithRequired[
          GraphQLRequestContext[TContext], 
          metrics | source | document | operationName | operation
        ] => (js.Function1[/* err */ js.UndefOr[js.Error], Unit]) | Unit
    ): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionDidStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExecutionDidStart: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionDidStart")(js.undefined)
        ret
    }
    @scala.inline
    def withParsingDidStart(
      value: /* requestContext */ WithRequired[GraphQLRequestContext[TContext], metrics | source] => (js.Function1[/* err */ js.UndefOr[js.Error], Unit]) | Unit
    ): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsingDidStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParsingDidStart: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsingDidStart")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseForOperation(
      value: /* requestContext */ WithRequired[
          GraphQLRequestContext[TContext], 
          metrics | source | document | operationName | operation
        ] => ValueOrPromise[GraphQLResponse | Null]
    ): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseForOperation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResponseForOperation: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseForOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationDidStart(
      value: /* requestContext */ WithRequired[GraphQLRequestContext[TContext], metrics | source | document] => (js.Function1[/* err */ js.UndefOr[js.Array[js.Error]], Unit]) | Unit
    ): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationDidStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidationDidStart: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationDidStart")(js.undefined)
        ret
    }
    @scala.inline
    def withWillSendResponse(
      value: /* requestContext */ WithRequired[GraphQLRequestContext[TContext], metrics | response] => ValueOrPromise[Unit]
    ): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willSendResponse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWillSendResponse: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willSendResponse")(js.undefined)
        ret
    }
  }
  
}

