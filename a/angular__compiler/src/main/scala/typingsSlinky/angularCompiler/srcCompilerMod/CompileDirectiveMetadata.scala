package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.anon.ChangeDetection
import typingsSlinky.angularCompiler.anon.ComponentFactory
import org.scalablytyped.runtime.StObject
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
object CompileDirectiveMetadata {
  
  @JSImport("@angular/compiler/src/compiler", "CompileDirectiveMetadata.create")
  @js.native
  def create(
    hasIsHostTypeIsComponentSelectorExportAsChangeDetectionInputsOutputsHostProvidersViewProvidersQueriesGuardsViewQueriesEntryComponentsTemplateComponentViewTypeRendererTypeComponentFactory: ChangeDetection
  ): typingsSlinky.angularCompiler.compileMetadataMod.CompileDirectiveMetadata = js.native
}
