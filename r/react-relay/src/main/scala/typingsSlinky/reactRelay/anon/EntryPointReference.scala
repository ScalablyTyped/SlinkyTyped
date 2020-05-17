package typingsSlinky.reactRelay.anon

import slinky.core.ReactComponentClass
import typingsSlinky.reactRelay.entryPointTypesMod.EntryPointProps
import typingsSlinky.reactRelay.entryPointTypesMod.PreloadedEntryPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntryPointReference[TEntryPointComponent /* <: ReactComponentClass[
EntryPointProps[TPreloadedQueries, TPreloadedNestedEntryPoints, TRuntimeProps, TExtraProps]] */, TRuntimeProps /* <: js.Object */, TPreloadedQueries /* <: js.Object */, TPreloadedNestedEntryPoints /* <: js.Object */, TExtraProps] extends js.Object {
  var entryPointReference: PreloadedEntryPoint[TEntryPointComponent] = js.native
  var props: TRuntimeProps = js.native
}

object EntryPointReference {
  @scala.inline
  def apply[TEntryPointComponent, TRuntimeProps, TPreloadedQueries, TPreloadedNestedEntryPoints, TExtraProps](entryPointReference: PreloadedEntryPoint[TEntryPointComponent], props: TRuntimeProps): EntryPointReference[
    TEntryPointComponent, 
    TRuntimeProps, 
    TPreloadedQueries, 
    TPreloadedNestedEntryPoints, 
    TExtraProps
  ] = {
    val __obj = js.Dynamic.literal(entryPointReference = entryPointReference.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryPointReference[
      TEntryPointComponent, 
      TRuntimeProps, 
      TPreloadedQueries, 
      TPreloadedNestedEntryPoints, 
      TExtraProps
    ]]
  }
  @scala.inline
  implicit class EntryPointReferenceOps[Self[tentrypointcomponent, truntimeprops, tpreloadedqueries, tpreloadednestedentrypoints, textraprops] <: EntryPointReference[
    tentrypointcomponent, 
    truntimeprops, 
    tpreloadedqueries, 
    tpreloadednestedentrypoints, 
    textraprops
  ], TEntryPointComponent, TRuntimeProps, TPreloadedQueries, TPreloadedNestedEntryPoints, TExtraProps] (val x: Self[
        TEntryPointComponent, 
        TRuntimeProps, 
        TPreloadedQueries, 
        TPreloadedNestedEntryPoints, 
        TExtraProps
      ]) extends AnyVal {
    @scala.inline
    def duplicate: Self[
        TEntryPointComponent, 
        TRuntimeProps, 
        TPreloadedQueries, 
        TPreloadedNestedEntryPoints, 
        TExtraProps
      ] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[
        TEntryPointComponent, 
        TRuntimeProps, 
        TPreloadedQueries, 
        TPreloadedNestedEntryPoints, 
        TExtraProps
      ]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[
        TEntryPointComponent, 
        TRuntimeProps, 
        TPreloadedQueries, 
        TPreloadedNestedEntryPoints, 
        TExtraProps
      ]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[
        TEntryPointComponent, 
        TRuntimeProps, 
        TPreloadedQueries, 
        TPreloadedNestedEntryPoints, 
        TExtraProps
      ]) with Other]
    @scala.inline
    def withEntryPointReference(value: PreloadedEntryPoint[TEntryPointComponent]): Self[
        TEntryPointComponent, 
        TRuntimeProps, 
        TPreloadedQueries, 
        TPreloadedNestedEntryPoints, 
        TExtraProps
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPointReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: TRuntimeProps): Self[
        TEntryPointComponent, 
        TRuntimeProps, 
        TPreloadedQueries, 
        TPreloadedNestedEntryPoints, 
        TExtraProps
      ] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

