package typingsSlinky.reactMdUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesTypesMod {
  
  type ClassNameCloneableChild[T] = slinky.core.facade.ReactElement
  
  type LabelRequiredForA11y[Props /* <: typingsSlinky.reactMdUtils.typesTypesMod.LabelA11y */] = typingsSlinky.reactMdUtils.typesTypesMod.RequireAtLeastOne[
    Props, 
    typingsSlinky.reactMdUtils.reactMdUtilsStrings.`aria-label` | typingsSlinky.reactMdUtils.reactMdUtilsStrings.`aria-labelledby`
  ]
  
  type Maybe[T, NotFound] = T | NotFound
  
  type PropsWithRef[P /* <: js.Object */, E /* <: org.scalajs.dom.raw.HTMLElement */] = P with typingsSlinky.reactMdUtils.anon.Ref[E]
  
  type RequireAtLeastOne[T, Keys /* <: /* keyof T */ java.lang.String */] = (typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, Keys]]) with (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in Keys ]: -? std.Required<std.Pick<T, K>> & std.Partial<std.Pick<T, std.Exclude<Keys, K>>>}[Keys] */ js.Any)
}
