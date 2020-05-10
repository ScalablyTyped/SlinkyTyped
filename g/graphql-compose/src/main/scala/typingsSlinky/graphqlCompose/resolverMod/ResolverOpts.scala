package typingsSlinky.graphqlCompose.resolverMod

import typingsSlinky.graphqlCompose.definitionsMod.Extensions
import typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeFieldConfigArgumentMap
import typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeOutputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverOpts[TSource, TContext, TArgs, TReturn] extends js.Object {
  var args: js.UndefOr[ComposeFieldConfigArgumentMap[TArgs]] = js.native
  var description: js.UndefOr[String] = js.native
  var displayName: js.UndefOr[String] = js.native
  var extensions: js.UndefOr[Extensions] = js.native
  var kind: js.UndefOr[ResolverKinds] = js.native
  var name: js.UndefOr[String] = js.native
  var parent: js.UndefOr[Resolver[_, TContext, _, _]] = js.native
  var resolve: js.UndefOr[ResolverRpCb[TSource, TContext, TArgs]] = js.native
  var `type`: js.UndefOr[ComposeOutputType[TReturn, TContext]] = js.native
}

object ResolverOpts {
  @scala.inline
  def apply[TSource, TContext, TArgs, TReturn](): ResolverOpts[TSource, TContext, TArgs, TReturn] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverOpts[TSource, TContext, TArgs, TReturn]]
  }
  @scala.inline
  implicit class ResolverOptsOps[Self[tsource, tcontext, targs, treturn] <: ResolverOpts[tsource, tcontext, targs, treturn], TSource, TContext, TArgs, TReturn] (val x: Self[TSource, TContext, TArgs, TReturn]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSource, TContext, TArgs, TReturn] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSource, TContext, TArgs, TReturn]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TSource, TContext, TArgs, TReturn]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TSource, TContext, TArgs, TReturn]) with Other]
    @scala.inline
    def withArgs(value: ComposeFieldConfigArgumentMap[TArgs]): Self[TSource, TContext, TArgs, TReturn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self[TSource, TContext, TArgs, TReturn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self[TSource, TContext, TArgs, TReturn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self[TSource, TContext, TArgs, TReturn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self[TSource, TContext, TArgs, TReturn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self[TSource, TContext, TArgs, TReturn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: Extensions): Self[TSource, TContext, TArgs, TReturn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self[TSource, TContext, TArgs, TReturn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: ResolverKinds): Self[TSource, TContext, TArgs, TReturn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self[TSource, TContext, TArgs, TReturn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[TSource, TContext, TArgs, TReturn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[TSource, TContext, TArgs, TReturn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: Resolver[_, TContext, _, _]): Self[TSource, TContext, TArgs, TReturn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self[TSource, TContext, TArgs, TReturn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withResolve(value: /* resolveParams */ ResolveParams[TSource, TContext, TArgs] => js.Promise[js.Any] | js.Any): Self[TSource, TContext, TArgs, TReturn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResolve: Self[TSource, TContext, TArgs, TReturn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ComposeOutputType[TReturn, TContext]): Self[TSource, TContext, TArgs, TReturn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[TSource, TContext, TArgs, TReturn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

