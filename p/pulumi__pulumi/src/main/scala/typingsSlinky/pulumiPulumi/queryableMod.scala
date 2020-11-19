package typingsSlinky.pulumiPulumi

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.pulumiPulumi.pulumiPulumiStrings.getProvider
import typingsSlinky.pulumiPulumi.pulumiPulumiStrings.urn
import typingsSlinky.pulumiPulumi.resourceMod.Resource
import typingsSlinky.std.Array
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi/queryable", JSImport.Namespace)
@js.native
object queryableMod extends js.Object {
  
  @js.native
  trait ModifyOptionalProperties[T] extends js.Object
  
  @js.native
  trait ResolvedArray[T] extends Array[Resolved[T]]
  
  type OptionalKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: undefined extends T[P]? P : never}[keyof T] */ js.Any
  
  type RequiredKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: undefined extends T[P]? never : P}[keyof T] */ js.Any
  
  type Resolved[T] = ResolvedSimple[js.Any | T]
  
  type ResolvedObject[T] = ModifyOptionalProperties[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: @pulumi/pulumi.@pulumi/pulumi/queryable.Resolved<T[P]>}
    */ typingsSlinky.pulumiPulumi.pulumiPulumiStrings.ResolvedObject with TopLevel[T]
  ]
  
  type ResolvedResource[T /* <: Resource */] = Omit[Resolved[T], urn | getProvider]
  
  type ResolvedSimple[T] = ResolvedObject[T] | ResolvedArray[js.Any] | T
  
  type primitive = js.UndefOr[String | Double | Boolean | Null]
}
