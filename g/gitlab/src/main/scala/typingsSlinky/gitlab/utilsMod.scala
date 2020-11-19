package typingsSlinky.gitlab

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/infrastructure/Utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def bundler[T /* <: StringDictionary[Constructor] */, P /* <: /* keyof T */ String */](services: T): Bundle[T, P] = js.native
  
  @js.native
  trait Bundle[T /* <: StringDictionary[Constructor] */, P /* <: /* keyof T */ String */]
    extends Instantiable0[Mapper[T, P]]
       with Instantiable1[/* options */ js.Any, Mapper[T, P]]
  
  @js.native
  trait Constructor
    extends Instantiable1[/* args */ js.Any, js.Any]
  
  type Mapper[T /* <: StringDictionary[Constructor] */, P /* <: /* keyof T */ String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in P ]: std.InstanceType<T[name]>}
    */ typingsSlinky.gitlab.gitlabStrings.Mapper with TopLevel[T]
}
