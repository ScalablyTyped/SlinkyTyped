package typingsSlinky.quicksettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnyModel = typingsSlinky.std.Record[java.lang.String, js.Any]
  
  type ChangeHandler[T] = js.Function1[/* value */ T, scala.Unit]
  
  type DropDownItems[T] = js.Array[
    (T with (java.lang.String | scala.Double)) | typingsSlinky.quicksettings.mod.DropDownOption[T]
  ]
  
  /**
    * Mapped type picking only the properties of the type `M` whose value declaration extends `V`
    */
  type KeyWhereType[M, V] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof M ]: M[K] extends V? K : never}[keyof M] */ js.Any
}
