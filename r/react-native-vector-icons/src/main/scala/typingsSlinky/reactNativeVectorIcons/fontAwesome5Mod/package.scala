package typingsSlinky.reactNativeVectorIcons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fontAwesome5Mod {
  type AllowOnlyOne[T, Keys /* <: java.lang.String */] = (typingsSlinky.reactNativeVectorIcons.fontAwesome5Mod.Omit[T, Keys]) with (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in Keys ]: -? std.Partial<std.Pick<T, K>> & std.Partial<std.Record<std.Exclude<Keys, K>, undefined>>}[Keys] */ js.Any)
  type FontAwesome5Icon = slinky.core.ReactComponentClass[typingsSlinky.reactNativeVectorIcons.fontAwesome5Mod.FontAwesome5IconProps]
  type FontAwesome5IconProps = typingsSlinky.reactNativeVectorIcons.fontAwesome5Mod.AllowOnlyOne[
    typingsSlinky.reactNativeVectorIcons.KinFontAwesome5IconVarian, 
    typingsSlinky.reactNativeVectorIcons.fontAwesome5Mod.FontAwesome5IconVariants
  ]
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[java.lang.String, K]]
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
