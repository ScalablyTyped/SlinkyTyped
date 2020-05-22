package typingsSlinky.pulumiPulumi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outputMod {
  type Input[T] = T | js.Promise[T] | typingsSlinky.pulumiPulumi.outputMod.OutputInstance[T]
  type Inputs = typingsSlinky.std.Record[java.lang.String, typingsSlinky.pulumiPulumi.outputMod.Input[js.Any]]
  type Lifted[T] = js.Object | (typingsSlinky.pulumiPulumi.outputMod.LiftedObject[
    java.lang.String | T, 
    typingsSlinky.pulumiPulumi.outputMod.NonFunctionPropertyNames[java.lang.String | T]
  ]) | typingsSlinky.pulumiPulumi.outputMod.LiftedArray[js.Any]
  type LiftedObject[T, K /* <: /* keyof T */ java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: T[P] extends @pulumi/pulumi.@pulumi/pulumi/output.OutputInstance<infer T1>? @pulumi/pulumi.@pulumi/pulumi/output.Output<any> : T[P] extends std.Promise<infer T2>? @pulumi/pulumi.@pulumi/pulumi/output.Output<any> : @pulumi/pulumi.@pulumi/pulumi/output.Output<T[P]>}
    */ typingsSlinky.pulumiPulumi.pulumiPulumiStrings.LiftedObject with org.scalablytyped.runtime.TopLevel[js.Any]
  type NonFunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  type Output_[T] = typingsSlinky.pulumiPulumi.outputMod.OutputInstance[T] with typingsSlinky.pulumiPulumi.outputMod.Lifted[T]
  type Unwrap[T] = typingsSlinky.pulumiPulumi.outputMod.UnwrapSimple[js.Any | T]
  type UnwrapSimple[T] = typingsSlinky.pulumiPulumi.outputMod.UnwrappedObject[T] | typingsSlinky.pulumiPulumi.outputMod.UnwrappedArray[js.Any] | T
  type UnwrappedObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: @pulumi/pulumi.@pulumi/pulumi/output.Unwrap<T[P]>}
    */ typingsSlinky.pulumiPulumi.pulumiPulumiStrings.UnwrappedObject with org.scalablytyped.runtime.TopLevel[T]
  type primitive = js.UndefOr[js.Function | java.lang.String | scala.Double | scala.Boolean | scala.Null]
}
