package typingsSlinky.reactRelay.entryPointTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  entryPoints  :TPreloadedEntryPoints,   extraProps  :TExtraProps | null,   props  :TRuntimeProps,   queries  :TPreloadedQueries}> */
@js.native
trait EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] extends js.Object {
  val entryPoints: TPreloadedEntryPoints = js.native
  val extraProps: js.UndefOr[TExtraProps] = js.native
  val props: TRuntimeProps = js.native
  val queries: TPreloadedQueries = js.native
}

object EntryPointProps {
  @scala.inline
  def apply[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps](entryPoints: TPreloadedEntryPoints, props: TRuntimeProps, queries: TPreloadedQueries): EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
    val __obj = js.Dynamic.literal(entryPoints = entryPoints.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]]
  }
  @scala.inline
  implicit class EntryPointPropsOps[Self[tpreloadedqueries, tpreloadedentrypoints, truntimeprops, textraprops] <: EntryPointProps[tpreloadedqueries, tpreloadedentrypoints, truntimeprops, textraprops], TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] (val x: Self[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]) with Other]
    @scala.inline
    def withEntryPoints(value: TPreloadedEntryPoints): Self[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: TRuntimeProps): Self[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueries(value: TPreloadedQueries): Self[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraProps(value: TExtraProps): Self[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraProps: Self[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraProps")(js.undefined)
        ret
    }
  }
  
}

