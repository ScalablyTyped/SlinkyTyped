package typingsSlinky.atPulumiPulumi

import typingsSlinky.atPulumiPulumi.atPulumiPulumiStrings.getProvider
import typingsSlinky.atPulumiPulumi.atPulumiPulumiStrings.urn
import typingsSlinky.atPulumiPulumi.queryableMod.ModifyOptionalProperties
import typingsSlinky.atPulumiPulumi.queryableMod.PulumiExclude
import typingsSlinky.atPulumiPulumi.queryableMod.PulumiOmit
import typingsSlinky.atPulumiPulumi.queryableMod.Resolved
import typingsSlinky.atPulumiPulumi.queryableMod.ResolvedArray
import typingsSlinky.atPulumiPulumi.queryableMod.ResolvedObject
import typingsSlinky.atPulumiPulumi.queryableMod.ResolvedSimple
import typingsSlinky.atPulumiPulumi.resourceMod.Resource
import typingsSlinky.std.Array
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/queryable", JSImport.Namespace)
@js.native
object queryableMod extends js.Object {
  @js.native
  trait ModifyOptionalProperties[T] extends js.Object
  
  @js.native
  trait ResolvedArray[T] extends Array[Resolved[T]]
  
  type OptionalKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: undefined extends T[P]? P : never}[keyof T] */ js.Any
  type PulumiExclude[T, U] = T
  type PulumiOmit[T, K /* <: String */] = Pick[T, PulumiExclude[String, K]]
  type RequiredKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: undefined extends T[P]? never : P}[keyof T] */ js.Any
  type Resolved[T] = ResolvedSimple[js.Any | T]
  type ResolvedObject[T] = ModifyOptionalProperties[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: @pulumi/pulumi.@pulumi/pulumi/queryable.Resolved<T[P]>}
    */ typingsSlinky.atPulumiPulumi.atPulumiPulumiStrings.ResolvedObject with T
  ]
  type ResolvedResource[T /* <: Resource */] = PulumiOmit[Resolved[T], urn | getProvider]
  type ResolvedSimple[T] = ResolvedObject[T] | ResolvedArray[js.Any] | T
  type primitive = js.UndefOr[String | Double | Boolean | Null]
}

