package typingsSlinky.graphqlCompose.objectTypeComposerMod

import typingsSlinky.graphqlCompose.definitionsMod.Thunk
import typingsSlinky.graphqlCompose.resolverMod.Resolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationOptsWithResolver[TRelationSource, TSource, TContext, TArgs] extends RelationOpts[TRelationSource, TSource, TContext, TArgs] {
  var catchErrors: js.UndefOr[Boolean] = js.native
  var deprecationReason: js.UndefOr[String | Null] = js.native
  var description: js.UndefOr[String | Null] = js.native
  var prepareArgs: js.UndefOr[RelationArgsMapper[TSource, TContext, TArgs]] = js.native
  var projection: js.UndefOr[js.Object] = js.native
  var resolver: Thunk[Resolver[TRelationSource, TContext, TArgs, _]] = js.native
}

object RelationOptsWithResolver {
  @scala.inline
  def apply[TRelationSource, TSource, TContext, TArgs](resolver: Thunk[Resolver[TRelationSource, TContext, TArgs, _]]): RelationOptsWithResolver[TRelationSource, TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(resolver = resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationOptsWithResolver[TRelationSource, TSource, TContext, TArgs]]
  }
  @scala.inline
  implicit class RelationOptsWithResolverOps[Self[trelationsource, tsource, tcontext, targs] <: RelationOptsWithResolver[trelationsource, tsource, tcontext, targs], TRelationSource, TSource, TContext, TArgs] (val x: Self[TRelationSource, TSource, TContext, TArgs]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TRelationSource, TSource, TContext, TArgs] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TRelationSource, TSource, TContext, TArgs]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TRelationSource, TSource, TContext, TArgs]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TRelationSource, TSource, TContext, TArgs]) with Other]
    @scala.inline
    def withResolverFunction0(value: () => Resolver[TRelationSource, TContext, TArgs, _]): Self[TRelationSource, TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResolver(value: Thunk[Resolver[TRelationSource, TContext, TArgs, _]]): Self[TRelationSource, TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCatchErrors(value: Boolean): Self[TRelationSource, TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catchErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatchErrors: Self[TRelationSource, TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catchErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecationReason(value: String): Self[TRelationSource, TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecationReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecationReason: Self[TRelationSource, TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecationReason")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecationReasonNull: Self[TRelationSource, TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecationReason")(null)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self[TRelationSource, TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self[TRelationSource, TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionNull: Self[TRelationSource, TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(null)
        ret
    }
    @scala.inline
    def withPrepareArgs(value: RelationArgsMapper[TSource, TContext, TArgs]): Self[TRelationSource, TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrepareArgs: Self[TRelationSource, TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withProjection(value: js.Object): Self[TRelationSource, TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjection: Self[TRelationSource, TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.undefined)
        ret
    }
  }
  
}

