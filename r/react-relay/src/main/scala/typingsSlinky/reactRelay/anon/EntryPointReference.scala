package typingsSlinky.reactRelay.anon

import slinky.core.ReactComponentClass
import typingsSlinky.reactRelay.entryPointTypesMod.EntryPointProps
import typingsSlinky.reactRelay.entryPointTypesMod.PreloadedEntryPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntryPointReference[TEntryPointComponent /* <: ReactComponentClass[
EntryPointProps[TPreloadedQueries, TPreloadedNestedEntryPoints, TRuntimeProps, TExtraProps]] */, TRuntimeProps /* <: js.Object */, TPreloadedQueries /* <: js.Object */, TPreloadedNestedEntryPoints /* <: js.Object */, TExtraProps] extends js.Object {
  
  var entryPointReference: PreloadedEntryPoint[TEntryPointComponent] = js.native
  
  var props: TRuntimeProps = js.native
}
object EntryPointReference {
  
  @scala.inline
  def apply[TEntryPointComponent /* <: ReactComponentClass[
    EntryPointProps[TPreloadedQueries, TPreloadedNestedEntryPoints, TRuntimeProps, TExtraProps]
  ] */, TRuntimeProps /* <: js.Object */, TPreloadedQueries /* <: js.Object */, TPreloadedNestedEntryPoints /* <: js.Object */, TExtraProps](entryPointReference: PreloadedEntryPoint[TEntryPointComponent], props: TRuntimeProps): EntryPointReference[
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
  implicit class EntryPointReferenceOps[Self <: EntryPointReference[_, _, _, _, _], TEntryPointComponent /* <: ReactComponentClass[
    EntryPointProps[TPreloadedQueries, TPreloadedNestedEntryPoints, TRuntimeProps, TExtraProps]
  ] */, TRuntimeProps /* <: js.Object */, TPreloadedQueries /* <: js.Object */, TPreloadedNestedEntryPoints /* <: js.Object */, TExtraProps] (val x: Self with (EntryPointReference[
        TEntryPointComponent, 
        TRuntimeProps, 
        TPreloadedQueries, 
        TPreloadedNestedEntryPoints, 
        TExtraProps
      ])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntryPointReference(value: PreloadedEntryPoint[TEntryPointComponent]): Self = this.set("entryPointReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: TRuntimeProps): Self = this.set("props", value.asInstanceOf[js.Any])
  }
}
