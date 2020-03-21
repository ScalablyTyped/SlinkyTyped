package typingsSlinky.jest.mod.jest

import typingsSlinky.std.InstanceType
import typingsSlinky.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", "jest.spyOn")
@js.native
object spyOn extends js.Object {
  def apply[T /* <: js.Object */, M /* <: ConstructorPropertyNames[Required[T]] */](`object`: T, method: M): SpyInstance[
    InstanceType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ], 
    ConstructorArgsType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ]
  ] = js.native
}

