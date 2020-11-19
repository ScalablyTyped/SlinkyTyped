package typingsSlinky.graphqlToolsLoad

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphqlToolsLoad.anon.Cache
import typingsSlinky.graphqlToolsUtils.loadersMod.SingleFileOptions
import typingsSlinky.graphqlToolsUtils.loadersMod.Source
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/load/load-typedefs", JSImport.Namespace)
@js.native
object loadTypedefsMod extends js.Object {
  
  def loadTypedefs[AdditionalConfig](
    pointerOrPointers: js.Array[UnnormalizedTypeDefPointer],
    options: LoadTypedefsOptions[Partial[AdditionalConfig]]
  ): js.Promise[js.Array[Source]] = js.native
  def loadTypedefs[AdditionalConfig](
    pointerOrPointers: UnnormalizedTypeDefPointer,
    options: LoadTypedefsOptions[Partial[AdditionalConfig]]
  ): js.Promise[js.Array[Source]] = js.native
  
  def loadTypedefsSync[AdditionalConfig](
    pointerOrPointers: js.Array[UnnormalizedTypeDefPointer],
    options: LoadTypedefsOptions[Partial[AdditionalConfig]]
  ): js.Array[Source] = js.native
  def loadTypedefsSync[AdditionalConfig](
    pointerOrPointers: UnnormalizedTypeDefPointer,
    options: LoadTypedefsOptions[Partial[AdditionalConfig]]
  ): js.Array[Source] = js.native
  
  type LoadTypedefsOptions[ExtraConfig] = SingleFileOptions with ExtraConfig with Cache
  
  type UnnormalizedTypeDefPointer = StringDictionary[js.Any] | String
}
