package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.anon.ChangeDetection
import typingsSlinky.angularCompiler.anon.ComponentFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "CompileDirectiveMetadata")
@js.native
class CompileDirectiveMetadata protected ()
  extends typingsSlinky.angularCompiler.compileMetadataMod.CompileDirectiveMetadata {
  def this(hasIsHostTypeIsComponentSelectorExportAsChangeDetectionInputsOutputsHostListenersHostPropertiesHostAttributesProvidersViewProvidersQueriesGuardsViewQueriesEntryComponentsTemplateComponentViewTypeRendererTypeComponentFactory: ComponentFactory) = this()
}
/* static members */
@JSImport("@angular/compiler/src/compiler", "CompileDirectiveMetadata")
@js.native
object CompileDirectiveMetadata extends js.Object {
  
  def create(
    hasIsHostTypeIsComponentSelectorExportAsChangeDetectionInputsOutputsHostProvidersViewProvidersQueriesGuardsViewQueriesEntryComponentsTemplateComponentViewTypeRendererTypeComponentFactory: ChangeDetection
  ): typingsSlinky.angularCompiler.compileMetadataMod.CompileDirectiveMetadata = js.native
}
