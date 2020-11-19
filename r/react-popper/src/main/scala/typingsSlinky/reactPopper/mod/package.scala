package typingsSlinky.reactPopper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Modifier[Name, Options /* <: js.Object */] = (typingsSlinky.std.Partial[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Modifier<Name, Options> */ js.Any
  ]) | typingsSlinky.reactPopper.mod.StrictModifier[Name]
  
  type StrictModifier[Name /* <: typingsSlinky.reactPopper.mod.StrictModifierNames */] = typingsSlinky.reactPopper.mod.UnionWhere[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.StrictModifiers */ js.Any, 
    typingsSlinky.reactPopper.anon.`0`[Name]
  ]
  
  type StrictModifierNames = typingsSlinky.std.NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.StrictModifiers * / any['name'] */ js.Any
  ]
  
  // Utility type
  type UnionWhere[U, M] = U
}
