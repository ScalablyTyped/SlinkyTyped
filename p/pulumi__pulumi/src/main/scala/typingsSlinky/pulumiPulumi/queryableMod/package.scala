package typingsSlinky.pulumiPulumi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object queryableMod {
  type OptionalKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: undefined extends T[P]? P : never}[keyof T] */ js.Any
  type RequiredKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: undefined extends T[P]? never : P}[keyof T] */ js.Any
  type Resolved[T] = typingsSlinky.pulumiPulumi.queryableMod.ResolvedSimple[js.Any | T]
  type ResolvedObject[T] = typingsSlinky.pulumiPulumi.queryableMod.ModifyOptionalProperties[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: @pulumi/pulumi.@pulumi/pulumi/queryable.Resolved<T[P]>}
    */ typingsSlinky.pulumiPulumi.pulumiPulumiStrings.ResolvedObject with org.scalablytyped.runtime.TopLevel[T]
  ]
  type ResolvedResource[T /* <: typingsSlinky.pulumiPulumi.resourceMod.Resource */] = typingsSlinky.std.Omit[
    typingsSlinky.pulumiPulumi.queryableMod.Resolved[T], 
    typingsSlinky.pulumiPulumi.pulumiPulumiStrings.urn | typingsSlinky.pulumiPulumi.pulumiPulumiStrings.getProvider
  ]
}
